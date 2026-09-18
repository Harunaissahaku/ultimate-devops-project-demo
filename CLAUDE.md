# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## What this repo is

A fork of [open-telemetry/opentelemetry-demo](https://github.com/open-telemetry/opentelemetry-demo)
(the "Astronomy Shop"): ~20 polyglot microservices instrumented with OpenTelemetry.

The **application code under `src/` is upstream and rarely the target of work here.** What is
actively developed in this fork is the DevOps layer:

- `.github/workflows/` — hand-written per-service CI/CD pipelines (upstream's workflows were dropped)
- `kubernetes/` — per-service `deploy.yaml` manifests that the pipelines rewrite

Treat `src/` as vendored unless a task explicitly says otherwise. Read upstream docs at
<https://opentelemetry.io/docs/demo/> rather than reverse-engineering service internals.

## Critical: `.env` is not committed

`docker-compose.yml` takes **every** image tag, port, and Dockerfile path from `.env` /
`.env.override`, and neither file exists in this fork (they were never tracked, and `.gitignore`
now excludes `.env`). Consequence:

```
$ docker compose -f docker-compose.yml config
invalid spec: :/hostfs:ro: empty section between colons   # ${HOST_FILESYSTEM} is empty
```

So `make start`, `make stop`, `make build`, `make redeploy`, and `make run-tests` **cannot work as-is**.
Fetch `.env` from upstream before suggesting or running any of them. Do not assume a compose-based
command succeeded; check its exit code.

Per-service builds (below) and the GitHub Actions pipelines do not depend on `.env` and do work.

## Per-service build & test

Only four services have CI, and each is a different toolchain:

| Service | Path | Build / test |
|---|---|---|
| ad | `src/ad` | `./gradlew build --no-daemon` &nbsp;·&nbsp; single test: `./gradlew test --tests '*ClassName*'` |
| cart | `src/cart` | `dotnet restore cart.sln` → `dotnet build cart.sln -c Release --no-restore` → `dotnet test cart.sln -c Release --no-build` &nbsp;·&nbsp; single test: `dotnet test --filter FullyQualifiedName~CartServiceTests` |
| product-catalog | `src/product-catalog` | `go build -o product-catalog-service main.go` · `go test ./...` · `golangci-lint run` |
| frontend | `src/frontend` | `npm ci` → `npm run grpc:generate` → `npm run build` · `npm run lint` · `npm run cy:open` (Cypress) |

Repo-wide lint targets exist (`make check` = `misspell markdownlint checklicense`) and don't need
`.env`, but two are broken in this fork: `make markdownlint` passes `-c .markdownlint.yaml` and
`make yamllint` expects a `.yamllint`, and **neither config file is present** (they were never
tracked here). `node_modules/` is also absent, so `make markdownlint` first runs `npm install`.
`make misspell` builds its binary from `internal/tools` and does work. Prefer running a service's own
linter (`golangci-lint run`, `npm run lint`) over the repo-wide targets.

Protobuf: the single source of truth is the root `pb/demo.proto`. Regenerate with
`make docker-generate-protobuf` (containerized, preferred) or `make generate-protobuf` (needs local
protoc). `make clean` removes only the Go/Python generated output.

### The ad service is pinned to JDK 17

`src/ad/build.gradle` declares `java { toolchain { languageVersion = 17 } }`, and
`src/ad/settings.gradle` configures **no toolchain download repository**. Gradle therefore requires a
locally installed JDK 17 and will hard-fail rather than cross-compile:

```
Cannot find a Java installation on your machine matching this tasks requirements:
{languageVersion=17, ...} > No locally installed toolchains match and toolchain
download repositories have not been configured.
```

This is why `src/ad/Dockerfile`'s builder stage is `eclipse-temurin:17-jdk` and why
`AdserviceCI.yaml` pins `java-version: '17'`. Changing either base image or the setup-java version
requires changing the `build.gradle` toolchain (or adding a resolver plugin) in the same commit. The
runtime stage on `21-jre` is fine — Java 17 bytecode runs there.

Note the asymmetry that hid this bug once already: `ubuntu-latest` ships a discoverable JDK 17, so
the `build` job can pass while the containerized `docker` job fails.

## CI/CD architecture

All four workflows follow one GitOps-ish shape:

```
push to main (path-filtered)  →  build+test  →  docker build/push  →  sed image tag into
                                                                      kubernetes/<svc>/deploy.yaml
                                                                   →  commit back to main [skip ci]
```

Workflows: `AdserviceCI.yaml`, `cart-cicd.yaml`, `frontend-cicd.yaml`, `CICD.yml` (product-catalog).

Conventions that must hold for a new or edited workflow:

- **`[skip ci]` guard is mandatory** on any workflow that both triggers on push-to-main and commits
  back to main, or it self-triggers forever:
  `if: github.event_name == 'workflow_dispatch' || !contains(github.event.head_commit.message, '[skip ci]')`.
  (`CICD.yml` lacks one but is `workflow_dispatch`-only, so it can't loop.)
- **Path filters must include the workflow's own filename.** Renaming a workflow file means editing
  the `paths:` self-reference inside it.
- **Secrets are `DOCKER_USERNAME` / `DOCKER_TOKEN`** (Docker Hub) across all four, each fronted by an
  explicit validation step that fails with a `::error::` annotation. Don't introduce `DOCKERHUB_*`.
- `concurrency` group per service + `cancel-in-progress: false`, so manifest-committing runs don't
  race each other.
- Image tags: `${{ github.run_id }}` (ad, frontend, product-catalog) or `${{ github.sha }}` (cart),
  plus `:latest`. GHA cache via `cache-from/to: type=gha`.

### Build contexts differ per service — check before editing `.dockerignore`

`.dockerignore` is read from the **context root**, so it only governs root-context builds.

| Service | Context | Dockerfile COPYs | Root `.dockerignore` applies? |
|---|---|---|---|
| frontend | `.` | `./src/frontend`, `./pb` | **yes** |
| cart | `.` | `./src/cart/`, `./pb/` | **yes** |
| ad | `src/ad` | `./pb` (its own `src/ad/pb/`) | no |
| product-catalog | `src/product-catalog` | `.` | no |

The root `.dockerignore` excludes most of `src/*` to keep the context small. **Never add an
exclusion for a service whose Dockerfile COPYs from the root** — excluding `src/cart` or
`src/frontend` breaks their own builds. This is already documented in a comment at the top of the
file; keep it accurate.

### The manifest `sed` is the fragile part

`kubernetes/*/deploy.yaml` often contains more than one `image:` line — `kubernetes/cart/deploy.yaml`
has the cartservice container at line 34 *and* a `busybox:latest` initContainer at line 74. A blanket
`s|image: .*|...|` clobbers both.

Use an anchored or range-scoped substitution and verify with a `grep -n 'image:'` afterward:

```bash
# scoped to one container block (cart)
sed -i -E "/- name: cartservice/,/imagePullPolicy/ s|^([[:space:]]*)image:.*|\1image: ${IMAGE}|" kubernetes/cart/deploy.yaml
# anchored on the image key so imagePullPolicy survives (ad — single image line)
sed -i -E "s|^([[:space:]]*)image:.*|\1image: ${IMAGE}|" kubernetes/ad/deploy.yaml
```

`CICD.yml` still uses the unscoped form; `kubernetes/productcatalog/deploy.yaml` currently has one
image line, so it works by luck.

**macOS caveat when testing these locally:** BSD `sed` reads the token after `-i` as a backup
suffix, so `sed -i -E` silently runs the pattern as a BRE and errors with `\1 not defined in the RE`.
The workflows are correct — runners use GNU sed. Validate locally with `sed -E` (no `-i`) against a
copy instead.

### Directory naming is not 1:1

`src/` uses hyphens, `kubernetes/` mostly doesn't: `src/product-catalog` → `kubernetes/productcatalog`,
`src/fraud-detection` → `kubernetes/frauddetection`, `src/frontend-proxy` → `kubernetes/frontendproxy`,
`src/image-provider` → `kubernetes/imageprovider`, `src/load-generator` → `kubernetes/loadgenerator`.
Several `src/` dirs have no manifest and `kubernetes/valkey` has no `src/`. Verify the target path
exists before writing it into a workflow — an earlier revision of `AdserviceCI.yaml` referenced
`src/adservice` and `kubernetes/adservice`, neither of which exist.

`kubernetes/complete-deploy.yaml` is a 1907-line all-in-one bundle; the per-service `deploy.yaml`
files — split out by hand in this fork — are what CI edits. Note `make generate-kubernetes-manifests`
regenerates a *different* file (`kubernetes/opentelemetry-demo.yaml`, via `helm template`) that
doesn't exist here, so it will not refresh the per-service manifests.

## Known wart

826 build artifacts are tracked under `src/ad/build`, `src/ad/bin`, `src/currency/build`,
`src/fraud-detection/`, and `src/shipping/build`, inflating the ad build context to ~52 MB.
`.gitignore` does not untrack already-committed files; clearing them needs
`git rm -r --cached src/ad/build src/ad/bin`. Note some generated proto `.java` files live under
`src/ad/build/generated/...`, which `build.gradle` registers as a source dir — regenerate before
assuming removal is safe.

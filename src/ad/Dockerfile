# JDK 17 to satisfy the Gradle toolchain pinned in build.gradle
# (java { toolchain { languageVersion = 17 } }). Gradle requires a matching
# JDK to be installed and has no toolchain download repository configured,
# so a JDK 21 builder fails at :compileJava.
FROM eclipse-temurin:17-jdk AS builder

WORKDIR /usr/src/app/

COPY gradlew* settings.gradle* build.gradle .
COPY ./gradle ./gradle

RUN chmod +x ./gradlew
RUN ./gradlew
RUN ./gradlew downloadRepos

COPY . .
COPY ./pb ./proto
RUN chmod +x ./gradlew
RUN ./gradlew installDist -PprotoSourceDir=./proto

#####################################################

FROM eclipse-temurin:21-jre

WORKDIR /usr/src/app/

COPY --from=builder /usr/src/app/ ./

ENV AD_PORT 9099

ENTRYPOINT ["./build/install/opentelemetry-demo-ad/bin/Ad"]


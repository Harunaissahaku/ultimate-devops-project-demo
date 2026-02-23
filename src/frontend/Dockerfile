FROM node:20-alpine AS deps
RUN apk add --no-cache libc6-compat
WORKDIR /app

COPY ./src/frontend/package*.json ./
RUN npm ci

# ---------------- BUILDER ----------------
FROM node:20-alpine AS builder
RUN apk add --no-cache libc6-compat protobuf-dev protoc
WORKDIR /app

COPY --from=deps /app/node_modules ./node_modules
COPY ./pb ./pb
COPY ./src/frontend .

# 🔴 CRITICAL: copy next.config.js BEFORE build
COPY ./src/frontend/next.config.js ./

# 🔴 CRITICAL: provide env at build time
ENV NODE_ENV=production
ENV OTEL_COLLECTOR_HOST=otel-collector
ENV OTEL_COLLECTOR_PORT_HTTP=4318
ENV FRONTEND_PORT=8080

RUN npm run grpc:generate
RUN npm run build

# ---------------- RUNNER ----------------
FROM node:20-alpine AS runner
WORKDIR /app

ENV NODE_ENV=production
ENV PORT=8080

RUN addgroup -g 1001 -S nodejs
RUN adduser -S nextjs -u 1001

# Only copy standalone output (no node_modules!)
COPY --from=builder --chown=nextjs:nodejs /app/.next/standalone ./
COPY --from=builder --chown=nextjs:nodejs /app/.next/static ./.next/static
COPY --from=builder --chown=nextjs:nodejs /app/public ./public

USER nextjs
EXPOSE 8080

CMD ["node", "server.js"]


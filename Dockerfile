FROM maven:3.9.9-eclipse-temurin-21-alpine AS build

ENV DOCKERIZE_VERSION=v0.8.0

RUN apk update --no-cache \
    && apk add --no-cache wget openssl \
    && wget -O - https://github.com/jwilder/dockerize/releases/download/$DOCKERIZE_VERSION/dockerize-alpine-linux-amd64-$DOCKERIZE_VERSION.tar.gz | tar xzf - -C /usr/local/bin \
    && apk del wget

COPY . .

RUN mvn package -DskipTests

FROM eclipse-temurin:21-alpine

COPY --from=build /usr/local/bin/dockerize /usr/local/bin/dockerize
COPY --from=build target/DockerApp.jar app.jar

EXPOSE 8080

CMD ["dockerize", "-wait", "tcp://db:3306", "-timeout", "30s", "java", "-jar", "app.jar"]
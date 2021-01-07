FROM openjdk:8-jdk AS builder
COPY . /source
WORKDIR /source
RUN ./gradlew clean build

FROM java:8-jdk-alpine
COPY --from=builder /source/build/libs/micro-service-0.0.1-SNAPSHOT.jar /usr/app/micro-service.jar
WORKDIR /usr/app
EXPOSE 8080
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","micro-service.jar"]

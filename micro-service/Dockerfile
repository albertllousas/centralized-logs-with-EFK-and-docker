# Download docker from docker hub with all dependencies to run a java 8 application
FROM java:8-jdk-alpine

# Moving the app artifact from the host to the container
COPY ./build/libs/micro-service-0.0.1-SNAPSHOT.jar /usr/app/micro-service.jar

# The WORKDIR instruction sets the working directory for any RUN, CMD, ENTRYPOINT, COPY and ADD instructions that follow it in the Dockerfile.
WORKDIR /usr/app

# With it we inform Docker that a container will listen to specific port, the same as our app is using.
EXPOSE 8080

# Tell Docker to run the application, where first value is a command and the last two are parameters
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","micro-service.jar"]
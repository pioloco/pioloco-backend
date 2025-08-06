FROM openjdk:24-slim-bullseye

WORKDIR /app

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} /app/pioloco.jar

ENTRYPOINT ["java", "-jar", "/app/pioloco.jar"]
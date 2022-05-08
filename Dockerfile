
FROM openjdk:11 as builder
WORKDIR /springhometask
ARG JAR_FILE=build/*.jar
COPY ${JAR_FILE} springhometask-0.0.1-SNAPSHOT-plain.jar
RUN gradle build


FROM openjdk:11

ENTRYPOINT ["java", "org.springframework.boot.loader.JarLauncher"]

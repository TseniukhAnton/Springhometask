
FROM openjdk:11 as builder
WORKDIR /springhometask
ARG JAR_FILE=build/libs/*.jar
#COPY ${JAR_FILE} springhometask-0.0.1-SNAPSHOT-plain.jar
#COPY springhometask-0.0.1-SNAPSHOT-plain.jar /springhometask/build/libs/springhometask-0.0.1-SNAPSHOT-plain.jar
RUN cp -a springhometask/build/libs/springhometask-0.0.1-SNAPSHOT-plain.jar springhometask-0.0.1-SNAPSHOT-plain.jar

FROM openjdk:11

ENTRYPOINT ["java", "-jar", "/springhometask-0.0.1-SNAPSHOT-plain.jar"]

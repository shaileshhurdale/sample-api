FROM openjdk:8-jdk-alpine
#MAINTAINER sample.org
COPY target/sample-api-0.0.1-SNAPSHOT.jar sample-api-0.0.1.jar
ENTRYPOINT ["java","-jar","/sample-api-0.0.1.jar"]
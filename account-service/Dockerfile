FROM openjdk:17-alpine3.14 as build

MAINTAINER Shadrach-Adamu

COPY target/account-service-0.0.1-SNAPSHOT.jar account-service-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","/account-service-0.0.1-SNAPSHOT.jar"]
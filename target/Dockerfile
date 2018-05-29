#!/usr/bin/env bash
FROM openjdk:8-jre-alpine
MAINTAINER 'Middleware Team'
VOLUME /tmp
EXPOSE 8082
ADD target/check-metrics-1.0-SNAPSHOT.war app.war
CMD java -jar app.war
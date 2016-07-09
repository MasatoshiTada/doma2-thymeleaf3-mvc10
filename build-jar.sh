#!/usr/bin/env bash
gradle clean build
open -a Safari http://localhost:8080/doma2-thymeleaf3-mvc10-1.0-SNAPSHOT/
java -jar ~/Java/ap-server/payara-micro-4.1.1.162.jar --deploy build/libs/doma2-thymeleaf3-mvc10-1.0-SNAPSHOT.war

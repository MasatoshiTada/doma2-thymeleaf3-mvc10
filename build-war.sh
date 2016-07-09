#!/usr/bin/env bash
export GF_HOME=~/Java/ap-server/payara-web-ml-4.1.1.162
gradle clean build
$GF_HOME/bin/asadmin start-domain domain1
$GF_HOME/bin/asadmin undeploy doma2-thymeleaf3-mvc10
$GF_HOME/bin/asadmin deploy --contextroot=doma2-thymeleaf3-mvc10 --name=doma2-thymeleaf3-mvc10 build/libs/doma2-thymeleaf3-mvc10-1.0-SNAPSHOT.war
open -a Safari http://localhost:8080/doma2-thymeleaf3-mvc10/
tail -f $GF_HOME/glassfish/domains/domain1/logs/server.log

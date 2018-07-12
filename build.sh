#!/bin/bash

# Chris Joakim, Microsoft, 2018/07/11

# date > src/main/resources/build_date.txt

rm  target/*.war

mvn clean compile package

cp  target/t85.war /devroot/apache-tomcat-8.5.32/webapps

ls -al /devroot/apache-tomcat-8.5.32/webapps | grep war$

echo 'done'

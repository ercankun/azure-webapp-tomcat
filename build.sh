#!/bin/bash

# Compile the code and package the WAR file with Maven.
# Chris Joakim, Microsoft, 2018/07/12

rm  target/*.war

mvn clean compile package

# copy to my localhost Tomcat deployment directory, then
# list the war files there
cp  target/t85.war /devroot/apache-tomcat-8.5.32/webapps
ls -al /devroot/apache-tomcat-8.5.32/webapps | grep war$

echo 'done'

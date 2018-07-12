#!/bin/bash

# Chris Joakim, Microsoft, 2018/07/12
#
# $ ./deploy.sh
# Enter host password for user 'cjoakim':

curl -X POST -u cjoakim --data-binary @"target/t85.war" https://cjoakim-tomcat-t85.scm.azurewebsites.net/api/wardeploy

echo 'done'

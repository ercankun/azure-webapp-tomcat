#!/bin/bash

# Chris Joakim, Microsoft, 2018/07/12
# see https://docs.microsoft.com/en-us/azure/app-service/app-service-deploy-zip
#
# $ ./deploy.sh
# Enter host password for user 'cjoakim':

curl -X POST -u cjoakim --data-binary @"target/t85.war" https://cjoakim-tomcat-t85.scm.azurewebsites.net/api/wardeploy

echo 'done'

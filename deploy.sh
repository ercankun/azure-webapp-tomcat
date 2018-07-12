#!/bin/bash

# bash shell script to deploy a WAR file to the Azure App Service via HTTP.
# The curl command will prompt you for your deployment/ftp password.
# see https://docs.microsoft.com/en-us/azure/app-service/app-service-deploy-zip
#
# Chris Joakim, Microsoft, 2018/07/12

curl -X POST -u cjoakim --data-binary @"target/t85.war" https://cjoakim-tomcat-t85.scm.azurewebsites.net/api/wardeploy

echo 'done'

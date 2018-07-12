# azure-webapp-tomcat

Example Tomcat 8.5 web application

# Instructions

- In Azure Portal, create an Azure App Service with Tomcat version 8.5
- In Azure Portal, create an ftp & deployment ID and Password for the app
- Clone this repo
- See build.sh for compiling and packaging
- See deploy.sh for deploying to Azure via the HTTP API using your deployment ID and password
- See curl.sh to invoke the /ping endpoint

# Tomcat 8.5

- Install Tomcat 8.5 on your workstation
- Copy your WAR files to its' webapps directory


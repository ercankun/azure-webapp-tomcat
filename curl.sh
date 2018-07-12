#!/bin/bash

# Invoke the /ping endpoint vs both localhost and Azure,
# piping the application/json response to jq for pretty-printing.
# Chris Joakim, Microsoft, 2018/07/12

curl 'http://localhost:8080/t85/ping' | jq -S

curl 'https://cjoakim-tomcat-t85.azurewebsites.net/ping' | jq -S

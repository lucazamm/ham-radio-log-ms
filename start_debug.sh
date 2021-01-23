#!/bin/bash
set -e
mvn clean install

docker-compose -f docker-compose-debug.yml build

docker-compose -f docker-compose-debug.yml up
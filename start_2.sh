#!/bin/bash
set -e
docker run -it --rm --name spc-backend -v "$PWD":/usr/src/spc-backend --volume "$HOME"/.m2:/root/.m2 -w /usr/src/spc-backend maven:3.3.3-jdk-8 mvn clean install -DskipTests

docker-compose -f build --no-cache backend

docker-compose up
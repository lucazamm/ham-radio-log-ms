#!/bin/bash
set -e

echo "Ham Radio Log"

echo "Compiling"
mvn clean install

echo "Docker build"
docker-compose build --no-cache backend

echo "Docker start"
docker-compose up
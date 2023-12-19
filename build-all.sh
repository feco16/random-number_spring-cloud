#!/bin/zsh

./gradlew RandomNumberService:clean
./gradlew RandomNumberService:bootJar
docker build ./RandomNumberService -t random-number-service

./gradlew RandomNumber-UI:clean
./gradlew RandomNumber-UI:bootJar
docker build ./RandomNumber-UI -t random-number-ui

./gradlew EurekaServer:clean
./gradlew EurekaServer:bootJar
docker build ./EurekaServer -t eureka-server

./gradlew ApiGateway:clean
./gradlew ApiGateway:bootJar
docker build ./ApiGateway -t api-gateway
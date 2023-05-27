#!/usr/bin/env bash

source .env

#mvn -DskipTests clean verify package
mvn -DskipTests -P deploy deploy

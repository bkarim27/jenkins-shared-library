#!/usr/bin/env groovy

def call() {
    echo "building the docker image"
    sh 'docker build -t badshak/demo-app:java-maven-app-2.3 .'
}
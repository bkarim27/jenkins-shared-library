#!/usr/bin/env groovy

def call() {
    echo "building jar"
    sh 'mvn package'
}
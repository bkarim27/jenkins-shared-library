#!/usr/bin/env groovy

def call() {
    echo "building jar for branch $BRANCH_NAME"
    sh 'mvn package'
}
#!/usr/bin/env groovy

def call() {
    echo "deploying to docker hub"
    withCredentials([usernamePassword(credentialsId: 'DockerHub', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
        sh "echo $PASS | docker login -u $USER --password-stdin"
        sh 'docker push badshak/demo-app:java-maven-app-2.3'
    }
}
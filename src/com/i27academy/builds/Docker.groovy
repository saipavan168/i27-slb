package com.i27academy.builds

class Docker {
    def jenkins
    Docker(jenkins) {
        this.jenkins = jenkins
    }

    // Application Build
    def buildApp(appName) {
        jenkins.sh """#!/bin/bash
        echo "Building the Shared Library $appName Application"
        mvn clean package -DskipTests=true
        """
    }
    
}
@Library('pipeline-library-demo@master') _

pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                build() // Call the shared library function for the "Build" stage
            }
        }

        stage('Containerize') {
            steps {
                containerize() // Call the shared library function for the "Containerize" stage
            }
        }

        stage('Publish') {
            steps {
                publish() // Call the shared library function for the "Publish" stage
            }
        }
    }
}

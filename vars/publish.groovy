def call() {
    stage('Publish') {
        // Publish Docker image to Artifactory
        sh 'docker tag myapp:latest <artifactory-url>/myapp:latest'
        sh 'docker push <artifactory-url>/myapp:latest'
    }
}
def call() {
  stage('Containerize') {
    // Build Docker image
    sh 'docker build -t myapp:latest .'
  }
}
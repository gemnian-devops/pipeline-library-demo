def call() {
    stage('Build') {

        git url: 'git@github.com:gemnian-devops/springbootdemo.git'

        // Add any necessary environment setup steps, such as configuring Git credentials or setting up Maven
        // ...

        // Run Maven build
        sh 'mvn clean install'
    }
}
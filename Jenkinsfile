pipeline {
    agent any

    tools {
        maven 'M2_HOME'
    }

    stages {
        stage('Build Maven') {
            steps {
                sh 'mvn clean package -DskipTests'
            }
        }

        stage('Build Docker Image') {
            steps {
                sh 'docker build -t boycott-backend:dev .'
            }
        }
    }
}

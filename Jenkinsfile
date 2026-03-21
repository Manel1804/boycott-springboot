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

        stage('Tag Docker Image') {
            steps {
                sh 'docker tag boycott-backend:dev manel1804/boycott-backend:dev'
            }
        }

        stage('Push Docker Image') {
            steps {
                sh 'docker push manel1804/boycott-backend:dev'
            }
        }
    }
}

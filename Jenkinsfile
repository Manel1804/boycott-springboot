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

        stage('SonarQube Analysis') {
            steps {
                sh 'mvn sonar:sonar -Dsonar.projectKey=boycott-springboot -Dsonar.projectName=boycott-springboot -Dsonar.host.url=http://localhost:9000 -Dsonar.login=squ_2c4f57135b090a2bf18d83aabea027ad14eec9ab'
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

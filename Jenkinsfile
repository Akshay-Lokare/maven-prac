
pipeline {
    agent any

    tools {
        jdk 'JAVA-17'
        maven 'Maven-3'
    }

    stages {
        stage('Check Environment') {
            steps {
                bat 'echo Java Version:'
                bat 'java -version'
                bat 'echo Maven Version:'
                bat 'mvn -version'
            }
        }

        stage('Checkout') {
            steps {
                git branch: 'master',
                    url: 'https://github.com/Akshay-Lokare/maven-prac.git'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Package') {
            steps {
                bat 'mvn package'
            }
        }

        stage('Run Application') {
            steps {
                bat 'java -cp target/maven-demo-1.0-SNAPSHOT.jar com.example.App'
            }
        }

        stage('Archive Artifact') {
            steps {
                archiveArtifacts artifacts: 'target/*.jar',
                    fingerprint: true
            }
        }
    }
}

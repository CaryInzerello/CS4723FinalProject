pipeline {
    agent any
    tools {
            maven 'Maven 3.6.3'
    }
    stages {
        stage('build') {
            steps {
                bat 'mvn -B -DskipTests clean package'
            }
        }
        stage('test') {
            steps {
                bat 'mvn test'
            }
        }
    }
}
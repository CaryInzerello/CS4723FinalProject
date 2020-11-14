pipeline {
    agent any
    tools {
            maven 'Maven'
            jdk "JDK13"
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
pipeline{
    agent any
    environment{
        APP_NAME= 'springboot-demo'
        PORT= '9090'
    }
    stages{
        stage('Checkout'){
            steps{
                git branch: 'main',
                url: 'https://github.com/sarthak-agnihotri/springboot-jenkins-cicd.git'
            }
        }
        stage('Build'){
            steps{
                bat 'mvn clean compile'
            }
        }
        stage('Test'){
            steps{
                bat 'mvn test'
            }
        }
        stage('Package'){
            steps{
                bat 'mvn package'
            }
        }
    }
}
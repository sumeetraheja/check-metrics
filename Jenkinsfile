pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                checkout([$class: 'GitSCM', branches: [[name: '*/master']],
                     userRemoteConfigs: [[url: 'https://github.com/sumeetraheja/check-metrics.gi']]])
                 echo 'Checkout Done..'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
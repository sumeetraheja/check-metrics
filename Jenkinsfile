pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                dir('subDirCheckout') {
                    checkout([$class: 'GitSCM', branches: [[name: '*/master']],
                                         userRemoteConfigs: [[url: 'https://github.com/sumeetraheja/check-metrics.git']]])
                }

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
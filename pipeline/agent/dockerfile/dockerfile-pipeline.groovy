pipeline {
    agent none
    stages {
        stage('Checkout') {
            agent any
            steps {
                checkout([$class: 'GitSCM',
                branches: [[name: 'origin/master']],
                userRemoteConfigs: [[url: 'https://github.com/idnbso/jenkins-studies.git']]
                ])
            }
        }
        stage('Build') {
            agent {
                dockerfile true
            }
            steps {
                sh 'cat /etc/lsb-release'
            }
        }
    }
}

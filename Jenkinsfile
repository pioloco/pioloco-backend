pipeline {
    agent any

    tools {
        maven 'Maven-3.8.6'
        jdk 'JDK-17'
    }
    
    environment {
        REMOTE_USER = 'CKKLTPurgaINF331'
        REMOTE_HOST = 'smartcloudservices.cloud'
        REMOTE_PORT = '22222'
        DEPLOY_PATH = '/home/CKKLTPurgaINF331/pioloco'
        JAR_NAME    = 'pioloco-0.0.1-SNAPSHOT.jar'
    }

    stages {
        stage('1. Checkout') {
            steps {
                echo 'Recuperation du code'
                git branch: 'main', url: 'https://github.com/pioloco/pioloco-backend.git'
            }
        }

        stage('2. Build & Test') {
            steps {
                echo 'Compilation et tests unitaires...'
                sh 'mvn clean package'
            }
        }

        stage('3. Deploy to Server') {
            steps {
                echo "Deploiement de l'appli sur ${REMOTE_HOST}..."

                script {
                    sshagent(credentials: ['deploy-server-ssh']) {
                        sh "scp -P ${env.REMOTE_PORT} target/${env.JAR_NAME} ${env.REMOTE_USER}@${env.REMOTE_HOST}:${env.DEPLOY_PATH}/"

                        sh "ssh -p ${env.REMOTE_PORT} ${env.REMOTE_USER}@${env.REMOTE_HOST} 'bash ${env.DEPLOY_PATH}/deploy.sh'"
                    }
                }
            }
        }
    }

    post {
        always {
            echo 'Pipeline terminée'
        }
        success {
            echo 'Deploiement ok!!!'
        }
        failure {
            echo 'Le pipeline a un probleme. Il a echoue, il faut verifier les logs.'
        }
    }
}
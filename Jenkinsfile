pipeline{
    agent any

    tools{
        maven 'Maven 3.8.6'
        jdk 'JDK 17'
    }

    stages{
        stage('1. Checkout') {
            steps {
                echo 'Recuperation du code'

                git branch: 'main', url: 'https://github.com/pioloco/pioloco-backend.git'
            }
        }

        stage('2. Build & Test'){
            steps{
                echo 'Compilation et tests unitaires...'
                sh 'mvn clean package'
            }
        }

        stage('3. Deploy to server'){
            steps{
                echo 'Deploiement de l\'appli'

                sshagent(credentials: ['deploy-server-ssh']){
                    def remoteUser = 'CKKLTPurgaINF331'
                    def remoteHost = 'smartcloudservices.cloud'
                    def remotePort = 22222
                    
                    def deployPath = '/home/CKKLTPurgaINF331/pioloco'

                    def jarName = 'pioloco-0.0.1-SNAPSHOT.jar'

                    sh "scp -P ${remotePort} target/${jarName} ${remoteUser}@${remoteHost}:${deployPath}/"

                    sh "ssh -p ${remotePort} ${remoteUser}@${remoteHost} 'bash ${deployPath}/deploy.sh'"                
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
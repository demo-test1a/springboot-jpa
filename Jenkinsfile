pipeline {

  agent any
  tools {
        maven 'Maven'
   }
  stages {
        stage ('Checkout') {
            steps {
                checkout scm
             }
        }
        stage ('Build') {
            steps {
              sh "mvn  clean install -DskipTests=true"
            }
        }
         stage ('Test') {
            steps {
                sh "mvn test"
            }
        }
        stage ('Build Docker Image') {
            steps {
                sh "docker version"
                sh "docker build -t vaanimohan/demo1img2 ."
            }
        }
        stage ('Push Docker Artifact') {
            steps {
                withCredentials([usernamePassword(credentialsId: 'vaanimohan', usernameVariable: 'USERNAME', passwordVariable: 'PASSWORD')]) {
                  sh '''
                     docker login -u $USERNAME -p  $PASSWORD
                     docker push vaanimohan/demo1img2
                     '''  
                }
            }
        }
        stage ('Deploy Docker Image') {
            steps {
                sh "docker version"
                sh "docker build -t vaanimohan/demo1 ."
            }
        }
    }

}

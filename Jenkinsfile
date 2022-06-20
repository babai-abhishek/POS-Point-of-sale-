pipeline {
    agent any 
    stages {
        stage('checkout') {
            steps {
                echo 'checking out the application' 
                deleteDir()
                checkout scm
            }
        }
        stage('initialize params'){
            steps {
                def pom = readMavenPom file: 'pom.xml'
                appName = pom.name
                appName = appName.toLowerCase()
                echo "Appname: ${appName}"
            }
        }
        stage('deploy') {
            steps {
                echo 'deploying the application' 
            }
        }
    }
}

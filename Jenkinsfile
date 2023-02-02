pipeline {
    agent any
    stages {
        stage('Git Check-Out') {
            steps {
                git branch: 'main', url: 'https://github.com/Saikat2203/MachineTest05.git'
            }
        }
        stage('Check files') {
            steps {
                sh ''' pwd
            ls '''
            }
        }
        stage('Build') {
            steps {
                sh ''' echo "Building npm"
                npm install '''
            }
        }
    }
}

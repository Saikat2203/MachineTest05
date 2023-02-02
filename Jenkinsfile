pipeline {
    agent any
    stages {
        stage('Git Check-Out') {
            steps {
                git branch: 'main', url: 'https://github.com/Saikat2203/MachineTest05.git'
            }
        }
        stage('Check files') {
            sh ''' pwd
            ls '''
        }
    }
}

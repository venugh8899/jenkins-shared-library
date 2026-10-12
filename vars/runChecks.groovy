def call() {
    stage('Library - Linux Check') {
        sh 'echo "Linux check completed"'
    }

    stage('Library - Git Check') {
        sh 'git --version'
    }

    stage('Library - Java Check') {
        sh 'java -version'
    }
}

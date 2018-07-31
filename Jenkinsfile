pipeline {
    agent any

    stages {

        stage('Verify Gradle Wrapper') {
            steps {
                sh './gradlew -v'
            }
        }

        stage('Compile') {
            steps {
                sh './gradlew clean testCompile'
            }
        }

        stage('Test') {
            steps {
                sh './gradlew test'
            }
        }
    }
}

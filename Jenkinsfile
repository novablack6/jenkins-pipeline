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
                sh './gradlew clean testClasses'
            }
        }

        stage('Test') {
            steps {
                sh './gradlew test'
            }
        }
    }
}

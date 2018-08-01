pipeline {
    agent any

    stages {

        stage('Setup Gradle') {
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
            post {
                always {
                    junit 'build/test-results/test/*.xml'
                }
            }
        }
    }
}

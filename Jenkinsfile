pipeline {
    agent any
    stages {
        stage("Build") {
            when {
                //changeRequest()
                changeRequest title: "when-pr"
            }
            steps {
                echo "Pull Request Detected"
            }
        }
    }
}
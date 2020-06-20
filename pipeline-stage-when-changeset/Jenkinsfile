pipeline {
    agent any
    stages {
        stage("Build") {
            when {
                changeset pattern: "*.js"
            }
            steps {
                echo "Changeset for JavaScript files was detected."
            }
        }
    }
}
pipeline {
    agent any
    stages {
        stage("Build") {
            when {
                changeset glob: "*.js"
            }
            steps {
                echo "Changeset for JavaScript files was detected."
            }
        }
    }
}
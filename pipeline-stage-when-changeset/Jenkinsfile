pipeline {
    agent any
    stages {
        stage("Build") {
            when {
                //changeset pattern: "*.js"
                changeset pattern: "WORLD.js", caseSensitive: true
            }
            steps {
                echo "Changeset for JavaScript files was detected."
            }
        }
    }
}
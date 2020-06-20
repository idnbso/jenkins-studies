pipeline {
    agent any
    stages {
        stage("Build") {
            when {
                //buildingTag()
                //tag "2.0"
                tag "release-*"
            }
            steps {
                echo "Building Tag"
            }
        }
    }
}
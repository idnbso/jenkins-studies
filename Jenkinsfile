pipeline {
    agent any
    stages {
        stage("Build") {
            when {
                //buildingTag()
                tag "2.0"
            }
            steps {
                echo "Building Tag"
            }
        }
    }
}
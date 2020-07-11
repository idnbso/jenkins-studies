node{
	stage('Build'){
		println "env.CHANGE_ID: ${env.CHANGE_ID}"
		println "env.CHANGE_URL: ${env.CHANGE_URL}"
		println "env.CHANGE_TITLE: ${env.CHANGE_TITLE}"
		println "env.CHANGE_AUTHOR: ${env.CHANGE_AUTHOR}"
		println "env.CHANGE_AUTHOR_DISPLAY_NAME: ${env.CHANGE_AUTHOR_DISPLAY_NAME}"
		println "env.CHANGE_AUTHOR_EMAIL: ${env.CHANGE_AUTHOR_EMAIL}"
		println "env.CHANGE_TARGET: ${env.CHANGE_TARGET}"

		if(env.CHANGE_TITLE == "when-pr"){
			echo "pull request is found"
		}
		else {
			echo "pull request is not found"
		}
	}
}
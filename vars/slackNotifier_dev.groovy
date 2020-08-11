def call(String buildResult) {
  if( buildResult == "FAILURE" ) { 
    slackSend color: "danger", message: "BAD NEWS:Job ${env.JOB_NAME} with buildnumber ${env.BUILD_NUMBER} was failed ! more info ${env.BUILD_URL}"

}

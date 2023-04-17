pipeline {
  agent any
  tools {
    maven 'Maven'
  }
  stages {
    stage ( 'Initialize' ) {
      steps {
        sh ''' 
      		echo "PATH = ${PATH}"
		echo "M2	_HOME = ${M2_HOME}"
            ''' 
          }
        }

        stage ( 'Build' ) {
		steps {		
           sh 'mvn clean package'
        }
        }
	  stage ('Deploy-To-Tomcat') {
             steps {
           sshagent(['tomcat']) {
                  sh 'scp -o StrictHostKeyChecking=no target/*.war ubuntu@http://13.233.10.1:/prod/apache-tomcat-10.1.7/webapps/webapp.war'
             }
  }
}	
	

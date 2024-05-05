
@Library('my-shared-library') _       # here my-shred-library is name given when configured shared library in jenkins
pipeline {
    agent any
    
    stages {
        stage('calling  code from vars') {
            steps {
                aws()               # this is file from vars where code is stored for this step in groovy format
            }
        }
        stage ("calling bash script form resource folder by vars help") {
            steps {
                resource()
            }
        }
    }
}

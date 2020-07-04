#!/usr/bin/env groovy

// check bach syntax
def call(){

    sh '/docker-entrypoint.sh csslint  \${WORKSPACE}/battleboat/css/styles.css'

}

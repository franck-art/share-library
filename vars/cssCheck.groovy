#!/usr/bin/env groovy

// check bach syntax
def call(){

    sh 'csslint  \${WORKSPACE}/battleboat/css/styles.css'

}

#!/usr/bin/env groovy

// check bach syntax
def call(){
    sh 'curl -sL https://rpm.nodesource.com/setup_10.x | sudo bash -'
    sh 'sudo yum install nodejs'
    sh 'sudo npm install -g sql-lint'
    sh 'sql-lint  \${WORKSPACE}/database/crud_flask.sql'


}


#!/usr/bin/env groovy

// check bach syntax
def call(){

    sh 'go get -u golang.org/x/lint/golint'
    sh 'go list -f {{.Target}} golang.org/x/lint/golint'
    sh 'export PATH="$PATH:/go/bin/"'
    sh 'golint  \${WORKSPACE}/fake-backend/main.go'
    sh 'golint  \${WORKSPACE}/fake-backend/config.go'


}

#!/usr/bin/env groovy

// check python syntax
def call(){
  
   sh 'sudo yum install epel-release'
   sh 'sudo yum install python-pip'
   sh 'pip --version'
   sh 'pip install pylint'
   sh 'pylint  \${WORKSPACE}/source_code/module/database.py'

}


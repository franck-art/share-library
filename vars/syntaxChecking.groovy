#!/usr/bin/env groovy

// check bach syntax
def call(){

    sh 'shellcheck --version'
    sh 'apk  --no-cache add grep'
    sh '''
    for file in $(grep -IRl "#!(/usr/bin/env |/bin/)" --exclude-dir ".git" --exclude Jenkinsfile \${WORKSPACE}); do
      if ! shellcheck -x $file; then
        export FAILED=1
      else
        echo "$file OK"
      fi
    done
    if [ "${FAILED}" = "1" ]; then
      exit 1
    fi
    '''

}

// check yaml syntax
def yamlCheck(){

    sh 'yamllint --version'
    sh 'yamllint \${WORKSPACE}'
}


// check markdown syntax
def markdownCheck(){
    sh 'apk --no-cache add git'
    sh 'gem install mdl'
    sh 'mdl --version'
    sh 'mdl --style all --warnings --git-recurse \${WORKSPACE}'
}

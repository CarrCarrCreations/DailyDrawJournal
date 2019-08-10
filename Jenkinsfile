pipeline {
  agent any
  stages {
    stage('Deploy to Heroku') {
      steps {
        git(url: 'https://github.com/CarrCarrCreations/DailyDrawJournal', branch: 'master')
        sh 'gradle run clean build'
        sh 'git push heroku master'
      }
    }
  }
}
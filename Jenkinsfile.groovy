node {
    stage("Say Hello"){
    # properties([parameters([string(defaultValue: 'Nadira', 
    # description: 'please input your name', 
    # name: 'NAME', trim: true)]), pipelineTriggers([cron('* * * * *')])])
    git 'https://github.com/NadiraSaip/jenkins_testrepo.git'
    }
}


node {
    stage("Say Hello"){
    properties([parameters([string(defaultValue: 'Nadira', 
    description: 'please input your name', 
    name: 'NAME', trim: true)]), pipelineTriggers([cron('* * * * *')])])
    sh "echo Hello ${NAME}"
    }
}


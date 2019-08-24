node {
    stage("Say Hello"){
        properties([parameters([string(defaultValue: '3.16.147.59', description: '''dev: 3.16.147.59 qa: 3.16.147.59 prod: 18.218.24.94''', name: 'Remote_instances', trim: true)])])
        git 'https://github.com/NadiraSaip/jenkins_testrepo.git'
    }
}


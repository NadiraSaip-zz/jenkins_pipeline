node {
    stage("Say Hello"){
        properties([parameters([string(defaultValue: '3.16.147.59', description: '''dev: 3.16.147.59 qa: 3.16.147.59 prod: 18.218.24.94''', name: 'Remote_instances', trim: true)])])
        git 'https://github.com/NadiraSaip/jenkins_testrepo.git'
    }
    stage("Install Apache"){
        sh "ssh ec2-user@${Remote_instances} sudo yum install httpd -y"
    }
    stage("Create Index.html"){
        sh "scp index.html ec2-user@${Remote_instances}":/tmp"
    }
    stage("Move Files"){
        sh "ssh ec2-user@${Remote_instances} sudo mv /tmp/index.html /var/www/html/index.html"
            }
    stage("Restart httpd"){
        sh "ssh ec2-user@${Remote_instances" sudo systemctl restart httpd"
    }
}



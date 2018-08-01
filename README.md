# Sample Jenkins Pipeline with Gradle Wrapper


## Run Jenkins docker image

`$ docker run -d -v jenkins_home:/var/jenkins_home -p 8080:8080 -p 50000:50000 jenkins/jenkins:lts`


## Obtain Jenkins initial password

`$ docker volume inspect jenkins_home | jq .[0].Mountpoint`

`"/var/lib/docker/volumes/jenkins_home/_data"`

`$ sudo cat /var/lib/docker/volumes/jenkins_home/_data/secrets/initialAdminPassword`

`f6b8526a94ac41c4be65443ffab5ec96`


## Notes

- Task downloading resources (gradle wrapper and jars) may take longer for the first time due to large download size.
  Subsequent executions should be faster.

## References

- https://github.com/jenkinsci/docker/blob/master/README.md
- https://github.com/arnaud-deprez/demo-jenkins-pipeline-gradle/blob/master/Jenkinsfile
- https://www.youtube.com/watch?v=s73nhwYBtzE
- https://github.com/jenkinsci/pipeline-model-definition-plugin/wiki/Reporting-test-results-and-storing-artifacts

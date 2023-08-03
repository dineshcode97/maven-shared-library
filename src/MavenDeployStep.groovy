def call(String pomPath = 'pom.xml', String nexusUrl, String nexusUsername, String nexusPassword, String repositoryId) {
    // Maven deploy step
    sh "mvn -f ${pomPath} deploy -DskipTests -DaltDeploymentRepository=${repositoryId}::default::${nexusUrl}/repository/${repositoryId}/ -DrepositoryId=${repositoryId} -DrepositorySnapshots=${nexusUrl}/repository/${repositoryId}-snapshot/ -DrepositoryReleases=${nexusUrl}/repository/${repositoryId}/ -DrepositoryUsername=${nexusUsername} -DrepositoryPassword=${nexusPassword}"
}

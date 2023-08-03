def call(String pomPath = 'pom.xml') {
    // Maven build step
    sh "mvn -f ${pomPath} clean package"
}

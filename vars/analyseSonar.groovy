def call() {
    withSonarQubeEnv('next') {
        withMaven(maven: MAVEN_TOOL) {
            sh "mvn org.jacoco:jacoco-maven-plugin:prepare-agent package sonar:sonar -Dsonar.branch=${env.BRANCH_NAME}"
        }
    }
}
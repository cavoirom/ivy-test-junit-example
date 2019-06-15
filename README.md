# ivy-test-junit-example
Ivy example project for Ivy Test Runner and JUnit4

## How To
### 1. Ivy Test Runner
The *ivy-test-runner* provide API to delegate test execution to Ivy Engine, it's a maven project, you need to clone the project and install to your local repository.
##### Clone the *ivy-api* which is required to build *ivy-test-runner*
`git clone https://github.com/cavoirom/ivy-api.git`
##### Build and Install *ivy-api*
`mvn clean install`
##### Clone *ivy-test-runner*
`git clone https://github.com/cavoirom/ivy-test-runner.git`
##### Build and Install *ivy-test-runner*
`mvn clean install`

### 2. Ivy Test Server
The *ivy-test-server* will be deploy to Ivy Engine, it will receive test execution request from *ivy-test-runner* and execute the test cases.
##### Clone *ivy-test-server*
`git clone https://github.com/cavoirom/ivy-test-server.git`
##### Build and Install *ivy-test-server*
`mvn clean install`

### 3. Run Example
The example was configured to automatically start Ivy Engine, deploy *ivy-test-server* and ivy-test-junit-example* then run tests. Read the *pom.xml* for more information.
##### Clone *ivy-test-junit-example*
`git clone https://github.com/cavoirom/ivy-test-junit-example.git`
##### Run tests
`mvn clean verify`
##### Check result
You will see test run successfully in maven output, checking the *target/testEngineOut.log* will show some log written by test cases.

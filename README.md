# Camunda Platform Process Application
A Process Application for [Camunda Platform](http://docs.camunda.org).

This project has been generated by the Maven archetype
[camunda-archetype-servlet-war-7.19.0](https://docs.camunda.org/manual/latest/user-guide/process-applications/maven-archetypes/).

## Show me the important parts!
[BPMN Process](src/main/resources/process.bpmn)

## Camunda Setup Guide
### Setting Up Camunda:
- Download tar file from https://camunda.com/download/platform-7/
- Create a folder named Camunda in /opt
- Create a folder named camunda_bpm on /opt/camunda and move the tar file to it.
- Extract the tar file
- Run using ./start.sh (may required JAVA_HOME setup)
- Camunda will run on http://localhost:8080/camunda-welcome/index.html

### Setting Up Camunda Modeler:
- Download tar file from https://camunda.com/download/modeler/
- Extract on Camunda folder
- Enter the folder and run by ./camunda-modeler

### Creating Camunda Project:
- Initialize from https://start.camunda.com/
- Run with Intellij idea
- Another way is manually creating a Maven Archetype project.
- Archetype Remote Catalog: https://artifacts.camunda.com/artifactory/camunda-bpm/archetype-catalog.xml

- Archetype Dependency:


```<!-- https://mvnrepository.com/artifact/org.camunda.bpm.archetype/camunda-archetype-spring-boot -->
<dependency>
    <groupId>org.camunda.bpm.archetype</groupId>
    <artifactId>camunda-archetype-spring-boot</artifactId>
    <version>7.15.0</version>
</dependency>
```


### War File Deployment:




## How does it work?

## How to use it?

### Unit Test
You can run the JUnit test [ProcessTest](src/test/java/com/exos/camunda/CamundaSpringBootApp/ProcessTest.java) in your IDE or using:

```bash
mvn clean test
```

### Deployment to an Application Server
You can also build and deploy the process application to an application server.
For an easy start you can download Apache Tomcat with a pre-installed Camunda
from our [Download Page](https://camunda.com/download/).

#### Manually
1. Build the application using:

```bash
mvn clean package
```
2. Copy the *.war file from the `target` directory to the deployment directory
of your application server e.g. `tomcat/webapps` or `wildfly/standalone/deployments`.
For a faster 1-click (re-)deployment see the alternatives below.

#### Apache Tomcat (using Tomcat Maven Plugin)
1. Create a user in Tomcat with the role `manager-script`.
2. Add the user's credentials to the `tomcat7-maven-plugin` configuration in the [pom.xml](pom.xml) file.
3. Build and deploy the process application using:

```bash
mvn clean tomcat7:deploy
```

#### Wildfly (using Wildfly Maven Plugin)
1. Build and deploy the process application using:

```bash
mvn clean wildfly:deploy
```

#### JBoss AS7 (using JBoss AS Maven Plugin)
1. Build and deploy the process application using:
```bash
mvn clean jboss-as:deploy
```

### Run and Inspect with Tasklist and Cockpit
Once you deployed the application you can run it using
[Camunda Tasklist](http://docs.camunda.org/latest/guides/user-guide/#tasklist)
and inspect it using
[Camunda Cockpit](http://docs.camunda.org/latest/guides/user-guide/#cockpit).

## Environment Restrictions
Built and tested against Camunda Platform version 7.19.0.

## Known Limitations

## License
[Apache License, Version 2.0](http://www.apache.org/licenses/LICENSE-2.0).

<!-- Tweet
New @Camunda example: Camunda Platform Process Application - A Process Application for [Camunda Platform](http://docs.camunda.org). https://github.com/camunda-consulting/code/tree/master/snippets/CamundaSpringBootApp
-->
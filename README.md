# DropBookmarks

## Creating the structure of the project.
Pretty simple, use this Maven command:

    $ mvn archetype:generate -DgroupId=com.dwbook.phonebook -DartifactId=dwbook-phonebook -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
   
Where:
  - groupID:      the package structure of the project
  - artifactId:   the name of the application and the name of the directory

Remember, the artifactId is also the name of the project's directory. With GitHub, the 
name of the repo is also the name of the project's directory.

## Running the application
    $ java -jar target/dwbook-phonebook-1.0-SNAPSHOT.jar server
the server argument to the command. 

In public static void main, we called the public void run method, 
passing command-line arguments to it. Dropwizard has only one command 
preconfigured (although we're able to configure additional commands), 
the server command, which starts the embedded HTTP Server (Jetty) 
to run our service. 

## How to start the DropBookmarks application
---

1. Run `mvn clean install` to build your application
1. Start application with `java -jar target/DropBookmarks-1.0-SNAPSHOT.jar server config.yml`
1. To check that your application is running enter url `http://localhost:8080`

## Running the app with a config file
Here is the command to run the app with a config file.  Execute command in the root of the project:

    java -jar target/dwbook-phonebook-1.0-SNAPSHOT.jar server config.yaml

When a configuration file is passed as a command line argument, Dropwizard parses it and creates an instance of the configuration class.

## Health Check
---

To see your applications health enter url `http://localhost:8081/healthcheck`

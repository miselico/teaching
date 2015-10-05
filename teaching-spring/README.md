# Goal
The goal of the task is to get familiar with Spring framework.

# Prerequisites
Learn about spring boot (embedded application server for spring applications that automates a lot of spring application related configuration based on the libraries found in the classpath)

    https://spring.io/guides/gs/spring-boot/
    
Learn how to use spring CRUD repositories (note, that these are available only in Spring 4)
    
    https://spring.io/guides/gs/accessing-data-mongodb/ - explains how to set it up in the easiest possible way
    http://docs.spring.io/spring-data/mongodb/docs/current/reference/html/ - contains more information on how to use it
    
Check out some basic information about spring security:

    http://www.mkyong.com/spring-security/spring-security-hello-world-annotation-example/
    
Your users will be stored in your mongodb database. MongoDB can be downloaded from here:

    https://www.mongodb.org/downloads#production
    
You can start the database by simply going to the <installation directory>/bin/ and running mongod.exe.
    
# Task

In this exercise you will write a spring application that registers users and lets them log in. The user should first be presented with a registration form with the following input fields:

* email address
* password 
* repeat password

Once the fields are filled, the user presses the "register" button. That should trigger the HTTP POST request to the backend.
The backend then checks in the database if the user with the following email address already exists, if it does, it should return an error message to the client.
The backend should also make sure that the passwords are the same and at least 6 characters long and if they are not, it should return an appropriate error.
Whatever the error, it should be dynamically presented to the user without reloading the page.
If no error occurs during the registration, the user should be persisted with the provided email and password.

Once the user is registered, it should be possible for him to log in. You should use spring security framework for that purpose.
When the user is finally logged in, just display his email address.

#Hints

## Dependency injection in Spring
Spring framework provides you with dependency injection. In order to inject a resource into your controller or a service, you can use the @Autowired annotation, like in the following example

    @RestController
    public class IndexController {
        
        @Autowired
        private UserRepository userRepository;
    
        public void someMethodThatUsesUserRepository() {
            ...
        }
    }

This way spring will automatically initialize the userRepository before executing any of your methods.

In order to enable the connection to mongodb database, first add annotation to your configuration class/main class: @EnableMongoRepositories
and then add to your resources a file called application.properties and paste into it the following content

    spring.data.mongodb.host=localhost
    spring.data.mongodb.port=27017
    spring.data.mongodb.uri=mongodb://localhost/georpg
    spring.data.mongodb.repositories.enabled=true
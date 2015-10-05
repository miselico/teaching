# Goal
The goal of the task is to get familiar with Spring MVC and docker container.

# Prerequisites
Learn about spring boot (embedded application server for spring applications that automates a lot of spring application related configuration based on the libraries found in the classpath)

    https://spring.io/guides/gs/spring-boot/
    
Learn how to use spring CRUD repositories (note, that these are available only in Spring 4)
    
    https://spring.io/guides/gs/accessing-data-mongodb/ - explains how to set it up in the easiest possible way
    http://docs.spring.io/spring-data/mongodb/docs/current/reference/html/ - contains more information on how to use it
    
Learn about what docker is and how to use it:

    http://docs.docker.com/mac/started/
    
Your users will be stored in your mongo database. MongoDB can be downloaded from here:

    https://www.mongodb.org/downloads#production
    
You can start the database by simply going to the <installation directory>/bin/ and running mongod.exe.
    
# Task

## Part 1
In this exercise you will write a spring application that registers users. The user should first be presented with a registration form with the following input fields:

* email address
* password 
* repeat password

Once the fields are filled, the user presses the "register" button. That should trigger the ajax HTTP POST request to the backend.
The backend then checks in the database if the user with the following email address already exists, if it does, it should return an error message to the client.
The backend should also make sure that the passwords are the same and at least 6 characters long and if they are not, it should return an appropriate error.
Whatever the error, it should be dynamically presented to the user without reloading the page.
If no error occurs during the registration, the user should be persisted with the provided email and password.

At this point the form is already prepared for you. If you start the spring boot server (run fi.teachingspring.Main.main()), the page will be available at http://localhost:8080.
Note that for your convenience the page already contains JQuery, but you still have to write the ajax request yourself.

## Part 2
Since the application requires external resources (like the database for instance), it is good to generate one Docker image that contains all the necessary stuff.
This way, whenever a new developer joins the project, he doesn't have to spend hours trying to configure his development environment, but instead can generate a new Docker-based virtual machine
that already has everything pre-installed. Docker images are also useful when creating new test or even production environments.

#Hints

## HTTP POST request with JQuery
JQuery is one of the most popular JavaScript libraries. It provides convenient multi-browser functions that make it easier to perform most common JavaScript operations.
To see how to perform HTTP POST request, check out http://api.jquery.com/jquery.post/

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
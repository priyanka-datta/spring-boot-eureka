# spring-boot-eureka

There are 2 applications. One is eureka server and one is eureka client.

Eureka server application knows the information of all the client applications and it registers all the microservice applications. Eureka server application default port number is 8761.<br/>

Here spring-boot-eureka-client is a microservice and in this application one simple GET endpoint has been added. For all the microservices, server.port and spring.application.name should always be added in application.properties.<br/>

For testing the application, first we need to start the eureka server application and then we need to start all the client applications. 

# microservices
This is a simple application in microservice architecture. Hotels microservice connects to in-memory h2 database filled with information about hotels and their available rooms. It provides REST API to interact with it. Booking microservice sends requests to hotels microservice using Feign client and allows to book a room in the hotel. 

Technologies used: Spring framework (Boot, Data, Web MVC, Cloud), Hibernate as JPA provider, Feign client, Maven, Eureka service discovery and Zuul gateway.

TODO: add JWT security

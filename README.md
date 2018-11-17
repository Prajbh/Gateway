# Gateway

This project will simulate service discovery and load balancing functionality to a given set of services. <br />
It will be used in conjunction to a redis database which will serve as a service registry <br />


# To run
Make sure you have a running redis container<br />
docker pull redis <br />
docker run -p 6379:6379 redis <br /><br />

To run this project <br />
mvn spring-boot:run <br /><br />

# Endpoints 

POST http://localhost:8080/register <br />
Need to send service name and location as part of paylaod 

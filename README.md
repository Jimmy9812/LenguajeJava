
# Hello, Docker! - Spring Web Application

This is a simple project that uses **Spring** to create a web server that responds with a basic message: **"Hello, Docker! with Jimmy Maila"**. The project is containerized using Docker for easy deployment and portability.

## Technologies Used

- Java 17


## Description

This project demonstrates how to create a basic web application with Spring and how to containerize it using Docker. The web server responds with a personalized message when accessing the root route `/`.

## Requirements


## Usage Instructions

### Run the application locally with Docker

1. Clone this repository:

   ```bash
   git clone https://github.com/Jimmy9812/LenguajeJava.git
    ```
2. Run the application:
After cloning, you can start the application by navigating to the project directory and using Maven to run it:
```bash
mvn spring-boot:run
```
### Run the image of Docker Hub
You can pull and run it on any machine that has Docker installed
```
docker pull Jimmy9812/Lenguaje-java:latest

docker run -p 8081:8081 Jimmy9812/Lenguaje-java:latest
```
Usage
Once the application is running, you can access it at http://localhost:8081.

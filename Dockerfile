# Use a suitable base image with JDK
FROM openjdk:17-jdk-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file built from your Spring Boot project
COPY build/libs/docker-journey-1.0-SNAPSHOT.jar app.jar

VOLUME build/libs/docker-journey-1.0-SNAPSHOT.jar app.jar

# Expose the port your Spring Boot application listens on
EXPOSE 8080

# Define the command to run your application
CMD ["java", "-jar", "app.jar"]
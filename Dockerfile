# Use OpenJDK 17 as base image
FROM openjdk:17-jdk-slim

# Set application directory
WORKDIR /app

# Copy the JAR file into the container
COPY target/loc-api-0.0.1-SNAPSHOT.jar app.jar

# Expose the application port
EXPOSE 9082

# Run the JAR file when the container starts
ENTRYPOINT ["java", "-jar", "/app/app.jar"]

FROM openjdk:17-jdk-alpine
ENV PROFILE=docker
WORKDIR /app
COPY target/WTC-Security-0.0.1-SNAPSHOT.jar /app
COPY env.properties /app
EXPOSE 8080
CMD ["java", "-jar", "WTC-Security-0.0.1-SNAPSHOT.jar"]
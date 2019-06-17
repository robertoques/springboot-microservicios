FROM openjdk:8u151-jdk
CMD mkdir -p /app/
COPY target/spring-eureka-server-0.0.1-SNAPSHOT.jar /app/spring-eureka-server.jar
#COPY application.properties /app/application.properties
CMD java -jar /app/spring-eureka-server.jar
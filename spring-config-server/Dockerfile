FROM openjdk:8u151-jdk
CMD mkdir -p /app/
COPY target/spring-config-server-0.0.1.jar /app/spring-config-server.jar
#COPY application.properties /app/application.properties
CMD java -jar /app/spring-config-server.jar
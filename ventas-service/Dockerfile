FROM openjdk:8u151-jdk
CMD mkdir -p /app/
COPY target/ventas-service-0.0.1-SNAPSHOT.jar /app/ventas-service.jar
#COPY application.properties /app/application.properties
CMD java -jar /app/ventas-service.jar
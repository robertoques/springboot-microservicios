FROM openjdk:8u151-jdk
CMD mkdir -p /app/
COPY target/bodega-service-0.0.1-SNAPSHOT.jar /app/bodega-service.jar
COPY conf/application-dev.properties /app/application.properties
CMD java -jar /app/bodega-service.jar --spring.config.location=file:///app/application.properties
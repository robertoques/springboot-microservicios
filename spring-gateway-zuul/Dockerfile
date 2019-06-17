FROM openjdk:8u151-jdk
CMD mkdir -p /app/
COPY target/spring-gateway-zuul-0.0.1-SNAPSHOT.jar /app/spring-gateway-zuul.jar
#COPY application.properties /app/application.properties
CMD java -jar /app/spring-gateway-zuul.jar
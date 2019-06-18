FROM openjdk:8u151-jdk
CMD mkdir -p /app/
COPY target/hystrix-dashboard-0.0.1-SNAPSHOT.jar /app/hystrix-dashboard.jar
COPY conf/application-dev.properties /app/application.properties
CMD java -jar /app/hystrix-dashboard.jar --spring.config.location=file:///app/application.properties
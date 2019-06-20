#!/bin/bash

echo "[+] Constructor de microservicios"

cd spring-config-server/ && mvn package && cd ..

cd spring-eureka-server/ && mvn package && cd ..

cd bodega-service/ && mvn package && cd ..

cd ventas-service/ && mvn package && cd ..

cd compras-service/ && mvn package && cd ..

cd spring-gateway-zuul/ && mvn package && cd ..

cd spring-hystrix-dashboard/ && mvn package && cd ..

echo "[+] Proceso Terminado."
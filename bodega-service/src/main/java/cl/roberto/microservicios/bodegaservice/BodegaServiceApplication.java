package cl.roberto.microservicios.bodegaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BodegaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BodegaServiceApplication.class, args);
	}

}

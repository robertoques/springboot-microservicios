package cl.roberto.microservicios.bodegaservice;

import brave.sampler.Sampler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class BodegaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BodegaServiceApplication.class, args);
	}

	//Para Tracing, coloar en puntos de entrada
	@Bean
	public Sampler defaultSampler(){
		return Sampler.ALWAYS_SAMPLE;
	}
}

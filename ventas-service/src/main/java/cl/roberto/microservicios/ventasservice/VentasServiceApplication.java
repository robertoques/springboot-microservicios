package cl.roberto.microservicios.ventasservice;

import brave.sampler.Sampler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients("cl.roberto")
@EnableCircuitBreaker
@EnableHystrix
public class VentasServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(VentasServiceApplication.class, args);
	}

	//Para Tracing, coloar en puntos de entrada
	@Bean
	public Sampler defaultSampler(){
		return Sampler.ALWAYS_SAMPLE;
	}
}

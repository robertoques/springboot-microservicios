package cl.roberto.microservicios.springgatewayzuul;

import brave.sampler.Sampler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@SpringBootApplication
public class SpringGatewayZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringGatewayZuulApplication.class, args);
	}

	//Para Tracing, coloar en puntos de entrada
	@Bean
	public Sampler defaultSampler(){
		return Sampler.ALWAYS_SAMPLE;
	}
}

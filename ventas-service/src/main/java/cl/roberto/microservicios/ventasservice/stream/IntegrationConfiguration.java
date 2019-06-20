package cl.roberto.microservicios.ventasservice.stream;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.annotation.IntegrationComponentScan;

@Configuration
@EnableBinding(BodegaSource.class)
@IntegrationComponentScan
public class IntegrationConfiguration {
}

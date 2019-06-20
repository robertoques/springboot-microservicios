package cl.roberto.microservicios.bodegaservice.stream;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableBinding(BodegaSink.class)
public interface IntegrationConfiguration {
}

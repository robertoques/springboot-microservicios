package cl.roberto.microservicios.ventasservice.stream;

import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;

@MessagingGateway
public interface BodegaGateway {

    @Gateway(requestChannel = BodegaSource.CHANNEL_NAME)
    void generate(AvisoDTO avisoDTO);

}

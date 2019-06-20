package cl.roberto.microservicios.ventasservice.stream;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface BodegaSource {
    String CHANNEL_NAME = "ventachannel";

    @Output
    MessageChannel ventachannel();
}

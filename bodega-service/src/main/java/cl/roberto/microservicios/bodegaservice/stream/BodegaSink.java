package cl.roberto.microservicios.bodegaservice.stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface BodegaSink {
    String CHANNEL_NAME = "ventachannel";

    @Input
    SubscribableChannel ventachannel();

}

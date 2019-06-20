package cl.roberto.microservicios.bodegaservice.stream;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class BodegaReceptionHandler {

    @StreamListener(BodegaSink.CHANNEL_NAME)
    public void receptorMensaje(AvisoDTO avisoDTO){
        log.info("Recibido el siguiente mensaje : " + avisoDTO.toString());
    }
}

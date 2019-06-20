package cl.roberto.microservicios.ventasservice.controllers;

import cl.roberto.microservicios.ventasservice.stream.AvisoDTO;
import cl.roberto.microservicios.ventasservice.stream.BodegaGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StreamController {

    @Autowired
    private BodegaGateway bodegaGateway;

    //https://www.jorgehernandezramirez.com/2017/05/10/spring-cloud-stream-rabbitmq/

    // 1 https://www.baeldung.com/spring-cloud-stream
    // 2 https://www.paradigmadigital.com/dev/event-driven-microservicios-spring-cloud-stream/

    @RequestMapping("/stream-bodega")
    public AvisoDTO generarAviso(){
        final AvisoDTO avisoDTO = new AvisoDTO("1","name");
        bodegaGateway.generate(avisoDTO);
        return avisoDTO;
    }
}

package cl.roberto.microservicios.ventasservice.controllers;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FalloController {

    @GetMapping("/fallo")
    @HystrixCommand(fallbackMethod = "retornoSecundario")
    public String falloIntencional(){
        throw new RuntimeException("Fallo intencional");
    }

    public String retornoSecundario(){
        return "Todo bien!";
    }

}

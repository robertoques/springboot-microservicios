package cl.roberto.microservicios.ventasservice.controllers;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FalloController {

    //El cirucito se cierra si
    //Existe mas de 4 request y el umbral de errores es mas de 50% a la vez.
    //La evaluación de la condicións e realiza durante una ventana de 1200 ms
    //Se define un timeout para cada llamada de 1000ms
    //Se reintentará verificar si se puede abrir el circuito para una nueva request en 1500ms

    //1000 req por segundo por instancia se recomienda siempre el uso de thread en vez de semaphore


    //Referencias :
    //https://github.com/Netflix/Hystrix/wiki/Configuration#ThreadPool Custom thread.
    //https://github.com/Netflix/Hystrix/wiki/Configuration
    //https://picodotdev.github.io/blog-bitix/2018/10/tolerancia-a-fallos-en-un-cliente-de-microservicio-con-spring-cloud-netflix-y-hystrix/
    //https://cloud.spring.io/spring-cloud-static/spring-cloud-netflix/2.0.1.RELEASE/single/spring-cloud-netflix.html#_circuit_breaker_hystrix_clients
    //https://unpocodejava.com/2012/12/18/un-poco-de-hystrix-latency-and-fault-tolerance-for-distributed-systems/


    @GetMapping("/fallo")
    @HystrixCommand(fallbackMethod = "retornoSecundario", commandProperties = {
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "4"),
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "50"),
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "1500"),
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1000"),
            @HystrixProperty(name = "metrics.rollingStats.timeInMilliseconds", value = "1200")
    }
    )
    public String falloIntencional(){
        throw new RuntimeException("Fallo intencional");
    }

    public String retornoSecundario(){
        //Es posible encadenar varios fallback además, se puede implementar un cache
        //Como https://www.baeldung.com/guava-cache
        //Para evitar degradar el servicio, además de indicar que la info no esta actualizada.
        return "Todo bien!";
    }

}

package cl.roberto.microservicios.ventasservice.proxies;

import cl.roberto.microservicios.ventasservice.dto.VentaDTO;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(name = "bodega-service", url = "http://localhost:8081")
@FeignClient(name = "spring-gateway-zuul")
@RibbonClient(name = "bodega-service")
public interface BodegaServiceProxy {

    @GetMapping("/bodega-service/stocks/{idProducto}")
    public Integer realizarConsultaBodega(@PathVariable("idProducto") Integer idProducto);

}

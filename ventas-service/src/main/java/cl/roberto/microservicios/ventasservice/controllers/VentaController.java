package cl.roberto.microservicios.ventasservice.controllers;

import cl.roberto.microservicios.ventasservice.dto.VentaDTO;
import cl.roberto.microservicios.ventasservice.entities.Venta;
import cl.roberto.microservicios.ventasservice.proxies.BodegaServiceProxy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RestController
@Slf4j
public class VentaController {

    @Autowired
    private BodegaServiceProxy proxy;

    @PostMapping("/ventas")
    public void realizarVenta(@RequestBody Venta venta){
        log.info("realizarVenta : " + venta.toString());
    }

    @GetMapping("/ventas/{idVenta}")
    public VentaDTO realizarVenta(@PathVariable Integer idVenta){
        log.info("realizarVenta : "  + idVenta);

        Map<String, Integer> mapaParametros = new HashMap<>();
        mapaParametros.put("idProducto", idVenta);

        ResponseEntity<Integer> responseEntity = new RestTemplate().getForEntity(
                "http://localhost:8081/stocks/{idProducto}", Integer.class, mapaParametros);

        log.info("Body : " + responseEntity.getBody());
        return new VentaDTO(1,2,null);

    }

    @GetMapping("/ventas-feign/{idVenta}")
    public VentaDTO realizarVentaFeign(@PathVariable Integer idVenta){
        log.info("realizarVentaFeign : "  + idVenta);

        Map<String, Integer> mapaParametros = new HashMap<>();
        mapaParametros.put("idProducto", idVenta);

        Integer response = proxy.realizarConsultaBodega(idVenta);

        return new VentaDTO(1,response,null);

    }
}

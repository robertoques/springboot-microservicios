package cl.roberto.microservicios.bodegaservice.controller;

import cl.roberto.microservicios.bodegaservice.dto.ProductoCantidadDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/stocks")
@Slf4j
public class StockController {

    @GetMapping("/{idProducto}")
    public Integer obtenerStockPorProducto(@PathVariable Integer idProducto){
        log.info("obtenerStockPorProducto : " + idProducto);
        return idProducto;
    }

    @GetMapping("/add/{idProducto}/{cantidad}")
    public void incrementarStockProducto(@PathVariable Integer idProducto, @PathVariable Integer cantidad){
        log.info("incrementarStockProducto : " + idProducto + " " + cantidad);
    }

    @GetMapping("/sub/{idProducto/{cantidad}")
    public void disminuirStockProducto(@PathVariable Integer idProducto, @PathVariable Integer cantidad){
        log.info("disminuirStockProducto : " + idProducto + " " + cantidad);
    }

    @PostMapping("/sub")
    public void disminuirStock(@RequestBody List<ProductoCantidadDTO> listadoProducto){
        log.info("disminuirStock : " + listadoProducto.toString());
    }

    @PostMapping("/add")
    public void aumentarStock(@RequestBody List<ProductoCantidadDTO> listadoProducto){
        log.info("aumentarStock : " + listadoProducto.toString());
    }
}

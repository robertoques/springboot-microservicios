package cl.roberto.microservicios.bodegaservice.controller;

import cl.roberto.microservicios.bodegaservice.entities.Producto;
import cl.roberto.microservicios.bodegaservice.repository.ProductoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/productos")
@Slf4j
public class ProductoController {

    @Autowired
    private ProductoRepository repository;

    @GetMapping//("/")
    public List<Producto> obtenerTodosProductos(){
        log.info("obtenerTodosProductos : ");
        return repository.findAll();
    }

}

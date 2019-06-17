package cl.roberto.microservicios.bodegaservice.repository;

import cl.roberto.microservicios.bodegaservice.entities.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Integer>{

}

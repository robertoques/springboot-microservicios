package cl.roberto.microservicios.bodegaservice.repository;

import cl.roberto.microservicios.bodegaservice.entities.Bodega;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BodegaRepository extends JpaRepository<Bodega, Integer>{

}

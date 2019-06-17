package cl.roberto.microservicios.bodegaservice.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Bodega {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idBodega;
    @Column(name = "nombre")
    private String nombre;

    @OneToMany(mappedBy = "bodega", fetch = FetchType.LAZY)
    private List<Producto> productoList;

}

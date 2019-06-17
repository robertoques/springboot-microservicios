package cl.roberto.microservicios.bodegaservice.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idProducto;

    @Column(name = "nombre")
    private String nombre;

    @ManyToOne
    @JoinColumn
    private Bodega bodega;
}

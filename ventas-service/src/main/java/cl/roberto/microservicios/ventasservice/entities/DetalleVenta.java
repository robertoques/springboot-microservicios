package cl.roberto.microservicios.ventasservice.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class DetalleVenta {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idDetalleVenta;

    private Integer idProducto;
    private Integer cantidad;
    private Integer precio;
    private Integer subtotal;

    @ManyToOne
    @JoinColumn
    private Venta venta;
}

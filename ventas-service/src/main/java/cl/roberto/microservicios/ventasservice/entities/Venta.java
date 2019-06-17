package cl.roberto.microservicios.ventasservice.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Venta {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idVenta;

    private Integer total;

    @OneToMany(mappedBy = "venta", fetch = FetchType.LAZY)
    private List<DetalleVenta> detalleVentaList;
}

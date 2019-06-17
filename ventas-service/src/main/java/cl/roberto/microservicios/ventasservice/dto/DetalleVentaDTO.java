package cl.roberto.microservicios.ventasservice.dto;

import lombok.Data;

@Data
public class DetalleVentaDTO {

    private Integer idProducto;
    private Integer cantidad;
    private Integer precio;
    private Integer subtotal;
}

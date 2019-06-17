package cl.roberto.microservicios.ventasservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class VentaDTO {

    private Integer idVenta;
    private Integer total;
    private List<DetalleVentaDTO> listado;
}

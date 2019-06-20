package cl.roberto.microservicios.ventasservice.stream;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AvisoDTO {

    private String id;
    private String mensaje;
}

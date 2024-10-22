package cibertec.edu.pe.ef_fernandocastillo_pregunta3.dto.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UsuarioResponseDto {

    private Integer id;
    private String codigo;
    private String token;

}

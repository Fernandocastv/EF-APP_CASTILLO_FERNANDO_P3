package cibertec.edu.pe.ef_fernandocastillo_pregunta3.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String codigo;
    private String password;
    private String email;
    private String rol;
    private boolean activo;

}

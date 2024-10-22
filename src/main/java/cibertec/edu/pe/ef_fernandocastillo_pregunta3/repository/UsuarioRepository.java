package cibertec.edu.pe.ef_fernandocastillo_pregunta3.repository;

import cibertec.edu.pe.ef_fernandocastillo_pregunta3.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    Usuario findByCodigo(String codigo);

}

package com.javesitemas.cadastro_react.repository;

import com.javesitemas.cadastro_react.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}

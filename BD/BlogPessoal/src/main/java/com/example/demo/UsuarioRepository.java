package com.example.demo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<UsuarioModel, Long>{
	public Optional<UsuarioModel> findByUsuario(String usuario);

}

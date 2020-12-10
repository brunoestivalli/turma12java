//CADASTRO DE USUARIO E SENHA

package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@org.springframework.stereotype.Service
public class Service {

	@Autowired
	private UsuarioRepository repository;

	public UsuarioModel CadastrarUsuario(UsuarioModel usuario) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String senhaEncoder = encoder.encode(usuario.getSenha());
		usuario.setSenha(senhaEncoder);
		return repository.save(usuario);
	}
}

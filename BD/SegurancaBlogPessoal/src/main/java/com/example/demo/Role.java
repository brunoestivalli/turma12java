//PRIVILÉGIOS DE USUÁRIOS

package com.example.demo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.springframework.security.core.GrantedAuthority;

@Entity
public class Role implements GrantedAuthority {

	// Atributos
	@Id
	private String nomeRole;

	@ManyToMany(mappedBy = "roles")
	private List<UsuarioModel> usuarios;

	//Método de autoridades
	@Override
	public String getAuthority() {
		// TODO Auto-generated method stub
		return this.nomeRole;
	}

	// Getters e Setters
	public String getNomeRole() {
		return nomeRole;
	}

	public void setNomeRole(String nomeRole) {
		this.nomeRole = nomeRole;
	}

	public List<UsuarioModel> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<UsuarioModel> usuarios) {
		this.usuarios = usuarios;
	}

}

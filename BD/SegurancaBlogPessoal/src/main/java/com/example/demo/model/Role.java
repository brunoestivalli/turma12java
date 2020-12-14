package com.example.demo.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.springframework.security.core.GrantedAuthority;

@Entity
public class Role implements GrantedAuthority {

	@Id
    private String nome_role;

    @ManyToMany(mappedBy = "roles")
    private List<Usuario> usuarios;

    public String getNomeRole() {
        return nome_role;
    }

    public void setNomeRole(String nomeRole) {
        this.nome_role = nomeRole;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    @Override
    public String getAuthority() {
        return this.nome_role;
    }
}

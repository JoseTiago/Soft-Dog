package br.com.triadworks.loja.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import br.com.triadworks.loja.model.Cliente;
import br.com.triadworks.loja.model.Usuario;

@Component
@Scope("session")
public class UsuarioWeb {

	private Cliente usuario;

	public void loga(Cliente usuario) {
		this.usuario = usuario;
	}
	
	public Cliente getUsuario() {
		return usuario;
	}
	public boolean isLogado() {
		return usuario != null;
	}
	public void logout() {
		usuario = null;
	}

}

package br.com.triadworks.loja.service;

import br.com.triadworks.loja.model.Cliente;
import br.com.triadworks.loja.model.Usuario;

public interface UsuarioService {

	public Cliente autentica(String login, String senha);

}

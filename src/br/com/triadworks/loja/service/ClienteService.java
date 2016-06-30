package br.com.triadworks.loja.service;

import java.util.List;

import br.com.triadworks.loja.model.Cliente;

public interface ClienteService {

	public List<Cliente> listaTudo();
	
	public void adiciona(Cliente cliente);
	
	public void remove(Cliente cliente);
	
	public Cliente carrega(Integer id);
	
	public void atualiza(Cliente cliente);
	
	public List<Cliente> busca (String nome);
}

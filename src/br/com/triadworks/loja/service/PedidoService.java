package br.com.triadworks.loja.service;

import java.util.List;

import br.com.triadworks.loja.model.Cliente;
import br.com.triadworks.loja.model.Pedido;
import br.com.triadworks.loja.model.Usuario;

public interface PedidoService {

	public List<Pedido> listaTudo();
	
	public void adiciona(Pedido pedido);
	
	public void remove(Pedido pedido);
	
	public Cliente carrega(Integer id);
	
	public void atualiza(Pedido pedido);
	
	public List<Cliente> busca (String nome);
	
}

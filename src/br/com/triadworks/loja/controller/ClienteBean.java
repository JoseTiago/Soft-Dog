package br.com.triadworks.loja.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.component.UIForm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import br.com.triadworks.loja.model.Cliente;
import br.com.triadworks.loja.service.ClienteService;
import br.com.triadworks.loja.service.ProdutoService;
import br.com.triadworks.loja.util.FacesUtils;

@Component
@Scope("request")
public class ClienteBean {

	private Cliente cliente = new Cliente();
	private List<Cliente> clientes = new ArrayList<Cliente>();
	
	private static final String ESTADO_DE_PESQUISA = "_pesquisa";
	private static final String ESTADO_NOVO = "_novo";
	private static final String ESTADO_DE_EDICAO = "_edicao";
	
	private String state = ESTADO_DE_PESQUISA;
	
	private UIForm form; 
	
	private final ClienteService clienteService;
	private final FacesUtils facesUtils;
	
	@Autowired
	public ClienteBean(ClienteService clienteService, FacesUtils facesUtils){
	
		this.clienteService = clienteService;
		this.facesUtils = facesUtils;	
		
	}
	
	public void lista(){
		clientes = clienteService.listaTudo();
		setState(ESTADO_DE_PESQUISA);
	}
	
	public void preparaParaAdicionar(){
		limpa();
		setState(ESTADO_NOVO);
	}
	
	public void adiciona(){
		clienteService.adiciona(cliente);
		facesUtils.adicionaMensagemDeInformacao("Cliente adicionado com suesso!");
		lista();
	}
	
	public void remove(){
		clienteService.remove(cliente);
		facesUtils.adicionaMensagemDeInformacao("Cliente removido com Sucesso!");
		lista();
	}
	
	public void preparaParaAlterar(){
		this.cliente = clienteService.carrega(cliente.getId());
		setState(ESTADO_DE_EDICAO);
	}
	
	public void alterar(){
		clienteService.atualiza(cliente);
		facesUtils.adicionaMensagemDeInformacao("Produto alterado com Sucesso");
	}
	
	public void voltar(){
		limpa();
		setState(ESTADO_DE_PESQUISA);
	}
	
	private void limpa() {
		cliente = new Cliente();
		facesUtils.cleanSubmittedValues(form);
		
	}
	
	public boolean isPesquisando(){
		return ESTADO_DE_PESQUISA.equals(state);
	}
	
	public boolean isEditando(){
		return ESTADO_DE_EDICAO.equals(state);
	}
	
	public boolean isAdicionando(){
		return ESTADO_NOVO.equals(state);
	}
	

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}
	
	public String getState() {
		return state;
	}

	private void setState(String state) {
		this.state = state;
		
	}

	public UIForm getForm() {
		return form;
	}

	public void setForm(UIForm form) {
		this.form = form;
	}	
}
 
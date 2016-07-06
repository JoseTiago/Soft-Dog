package br.com.triadworks.loja.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.component.UIForm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import br.com.triadworks.loja.model.Pedido;
import br.com.triadworks.loja.service.ClienteService;
import br.com.triadworks.loja.service.PedidoService;
import br.com.triadworks.loja.util.FacesUtils;

@Component
@Scope("request")
public class PedidoBean {

	private Pedido pedido = new Pedido();
	private List<Pedido> pedidos = new ArrayList<Pedido>();
	
	private static final String ESTADO_DE_PESQUISA = "_pesquisa";
	private static final String ESTADO_NOVO = "_novo";
	private static final String ESTADO_DE_EDICAO = "_edicao";
	
	private String state = ESTADO_DE_PESQUISA; 
	
	private UIForm form; 
	
	private final PedidoService pedidoService;
	private final FacesUtils facesUtils;

	@Autowired
	public PedidoBean(PedidoService pedidoService, FacesUtils facesUtils){
		
		this.pedidoService.listaTudo();
		this.facesUtils = facesUtils;
	}
	
	public void lista(){
		pedidos = pedidoService.listaTudo();
		setState(ESTADO_DE_PESQUISA);
	}
	
	public void preparaParaAdicionar(){
		limpa();
		setState(ESTADO_NOVO);
	}
	
	public void adiciona(){
		pedidoService.adiciona(pedido);
		facesUtils.adicionaMensagemDeInformacao("Cliente adicionado com suesso!");
		lista();
	}
	
	public void remove(){
		pedidoService.remove(pedido);
		facesUtils.adicionaMensagemDeInformacao("Pedido removido com Sucesso!");
		lista();
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public UIForm getForm() {
		return form;
	}

	public void setForm(UIForm form) {
		this.form = form;
	}

	public PedidoService getPedidoService() {
		return pedidoService;
	}
	
	
}

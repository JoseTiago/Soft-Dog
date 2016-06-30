package br.com.triadworks.loja.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.component.UIForm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import br.com.triadworks.loja.model.Cliente;
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
	
	
}
 
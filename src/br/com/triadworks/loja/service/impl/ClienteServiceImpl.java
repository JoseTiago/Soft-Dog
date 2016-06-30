package br.com.triadworks.loja.service.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContexts;

import org.springframework.stereotype.Service;

import br.com.triadworks.loja.model.Cliente;
import br.com.triadworks.loja.service.ClienteService;


@Service("clienteService")
public class ClienteServiceImpl implements ClienteService {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	public List<Cliente> listaTudo(){
		return entityManager.createQuery("from Cliente").getResultList();
	}

	public void adiciona(Cliente cliente){
		entityManager.persist(cliente);
	}
	
	public void atualiza(Cliente cliente){
		entityManager.merge(cliente);
	}
	
	public Cliente carrega(Integer id) {
		return entityManager.find(Cliente.class, id);
	}
	
	public void remove(Cliente cliente){
		entityManager.remove(entityManager.merge(cliente));
	}
	
	@SuppressWarnings("unchecked")
	public List<Cliente> busca(String nome){
		if(nome == null || "".equals(nome)){
			return Collections.EMPTY_LIST;
		}
		
		return entityManager
				.createQuery("from Cliente p where lower(p.nome) like lower(:nome)")
				.setParameter("nome", "%" + nome + "%")
				.getResultList();
	}

	
	
}

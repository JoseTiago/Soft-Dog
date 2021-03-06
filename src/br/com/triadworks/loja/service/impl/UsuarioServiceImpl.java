package br.com.triadworks.loja.service.impl;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Service;

import br.com.triadworks.loja.model.Cliente;
import br.com.triadworks.loja.model.Usuario;
import br.com.triadworks.loja.service.UsuarioService;

@Service("usuarioService")
public class UsuarioServiceImpl implements UsuarioService {

	@PersistenceContext
	EntityManager entityManager;
	
	public Cliente autentica(String login, String senha) {
		String hql = "from Cliente u where u.login = :login and u.senha = :senha";
		Query query = entityManager.createQuery(hql)
			.setParameter("login", login)
			.setParameter("senha", senha);
		try {
			return (Cliente) query.getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
	}

}

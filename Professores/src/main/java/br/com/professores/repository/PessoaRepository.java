package br.com.professores.repository;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.professores.model.Pessoa;

@Stateless
public class PessoaRepository {

	@PersistenceContext
	private EntityManager em;
	
	public void persist(Pessoa pessoa) {
		em.persist(pessoa);
		
	}
	
}
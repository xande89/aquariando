package org.aquariando.model.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.aquariando.model.vo.UsuarioVO;
import org.springframework.stereotype.Component;

@Component		
public class UsuarioDao {
	@PersistenceContext
	private EntityManager entityManager;
	
	public UsuarioVO obtemUsuarioPorCredenciaisNativas(UsuarioVO usuario)
	{
		Query q = entityManager.createNativeQuery("Select u from Usuario u where senha=:senha AND email=:email");
		q.setParameter("senha", usuario.getSenha());
		q.setParameter("email", usuario.getEmail());
		
		return (UsuarioVO) q.getSingleResult();
		
	}
}


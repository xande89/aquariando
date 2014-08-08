package org.aquariando.model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.aquariando.model.vo.AquarioVO;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class AquarioDaoImpl implements AquarioDao {
	
	@PersistenceContext
	private EntityManager entityManager;

	
	@Transactional
	public void cria(AquarioVO aquario) {
		entityManager.persist(aquario);
		entityManager.flush();
//		entityManager.clear();

	}

	public void altera(AquarioVO aquario) {
		// TODO Auto-generated method stub

	}

	public void deleta(AquarioVO aquario) {
		// TODO Auto-generated method stub

	}
	
	@SuppressWarnings("unchecked")
	public List<AquarioVO> listar() 
	{
		return (List<AquarioVO>)entityManager.createQuery("select a from Aquario a")
		.getResultList();
		
	}

}

package org.aquariando.model.dao;

import java.util.List;

import org.aquariando.model.vo.AquarioVO;


public interface AquarioDao {

	public void cria(AquarioVO aquario);
	
	public void altera(AquarioVO aquario);
	
	public void deleta(AquarioVO aquario);
	
	public List<AquarioVO> listar();
	
	
}

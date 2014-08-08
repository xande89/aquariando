package org.aquariando.controller;

import java.util.List;

import org.aquariando.model.dao.AquarioDao;
import org.aquariando.model.vo.AquarioVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("aquarioService")
public class AquarioServiceImpl implements AquarioService {
	
	private AquarioVO aquario = new AquarioVO();
	
	@Autowired
	private AquarioDao aquarioDao;
	
	public void criaAquario(){
		aquarioDao.cria(aquario);
		aquario= new AquarioVO();
	}
	public List<AquarioVO> listar() {
		return aquarioDao.listar();
	}
	
	public AquarioVO getAquario() {
		return aquario;
	}

	public void setAquario(AquarioVO aquario) {
		this.aquario = aquario;
	}

	public AquarioDao getAquarioDao() {
		return aquarioDao;
	}

	public void setAquarioDao(AquarioDao aquarioDao) {
		this.aquarioDao = aquarioDao;
	}

	
	
	
}

package org.aquariando.controller;

import java.util.List;

import org.aquariando.model.vo.AquarioVO;

public interface AquarioService {
	
	public void criaAquario();
	public List<AquarioVO> listar();
	public AquarioVO getAquario();

}

package org.meuaqua.aquario.bean;

import java.util.List;

import junit.framework.Assert;

import org.aquariando.controller.AquarioService;
import org.aquariando.model.vo.AquarioVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@ContextConfiguration("/test-context.xml")
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
public class NovoAquarioTeste {
	
	@Autowired
	private AquarioService aquarioService;
	
	@Test
	public void testaInsercao(){

		
		AquarioVO aquario = aquarioService.getAquario();
		aquario.setAltura(Float.parseFloat("20"));
		aquario.setComprimento(Float.parseFloat("20"));
		aquario.setLargura(Float.parseFloat("20"));
		
		
		
		aquarioService.criaAquario();
		List<AquarioVO> listaAquarios = aquarioService.listar();
		
		Assert.assertEquals(1, listaAquarios.size());
		
		
	}
	

}

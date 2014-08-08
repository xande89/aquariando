package org.aquariando.controller;

import java.io.IOException;

import javax.faces.context.FacesContext;

import org.aquariando.model.dao.UsuarioDao;
import org.aquariando.model.vo.UsuarioVO;
import org.primefaces.context.RequestContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LoginController {

	@Autowired
	private UsuarioDao usuarioDao;
	
	private UsuarioVO usuario;
	
	public String fazLogin(){
		
		RequestContext requestContext = RequestContext.getCurrentInstance();
		
		usuarioDao.obtemUsuarioPorCredenciaisNativas(usuario);	
		try {
			FacesContext.getCurrentInstance().getExternalContext().redirect("index.xhtml");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public UsuarioDao getUsuarioDao() {
		return usuarioDao;
	}

	public void setUsuarioDao(UsuarioDao usuarioDao) {
		this.usuarioDao = usuarioDao;
	}

	public UsuarioVO getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioVO usuario) {
		this.usuario = usuario;
	}
	
	
	
}

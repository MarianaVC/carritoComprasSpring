package com.carritocompras.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carritocompras.dao.UsuarioDAO;
import com.carritocompras.dao.Usuario;



@Service("usuarioService")
public class UsuarioService {

	private UsuarioDAO usuarioDao;
	@Autowired
	public void setUsuarioDao(UsuarioDAO usuarioDao) {
		this.usuarioDao = usuarioDao;
	}
	
	public List<Usuario> getCurrent(){
		return usuarioDao.getUsuario();
	}

}

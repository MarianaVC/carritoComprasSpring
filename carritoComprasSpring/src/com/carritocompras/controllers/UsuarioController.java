package com.carritocompras.controllers;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.carritocompras.dao.Usuario;
import com.carritocompras.service.UsuarioService;

@Controller
/*
 * @author Mariana Esta clase se encarga de recibir las peticiones para resolver
 * las vistas.
 */
public class UsuarioController {

	private UsuarioService usuarioService;

	@Autowired
	public void setUsuarioService(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}

	@RequestMapping("/usuarios")
	public String showUsuarios(Model model) {
		List<Usuario> usuarios = usuarioService.getCurrent();
		model.addAttribute("usuarios", usuarios);
		return "usuarios";
	}

	@RequestMapping(value="/test", method=RequestMethod.GET)
	public String showTest(Model model, @RequestParam("id")String id) {
		System.out.println("EL ID ES:" + id);
		return "home";
	}

	@RequestMapping("/crearUsuario")
	public String crearUsuario() {
		return "crearUsuario";
	}

}

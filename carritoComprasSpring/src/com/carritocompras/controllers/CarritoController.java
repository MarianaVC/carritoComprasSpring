package com.carritocompras.controllers;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
/*
 * @author Mariana
 * Esta clase se encarga de recibir las peticiones para resolver las vistas. 
 */
public class CarritoController {
//	Si se val root del proyecto regresamos home. 	
	@RequestMapping("/")
	public String showHome(){
		
//		session.setAttribute("nombre","mariana");
//		El nombre lógico de la vista home es manejado por el ViewResolver. bean id : vistasViewResolver		
		ModelAndView mv = new ModelAndView("home");
		Map<String, Object> model = mv.getModel();
		
		model.put("nombre", "Mariana");
		
		return "home";
		
	}

}

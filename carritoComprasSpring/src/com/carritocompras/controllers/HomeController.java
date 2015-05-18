package com.carritocompras.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.carritocompras.dao.Usuario;

@Controller
public class HomeController {

	// Si se val root del proyecto regresamos home.
	@RequestMapping("/")
	public String showHome() {
	
		return "home";
	}
}

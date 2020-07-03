package com.redsocial.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.redsocial.entidad.categoria;
import com.redsocial.entidad.galleta;
import com.redsocial.servicio.CategoriaService;
import com.redsocial.servicio.GalletaService;

@Controller
public class GalletaController {

	@Autowired
	private GalletaService galletaService;
	private CategoriaService categoriaService;
	
	@RequestMapping("/verRegistroGalleta")
	public String verRegGalleta() {
	return "registraGalleta";
	}
	
	//Permite retornar datos en formato json, sirve para llenar el como de categoria
	@ResponseBody
	@RequestMapping("/verCategoria")
	public List<categoria> cargaComboCategoria() {
	return categoriaService.listarTodos();
	}


	@RequestMapping("/registroDeGalleta")
	public String verRegGalleta(galleta obj, HttpSession session) {
		galleta objRep =  galletaService.insertaGalleta(obj);
		if(objRep == null) {
			session.setAttribute("MENSAJE", "Registro erróneo");
		}else {
			session.setAttribute("MENSAJE", "Registro exitos");
		}
		return "registraGalleta";
	}
}

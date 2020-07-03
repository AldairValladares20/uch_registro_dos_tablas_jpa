package com.redsocial.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.redsocial.entidad.categoria;
import com.redsocial.repositorio.CategoriaRepositorio;

public class CategoriaServiceImp implements CategoriaService{

	@Autowired
	private CategoriaRepositorio repositorio;
	@Override
	public List<categoria> listarTodos() {
		return repositorio.findAll();
	}

}

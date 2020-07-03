package com.redsocial.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.redsocial.entidad.galleta;
import com.redsocial.repositorio.GalletaRepositorio;

@Service
public class GalletaServiceImp implements GalletaService{

	@Autowired
	private GalletaRepositorio repositorio;

	@Override
	public galleta insertaGalleta(galleta obj) {
		return repositorio.save(obj);
	}
}


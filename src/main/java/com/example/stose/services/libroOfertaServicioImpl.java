package com.example.stose.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.stose.entity.libroOferta;
import com.example.stose.repositories.libroOfertaRepositorio;

@Service
public class libroOfertaServicioImpl implements libroOfertaServicio {

	@Autowired
	private libroOfertaRepositorio repositorio;

	@Override
	public List<libroOferta> listarTodosLosLibros() {
		return repositorio.findAll();
	}

}
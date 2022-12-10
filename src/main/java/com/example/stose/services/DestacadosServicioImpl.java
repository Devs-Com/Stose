package com.example.stose.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.stose.entity.destacados;
import com.example.stose.repositories.destacadosRepositorio;

@Service
public class DestacadosServicioImpl implements DestacadosServicio {

	@Autowired
	private destacadosRepositorio repositorio;

	@Override
	public List<destacados> listarTodosLosLibros() {
		return repositorio.findAll();
	}

}
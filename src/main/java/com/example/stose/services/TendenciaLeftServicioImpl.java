package com.example.stose.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.stose.entity.TendenciaLeft;
import com.example.stose.repositories.TendenciaLeftRepositorio;

@Service
public class TendenciaLeftServicioImpl implements TendenciaLeftServicio {

	@Autowired
	private TendenciaLeftRepositorio repositorio;

	@Override
	public List<TendenciaLeft> listarTodosLosLibros() {
		return repositorio.findAll();
	}

}
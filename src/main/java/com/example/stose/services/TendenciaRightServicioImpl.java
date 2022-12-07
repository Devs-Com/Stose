package com.example.stose.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.stose.entity.TendenciaRight;
import com.example.stose.repositories.TendenciaRightRepositorio;

@Service
public class TendenciaRightServicioImpl implements TendenciaRightServicio {

	@Autowired
	private TendenciaRightRepositorio repositorio;

	@Override
	public List<TendenciaRight> listarTodosLosLibros() {
		return repositorio.findAll();
	}

}
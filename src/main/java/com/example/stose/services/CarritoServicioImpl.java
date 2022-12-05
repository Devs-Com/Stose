package com.example.stose.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.stose.entity.Carrito;
import com.example.stose.repositories.CarritoRepositorio;

@Service
public class CarritoServicioImpl implements CarritoServicio {
    
    @Autowired
	private CarritoRepositorio repositorio;

	@Override
	public List<Carrito> listarTodosLosLibros() {
		return repositorio.findAll();
	}

	@Override
	public Carrito obtenerLibroPorId(Long id) {
		return repositorio.findById(id).get();
	}

	@Override
	public Carrito actualizarLibro(Carrito carrito) {
		return repositorio.save(carrito);
	}

	@Override
	public void eliminarLibro(Long id) {
		repositorio.deleteById(id);

	}

}

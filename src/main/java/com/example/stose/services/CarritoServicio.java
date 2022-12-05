package com.example.stose.services;

import java.util.List;

import com.example.stose.entity.Carrito;

public interface CarritoServicio {

	public List<Carrito> listarTodosLosLibros();
	
	public Carrito obtenerLibroPorId(Long id);

    public Carrito actualizarLibro(Carrito carrito);
	
	public void eliminarLibro(Long id);
}
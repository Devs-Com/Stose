package com.example.stose.services;

import java.util.List;

import com.example.stose.entity.Carrito;

public interface CarritoServicio {

	public List<Carrito> listarTodosLosLibros();

	public Carrito guardarLibro(Carrito libro);
	
	public Carrito obtenerLibroPorId(Long id);
	
	public void eliminarLibro(Long id);

	public void eliminarLibroDeCarrito(Long id);
}
package com.example.stose.services;

import java.util.List;

import com.example.stose.entity.Libro;

public interface LibroService {

	public List<Libro> listarTodosLosLibros();
	
	public Libro guardarLibro(Libro libro);
	
	public Libro obtenerLibroPorId(Long id);
	
	public Libro actualizarLibro(Libro libro);
	
	public void eliminarLibro(Long id);
}

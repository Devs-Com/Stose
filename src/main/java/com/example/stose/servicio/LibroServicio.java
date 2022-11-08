package com.example.stose.servicio;

import java.util.List;

import com.example.stose.entidad.Libro;

public interface LibroServicio {

	public List<Libro> listarTodosLosLibros();
	
	public Libro guardarLibro(Libro libro);
	
	public Libro obtenerLibroPorId(Long id);
	
	public Libro actualizarLibro(Libro libro);
	
	public void eliminarLibro(Long id);
}

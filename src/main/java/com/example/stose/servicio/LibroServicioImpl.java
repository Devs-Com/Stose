package com.example.stose.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.stose.entidad.Libro;
import com.example.stose.repositorio.LibroRepositorio;

@Service
public class LibroServicioImpl implements LibroServicio {

	@Autowired
	private LibroRepositorio repositorio;

	@Override
	public List<Libro> listarTodosLosLibros() {
		return repositorio.findAll();
	}

	@Override
	public Libro guardarLibro(Libro libro) {
		return repositorio.save(libro);
	}

	@Override
	public Libro obtenerLibroPorId(Long id) {
		return repositorio.findById(id).get();
	}

	@Override
	public Libro actualizarLibro(Libro libro) {
		return repositorio.save(libro);
	}

	@Override
	public void eliminarLibro(Long id) {
		repositorio.deleteById(id);

	}

}

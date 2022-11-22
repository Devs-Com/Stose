package com.example.stose.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.stose.entity.Libro;
import com.example.stose.repositories.LibroRepositorie;

@Service
public class LibroServiceImpl implements LibroService {

	@Autowired
	private LibroRepositorie repositorio;

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

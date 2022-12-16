package com.example.stose.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.stose.entity.Libro;
import com.example.stose.services.LibroService;

@Controller
@RequestMapping("/inicio")
public class LibroController {
	
	@Value("${title.libros}")
	private String TitlePage;

	@Autowired
	private LibroService servicio;

	@GetMapping({ "/inicio", "/libros" })
	public String listarLibros(Model modelo) {
		modelo.addAttribute("libros", servicio.listarTodosLosLibros());

		modelo.addAttribute("TituloPagina", TitlePage);

		return "libros";
	}

	@GetMapping("/libros/nuevo")
	public String mostrarFormularioDeRegistrarLibro(Model modelo) {
		Libro libro = new Libro();
		modelo.addAttribute("libro", libro);
		return "crear_libro";
	}

	@PostMapping("/libros")
	public String guardarLibro(@ModelAttribute("libro") Libro libro) {
		servicio.guardarLibro(libro);
		return "redirect:/inicio/libros";
	}

	@GetMapping("/libros/editar/{id}")
	public String mostrarFormularioDeEditar(@PathVariable Long id, Model modelo) {
		modelo.addAttribute("libro", servicio.obtenerLibroPorId(id));
		return "editar_libro";
	}

	@PostMapping("/libros/{id}")
	public String actualizarLibro(@PathVariable Long id, @ModelAttribute("libro") Libro libro,
			Model modelo) {
		Libro libroExistente = servicio.obtenerLibroPorId(id);
		libroExistente.setId(id);
		libroExistente.setImg(libro.getImg());
		libroExistente.setTitulo(libro.getTitulo());
		libroExistente.setAutor(libro.getAutor());
		libroExistente.setId_editorial(libro.getId_editorial());
		libroExistente.setId_categoria(libro.getId_categoria());
		libroExistente.setId_subcategoria(libro.getId_subcategoria());
		libroExistente.setDescripcion(libro.getDescripcion());
		libroExistente.setPrecio_original(libro.getPrecio_original());
		libroExistente.setPrecio_descuento(libro.getPrecio_descuento());
		libroExistente.setPorcentaje_descuento(libro.getPorcentaje_descuento());
		libroExistente.setNumero_pagina(libro.getNumero_pagina());
		libroExistente.setYear_publicacion(libro.getYear_publicacion());
		libroExistente.setDisponible(libro.getDisponible());
		libroExistente.setDisponible(libro.getDescripcion());

		servicio.actualizarLibro(libroExistente);
		return "redirect:/inicio/libros";
	}

	@GetMapping("/libros/{id}")
	public String eliminarLibro(@PathVariable Long id) {
		servicio.eliminarLibro(id);
		return "redirect:/inicio/libros";
	}
}

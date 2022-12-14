package com.example.stose.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.stose.entity.Carrito;
import com.example.stose.entity.Libro;
import com.example.stose.model.detalleLibroModel;
import com.example.stose.model.indexModel;
import com.example.stose.services.CarritoServicio;
import com.example.stose.services.LibroService;



@Controller
@RequestMapping("/inicio")
public class detalleLibroController {
	
	@Value("${title.detallelibro}")
	private String titlePage;

	@Autowired
	private LibroService servicio;

	@Autowired
	private CarritoServicio servicio2;
    
    @GetMapping({ "/detalle-libro", "Detalle-Libro" })
    public String ControllerDetalleLibro(Model model) {
    	
    	        //CARRITO DE COMPRAS
    	indexModel CarritoC = new indexModel();
		CarritoC.setCarritoCompras1("/*Nombre de libro*/");
		CarritoC.setCarritoCompras2("/*Nombre de libro*/");
		CarritoC.setCarritoCompras3("/*Nombre de libro*/");
		CarritoC.setCarritoCompras4("/*Nombre de libro*/");
		
		List<indexModel> ListCarritoC = new ArrayList<>();
		ListCarritoC.add(CarritoC);
		
		//SECCION Lista de Deseos
		indexModel LibrosDeseados = new indexModel();
		LibrosDeseados.setLibroDeseado1("/*Nombre de libro*/");
		LibrosDeseados.setLibroDeseado2("/*Nombre de libro*/");
		LibrosDeseados.setLibroDeseado3("/*Nombre de libro*/");
		LibrosDeseados.setLibroDeseado4("/*Nombre de libro*/");
		List<indexModel> ListLibrosDeseados = new ArrayList<>();
		ListLibrosDeseados.add(LibrosDeseados);
    			
    			//DETALLE LIBROS
    			
    			detalleLibroModel DetalleLibro = new detalleLibroModel();
    			
    			DetalleLibro.setTitulo("/*Nombre del libro*/");
    			DetalleLibro.setAutor("/*Nombre de autor*/ - /*Nombre editorial*/");
    			
    			List<detalleLibroModel> ListDetalleLibro = new ArrayList<>();
    			ListDetalleLibro.add(DetalleLibro);
    			
    			//DESCRIPCION
    			
    			detalleLibroModel Descripcion = new detalleLibroModel();
    			
    			Descripcion.setContenido("Lorem ipsum dolor sit amet consectetur adipisicing elit. Porro, iure quas optio necessitatibus aperiam sed tempora amet assumenda ducimus excepturi nobis omnis ad expedita saepe odit delectus placeat maxime corporis.");
    			
    			List<detalleLibroModel> ListDescripcion = new ArrayList<>();
    			ListDescripcion.add(Descripcion);
    			
    			//INFORMACION
    			detalleLibroModel Informacion = new detalleLibroModel();
    			
    			Informacion.setAutorInfo("  /*Nombre de autor*/");
    			Informacion.setCategoria(" /*Nombre categoria*/");
    			Informacion.setAnoPublicacion(" #");
    			Informacion.setEditorial(" /*Nombre editorial*/");
    			Informacion.setNumeroPaginas("#");
    			
    			List<detalleLibroModel> ListInformacion = new ArrayList<>();
    			ListInformacion.add(Informacion);
    			
    			
    			
    			//LIBROS RELACIONADOS
    			detalleLibroModel LibroR = new detalleLibroModel();
    			
    			LibroR.setLibroRelacionado1("/*Nombre de libro*/");
    			LibroR.setLibroRelacionado2("/*Nombre de libro*/");
    			LibroR.setLibroRelacionado3("/*Nombre de libro*/");
    			LibroR.setLibroRelacionado4("/*Nombre de libro*/");
    			LibroR.setLibroRelacionado5("/*Nombre de libro*/");
    			LibroR.setLibroRelacionado6("/*Nombre de libro*/");
    			LibroR.setLibroRelacionado7("/*Nombre de libro*/");
    			LibroR.setLibroRelacionado8("/*Nombre de libro*/");
    			
    			List<detalleLibroModel> ListLibroR = new ArrayList<>();
    			ListLibroR.add(LibroR);
    			
    			//Categoria
    			
    			indexModel SubCategoria = new indexModel();
    			SubCategoria.setSubCategoria1("Arquitectura");
    			SubCategoria.setSubCategoria2("Artes Escénicas");
    			SubCategoria.setSubCategoria3("Aspectos Generales del Arte");
    			SubCategoria.setSubCategoria4("Diseño Industrial y Comercial");
    			SubCategoria.setSubCategoria5("Enfoques del Arte");
    			SubCategoria.setSubCategoria6("Expresiones Artísticas del Arte");
    			SubCategoria.setSubCategoria7("Fotografía");
    			SubCategoria.setSubCategoria8("Música");
    			SubCategoria.setSubCategoria9("Biografías");
    			SubCategoria.setSubCategoria10("Historia y Crítica Literaria");
    			SubCategoria.setSubCategoria11("Obras de Teatro");
    			SubCategoria.setSubCategoria12("Textos Antiguos, Clásicos y Mediavales");
    			SubCategoria.setSubCategoria13("Poesía");
    			SubCategoria.setSubCategoria14("Ciencias de la Tierra/Geociencias");
    			SubCategoria.setSubCategoria15("El Medioambiente");
    			SubCategoria.setSubCategoria16("Geografía");
    			SubCategoria.setSubCategoria17("Planificación Regional y Zonal");
    			SubCategoria.setSubCategoria18("Aplicaciones Empresariales y de Negocios");
    			SubCategoria.setSubCategoria19("Aplicaciones Gráficas y multimedia");
    			SubCategoria.setSubCategoria20("Aplicaciones Prácticas de Tecnología de la Información");
    			SubCategoria.setSubCategoria21("Bases de Datos");
    			SubCategoria.setSubCategoria22("Certificación Informática");
    			SubCategoria.setSubCategoria23("Ciencias de la Computación");
    			SubCategoria.setSubCategoria24("Redes y Comunicaciones");
    			SubCategoria.setSubCategoria25("Seguridad Informática");
    			SubCategoria.setSubCategoria26("Actividades Recreativas al Aire Libre");
    			SubCategoria.setSubCategoria27("Atletismo, Gimnasia y Deportes Relacionados");
    			SubCategoria.setSubCategoria28("Deporte: General");
    			SubCategoria.setSubCategoria29("Deportes con Vehículos");
    			SubCategoria.setSubCategoria30("Deportes de Combate y Defensa Personal");
    			SubCategoria.setSubCategoriao31("Deportes de Invierno");
    			SubCategoria.setSubCategoria32("Deportes y Juegos Acuáticos");
    			SubCategoria.setSubCategoria33("Deportes y Juegos de Pelota");
    			SubCategoria.setSubCategoria34("Derecho de Países o Territorios Concretos y Áreas Específicas del Derecho");
    			SubCategoria.setSubCategoria35("Derecho Internacional");
    			SubCategoria.setSubCategoria36("Derecho: Guías de Estudio y Revisión");
    			SubCategoria.setSubCategoria37("Teoría General del Derecho");
    			SubCategoria.setSubCategoria38("Economía");
    			SubCategoria.setSubCategoria39("Empresa y Gestión");
    			SubCategoria.setSubCategoria40("Finanzas y Contabilidad");
    			SubCategoria.setSubCategoria41("Industria y Estudios Industriales");
    			SubCategoria.setSubCategoria42("Antigüedades, Objetos De Época («Vintage») Y Coleccionables");
    			SubCategoria.setSubCategoria43("Artesanías, Artes Decorativas Y Manualidades");
    			SubCategoria.setSubCategoria44("Artículos De Papelería Y Miscelánea");
    			SubCategoria.setSubCategoria45("Cocina / Comidas Y Bebidas, Etc");
    			SubCategoria.setSubCategoria46("Guías De Estilos Personales Y Estilos De Vida");
    			SubCategoria.setSubCategoria47("Humor");
    			SubCategoria.setSubCategoria48("Interés Local, Historia Familiar Y Nostalgia");
    			SubCategoria.setSubCategoria49("Jardinería");
    			SubCategoria.setSubCategoria50("Aventuras De Ficción");
    			SubCategoria.setSubCategoria51("Ciencia Ficción");
    			SubCategoria.setSubCategoria52("Fantasía");
    			SubCategoria.setSubCategoria53("Ficción Biográfica");
    			SubCategoria.setSubCategoria54("Ficción Deportiva");
    			SubCategoria.setSubCategoria55("Ficción Histórica");
    			SubCategoria.setSubCategoria56("Ficción Humorística");
    			SubCategoria.setSubCategoria57("Ficción Literaria");
    			SubCategoria.setSubCategoria58("Filosfía");
    			SubCategoria.setSubCategoria59("Religión y Creencias");
    			SubCategoria.setSubCategoria60("Ficción Infantil / Ficción Juvenil e Historias Reales");
    			SubCategoria.setSubCategoria61("Infantil / Juvenil: Artículos De Escritorio Y Papelería Y Objetos Diversos");
    			SubCategoria.setSubCategoria62("Infantil / Juvenil: Cuestiones Personales Y Sociales");
    			SubCategoria.setSubCategoria63("Infantil/Juvenil: Anuarios, Antologías Y Poesía");
    			SubCategoria.setSubCategoria64("Infantil/Juvenil: Interés General");
    			SubCategoria.setSubCategoria65("Libros para niños: ilustrados, de actividades y de primeros conceptos de aprendizaje");
    			SubCategoria.setSubCategoria66("Material Educativo");
    							
    			List<indexModel> ListSubCategoria = new ArrayList<>();
    			ListSubCategoria.add(SubCategoria);
    			
    			
    			
    			//CONTENIDO DEL FOOTER
    			//Ayuda y contacto
    			indexModel AyudaC = new indexModel();
    			AyudaC.setCuenta("Tu Cuenta");
    			AyudaC.setPedidos("Tus Pedidos");
    			AyudaC.setEnvios("Tarifas de Envio");
    			AyudaC.setDevoluciones("Devoluciones");
    			AyudaC.setContactanos("Contactanos");
    							
    							
    			List<indexModel> ListAyudaC = new ArrayList<>();
    			ListAyudaC.add(AyudaC);
    			
    			//Libros y categorias
    			indexModel LibrosC = new indexModel();
    			LibrosC.setArte("Arte");
    			LibrosC.setBiografias("Biografias");
    			LibrosC.setCiencias("Ciencias");
    			LibrosC.setComputacion("Computacion");
    			LibrosC.setDeportes("Deportes");
    			LibrosC.setDerecho("Derecho");
    			LibrosC.setEconomia("Economia");
    			LibrosC.setEstilosDeVida("Estilos de Vida");
    			LibrosC.setFiccion("Ficcion");
    		    LibrosC.setFilosofiaYreligion("Filosofia y Religion");
    		    LibrosC.setInfantilesYjuveniles("Infantiles y Juveniles");
    			
    			List<indexModel> ListLibrosC = new ArrayList<>();
    			ListLibrosC.add(LibrosC);
    			
    			//Metodos de pago
    			indexModel MetodosP = new indexModel();
    		    MetodosP.setTarjetasDeCredito("Tarjetas de Credito");
    		    MetodosP.setPaypal("Paypal");
    							
    		    List<indexModel> ListMetodosP = new ArrayList<>();
    		    ListMetodosP.add(MetodosP);
    			
    		    //Sobre Nosotros
    		    indexModel Nosotros = new indexModel();
    		    Nosotros.setIempresa("Informacion de la Compañia");
    		    Nosotros.setNoticias("Noticias");
    		    Nosotros.setInversores("Inversores");
    		    Nosotros.setPoliticas("Politicas");
    		    Nosotros.setClienteV("Valoracion de los clientes");
    							
    		    List<indexModel> ListNosotros = new ArrayList<>();
    		    ListNosotros.add(Nosotros);
    			
    		    //Models 
    		    model.addAttribute("TituloPagina", titlePage);
    		    model.addAttribute("AyudaC", ListAyudaC);	
    		    model.addAttribute("LibrosC", ListLibrosC);
    		    model.addAttribute("MetodosP", ListMetodosP);
    		    model.addAttribute("Nosotros", ListNosotros);
    		    model.addAttribute("DetalleLibro", ListDetalleLibro);
    		    model.addAttribute("Descripcion", ListDescripcion);
    		    model.addAttribute("Informacion", ListInformacion);
    		    model.addAttribute("LibroR", ListLibroR);
    		    model.addAttribute("CarritoC", ListCarritoC);
    		    model.addAttribute("LibrosDeseados", ListLibrosDeseados );
    		    model.addAttribute("SubCategoria", ListSubCategoria);
    	
        return "detalle-libro";
    }

	@GetMapping("/libros/info/{id}")
	public String infoLibros(@PathVariable Long id, Model modelo) {
		modelo.addAttribute("libro", servicio.obtenerLibroPorId(id));

		modelo.addAttribute("carrito", servicio2.listarTodosLosLibros());

		return "detalle-libro";
	}

	// @GetMapping("/libros/nuevo/{id}")
	// public String mostrarFormularioDeRegistrarLibro(Model modelo) {
	// 	Libro libro = new Libro();
	// 	modelo.addAttribute("id", libro);
	// 	modelo.addAttribute("img", libro);
	// 	modelo.addAttribute("titulo", libro);
	// 	modelo.addAttribute("precio", libro);
	// 	return "detalle-libro";
	// }

	@PostMapping("/libros/guardar")
	public String guardarLibro(@ModelAttribute("libro") Carrito libro) {
		servicio2.guardarLibro(libro);
		return "redirect:/inicio/libros/info/{id}";
	}

	@PostMapping("/libros/detalle/{id}")
	public String detalleLibro(@PathVariable Long id, @ModelAttribute("libro") Libro libro,
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
		return "redirect:/libros/guardar";
	}

	@GetMapping("/detalle-libro/{id}")
	public String eliminarLibro(@PathVariable Long id) {
		servicio2.eliminarLibro(id);
		return "redirect:/inicio/libros/info/{id}";
	}
}
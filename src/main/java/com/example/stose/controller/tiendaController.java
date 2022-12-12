package com.example.stose.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.stose.model.indexModel;
import com.example.stose.services.LibroService;


@Controller
@RequestMapping("/inicio")
public class tiendaController {
    
	@Value("${title.tienda}")
	private String TitlePage;
	
	@Autowired
	private LibroService servicio;
	
    @GetMapping({ "/tienda", "Tienda" })
    public String ControllerTienda(Model model) {
    	
    	model.addAttribute("libros", servicio.listarTodosLosLibros());
    	
    	model.addAttribute("TituloPagina", TitlePage);
    	
    	
    			//SECCION carrito de compras
    			indexModel CarritoCompras = new indexModel();
    			CarritoCompras.setCarritoCompras1("/*Nombre de libro*/");
    			CarritoCompras.setCarritoCompras2("/*Nombre de libro*/");
    			CarritoCompras.setCarritoCompras3("/*Nombre de libro*/");
    			CarritoCompras.setCarritoCompras4("/*Nombre de libro*/");
    			List<indexModel> ListCarritoCompras = new ArrayList<>();
    			ListCarritoCompras.add(CarritoCompras);
    			
    			
    			//SECCION Lista de Deseos
    			indexModel LibrosDeseados = new indexModel();
    			LibrosDeseados.setLibroDeseado1("/*Nombre de libro*/");
    			LibrosDeseados.setLibroDeseado2("/*Nombre de libro*/");
    			LibrosDeseados.setLibroDeseado3("/*Nombre de libro*/");
    			LibrosDeseados.setLibroDeseado4("/*Nombre de libro*/");
    			List<indexModel> ListLibrosDeseados = new ArrayList<>();
    			ListLibrosDeseados.add(LibrosDeseados);
    			
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
    	    	

    			//Header top
    			
    			indexModel HeaderT = new indexModel();
    			HeaderT.setBlog("Blog");
    			HeaderT.setProductosDestacados("ProductosDestacados");
    			HeaderT.setListaDeDeseos("Lista de Deseos");
    			HeaderT.setRegistrate("Registrate");
    			HeaderT.setMiCuenta("MiCuenta");
    			HeaderT.setRevisionDePedidos("Revision De Pedidos");
    							
    							
    			List<indexModel> ListHeaderT = new ArrayList<>();
    			ListHeaderT.add(HeaderT);

    			
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
    			Nosotros.setPoliticas("Políticas");
    			Nosotros.setClienteV("Valoracion de los clientes");
    			
    			
    			List<indexModel> ListNosotros = new ArrayList<>();
    			ListNosotros.add(Nosotros);
    			
    			//models
    			model.addAttribute("AyudaC",ListAyudaC);
    			model.addAttribute("Nosotros",ListNosotros);
    			model.addAttribute("MetodosP",ListMetodosP);
    			model.addAttribute("LibrosC",ListLibrosC);
    			model.addAttribute("SubCategoria",ListSubCategoria);
    			model.addAttribute("CarritoCompras",ListCarritoCompras);
    			model.addAttribute("HeaderT",ListHeaderT );
    			model.addAttribute("LibrosDeseados",ListLibrosDeseados);
    			model.addAttribute("Titulo", TitlePage);

    			model.addAttribute("LibrosDeseados", ListLibrosDeseados );
    			model.addAttribute("SubCategoria", ListSubCategoria);

    	
        return "tienda";
    }
}

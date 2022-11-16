package com.example.stose.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.stose.model.detalleLibroModel;
import com.example.stose.model.indexModel;



@Controller
@RequestMapping("/inicio")
public class detalleLibroController {
	
	@Value("${title.detallelibro}")
	private String titlePage;
    
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
    	
    	
        return "detalle-libro";
    }
}
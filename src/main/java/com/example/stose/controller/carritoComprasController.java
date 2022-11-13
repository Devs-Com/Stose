package com.example.stose.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.stose.model.carritoComprasModel;
import com.example.stose.model.indexModel;



@Controller
@RequestMapping("/inicio")
public class carritoComprasController {
	
	@Value("${title.carritocompras}")
	private String titlePage;
    
    @GetMapping({ "/carrito-compras", "Carrito-Compras" })
    public String ControllerCarritoCompras(Model model) {
    	
    	//CARRITO DE COMPRAS
    	indexModel CarritoC = new indexModel();
    	CarritoC.setCarritoCompras1("/*Nombre del libro*/");
        CarritoC.setCarritoCompras2("/*Nombre del libro*/");
    	CarritoC.setCarritoCompras3("/*Nombre del libro*/");
    	CarritoC.setCarritoCompras4("/*Nombre del libro*/");
    			
    	List<indexModel> ListCarritoC = new ArrayList<>();
        ListCarritoC.add(CarritoC);
        
        //LIBRO TABLA
        carritoComprasModel LibroT = new carritoComprasModel();
        LibroT.setLibroTabla1("/Nombre del libro/");
        LibroT.setLibroTabla2("/Nombre del libro/");
        LibroT.setLibroTabla3("/Nombre del libro/");
        LibroT.setLibroTabla4("/Nombre del libro/");
        
        List<carritoComprasModel> ListLibroT = new ArrayList<>();
        ListLibroT.add(LibroT);
        
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
	    model.addAttribute("LibroT", ListLibroT);
	    model.addAttribute("CarritoC", ListCarritoC);
    	
        return "carrito-compras";
    }
}
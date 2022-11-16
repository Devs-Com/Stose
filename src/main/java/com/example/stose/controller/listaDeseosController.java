package com.example.stose.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.stose.model.indexModel;
import com.example.stose.model.listaDeseosModel;


@Controller
@RequestMapping("/inicio")
public class listaDeseosController {
	
	@Value("${title.listadeseos}")
	private String TitlePage;
	
	@GetMapping({ "/inicio", "/lista-de-deseos" })
    public String ControllerIndex(Model model) {
		
		//SECCION Carrito de compras
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
		
		//TABLA DE LISTA DE DESEOS
		
		listaDeseosModel LibrosDT = new listaDeseosModel();
		LibrosDT.setLibroDeseoT1("/*Nombre de libro*/");
		LibrosDT.setLibroDeseoT2("/*Nombre de libro*/");
		LibrosDT.setLibroDeseoT3("/*Nombre de libro*/");
		LibrosDT.setLibroDeseoT4("/*Nombre de libro*/");
		LibrosDT.setAutor1("/*Nombre del autor*/");
		LibrosDT.setAutor2("/*Nombre del autor*/");
		LibrosDT.setAutor3("/*Nombre del autor*/");
		LibrosDT.setAutor4("/*Nombre del autor*/");
		LibrosDT.setCategoria1("/*Nombre de la categoria*/");
		LibrosDT.setCategoria2("/*Nombre de la categoria*/");
		LibrosDT.setCategoria3("/*Nombre de la categoria*/");
		LibrosDT.setCategoria4("/*Nombre de la categoria*/");
		LibrosDT.setEditorial1("/*Nombre de la editorial*/");
		LibrosDT.setEditorial2("/*Nombre de la editorial*/");
		LibrosDT.setEditorial3("/*Nombre de la editorial*/");
		LibrosDT.setEditorial4("/*Nombre de la editorial*/");
		
		List<listaDeseosModel> ListLibrosDT = new ArrayList<>();
		ListLibrosDT.add(LibrosDT);
		
		
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
        model.addAttribute("TituloPagina", TitlePage);
		model.addAttribute("AyudaC", ListAyudaC);	
		model.addAttribute("LibrosC", ListLibrosC);
		model.addAttribute("MetodosP", ListMetodosP);
		model.addAttribute("Nosotros", ListNosotros);
		model.addAttribute("CarritoC", ListCarritoC);
		model.addAttribute("LibrosDT", ListLibrosDT);
		model.addAttribute("LibrosDeseados", ListLibrosDeseados );
		
		return "lista-de-deseos";
	}
}

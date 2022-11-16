package com.example.stose.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.stose.model.indexModel;



@Controller
@RequestMapping("/inicio")
public class indexController {
	
	@Value("${title.index}")
	private String TitlePage;
    
	@GetMapping({ "/inicio", "/", "Inicio" })
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
				
				
				

				//SECCION Libros en Tendencia
				//Libro en Oferta
				indexModel LibroO = new indexModel();
				LibroO.setLibroOferta("/*Nombre de libro*/");
				
				List<indexModel> ListLibroO = new ArrayList<>();
				ListLibroO.add(LibroO);

				//Libros en Tendencia
				indexModel LibroT = new indexModel();
				LibroT.setLibroTendencia1("/*Nombre de libro*/");
				LibroT.setLibroTendencia2("/*Nombre de libro*/");
				LibroT.setLibroTendencia3("/*Nombre de libro*/");
				LibroT.setLibroTendencia4("/*Nombre de libro*/");
				LibroT.setLibroTendencia5("/*Nombre de libro*/");
				LibroT.setLibroTendencia6("/*Nombre de libro*/");
				LibroT.setLibroTendencia7("/*Nombre de libro*/");
				LibroT.setLibroTendencia8("/*Nombre de libro*/");
				
				List<indexModel> ListLibroT = new ArrayList<>();
				ListLibroT.add(LibroT);


				//SECCION LIBROS DESTACADOS
				//Libros Destacados
				indexModel LibroD = new indexModel();
				LibroD.setLibroDestacado1("/*Nombre de libro*/");
				LibroD.setLibroDestacado2("/*Nombre de libro*/");
				LibroD.setLibroDestacado3("/*Nombre de libro*/");
				LibroD.setLibroDestacado4("/*Nombre de libro*/");
				LibroD.setLibroDestacado5("/*Nombre de libro*/");
				LibroD.setLibroDestacado6("/*Nombre de libro*/");
				LibroD.setLibroDestacado7("/*Nombre de libro*/");
				LibroD.setLibroDestacado8("/*Nombre de libro*/");

				List<indexModel> ListLibroD = new ArrayList<>();
				ListLibroD.add(LibroD);


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
				model.addAttribute("LibroO", ListLibroO);
				model.addAttribute("LibroT", ListLibroT);
				model.addAttribute("LibroD", ListLibroD);
				model.addAttribute("CarritoC", ListCarritoC);
				model.addAttribute("LibrosDeseados", ListLibrosDeseados );
		
        return "index";
    }
}

package com.example.stose.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.stose.model.indexModel;
import com.example.stose.model.nosotrosModel;

import org.springframework.ui.Model;



@Controller
@RequestMapping("/inicio")
public class NosotrosController {

    @Value("${title.nosotros}")
	private String TitlePage;

    @GetMapping({"/nosotros", "Nosotros"})
    public String ControllerNosotros(Model model){
        
        //SECCION Carrito de compras
				indexModel CarritoC = new indexModel();
				CarritoC.setCarritoCompras1("/*Nombre de libro*/");
				CarritoC.setCarritoCompras2("/*Nombre de libro*/");
				CarritoC.setCarritoCompras3("/*Nombre de libro*/");
				CarritoC.setCarritoCompras4("/*Nombre de libro*/");
				
				List<indexModel> ListCarritoC = new ArrayList<>();
				ListCarritoC.add(CarritoC);

        //Nosotros
        nosotrosModel Descripcion = new nosotrosModel();
        Descripcion.setDescripcion("Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam. te natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, et quasi architecto beatae vitae dicta sunt explicabo. tem accusantium doloremque laudantium, totam rem aperiam, et quasi architecto beatae vitae dicta sunt. error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, et quasi architecto beatae vitae dicta sunt explicabo.");       
		
        List<nosotrosModel> ListDescripcion = new ArrayList<>();
        ListDescripcion.add(Descripcion);

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
                model.addAttribute("Descripcion", ListDescripcion);
				
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        return "nosotros";
        
    }
}

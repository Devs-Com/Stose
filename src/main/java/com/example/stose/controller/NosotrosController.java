package com.example.stose.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.stose.model.indexModel;
import com.example.stose.model.nosotrosModel;
import com.example.stose.services.CarritoServicio;

import org.springframework.ui.Model;



@Controller
@RequestMapping("/inicio")
public class NosotrosController {

    @Value("${title.nosotros}")
	private String TitlePage;

	@Autowired
	private CarritoServicio servicio;

    @GetMapping({"/nosotros", "Nosotros"})
    public String ControllerNosotros(Model model){

		model.addAttribute("carrito", servicio.listarTodosLosLibros());
        
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

        //Nosotros
        nosotrosModel Descripcion = new nosotrosModel();
        Descripcion.setDescripcion("Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam. te natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, et quasi architecto beatae vitae dicta sunt explicabo. tem accusantium doloremque laudantium, totam rem aperiam, et quasi architecto beatae vitae dicta sunt. error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, et quasi architecto beatae vitae dicta sunt explicabo.");       
		
        List<nosotrosModel> ListDescripcion = new ArrayList<>();
        ListDescripcion.add(Descripcion);

      //Categoria
		
      		indexModel SubCategoria = new indexModel();
      		SubCategoria.setSubCategoria1("Arquitectura");
      		SubCategoria.setSubCategoria2("Artes Esc??nicas");
      		SubCategoria.setSubCategoria3("Aspectos Generales del Arte");
      		SubCategoria.setSubCategoria4("Dise??o Industrial y Comercial");
      		SubCategoria.setSubCategoria5("Enfoques del Arte");
      		SubCategoria.setSubCategoria6("Expresiones Art??sticas del Arte");
      		SubCategoria.setSubCategoria7("Fotograf??a");
      		SubCategoria.setSubCategoria8("M??sica");
      		SubCategoria.setSubCategoria9("Biograf??as");
      		SubCategoria.setSubCategoria10("Historia y Cr??tica Literaria");
      		SubCategoria.setSubCategoria11("Obras de Teatro");
      		SubCategoria.setSubCategoria12("Textos Antiguos, Cl??sicos y Mediavales");
      		SubCategoria.setSubCategoria13("Poes??a");
      		SubCategoria.setSubCategoria14("Ciencias de la Tierra/Geociencias");
      		SubCategoria.setSubCategoria15("El Medioambiente");
      		SubCategoria.setSubCategoria16("Geograf??a");
      		SubCategoria.setSubCategoria17("Planificaci??n Regional y Zonal");
      		SubCategoria.setSubCategoria18("Aplicaciones Empresariales y de Negocios");
      		SubCategoria.setSubCategoria19("Aplicaciones Gr??ficas y multimedia");
      		SubCategoria.setSubCategoria20("Aplicaciones Pr??cticas de Tecnolog??a de la Informaci??n");
      		SubCategoria.setSubCategoria21("Bases de Datos");
      		SubCategoria.setSubCategoria22("Certificaci??n Inform??tica");
      		SubCategoria.setSubCategoria23("Ciencias de la Computaci??n");
      		SubCategoria.setSubCategoria24("Redes y Comunicaciones");
      		SubCategoria.setSubCategoria25("Seguridad Inform??tica");
      		SubCategoria.setSubCategoria26("Actividades Recreativas al Aire Libre");
      		SubCategoria.setSubCategoria27("Atletismo, Gimnasia y Deportes Relacionados");
      		SubCategoria.setSubCategoria28("Deporte: General");
      		SubCategoria.setSubCategoria29("Deportes con Veh??culos");
      		SubCategoria.setSubCategoria30("Deportes de Combate y Defensa Personal");
      		SubCategoria.setSubCategoriao31("Deportes de Invierno");
      		SubCategoria.setSubCategoria32("Deportes y Juegos Acu??ticos");
      		SubCategoria.setSubCategoria33("Deportes y Juegos de Pelota");
      		SubCategoria.setSubCategoria34("Derecho de Pa??ses o Territorios Concretos y ??reas Espec??ficas del Derecho");
      		SubCategoria.setSubCategoria35("Derecho Internacional");
      		SubCategoria.setSubCategoria36("Derecho: Gu??as de Estudio y Revisi??n");
      		SubCategoria.setSubCategoria37("Teor??a General del Derecho");
      		SubCategoria.setSubCategoria38("Econom??a");
      		SubCategoria.setSubCategoria39("Empresa y Gesti??n");
      		SubCategoria.setSubCategoria40("Finanzas y Contabilidad");
      		SubCategoria.setSubCategoria41("Industria y Estudios Industriales");
      		SubCategoria.setSubCategoria42("Antig??edades, Objetos De ??poca (??Vintage??) Y Coleccionables");
      		SubCategoria.setSubCategoria43("Artesan??as, Artes Decorativas Y Manualidades");
      		SubCategoria.setSubCategoria44("Art??culos De Papeler??a Y Miscel??nea");
      		SubCategoria.setSubCategoria45("Cocina / Comidas Y Bebidas, Etc");
      		SubCategoria.setSubCategoria46("Gu??as De Estilos Personales Y Estilos De Vida");
      		SubCategoria.setSubCategoria47("Humor");
      		SubCategoria.setSubCategoria48("Inter??s Local, Historia Familiar Y Nostalgia");
      		SubCategoria.setSubCategoria49("Jardiner??a");
      		SubCategoria.setSubCategoria50("Aventuras De Ficci??n");
      		SubCategoria.setSubCategoria51("Ciencia Ficci??n");
      		SubCategoria.setSubCategoria52("Fantas??a");
      		SubCategoria.setSubCategoria53("Ficci??n Biogr??fica");
      		SubCategoria.setSubCategoria54("Ficci??n Deportiva");
      		SubCategoria.setSubCategoria55("Ficci??n Hist??rica");
      		SubCategoria.setSubCategoria56("Ficci??n Humor??stica");
      		SubCategoria.setSubCategoria57("Ficci??n Literaria");
      		SubCategoria.setSubCategoria58("Filosf??a");
      		SubCategoria.setSubCategoria59("Religi??n y Creencias");
      		SubCategoria.setSubCategoria60("Ficci??n Infantil / Ficci??n Juvenil e Historias Reales");
      		SubCategoria.setSubCategoria61("Infantil / Juvenil: Art??culos De Escritorio Y Papeler??a Y Objetos Diversos");
      		SubCategoria.setSubCategoria62("Infantil / Juvenil: Cuestiones Personales Y Sociales");
      		SubCategoria.setSubCategoria63("Infantil/Juvenil: Anuarios, Antolog??as Y Poes??a");
      		SubCategoria.setSubCategoria64("Infantil/Juvenil: Inter??s General");
      		SubCategoria.setSubCategoria65("Libros para ni??os: ilustrados, de actividades y de primeros conceptos de aprendizaje");
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
				Nosotros.setIempresa("Informacion de la Compa??ia");
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
                model.addAttribute("CarritoC", ListCarritoC);
                model.addAttribute("LibrosDeseados", ListLibrosDeseados );
                model.addAttribute("SubCategoria", ListSubCategoria);
        
        
        return "nosotros";
        
    }

	@GetMapping("/nosotros/{id}")
	public String eliminarLibro(@PathVariable Long id) {
		servicio.eliminarLibro(id);
		return "redirect:/inicio/nosotros";
	}
}

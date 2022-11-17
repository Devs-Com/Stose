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
public class revisionPedidoController {
 
	@Value("${title.}")
	private String TitlePage;
	
    @GetMapping({ "/revision-pedido", "Revision-Pedido" })
    public String ControllerRevisionPedido(Model model) {
    	
    	//SECCION Lista de Deseos
    			indexModel LibrosDeseados = new indexModel();
    			LibrosDeseados.setLibroDeseado1("/*Nombre de libro*/");
    			LibrosDeseados.setLibroDeseado2("/*Nombre de libro*/");
    			LibrosDeseados.setLibroDeseado3("/*Nombre de libro*/");
    			LibrosDeseados.setLibroDeseado4("/*Nombre de libro*/");
    			List<indexModel> ListLibrosDeseados = new ArrayList<>();
    			ListLibrosDeseados.add(LibrosDeseados);
    	    	
    			model.addAttribute("LibrosDeseados", ListLibrosDeseados );
    			model.addAttribute("Titulo", TitlePage);
        return "revision-pedido";
    }
}
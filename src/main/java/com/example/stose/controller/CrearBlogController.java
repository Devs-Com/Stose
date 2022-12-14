package com.example.stose.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.stose.services.CarritoServicio;



@Controller
@RequestMapping("/inicio")
public class CrearBlogController {

    @Autowired
	private CarritoServicio servicio;
    
	@GetMapping({ "/crearblog","CrearBlog"})
    public String ControllerCrearBlog(Model model) {

		model.addAttribute("carrito", servicio.listarTodosLosLibros());

        return "crearblog";
    }

    @GetMapping("/crearblog/{id}")
	public String eliminarLibro(@PathVariable Long id) {
		servicio.eliminarLibro(id);
		return "redirect:/inicio/crearblog";
	}
}

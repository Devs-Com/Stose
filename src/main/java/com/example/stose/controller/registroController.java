package com.example.stose.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/inicio")
public class registroController {
    
    @GetMapping({ "/registrar", "Registrar" })
    public String ControllerTienda(Model model) {
        return "registrar";
    }
}

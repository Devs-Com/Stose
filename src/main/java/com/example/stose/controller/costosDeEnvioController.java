package com.example.stose.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/inicio")
public class costosDeEnvioController {
    
    @GetMapping({ "/costos-de-envio", "Costos-De-Envio" })
    public String ControllerCostosDeEnvio(Model model) {
        return "costos-de-envio";
    }
}
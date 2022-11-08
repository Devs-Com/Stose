package com.example.stose.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/inicio")
public class revisionPedidoController {
    
    @GetMapping({ "/revision-pedido", "Revision-Pedido" })
    public String ControllerRevisionPedido(Model model) {
        return "revision-pedido";
    }
}
package com.example.stose.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ch.qos.logback.core.model.Model;

@Controller
@RequestMapping("/inicio")
public class revisionPedidoController {
    
    @GetMapping({ "/revision-pedido", "Revision-Pedido" })
    public String ControllerRevisionPedido(Model model) {
        return "revision-pedido";
    }
}
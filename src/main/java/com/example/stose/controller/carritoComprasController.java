package com.example.stose.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ch.qos.logback.core.model.Model;

@Controller
@RequestMapping("/inicio")
public class carritoComprasController {
    
    @GetMapping({ "/carrito-compras", "Carrito-Compras" })
    public String ControllerCarritoCompras(Model model) {
        return "carrito-compras";
    }
}
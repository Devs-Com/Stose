package com.example.stose.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import io.swagger.models.Model;

@Controller
@RequestMapping("/inicio")
public class logIn_adminController {
    @GetMapping({ "/login-admin", "Login-ADMIN" })
    public String ControllerLoginAdmin(Model model) {
        return "login-admin";
    }
}

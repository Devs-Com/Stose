package com.example.stose.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import io.swagger.models.Model;

@Controller
@RequestMapping("/inicio")
public class loginController {
    @GetMapping({ "/login", "Login" })
    public String ControllerLogin(Model model) {
        return "login";
    }
}

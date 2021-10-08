package br.itau.spring01.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("/hello")
public class HelloController {
    
    @GetMapping
    public String responder(){
        return "<h1 style='background-color: #005c9f; height: 55px;'>Olá Mundo Controller</h1>";
    }

    @GetMapping("/login")
    public String responder2(){
        return "<h1 style='background-color: #005c9f; height: 55px; width: 250px; margin:0 auto; color: white; text-align: center; padding-top: 10px;'>Faça seu login</h1>";
    }
}

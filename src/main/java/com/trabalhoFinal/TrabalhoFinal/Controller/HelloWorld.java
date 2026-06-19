package com.trabalhoFinal.TrabalhoFinal.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @GetMapping("/oi")
    public String dizerOi(@RequestParam(value = "nome", defaultValue = "Mundo") String nome) {
        return "Olá, " + nome + "!";
    }
}

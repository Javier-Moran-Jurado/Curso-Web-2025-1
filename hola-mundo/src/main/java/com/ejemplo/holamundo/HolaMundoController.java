package com.ejemplo.holamundo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundoController {

    @GetMapping("/hola/{nombre}")
    public String hola(@PathVariable("nombre") String nombre) {
        return "Hola" +nombre+"!";
    }
}
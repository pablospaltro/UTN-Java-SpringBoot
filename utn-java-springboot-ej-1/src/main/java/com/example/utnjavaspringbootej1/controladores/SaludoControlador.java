package com.example.utnjavaspringbootej1.controladores;

import com.example.utnjavaspringbootej1.servicios.SaludoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class SaludoControlador {

    @Autowired
    private SaludoServicio saludoServicio;

    @GetMapping("/saludo")
    public String darBienvenida(){
        return saludoServicio.mostrarSaludoInicial();
    }
}

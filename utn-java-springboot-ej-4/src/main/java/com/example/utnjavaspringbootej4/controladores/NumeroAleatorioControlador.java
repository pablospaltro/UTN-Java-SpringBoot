package com.example.utnjavaspringbootej4.controladores;

import com.example.utnjavaspringbootej4.servicios.NumeroAleatorioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class NumeroAleatorioControlador {

    @Autowired
    NumeroAleatorioServicio numeroAleatorioServicio;

    @GetMapping("/random")
    public int mostrarNumeroDelDia(){
        return numeroAleatorioServicio.mostrarNumeroAleatorio();
    }

}

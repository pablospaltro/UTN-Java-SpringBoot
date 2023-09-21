package com.example.utnjavaspringbootej1.controladores;

import com.example.utnjavaspringbootej1.entidades.Linea;
import com.example.utnjavaspringbootej1.servicios.LineaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class LineaControlador {

    @Autowired
    private LineaServicio lineaServicio;

    Linea linea = new Linea();

    @GetMapping("/lineas")
    public Linea mostrarLineas(){
        lineaServicio.setearAsteriscosPrimeraLinea(linea, 4);
        lineaServicio.setearAsteriscosSegundaLinea(linea, 4);
        lineaServicio.setearAsteriscosTerceraLinea(linea, 4);
        lineaServicio.setearAsteriscosCuartaLinea(linea, 4);
        return linea;
    }


}

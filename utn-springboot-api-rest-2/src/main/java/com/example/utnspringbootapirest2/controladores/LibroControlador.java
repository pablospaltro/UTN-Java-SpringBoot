package com.example.utnspringbootapirest2.controladores;

import com.example.utnspringbootapirest2.entidades.AuthorInfo;
import com.example.utnspringbootapirest2.servicios.LibroServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/libros")
public class LibroControlador {

    @Autowired
    LibroServicio libroServicio;

    @GetMapping("/titulo")
    public String mostrarLibroTitulo(){
        return libroServicio.mostrarTitulo();
    }

    @GetMapping("/autor")
    public String mostrarLibroAutor(){
        return libroServicio.mostrarAutor();
    }

    @GetMapping("/descripcion")
    public String mostrarLibroDescripcion(){
        return libroServicio.mostrarDescripcionLibro();
    }

}

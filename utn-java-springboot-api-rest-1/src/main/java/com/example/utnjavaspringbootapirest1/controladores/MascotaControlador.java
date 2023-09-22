package com.example.utnjavaspringbootapirest1.controladores;

import com.example.utnjavaspringbootapirest1.servicios.MascotaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mascotas")
public class MascotaControlador {

    @Autowired
    MascotaServicio mascotaServicio;

    @GetMapping("/perro1")
    public String mostrarMensajePerro1(){
        return mascotaServicio.mostrarMensajeMascota("perro", 1);
    }

    @GetMapping("/perro2")
    public String mostrarMensajePerro2(){
        return mascotaServicio.mostrarMensajeMascota("perro", 2);
    }

    @GetMapping("/perro3")
    public String mostrarMensajePerro3(){
        return mascotaServicio.mostrarMensajeMascota("perro", 3);
    }




}

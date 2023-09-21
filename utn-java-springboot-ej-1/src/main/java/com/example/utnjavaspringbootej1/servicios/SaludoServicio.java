package com.example.utnjavaspringbootej1.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaludoServicio {

    public String mostrarSaludoInicial(){
        String saludo ="Hola, este es mi primer proyecto en Spring";
        return saludo;
    }
}

package com.example.utnjavaspringbootej4.servicios;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class NumeroAleatorioServicio {

    Random random = new Random();

    public int mostrarNumeroAleatorio(){
        return random.nextInt(100) + 1;
    }
}

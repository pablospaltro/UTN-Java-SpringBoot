package com.example.utnjavaspringbootej3.servicios;

import com.example.utnjavaspringbootej3.entidades.Estacion;
import org.springframework.stereotype.Service;

@Service
public class EstacionServicio {

    Estacion estacion = new Estacion();

    public String establecerEstacion(String temperatura){

        if(temperatura.equals("calor")){
            String estacion = "verano";

        }


        return estacion;
    }

}

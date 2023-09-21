package com.example.utnjavaspringbootej1.servicios;

import com.example.utnjavaspringbootej1.entidades.Linea;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;

@Service
public class LineaServicio {

    //setea la linea1:
    public void setearAsteriscosPrimeraLinea(Linea linea, int cantidadAsteriscos){
        String [] asteriscos = new String[cantidadAsteriscos];
        for(int i=0; i<cantidadAsteriscos;i++){
            asteriscos[i] = "*";
        }
        linea.setLinea1(asteriscos);
    }

    //setea la linea 2:
    public void setearAsteriscosSegundaLinea(Linea linea, int cantidadAsteriscos){
        String [] asteriscos = new String[cantidadAsteriscos];
        for(int i=0; i<cantidadAsteriscos;i++){
            if(i==0){
                asteriscos[i] = "*";
            } else if (i == (cantidadAsteriscos-1)){
                asteriscos[i] = "*";
            } else {
                asteriscos[i] = " ";
            }
        }
        linea.setLinea2(asteriscos);
    }

    //setet la linea 3:
    public void setearAsteriscosTerceraLinea(Linea linea, int cantidadAsteriscos){
        String [] asteriscos = new String[cantidadAsteriscos];
        for(int i=0; i<cantidadAsteriscos;i++){
            if(i==0){
                asteriscos[i] = "*";
            } else if (i == (cantidadAsteriscos-1)){
                asteriscos[i] = "*";
            } else {
                asteriscos[i] = " ";
            }
        }
        linea.setLinea3(asteriscos);

    }

    //setea la linea 4:
    public void setearAsteriscosCuartaLinea(Linea linea, int cantidadAsteriscos){
        String [] asteriscos = new String[cantidadAsteriscos];
        for(int i=0; i<cantidadAsteriscos;i++){
            asteriscos[i] = "*";
        }
        linea.setLinea4(asteriscos);
    }


}

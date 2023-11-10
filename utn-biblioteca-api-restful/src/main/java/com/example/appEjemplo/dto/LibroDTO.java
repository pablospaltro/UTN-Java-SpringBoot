package com.example.appEjemplo.dto;

import java.io.Serializable;
import javax.validation.constraints.NotBlank;

import com.example.appEjemplo.entities.Autor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LibroDTO implements Serializable{
    
    @NotBlank
    private String nombre;
    
    @NotBlank
    private Autor autor;
    
    @NotBlank
    private String editorial;
    
    @NotBlank
    private int anio;
    
    @NotBlank
    private boolean fueLeido;
    
    @NotBlank
    private String formato;

    public LibroDTO() {
    }

    public LibroDTO(String nombre, Autor autor, String editorial, int anio, boolean fueLeido, String formato) {
        this.nombre = nombre;
        this.autor = autor;
        this.editorial = editorial;
        this.anio = anio;
        this.fueLeido = fueLeido;
        this.formato = formato;
    }

    
    
    
}

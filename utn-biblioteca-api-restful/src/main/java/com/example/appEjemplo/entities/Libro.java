package com.example.appEjemplo.entities;

import javax.persistence.*;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "libros")
@Getter
@Setter
@NoArgsConstructor
public class Libro {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    private String nombre;

    @Embedded
    private Autor autor;

    private String editorial;

    private int anio;

    private boolean fueLeido;

    private String formato;


    public Libro(String nombre, Autor autor, String editorial, int anio, boolean fueLeido, String formato) {
        this.nombre = nombre;
        this.autor = autor;
        this.editorial = editorial;
        this.anio = anio;
        this.fueLeido = fueLeido;
        this.formato = formato;
    }

    
}

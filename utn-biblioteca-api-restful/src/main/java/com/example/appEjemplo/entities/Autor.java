package com.example.appEjemplo.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Embeddable;
import javax.persistence.Entity;

@Getter @Setter
@AllArgsConstructor @NoArgsConstructor

@Embeddable
public class Autor {

    private String nombre;
    private String nacionalidad;
}

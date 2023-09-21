package com.example.utnjavaspringbootej1.entidades;

public class Saludo {

    private String texto;

    public Saludo() {
    }

    public Saludo(String texto) {
        this.texto = texto;
    }

    @Override
    public String toString() {
        return "Saludo{" +
                "texto='" + texto + '\'' +
                '}';
    }
}

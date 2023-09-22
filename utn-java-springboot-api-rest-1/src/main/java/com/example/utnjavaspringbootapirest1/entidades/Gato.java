package com.example.utnjavaspringbootapirest1.entidades;

public class Gato extends Mascota{

    private String mensaje;
    public Gato() {
    }

    public Gato(int id, String nombre, String raza, String sonido) {
        super(id, nombre, raza, sonido);
        this.mensaje= "Hola, soy "+nombre+", tu gato "+raza+" que te guiará para iniciar  el juego. ¡"+sonido+"!";
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}

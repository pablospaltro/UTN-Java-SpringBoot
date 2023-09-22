package com.example.utnjavaspringbootapirest1.entidades;

public class Perro extends Mascota{

    private String mensaje;

    public Perro(int id, String nombre, String raza, String sonido) {
        super(id, nombre, raza, sonido);
        this.mensaje= "Hola, soy "+nombre+", tu perro "+raza+" que te guiará para iniciar  el juego. ¡"+sonido+"!";
    }

    public Perro() {
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}

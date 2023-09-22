package com.example.utnjavaspringbootapirest1.entidades;

public abstract class Mascota {

    protected int id;
    protected String nombre;
    protected String raza;
    protected String sonido;

    public Mascota() {
    }

    public Mascota(int id, String nombre, String raza, String sonido) {
        this.id = id;
        this.nombre = nombre;
        this.raza = raza;
        this.sonido = sonido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getSonido() {
        return sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }

    @Override
    public String toString() {
        return "Mascota{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", raza='" + raza + '\'' +
                ", sonido='" + sonido + '\'' +
                '}';
    }
}

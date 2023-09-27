package com.example.utnspringbootpostman1.entidades;

public class Tarea {

    private int id;
    private String descripcion;

    public Tarea() {
    }

    public Tarea(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Tarea{" +
                "id=" + id +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}

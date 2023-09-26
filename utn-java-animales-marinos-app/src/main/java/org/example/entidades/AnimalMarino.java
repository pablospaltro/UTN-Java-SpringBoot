package org.example.entidades;

public class AnimalMarino {

    protected String nombre;
    protected TipoAnimalMarino tipo;
    protected int edad;
    protected String estadoDeSalud;

    public AnimalMarino() {
    }

    public AnimalMarino(String nombre, TipoAnimalMarino tipo, int edad, String estadoDeSalud) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.edad = edad;
        this.estadoDeSalud = estadoDeSalud;
    }

    public TipoAnimalMarino getTipo() {
        return tipo;
    }

    public void setTipo(TipoAnimalMarino tipo) {
        this.tipo = tipo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEstadoDeSalud() {
        return estadoDeSalud;
    }

    public void setEstadoDeSalud(String estadoDeSalud) {
        this.estadoDeSalud = estadoDeSalud;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void localizarMigracion() {

    }

    @Override
    public String toString() {
        return "AnimalMarino{" +
                "nombre='" + nombre + '\'' +
                ", tipo=" + tipo +
                ", edad=" + edad +
                ", estadoDeSalud='" + estadoDeSalud + '\'' +
                '}';
    }
}

package org.example.entidades;

public class Cazon extends AnimalMarino {

    public Cazon() {
    }

    public Cazon(String nombre, TipoAnimalMarino tipo, int edad, String estadoDeSalud) {
        super(nombre, tipo, edad, estadoDeSalud);
    }

    @Override
    public String toString() {
        return "Cazon{" +
                "nombre='" + nombre + '\'' +
                ", tipo=" + tipo +
                ", edad=" + edad +
                ", estadoDeSalud='" + estadoDeSalud + '\'' +
                "} " + super.toString();
    }

    @Override
    public void localizarMigracion() {
        System.out.println("CAZÓN | migra desde las aguas del sur de Brasil y Uruguay hasta el sur de Argentina.");

    }
}

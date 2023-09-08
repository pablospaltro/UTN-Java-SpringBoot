package org.example.entidades;

public class BallenaFranca extends AnimalMarino {

    public BallenaFranca() {
    }

    public BallenaFranca(String nombre, TipoAnimalMarino tipo, int edad, String estadoDeSalud) {
        super(nombre, tipo, edad, estadoDeSalud);
    }

    @Override
    public String toString() {
        return "BallenaFranca{" +
                "nombre='" + nombre + '\'' +
                ", tipo=" + tipo +
                ", edad=" + edad +
                ", estadoDeSalud='" + estadoDeSalud + '\'' +
                "} " + super.toString();
    }

    @Override
    public void localizarMigracion() {
        System.out.println("BALLENA FRANCA | migran desde Mar del Plata hacia Península de Valdés");

    }


}

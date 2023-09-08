package org.example.entidades;

public class BallenaFranca extends AnimalMarino {

    public BallenaFranca() {
    }

    public BallenaFranca(TipoAnimalMarino tipo, int edad, String estadoDeSalud) {
        super(tipo, edad, estadoDeSalud);
    }

    @Override
    public void localizarMigracion() {
        System.out.println("La ballena franca desde Mar del Plata hacia Península de Valdés.");

    }


}

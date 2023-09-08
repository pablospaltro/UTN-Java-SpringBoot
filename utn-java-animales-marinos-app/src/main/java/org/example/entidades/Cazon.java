package org.example.entidades;

public class Cazon extends AnimalMarino {

    public Cazon() {
    }

    public Cazon(TipoAnimalMarino tipo, int edad, String estadoDeSalud) {
        super(tipo, edad, estadoDeSalud);
    }

    @Override
    public void localizarMigracion() {
        System.out.println("El cazon migra desde las aguas del sur de Brasil y Uruguay hasta el sur de Argentina.");

    }
}

package org.example.entidades;

public class LoboMarino extends AnimalMarino {

    public LoboMarino() {
    }

    public LoboMarino(TipoAnimalMarino tipo, int edad, String estadoDeSalud) {
        super(tipo, edad, estadoDeSalud);
    }

    @Override
    public void localizarMigracion() {
        System.out.println("No se han detectado migraciones desde 1991.");
    }
}

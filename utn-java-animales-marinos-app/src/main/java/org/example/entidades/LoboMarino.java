package org.example.entidades;

public class LoboMarino extends AnimalMarino {

    public LoboMarino() {
    }

    public LoboMarino(String nombre, TipoAnimalMarino tipo, int edad, String estadoDeSalud) {
        super(nombre, tipo, edad, estadoDeSalud);
    }

    @Override
    public String toString() {
        return "LoboMarino{" +
                "nombre='" + nombre + '\'' +
                ", tipo=" + tipo +
                ", edad=" + edad +
                ", estadoDeSalud='" + estadoDeSalud + '\'' +
                "} " + super.toString();
    }

    @Override
    public void localizarMigracion() {

        System.out.println("LOBO MARINO | No se han detectado migraciones desde 1991.");
    }
}

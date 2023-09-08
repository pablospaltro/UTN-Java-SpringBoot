package org.example.entidades;

public class AnimalMarino {

    protected TipoAnimalMarino tipo;
    protected int edad;
    protected String estadoDeSalud;

    public AnimalMarino() {
    }

    public AnimalMarino(TipoAnimalMarino tipo, int edad, String estadoDeSalud) {
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

    @Override
    public String toString() {
        return "AnimalMarino{" +
                "tipo=" + tipo +
                ", edad=" + edad +
                ", estadoDeSalud='" + estadoDeSalud + '\'' +
                '}';
    }

    public void localizarMigracion() {

    }

}

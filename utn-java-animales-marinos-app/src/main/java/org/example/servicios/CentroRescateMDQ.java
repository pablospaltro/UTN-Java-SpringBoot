package org.example.servicios;

import org.example.entidades.*;

import java.util.ArrayList;
import java.util.Scanner;

public class CentroRescateMDQ implements GestionAnimalesMarinos {

    Scanner scanner = new Scanner(System.in);

    ArrayList<LoboMarino> lobosMarinos = new ArrayList<>();
    ArrayList<Cazon> cazones = new ArrayList<>();
    ArrayList<BallenaFranca> ballenas = new ArrayList<>();

    public void gestionMenuPrincipal(){

        boolean volverAlMenu = true;

        System.out.println("\nCENTRO DE RESCATE MDQ");
        System.out.println("proteccion de animales marinos");

        do{
            System.out.println("\n   MENU PRINCIPAL");
            System.out.println("1 | Ver todos los animales");
            System.out.println("2 | Registrar un nuevo animal");
            System.out.println("3 | Verificar la salud de un animal");
            System.out.println("0 | Interactuar con el animal");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch(opcion){
                case 1:
                    verAnimalesMenu();
                    break;
                case 2:
                    registrarAnimalMenu();
                    break;
                case 3:
                    consultarSaludDeAnimal();
                    break;
                case 4:
                    interactuarConAnimal();
                    break;
                case 0:
                    System.out.println("Saliendo...\nAdios!");
                    volverAlMenu = false;
                    break;
            }
        } while (volverAlMenu);
    }

    public void verAnimalesMenu(){

        boolean volverAlMenu = true;

        do {
            System.out.println("\nMostrar: ");
            System.out.println("1 | Lobo marino");
            System.out.println("2 | Cazon");
            System.out.println("3 | Ballena franca");
            System.out.println("0 | Volver al MENU Principal");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    mostrarLobosMarinos(lobosMarinos);
                    break;
                case 2:
                    mostrarCazones(cazones);
                    break;
                case 3:
                    mostrarBallenas(ballenas);
                    break;
                case 0:
                    volverAlMenu = false;
                    break;
            }
        } while (volverAlMenu);
    }

    public void mostrarCazones(ArrayList<Cazon> cazones){

        for (Cazon cazon : cazones){
            System.out.println(cazon);
        }
    }

    public void mostrarLobosMarinos(ArrayList<LoboMarino> lobos){

        for (LoboMarino lobo : lobos){
            System.out.println(lobo);
        }
    }

    public void mostrarBallenas (ArrayList<BallenaFranca> ballenas){
        for(BallenaFranca ballena : ballenas){
            System.out.println(ballena);
        }
    }


    @Override
    public void registrarAnimalMenu() {

        boolean volverAlMenu = true;

        do {
            System.out.println("\nRegistrar: ");
            System.out.println("1 | Lobo marino");
            System.out.println("2 | Cazon");
            System.out.println("3 | Ballena franca");
            System.out.println("0 | Volver al MENU Principal");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    registrarLoboMarino(lobosMarinos);
                    break;
                case 2:
                    registrarCazones(cazones);
                    break;
                case 3:
                    registrarBallenas(ballenas);
                    break;
                case 0:
                    volverAlMenu = false;
                    break;
            }
        } while (volverAlMenu);
    }

    public void registrarLoboMarino(ArrayList<LoboMarino> lobos){
        LoboMarino lobo = new LoboMarino();
        cargarDatosAnimal(lobo);
        lobos.add(lobo);
        System.out.println("Tenemos un nuevo Lobo Marino en el Centro!");
    }

    public void registrarCazones(ArrayList<Cazon> cazones){
        Cazon cazon = new Cazon();
        cargarDatosAnimal(cazon);
        cazones.add(cazon);
        System.out.println("Tenemos un nuevo Cazón en el Centro!");
    }

    public void registrarBallenas(ArrayList<BallenaFranca> ballenas){
        BallenaFranca ballena = new BallenaFranca();
        cargarDatosAnimal(ballena);
        ballenas.add(ballena);
        System.out.println("Tenemos una nueva Ballena Franca en el Centro!");
    }

    public void cargarDatosAnimal(AnimalMarino animal){

        System.out.println("Tipo LOBO_MARINO / CAZON / BALLENA_FRANCA : ");
        animal.setTipo(TipoAnimalMarino.valueOf(scanner.nextLine()));
        System.out.println("Edad: ");
        animal.setEdad(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Estado de salud: ");
        animal.setEstadoDeSalud(scanner.nextLine());
    }

    @Override
    public void guardarAnimal() {

    }

    @Override
    public void consultarSaludDeAnimal() {

    }

    @Override
    public void interactuarConAnimal() {

    }
}

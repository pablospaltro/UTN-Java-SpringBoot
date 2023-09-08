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

        System.out.println("\nC E N T R O   D E   R E S C A T E   MDQ");
        System.out.println("proteccion de animales marinos");

        do{
            System.out.println("\n   MENU PRINCIPAL");
            System.out.println("1 | Ver todos los animales");
            System.out.println("2 | Registrar un nuevo animal");
            System.out.println("3 | Verificar la salud de un animal");
            System.out.println("4 | Alimentar animales");
            System.out.println("0 | Salir");


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
                    consultarSaludAnimalMenu();
                    break;
                case 4:
                    alimentarAnimalMenu();
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

    public void mostrarCazones(ArrayList<Cazon> cazones) {
        if (cazones.isEmpty()) {
            System.out.println("Aun no hay cazones ingresados");
        } else {
            for (Cazon cazon : cazones) {
                System.out.println(cazon.toString());
            }
        }
    }

    public void mostrarLobosMarinos(ArrayList<LoboMarino> lobos) {
        if (lobos.isEmpty()) {
            System.out.println("Aun no hay lobos marinos ingresados");
        } else {
            for (LoboMarino lobo : lobos) {
                System.out.println(lobo.toString());
            }
        }
    }

    public void mostrarBallenas (ArrayList<BallenaFranca> ballenas) {
        if (ballenas.isEmpty()) {
            System.out.println("Aun no hay ballenas ingresados");
        } else {
            for (BallenaFranca ballena : ballenas) {
                System.out.println(ballena.toString());
            }
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
        lobo.setTipo(TipoAnimalMarino.LOBO_MARINO);
        cargarDatosAnimal(lobo);
        lobos.add(lobo);
        System.out.println("Tenemos un nuevo Lobo Marino en el Centro! Bienvenido/a, "+lobo.getNombre());
        lobo.localizarMigracion();
    }

    public void registrarCazones(ArrayList<Cazon> cazones){
        Cazon cazon = new Cazon();
        cazon.setTipo(TipoAnimalMarino.CAZON);
        cargarDatosAnimal(cazon);
        cazones.add(cazon);
        System.out.println("Tenemos un nuevo Cazón en el Centro! Bienvenido/a, "+cazon.getNombre());
        cazon.localizarMigracion();
    }

    public void registrarBallenas(ArrayList<BallenaFranca> ballenas){
        BallenaFranca ballena = new BallenaFranca();
        ballena.setTipo(TipoAnimalMarino.BALLENA_FRANCA);
        cargarDatosAnimal(ballena);
        ballenas.add(ballena);
        System.out.println("\nTenemos una nueva Ballena Franca en el Centro! Bienvenido/a, "+ballena.getNombre()+"! \n");
        ballena.localizarMigracion();
    }

    public void cargarDatosAnimal(AnimalMarino animal){

        System.out.println("Nombre: ");
        animal.setNombre(scanner.nextLine());
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
    public void consultarSaludAnimalMenu() {

        boolean volverAlMenu = true;

        do {
            System.out.println("\nConsultar la salud de: ");
            System.out.println("1 | Lobo marino");
            System.out.println("2 | Cazon");
            System.out.println("3 | Ballena franca");
            System.out.println("0 | Volver al MENU Principal");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    consultarSaludLoboMarino(lobosMarinos);
                    break;
                case 2:
                    consultarSaludCazon(cazones);
                    break;
                case 3:
                    consultarSaludBallena(ballenas);
                    break;
                case 0:
                    volverAlMenu = false;
                    break;
            }
        } while (volverAlMenu);



    }

    public void consultarSaludLoboMarino(ArrayList<LoboMarino> lobos){

        for(LoboMarino lobo : lobos){
            System.out.println("Nombre: "+lobo.getNombre()+"\nEstado de salud: "+lobo.getEstadoDeSalud());
        }
    }

    public void consultarSaludCazon(ArrayList<Cazon> cazones){

        for(Cazon cazon : cazones){
            System.out.println("Nombre: "+cazon.getNombre()+"\nEstado de salud: "+cazon.getEstadoDeSalud());
        }
    }

    public void consultarSaludBallena(ArrayList<BallenaFranca> ballenas){

        for(BallenaFranca ballena : ballenas){
            System.out.println("Nombre: "+ballena.getNombre()+"\nEstado de salud: "+ballena.getEstadoDeSalud());
        }
    }

    @Override
    public void alimentarAnimalMenu() {

        boolean volverAlMenu = true;

        do {
            System.out.println("\nAlimentar a: ");
            System.out.println("1 | Lobos marinos");
            System.out.println("2 | Cazones");
            System.out.println("3 | Ballenas francas");
            System.out.println("0 | Volver al MENU Principal");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    alimentarLobos();
                    break;
                case 2:
                    alimentarCazones();
                    break;
                case 3:
                    alimentarBallenas();
                    break;
                case 0:
                    volverAlMenu = false;
                    break;
            }
        } while (volverAlMenu);
    }

    public void alimentarLobos(){
        System.out.println("Alimentando lobos marinos...");
        System.out.println("Se pusieron contentos :)");
    }

    public void alimentarCazones(){
        System.out.println("Alimentando cazones...");
        System.out.println("Se pusieron contentos :)");
    }

    public void alimentarBallenas(){
        System.out.println("Alimentando ballenas...");
        System.out.println("Se pusieron contentas :)");
    }


}

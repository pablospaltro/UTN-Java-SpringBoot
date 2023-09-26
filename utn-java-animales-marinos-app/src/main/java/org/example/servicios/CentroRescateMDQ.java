package org.example.servicios;

import org.example.entidades.*;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CentroRescateMDQ implements GestionAnimalesMarinos {
    Scanner scanner = new Scanner(System.in);
    ArrayList<AnimalMarino> lobosMarinos = new ArrayList<>();
    ArrayList<AnimalMarino> cazones = new ArrayList<>();
    ArrayList<AnimalMarino> ballenas = new ArrayList<>();

    public void gestionMenuPrincipal() {
        boolean volverAlMenu = true;

        System.out.println("\nC E N T R O   D E   R E S C A T E   MDQ");
        System.out.println("Protección de animales marinos");

        do {
            System.out.println("\n   MENU PRINCIPAL");
            System.out.println("1 | Ver todos los animales");
            System.out.println("2 | Registrar un nuevo animal");
            System.out.println("3 | Verificar la salud de un animal");
            System.out.println("4 | Alimentar animales");
            System.out.println("0 | Salir");

            try {
                int opcion = scanner.nextInt();
                scanner.nextLine();

                switch (opcion) {
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
                        System.out.println("Saliendo...\nAdiós!");
                        volverAlMenu = false;
                        break;
                    default:
                        System.out.println("Opción no válida. Por favor, ingrese un número válido.");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("* Error: Debe ingresar un número válido");
                scanner.nextLine();
            }
        } while (volverAlMenu);
    }


    public void verAnimalesMenu() {

        boolean volverAlMenu = true;

        do {
            System.out.println("\nMostrar: ");
            System.out.println("1 | Lobo marino");
            System.out.println("2 | Cazon");
            System.out.println("3 | Ballena franca");
            System.out.println("0 | Volver al MENU Principal");

            try {
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
            } catch(InputMismatchException e){
                System.out.println("* Error: Debe ingresar un número válido.");
                scanner.nextLine();
                }
            } while (volverAlMenu) ;
        }

        public void mostrarAnimales (ArrayList < AnimalMarino > animales) {
            if (animales.isEmpty()) {
                System.out.println("Aun no hay animales ingresados");
            } else {
                for (AnimalMarino animal : animales) {
                    System.out.println(animal.toString());
                }
            }
        }

        public void mostrarCazones (ArrayList < AnimalMarino > cazones) {
            mostrarAnimales(cazones);
        }

        public void mostrarLobosMarinos (ArrayList < AnimalMarino > lobos) {
            mostrarAnimales(lobos);
        }

        public void mostrarBallenas (ArrayList < AnimalMarino > ballenas) {
            mostrarAnimales(ballenas);
        }

        public void registrarAnimal (ArrayList < ? super AnimalMarino > animales, TipoAnimalMarino tipoAnimal){
            AnimalMarino animal = null;

            switch (tipoAnimal) {
                case LOBO_MARINO:
                    animal = new LoboMarino();
                    break;
                case CAZON:
                    animal = new Cazon();
                    break;
                case BALLENA_FRANCA:
                    animal = new BallenaFranca();
                    break;
            }

            if (animal != null) {
                animal.setTipo(tipoAnimal);
                cargarDatosAnimal(animal);
                animales.add(animal);
                System.out.println("Tenemos un nuevo " + tipoAnimal + " en el Centro! Bienvenido/a, " + animal.getNombre());
                animal.localizarMigracion();
            }
        }

        public void registrarAnimalMenu () {
            boolean volverAlMenu = true;

            do {
                System.out.println("\nRegistrar: ");
                System.out.println("1 | Lobo marino");
                System.out.println("2 | Cazon");
                System.out.println("3 | Ballena franca");
                System.out.println("0 | Volver al MENU Principal");

                try {
                    int opcion = scanner.nextInt();
                    scanner.nextLine();

                    switch (opcion) {
                        case 1:
                            registrarLoboMarino(lobosMarinos);
                            break;
                        case 2:
                            registrarCazon(cazones);
                            break;
                        case 3:
                            registrarBallena(ballenas);
                            break;
                        case 0:
                            volverAlMenu = false;
                            break;
                        default:
                            System.out.println("Opción no válida");
                            break;
                    }
                } catch (InputMismatchException e){
                    System.out.println("* Error: Debe ingresar un número válido.");
                    scanner.nextLine();
                }
            } while (volverAlMenu);
        }

        public void registrarLoboMarino (ArrayList < ? super AnimalMarino > lobosMarinos){
            registrarAnimal(lobosMarinos, TipoAnimalMarino.LOBO_MARINO);
        }

        public void registrarCazon (ArrayList < ? super AnimalMarino > cazones){
            registrarAnimal(cazones, TipoAnimalMarino.CAZON);
        }

        public void registrarBallena (ArrayList < ? super AnimalMarino > ballenas){
            registrarAnimal(ballenas, TipoAnimalMarino.BALLENA_FRANCA);
        }

        public void cargarDatosAnimal (AnimalMarino animal){
            boolean datosValidos = false;
            do {
                try {
                    System.out.println("Nombre: ");
                    animal.setNombre(scanner.nextLine());
                    System.out.println("Edad: ");
                    animal.setEdad(scanner.nextInt());
                    scanner.nextLine();
                    System.out.println("Estado de salud: ");
                    animal.setEstadoDeSalud(scanner.nextLine());

                    datosValidos = true;

                } catch (InputMismatchException e) {
                    System.out.println("* Error: La edad debe ser un número válido. Intentemos otra vez... \n");
                    scanner.nextLine();
                }
            } while (!datosValidos);
        }

        @Override
        public void consultarSaludAnimalMenu () {
            boolean volverAlMenu = true;

            do {
                System.out.println("\nConsultar la salud de: ");
                System.out.println("1 | Lobo marino");
                System.out.println("2 | Cazon");
                System.out.println("3 | Ballena franca");
                System.out.println("0 | Volver al MENU Principal");

                try {
                    int opcion = scanner.nextInt();
                    scanner.nextLine();

                    switch (opcion) {
                        case 1:
                            consultarSaludAnimales(lobosMarinos);
                            break;
                        case 2:
                            consultarSaludAnimales(cazones);
                            break;
                        case 3:
                            consultarSaludAnimales(ballenas);
                            break;
                        case 0:
                            volverAlMenu = false;
                            break;
                        default:
                            System.out.println("Opción no válida");
                            break;
                    }
                } catch (InputMismatchException e){
                    System.out.println("* Error: Debe ingresar un número válido.");
                    scanner.nextLine();
                }
            } while (volverAlMenu);
        }

        public void consultarSaludAnimales (ArrayList < ? extends AnimalMarino > animales){
            for (AnimalMarino animal : animales) {
                System.out.println("Nombre: " + animal.getNombre() + "\nEstado de salud: " + animal.getEstadoDeSalud());
            }
        }

        @Override
        public void alimentarAnimalMenu () {
            boolean volverAlMenu = true;

            do {
                System.out.println("\nAlimentar a: ");
                System.out.println("1 | Lobos marinos");
                System.out.println("2 | Cazones");
                System.out.println("3 | Ballenas francas");
                System.out.println("0 | Volver al MENU Principal");

                try {
                    int opcion = scanner.nextInt();
                    scanner.nextLine();

                    switch (opcion) {
                        case 1:
                            alimentarAnimal("lobos marinos");
                            break;
                        case 2:
                            alimentarAnimal("cazones");
                            break;
                        case 3:
                            alimentarAnimal("ballenas");
                            break;
                        case 0:
                            volverAlMenu = false;
                            break;
                        default:
                            System.out.println("Opción no válida");
                            break;
                    }
                } catch (InputMismatchException e){
                    System.out.println("* Error: Debe ingresar un número válido.");
                    scanner.nextLine();
                }
            } while (volverAlMenu);
        }

        public void alimentarAnimal (String animales) {
            System.out.println("Alimentando "+animales+"...");
            System.out.println("Se ven felices :)");
        }
    }

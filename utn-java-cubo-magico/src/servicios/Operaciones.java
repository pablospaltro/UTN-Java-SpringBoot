package servicios;

import java.util.Scanner;

public class Operaciones {

    Scanner scanner = new Scanner(System.in);

    public void llenarCubo(int numeros[][]) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Ingrese el valor [" + i + "] [" + j + "] : ");
                int numeroIngresado = scanner.nextInt();
                scanner.nextLine();
                numeros[i][j] = numeroIngresado;
            }
        }
    }

    public void mostrarCubo(int numeros[][]) {

        System.out.println(" ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + numeros[i][j] + "]");
            }
            System.out.println(" ");
        }
        System.out.println(" ");

    }

    public int comprobarSumasHorizontales(int numeros[][]) {

        int contadorPrimerFila = 0;
        int contadorSegundaFila = 0;
        int contadorTercerFila = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 0) {
                    contadorPrimerFila += numeros[i][j];
                } else if (i == 1) {
                    contadorSegundaFila += numeros[i][j];
                } else if (i == 2) {
                    contadorTercerFila += numeros[i][j];
                }
            }
        }

        if (contadorPrimerFila == contadorSegundaFila && contadorSegundaFila == contadorTercerFila) {
            return contadorPrimerFila;
        } else {
            return -1;
        }
    }

    public int comprobarSumasVerticales(int numeros[][]) {

        int contadorPrimerCol = 0;
        int contadorSegundaCol = 0;
        int contadorTercerCol = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == 0) {
                    contadorPrimerCol += numeros[i][j];
                } else if (j == 1) {
                    contadorSegundaCol += numeros[i][j];
                } else if (j == 2) {
                    contadorTercerCol += numeros[i][j];
                }
            }
        }

        if (contadorPrimerCol == contadorSegundaCol && contadorSegundaCol == contadorTercerCol) {
            return contadorPrimerCol;
        } else {
            return -2;
        }
    }

    public int comprobarSumaDiagonal(int numeros[][]) {

        int contadorPrimerPosicion = 0;
        int contadorSegundaPosicion = 0;
        int contadorTercerPosicion = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j && i == 0) {
                    contadorPrimerPosicion += numeros[i][j];
                } else if (i == j && i == 1) {
                    contadorSegundaPosicion += numeros[i][j];
                } else if (i == j && i == 2) {
                    contadorTercerPosicion += numeros[i][j];
                }
            }
        }

        int sumaDiagonal = contadorPrimerPosicion+contadorSegundaPosicion+contadorTercerPosicion;

        return sumaDiagonal;
    }


    public void comprobarSiEsMagico(int numeros[][]){

            boolean volverAProbar = false;
            do {
                System.out.println("\n| c u b o   m á g i c o ? |\n");
                llenarCubo(numeros);
                mostrarCubo(numeros);

                int sumasHorizontales = comprobarSumasHorizontales(numeros);
                int sumasVerticales = comprobarSumasVerticales(numeros);
                int sumaDiagonal = comprobarSumaDiagonal(numeros);

                System.out.println("Suma de lineas horizontales: "+sumasHorizontales);
                System.out.println("Suma de lineas verticales: "+sumasVerticales);
                System.out.println("Suma de linea diagonal: "+sumaDiagonal);


                if (sumasHorizontales == sumasVerticales && sumasVerticales == sumaDiagonal) {
                    System.out.println("\uD83C\uDF1F El cubo es mágico \uD83C\uDF1F");
                } else {
                    System.out.println("El cubo no es mágico.");
                }


                System.out.println("\nVolver a probar otro cubo? S / N ");
                String opcion = scanner.nextLine();
                volverAProbar = opcion.equalsIgnoreCase("S");

                if (!volverAProbar) {
                    System.out.println("\nAdiós!");
                }
            } while (volverAProbar);
    }
}
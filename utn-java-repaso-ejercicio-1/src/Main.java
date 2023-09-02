import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* Pedí al usuario una frase de no más de 10 palabras.
Validá que el usuario cumpla esa condición. Luego,
alojá cada palabra en un índice de un vector e
imprimilo en la terminal.*/

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nIngrese una frase que no tenga más de 10 palabras: ");
            String fraseIngresada = scanner.nextLine();

            String frase[] = fraseIngresada.split(" ");

            if (frase.length <= 10) {
                for (String palabra : frase) {
                    System.out.print(palabra + " ");
                }
                System.out.println("La frase tiene " + frase.length + " palabras");
            } else {
                System.out.println("La frase ingresada tiene más de 10 palabras. Intente nuevamente");
            }
        }
    }
}
package servicios;

public class Operaciones {

    // numeros originales:
    int numeros[] = new int[1000];

    // divisores sumados que den resto 0 de cada nro original
    int divisoresSumadosDeCadaNumero[] = new int[1000];

    // añado los numeros originales:
    public void agregarNumerosOriginales(){

        for (int i = 0; i < 1000; i++) {
            numeros[i] = i + 1;
        }
    }

    /*
    recorro numeros[] y añado los divisores sumados que den resto 0
    de cada numero a divisoresSumadosDeCadaNumero[] */
    public void agregarDivisoresSumados () {

        for (int i = 0; i < 1000; i++) {

            int divisoresSumados = 0;
            int divisor = 1;
            while (numeros[i] != divisor) {
                if (numeros[i] % divisor == 0) {
                    divisoresSumados += divisor;

                }
                divisor++;
            }

            if (divisoresSumados != 0) {
                divisoresSumadosDeCadaNumero[i] = divisoresSumados;
            }
        }
    }

    public void mostrarNumerosOriginales() {

        System.out.println("Numeros originales: ");
            for (int i = 0; i < 1000; i++) {
                System.out.print("["+numeros[i]+"] ");
            }
        System.out.println("");

    }

    public void mostrarDivisoresSumadosDeCadaNumero(){

        System.out.println("Divisores que den resto 0 de cada numero sumados: ");
            for (int i = 0; i < 1000; i++) {
                System.out.print("["+divisoresSumadosDeCadaNumero[i]+"] ");
            }
        System.out.println("");
    }
}



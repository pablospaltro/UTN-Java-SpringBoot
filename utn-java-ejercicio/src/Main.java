import servicios.Operaciones;

public class Main {
    public static void main(String[] args) {

        Operaciones calculadora = new Operaciones();

        calculadora.agregarNumerosOriginales();
        calculadora.mostrarNumerosOriginales();
        calculadora.agregarDivisoresSumados();
        calculadora.mostrarDivisoresSumadosDeCadaNumero();


    }
}
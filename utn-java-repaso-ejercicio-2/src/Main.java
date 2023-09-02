public class Main {
    public static void main(String[] args) {

        /* Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se
obtiene cambiando sus filas por columnas (o viceversa)*/

        int matriz [][] = new int [4][4];

        int numero;


        //matriz original:
        for (int i=0; i< matriz.length; i++){
            for(int j=0; j< matriz.length; j++){
                numero = (int) (Math.random() * 10);
                matriz[i][j] = numero;
            }
        }

        System.out.println("Matriz original: ");
        for (int i=0; i< matriz.length; i++){
            for(int j=0; j< matriz.length; j++){
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println("");
        }

        System.out.println("\nMatriz transpuesta: ");
        for (int i=0; i< matriz.length; i++){
            for(int j=0; j< matriz.length; j++){
                System.out.print("["+matriz[j][i]+"]");
            }
            System.out.println("");
        }






    }
}
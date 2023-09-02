package servicios;

import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);
    LibroService libroServicio = new LibroService();

    public void biblioMenu(){

        libroServicio.llenarBiblioteca();
        boolean volverAlMenu = true;

        do {
            System.out.println("\n| Biblioteca |");
            System.out.println("1 | Buscar libro por Título");
            System.out.println("2 | Buscar libro por Autor");
            System.out.println("3 | Buscar libro por Género");
            System.out.println("4 | Ver transacciones");
            System.out.println("5 | Donar libros");
            System.out.println("0 | Salir");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch(opcion){
                case 1:
                    libroServicio.buscarLibroPorTitulo();
                    break;
                case 2:
                    libroServicio.buscarLibroPorAutor();
                    break;
                case 3:
                    libroServicio.buscarLibroPorGenero();
                    break;
                case 4:
                    libroServicio.verTransacciones();
                    break;
                case 5:
                    libroServicio.donarLibros();
                    break;
                case 0:
                    System.out.println("Saliendo...\nHasta pronto!");
                    volverAlMenu=false;
                    break;
                default:
                    System.out.println("Opción inválida, intente nuevamente");
                    break;
            }

        } while (volverAlMenu);
    }
}

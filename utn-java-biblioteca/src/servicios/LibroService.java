package servicios;

import entidades.Libro;

import java.util.ArrayList;
import java.util.Scanner;

public class LibroService {

    Scanner scanner = new Scanner(System.in);
    ArrayList<Libro> libros = new ArrayList<Libro>();
    ArrayList<String> registoDeTransacciones = new ArrayList<>();

    public void llenarBiblioteca() {

        Libro[] librosArray = {
                new Libro("Harry Potter y La camara secreta", "J.K.Rowling", "Fantasia", true),
                new Libro("Principios de filosofia", "Adolfo Carpio", "Filosofia", true),
                new Libro("El señor de los Anillos: La comunidad del anillo", "J.R.R.Tolkien", "Fantasia", true),
                new Libro("El señor de los Anillos: Las dos torres", "J.R.R.Tolkien", "Fantasia", true),
                new Libro("El señor de los Anillos: El retorno del rey", "J.R.R.Tolkien", "Fantasia", true),
                new Libro("It", "Stephen King", "Terror", true),
                new Libro("La torre oscura", "Stephen King", "Fantasia", true),
                new Libro("El viejo y el mar", "Ernest Hemingway", "Drama", true),
                new Libro("Las nieves del Kilimanjaro", "Ernest Hemingway", "Aventura", true),
                new Libro("El sabueso de los Baskerville", "Arthur Conan Doyle", "Policial", true),
                new Libro("Memorias de Sherlock Holmes", "Arthur Conan Doyle", "Policial", true),
                new Libro("El archivo de Sherlock Holmes", "Arthur Conan Doyle", "Policial", true),
                new Libro("Asi hablaba Zaratustra", "Friedrich Nietzche", "Filosofia", true),
                new Libro("La republica", "Platón", "Filosofia", true),
                new Libro("Aves de presa", "Wilbur Smith", "Aventura", true)
        };

        for (Libro libro : librosArray) {
            libros.add(libro);
        }
    }


    public void donarLibros() {
        System.out.println("¿Cuantos libros vas a donar?\n");
        int cantidadDonada = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < cantidadDonada; i++) {
            System.out.print("Titulo: ");
            String tituloDonado = scanner.nextLine();
            System.out.print("Autor: ");
            String autorDonado = scanner.nextLine();
            System.out.print("Genero: ");
            String generoDonado = scanner.nextLine();

            libros.add(new Libro(tituloDonado, autorDonado, generoDonado, true));
        }
    }

    public void buscarLibroPorTitulo() {
        System.out.print("Buscar por Título: ");
        String tituloABuscar = scanner.nextLine();
        boolean libroEncontrado = false;
        for (Libro libro : libros) {
            if (libro.getTitulo().toLowerCase().contains(tituloABuscar.toLowerCase())) {
                comprobarSiEstaDisponible(libro);
                libroEncontrado = true;
            }
        }
        if (!libroEncontrado) {
            System.out.println("La biblioteca no cuenta con ese libro.");
        }
    }

    public void buscarLibroPorAutor() {
        System.out.print("Buscar por Autor: ");
        String autorABuscar = scanner.nextLine();
        boolean libroEncontrado = false;
        for (Libro libro : libros) {
            if (libro.getAutor().toLowerCase().contains(autorABuscar.toLowerCase())) {
                comprobarSiEstaDisponible(libro);
                libroEncontrado = true;
            }
        }
        if (!libroEncontrado) {
            System.out.println("La biblioteca no cuenta con ese libro.");
        }
    }

    public void buscarLibroPorGenero() {
        System.out.print("Buscar por Género: ");
        String generoABuscar = scanner.nextLine();
        boolean libroEncontrado = false;
        for (Libro libro : libros) {
            if (libro.getGenero().toLowerCase().contains(generoABuscar.toLowerCase())) {
                comprobarSiEstaDisponible(libro);
                libroEncontrado = true;
            }
        }
        if (!libroEncontrado) {
            System.out.println("La biblioteca no cuenta con ese libro.");
        }
    }

    public void comprobarSiEstaDisponible(Libro libro) {
        if (libro.isDisponibilidad()) {
            System.out.println(libro.toString());
            System.out.println("Disponible para pedir");
        } else {
            System.out.println(libro.toString());
            System.out.println("Prestado. No disponible por el momento.");
        }
    }

    public void pedirPrestadoLibro() {

    }

    public void devolverLibro() {

    }


}

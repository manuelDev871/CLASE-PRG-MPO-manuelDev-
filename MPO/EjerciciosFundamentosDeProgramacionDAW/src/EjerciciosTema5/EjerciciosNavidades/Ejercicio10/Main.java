package EjerciciosTema5.EjerciciosNavidades.Ejercicio10;

import EjerciciosTema5.EjerciciosNavidades.Ejercicio10.controller.Biblioteca;
import EjerciciosTema5.EjerciciosNavidades.Ejercicio10.model.Libro;

public class Main {

    /*
        Objetivo: Crear un sistema de biblioteca que gestione libros y préstamos usando la clase `Libro` y una nueva clase `Biblioteca`.

        Requisitos:

        1. Modificar la clase `Libro` del Ejercicio 1 para añadir: `isbn` (String) y `prestado` (boolean).
        2. Añadir a `Libro` los métodos:
            - boolean `prestar()` que marque el libro como prestado si no lo está ya
            - boolean `devolver()` que marque el libro como no prestado
        3. Crear una clase `Biblioteca` con atributos: `nombre` (String), `libros` (array de Libro), `numLibros` (int).
        4. Crear métodos en `Biblioteca`:
            - `boolean agregarLibro(Libro libro)`
            - `Libro buscarLibroPorIsbn(String isbn)`
            - `boolean prestarLibro(String isbn)`
            - `boolean devolverLibro(String isbn)`
            - `void listarLibrosDisponibles()`
            - `void listarLibrosPrestados()`
        5. En el `main`, crear una biblioteca, añadir libros, realizar préstamos y devoluciones, y listar libros por estado.
     */

    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca("Biblioteca Municipal");

        System.out.println("Biblioteca creada: " + biblioteca.getNombre());

        Libro quijote = new Libro("El Quijote", "Miguel de Cervantes", 800, 19.99, "978-1234567890");
        Libro cienAnios = new Libro("Cien Años de Soledad", "Gabriel García Márquez", 400, 18.50, "978-0987654321");

        System.out.println("Agregando libros...");
        biblioteca.agregarLibro(quijote);
        System.out.println("Libro agregado: " + quijote.getTitulo() + " (ISBN: " + quijote.getIsbn() + ")");

        biblioteca.agregarLibro(cienAnios);
        System.out.println("Libro agregado: " + cienAnios.getTitulo() + " (ISBN: " + cienAnios.getIsbn() + ")");

        System.out.println("\nPréstamo del libro " + quijote.getIsbn() + "...");
        if (biblioteca.prestarLibro(quijote.getIsbn())) {
            System.out.println("Libro prestado exitosamente.");
        } else {
            System.out.println("No se pudo prestar el libro.");
        }

        System.out.println("\nLibros disponibles:");
        biblioteca.listarLibrosDisponibles();

        System.out.println("\nLibros prestados:");
        biblioteca.listarLibrosPrestados();

        System.out.println("\nDevolución del libro " + quijote.getIsbn() + "...");
        if (biblioteca.devolverLibro(quijote.getIsbn())) {
            System.out.println("Libro devuelto exitosamente.");
        } else {
            System.out.println("No se pudo devolver el libro.");
        }
    }
}

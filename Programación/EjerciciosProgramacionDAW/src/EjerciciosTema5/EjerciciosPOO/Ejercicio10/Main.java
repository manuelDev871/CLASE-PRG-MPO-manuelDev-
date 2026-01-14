package EjerciciosTema5.EjerciciosPOO.Ejercicio10;

import EjerciciosTema5.EjerciciosPOO.Ejercicio10.model.Libro;
import EjerciciosTema5.EjerciciosPOO.Ejercicio10.model.Prestamo;
import EjerciciosTema5.EjerciciosPOO.Ejercicio10.model.Usuario;

public class Main {

    /*
        Crea un sistema de biblioteca con las clases:
            Libro (titulo, autor, ISBN, disponible),
            Usuario (nombre, numeroSocio) y
            Prestamo (libro, usuario, fechaPrestamo).
        Implementa métodos para prestar un libro (si está disponible) y devolverlo.
        Crea varios libros y usuarios, realiza algunos préstamos y devoluciones.
     */

    public static void main(String[] args) {

        Libro l1 = new Libro("Don Quijote", "Miguel de Cervantes", "001");
        Libro l2 = new Libro("Cien años de soledad", "Gabriel García Márquez", "002");
        Libro l3 = new Libro("1984", "George Orwell", "003");

        Libro[] libros = { l1, l2, l3 };

        Usuario u1 = new Usuario("Juan Pérez", 101);
        Usuario u2 = new Usuario("María López", 102);

        System.out.println("--- BIBLIOTECA ---");
        mostrarLibros(libros);

        Prestamo p1 = new Prestamo(l1, u1);
        p1.realizarPrestamo();

        Prestamo p2 = new Prestamo(l1, u2);
        p2.realizarPrestamo();

        p1.devolverLibro();

        System.out.println("\nLibros disponibles ahora:");
        mostrarLibros(libros);
    }

    private static void mostrarLibros(Libro[] libros) {
        for (int i = 0; i < libros.length; i++) {
            if (libros[i].isDisponible()) {
                System.out.println("- " + libros[i].getLibro() + " (" +
                        libros[i].getAutor() + ") ISBN: " +
                        libros[i].getIsbn());
            }
        }
    }
}

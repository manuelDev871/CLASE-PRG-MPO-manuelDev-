package EjerciciosTema5.EjerciciosPOO.Ejercicio4;

import EjerciciosTema5.EjerciciosPOO.Ejercicio4.model.Libro;

public class Main {

    /*
        Crea una clase Libro con atributos titulo, autor y paginas.
        Implementa tres constructores: uno sin parámetros (valores por defecto),
        uno con título y autor, y otro con los tres parámetros.
        Crea tres objetos usando cada constructor y muestra sus datos.
     */

    public static void main(String[] args) {

        Libro libro1 = new Libro();
        System.out.println("Libro 2: " + libro1.getTitulo() + ", " + libro1.getAutor() + ", " + libro1.getNumeroPaginas() + " páginas");

        Libro libro2 = new Libro("Don Quijote","Miguel de Cervantes");
        System.out.println("Libro 2: " + libro2.getTitulo() + ", " + libro2.getAutor() + ", " + libro2.getNumeroPaginas() + " páginas");

        Libro libro3 = new Libro("Cien años de soledad","Gabriel García Márquez", 471);
        System.out.println("Libro 2: " + libro3.getTitulo() + ", " + libro3.getAutor() + ", " + libro3.getNumeroPaginas() + " páginas");
    }
}

/* Ejercicio Nº 4 : Crea un programa que simule la información de un libro usando variables con nombres descriptivos.
   Muestra toda la información del libro en la consola. */

public class Ejercicio4_Tema_1 {

    public static void main (String [] args) {

        System.out.println("--------------");
        System.out.println("INFORMACION 1");
        System.out.println("--------------");

        almacenar("Don Quijote","Miguel de Cervantes",1605, 863, true);

        System.out.println("--------------");
        System.out.println("INFORMACION 2");
        System.out.println("--------------");
        almacenar("Don Quijote de la Mancha","Miguel de Cervantes",1605, 863, false);
    }

    public static void almacenar (String titulo, String autor, int fechaPublicacion, int numeroPaginas, boolean disponibilidad) {

        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de publicación: " + fechaPublicacion);
        System.out.println("Número de páginas: " + numeroPaginas);
        System.out.println("Disponibilidad: " + disponibilidad);
    }
}

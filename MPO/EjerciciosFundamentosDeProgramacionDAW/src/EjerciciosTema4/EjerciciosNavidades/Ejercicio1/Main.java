package EjerciciosTema4.EjerciciosNavidades.Ejercicio1;

import EjerciciosTema4.EjerciciosNavidades.Ejercicio1.model.Libro;

public class Main {

    /*
        Objetivo: Crear una clase `Libro` con atributos básicos y métodos simples.

        Requisitos:

        1. Crear una clase `Libro` con los atributos: `titulo` (String), `autor` (String), `numPaginas` (int), `precio` (double).
        2. Crear un constructor que inicialice todos los atributos.
        3. Crear getters y setters para todos los atributos.
        4. Crear un metodo `mostrarInfo()` que imprima toda la información del libro con formato: "Título: XXX, Autor: XXX, Páginas: XXX, Precio: XXX€"
        5. Crear un metodo `boolean esLibroLargo()` que devuelva `true` si el libro tiene más de 300 páginas.
        6. Crear un metodo `void aplicarDescuento(double porcentaje)` que reduzca el precio según el porcentaje dado.
        7. En el `main`, crear varios objetos `Libro` y probar todos los métodos.
     */

    public static void main(String[] args) {

        Libro libro = new Libro("El Quijote", "Cervantes", 363, 25.5);
        Libro libro2 = new Libro("1984", "Márquez", 150, 17.5);

        libro.mostrarInfo();
        System.out.println("¿Es libro largo?: " + libro.esLibroLargo());
        libro.aplicarDescuento(10);

        libro2.mostrarInfo();
        System.out.println("¿Es libro largo?: " + libro2.esLibroLargo());
        libro2.aplicarDescuento(25);
    }
}

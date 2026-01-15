package EjerciciosTema4.EjerciciosNavidades.Ejercicio6;

import EjerciciosTema4.EjerciciosNavidades.Ejercicio6.model.Pelicula;

import java.util.ArrayList;

public class Main {

    /*
        Objetivo: Crear una clase `Pelicula` para gestionar información de películas.

        Requisitos:

        1. Crear una clase `Pelicula` con atributos: `titulo` (String), `director` (String), `duracion` (int en minutos), `anio` (int), `calificacion` (double de 0 a 10).
        2. Crear constructor con todos los parámetros.
        3. Crear getters y setters. El setter de calificación debe validar que esté entre 0 y 10.
        4. Crear metodo `String obtenerDuracionFormateada()` que devuelva la duración en formato "Xh Ymin" (ej: "2h 15min").
        5. Crear metodo `boolean esClasica()` que devuelva `true` si la película tiene más de 25 años.
        6. Crear metodo `boolean esRecomendable()` que devuelva `true` si la calificación es mayor o igual a 7.
        7. Crear metodo `void mostrarInfo()` con toda la información de la película.
        8. En el `main`, crear una colección de películas y mostrar cuáles son recomendables.
     */

    public static void main(String[] args) {

        ArrayList <Pelicula> peliculas = new ArrayList<>();

        Pelicula pelicula1 = new Pelicula("Corazones de acero", "Spilgver", 124, 2015, 5.8);
        Pelicula pelicula2 = new Pelicula("Forest Gump", "Paquito", 107, 2000, 7.8);
        Pelicula pelicula3 = new Pelicula("3 metros sobre el cielo", "Molina", 135, 2011, 9.0);

        peliculas.add(pelicula1);
        peliculas.add(pelicula2);
        peliculas.add(pelicula3);


        System.out.println("Mostrando informacion de la pelicula 1");
        pelicula1.mostrarInfo();
        System.out.println();
        System.out.println("¿Es clásica?: " + pelicula1.esClasica());
        System.out.println();

        System.out.println("Mostrando informacion de la pelicula 2");
        pelicula2.mostrarInfo();
        System.out.println();
        System.out.println("¿Es clásica?: " + pelicula2.esClasica());
        System.out.println();

        System.out.println("Mostrando informacion de la pelicula 3");
        pelicula3.mostrarInfo();
        System.out.println();
        System.out.println("¿Es clásica?: " + pelicula3.esClasica());
        System.out.println();

        System.out.println("Peliculas recomendadas:");

        for (Pelicula pelicula : peliculas) {
            if (pelicula.esRecomendable()) {
                System.out.println(pelicula.getTitulo() + " es recomendable: " + pelicula.esRecomendable());
            }
        }
    }
}

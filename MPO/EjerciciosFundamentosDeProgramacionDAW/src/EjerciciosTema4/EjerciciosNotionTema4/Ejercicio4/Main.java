package EjerciciosTema4.EjerciciosNotionTema4.Ejercicio4;

import java.util.function.BiPredicate;

public class Main {

    /*
        Ejercicio 4 - BiPredicate: Comparación de Strings

        Implementa un BiPredicate que reciba dos Strings y determine si tienen la misma longitud. Pruébalo con varios pares de palabras.
    */

    public static void main(String[] args) {

        BiPredicate<String, String> palabras = (p1, p2) -> p1 != null && p2 != null && p1.length() == p2.length();

        System.out.println(palabras.test("Hola", "Hola"));   // true
        System.out.println(palabras.test("Hola", "Adios"));  // false
        System.out.println(palabras.test("Java", "C++"));    // false
    }
}

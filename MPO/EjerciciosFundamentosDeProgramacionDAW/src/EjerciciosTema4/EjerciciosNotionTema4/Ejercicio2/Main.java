package EjerciciosTema4.EjerciciosNotionTema4.Ejercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    /*
        Ejercicio 2 - Predicate: Filtrado de Números**

        Utiliza un Predicate para crear una función lambda que determine si un número es par.
        Aplícala a una lista de números del 1 al 20 y muestra solo los pares.
     */

    public static void main(String[] args) {

        // Lista del 1 al 20
        ArrayList<Integer> numeros = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            numeros.add(i);
        }

        // Predicate para saber si un número es par
        Predicate<Integer> esPar = n -> n % 2 == 0;

        // Mostrar solo los pares
        numeros.forEach(n -> {
            if (esPar.test(n)) {
                System.out.println(n);
            }
        });
    }
}

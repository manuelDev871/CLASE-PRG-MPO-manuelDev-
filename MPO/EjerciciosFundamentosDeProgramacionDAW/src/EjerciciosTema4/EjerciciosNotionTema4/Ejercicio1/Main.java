package EjerciciosTema4.EjerciciosNotionTema4.Ejercicio1;

import java.util.function.Function;

public class Main {

    /*
        Crea una función lambda que reciba un número entero y
        devuelva su cuadrado. Pruébala con los números del 1 al 5.
     */

    public static void main(String[] args) {

        // Lambda que recibe un entero y devuelve su cuadrado
        Function<Integer, Integer> cuadrado = numero -> numero * numero;

        // Probarla con los números del 1 al 5
        for (int i = 1; i <= 5; i++) {
            System.out.println("El cuadrado de " + i + " es " + cuadrado.apply(i));
        }
    }
}

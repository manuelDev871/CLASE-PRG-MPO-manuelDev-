package EjerciciosTema4.EjerciciosNotionTema4.Ejercicio3;

import java.util.function.BiFunction;

public class Main {

    public static void main(String[] args) {

        /*
            Ejercicio 3 - BiFunction: Calculadora Básica**

            Crea una BiFunction que reciba dos números enteros y devuelva su suma.
            Después, crea otras tres BiFunctions para resta, multiplicación y división.
         */

        BiFunction<Integer, Integer, Integer> suma = Integer::sum;
        System.out.println(suma.apply(1, 4));

        BiFunction<Integer, Integer, Integer> resta = (p1, p2) -> p1 - p2;
        System.out.println(resta.apply(4, 1));

        BiFunction<Integer, Integer, Integer> multi = (p1, p2) -> p1 * p2;
        System.out.println(multi.apply(4, 1));

        BiFunction<Integer, Integer, Integer> division = (p1, p2) -> {
            if (p2 == 0) {
                System.out.println("No se puede dividir entre 0");
                return 0;
            }
            return p1 / p2;
        };

        System.out.println(division.apply(4,2));
        System.out.println(division.apply(4,0));
    }
}

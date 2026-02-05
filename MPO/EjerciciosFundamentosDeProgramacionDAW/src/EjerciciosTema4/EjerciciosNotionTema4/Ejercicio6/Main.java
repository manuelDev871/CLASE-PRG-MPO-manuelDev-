package EjerciciosTema4.EjerciciosNotionTema4.Ejercicio6;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

    /*
        Ejercicio 6 - Composición de Funciones: Operaciones Encadenadas

        Utiliza Function y el metodo `andThen()` para crear una cadena de operaciones:
        toma un número, súmale 10, multiplícalo por 2, y conviértelo a String. Aplícalo a una lista de números.
     */

    public static void main(String[] args) {

        Function<Integer, Integer> sumarDiez = (numero) -> numero + 10;
        Function<Integer,Integer> multiplicarPorDos = (numero) -> numero * 2;
        Function<Integer, String> convertirAString = (numero) -> "Resultado: " + numero;

        Function<Integer,String> opracionCompleta = sumarDiez.andThen(multiplicarPorDos).andThen(convertirAString);

        int [] numeros = new int[] {1,2,3,4,5};

        for (int numero: numeros) {
            System.out.println(opracionCompleta.apply(numero));
        }
    }
}

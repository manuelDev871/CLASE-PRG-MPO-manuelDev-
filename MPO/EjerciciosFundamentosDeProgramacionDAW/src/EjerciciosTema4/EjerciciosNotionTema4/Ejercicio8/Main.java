package EjerciciosTema4.EjerciciosNotionTema4.Ejercicio8;


import java.util.List;
import java.util.function.Predicate;

public class Main {

    /*
        Ejercicio 8 - Predicates Compuestos: Filtrado Múltiple

        Crea varios Predicates para filtrar una lista de números:

        - Números mayores que 50
        - Números pares
        - Números divisibles por 3

        Combínalos usando `and()`, `or()` y `negate()` para crear filtros complejos.
     */

    public static void main(String[] args) {

        List<Integer> numeros = List.of(10, 15, 20, 30, 45, 50, 60, 75, 90, 100);

        // Predicates básicos
        Predicate<Integer> mayorQue50 = (numero) -> numero > 50;
        Predicate<Integer> esPar = (numero) -> numero %2 == 0;
        Predicate<Integer> divisiblePor3 = (numero) -> numero %3 == 0;

        // 🔹 Combinaciones
        Predicate<Integer> mayorYPar = mayorQue50.and(esPar);
        Predicate<Integer> mayorOPar = mayorQue50.or(esPar);
        Predicate<Integer> noDivisiblePor3 = divisiblePor3.negate();
        Predicate<Integer> filtroComplejo = mayorQue50.and(esPar).and(noDivisiblePor3);


        System.out.println("Mayores que 50 y pares:");
        numeros.stream().filter(mayorYPar).forEach(System.out::println);

        System.out.println("\nMayores que 50 o pares:");
        numeros.stream().filter(mayorOPar).forEach(System.out::println);

        System.out.println("\nNo divisibles por 3:");
        numeros.stream().filter(noDivisiblePor3).forEach(System.out::println);

        System.out.println("\nFiltro complejo (mayor que 50, par y no divisible por 3):");
        numeros.stream().filter(filtroComplejo).forEach(System.out::println);
    }
}

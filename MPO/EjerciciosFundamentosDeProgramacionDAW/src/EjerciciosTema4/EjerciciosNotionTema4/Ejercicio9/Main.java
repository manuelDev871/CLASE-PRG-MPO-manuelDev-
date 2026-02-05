package EjerciciosTema4.EjerciciosNotionTema4.Ejercicio9;

import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    /*
        Ejercicio 9 - BiFunction con Colecciones: Fusión de Listas**

        Implementa una BiFunction que reciba dos listas de enteros y devuelva una nueva lista
        con todos los elementos de ambas listas, pero sin duplicados y ordenada de menor a mayor.
     */

    public static void main(String[] args) {

        List<Integer> listaUno = List.of(1,2,3,4,5);
        List<Integer> listaDos = List.of(1,3,5,7,9,3);

        BiFunction<List<Integer>,List<Integer>,List<Integer>> fusionarListas = (lista1, lista2) -> {
            return Stream.concat(lista1.stream(),lista2.stream())
                    .distinct()
                    .sorted()
                    .collect(Collectors.toList());
        };

        List<Integer> resultado = fusionarListas.apply(listaUno, listaDos);

        System.out.println(resultado);
    }
}

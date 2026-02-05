package EjerciciosTema4.EjerciciosNotionTema4.Ejercicio5;

import java.util.function.BiConsumer;

public class Main {

    /*
        Ejercicio 5 - Consumer y BiConsumer: Impresión de Datos

        Crea un BiConsumer que reciba un nombre (String) y una edad (Integer) e imprima
        un mensaje formateado como "Nombre: [nombre], Edad: [edad]". Úsalo para imprimir información de varios estudiantes.
     */

    public static void main(String[] args) {

        BiConsumer<String,Integer> datosEstudiante = (nombre, edad) -> System.out.println("Nombre: " + nombre + ", Edad: " + edad);

        datosEstudiante.accept("Manuel",24);
        datosEstudiante.accept("Natalia",22);
        datosEstudiante.accept("Ines",21);
    }
}

package EjerciciosTema4.EjerciciosNavidades.Ejercicio2;

import EjerciciosTema4.EjerciciosNavidades.Ejercicio2.model.Estudiante;

public class Main {

    /*
        Objetivo: Crear una clase `Estudiante` que gestione notas y calcule promedios.

        Requisitos:

        1. Crear una clase `Estudiante` con atributos: `nombre` (String), `edad` (int), `notaMatematicas` (double), `notaProgramacion` (double), `notaIngles` (double).
        2. Crear constructor con todos los parámetros.
        3. Crear getters y setters.
        4. Crear metodo `double calcularPromedio()` que devuelva el promedio de las tres notas.
        5. Crear metodo `boolean estaAprobado()` que devuelva `true` si el promedio es mayor o igual a 5.
        6. Crear metodo `String obtenerCalificacion()` que devuelva "Sobresaliente" (9-10), "Notable" (7-8.9), "Bien" (6-6.9), "Suficiente" (5-5.9) o "Insuficiente" (<5).
        7. Crear metodo `void mostrarInforme()` que muestre nombre, edad, notas, promedio y calificación.
        8. En el `main`, crear varios estudiantes y mostrar sus informes.
     */

    public static void main(String[] args) {

        Estudiante manuel = new Estudiante("Manuel", 24, 5.5, 7.5, 9);
        Estudiante ana = new Estudiante("Ana", 20, 4.5, 6, 5);
        Estudiante lucia = new Estudiante("Lucía", 22, 9, 8.5, 9.5);

        manuel.mostrarInforme();
        ana.mostrarInforme();
        lucia.mostrarInforme();
    }
}

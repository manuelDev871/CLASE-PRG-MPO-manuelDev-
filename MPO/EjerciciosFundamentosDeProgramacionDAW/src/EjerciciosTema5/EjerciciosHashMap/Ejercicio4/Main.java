package EjerciciosTema5.EjerciciosHashMap.Ejercicio4;

import EjerciciosTema5.EjerciciosHashMap.Ejercicio4.model.SistemaCalificaciones;

public class Main {

    /*
        Objetivo: Crear un sistema que gestione las calificaciones de estudiantes usando un HashMap donde la clave sea el nombre del estudiante y el valor sea un ArrayList de calificaciones.

        Requisitos:

        1. Crear un `HashMap&lt;String, ArrayList&lt;Double&gt;&gt;` para almacenar estudiantes y sus calificaciones.
        2. Crear metodo `void agregarEstudiante(String nombre)` que añada un estudiante con lista de calificaciones vacía.
        3. Crear metodo `void agregarCalificacion(String nombre, double calificacion)` que añada una calificación al estudiante.
        4. Crear metodo `double calcularPromedio(String nombre)` que calcule el promedio de calificaciones de un estudiante.
        5. Crear metodo `void mostrarCalificaciones(String nombre)` que muestre todas las calificaciones de un estudiante.
        6. Crear metodo `String mejorEstudiante()` que devuelva el nombre del estudiante con mejor promedio.
        7. Crear metodo `void listarEstudiantesAprobados(double notaMinima)` que muestre estudiantes con promedio mayor o igual a la nota mínima.
        8. Crear metodo `double promedioGeneral()` que calcule el promedio de todos los estudiantes.
        9. En el `main`, crear varios estudiantes, añadir calificaciones y generar reportes.
     */
    public static void main(String[] args) {

        SistemaCalificaciones sistema = new SistemaCalificaciones();

        sistema.agregarEstudiante("Ana");
        sistema.agregarEstudiante("Luis");
        sistema.agregarEstudiante("Maria");

        sistema.agregarCalificacion("Ana", 8);
        sistema.agregarCalificacion("Ana", 9);

        sistema.agregarCalificacion("Luis", 6);
        sistema.agregarCalificacion("Luis", 7);

        sistema.agregarCalificacion("Maria", 9);
        sistema.agregarCalificacion("Maria", 10);

        sistema.mostrarCalificaciones("Ana");

        System.out.println("Promedio Ana: " + sistema.calcularPromedio("Ana"));
        System.out.println("Mejor estudiante: " + sistema.mejorEstudiante());

        System.out.println("Estudiantes aprobados (>=7):");
        sistema.listarEstudiantesAprobados(7);

        System.out.println("Promedio general: " + sistema.promedioGeneral());
    }
}


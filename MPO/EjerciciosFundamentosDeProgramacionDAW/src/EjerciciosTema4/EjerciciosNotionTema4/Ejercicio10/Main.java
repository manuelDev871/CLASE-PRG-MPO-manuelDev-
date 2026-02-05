package EjerciciosTema4.EjerciciosNotionTema4.Ejercicio10;

import EjerciciosTema4.EjerciciosNotionTema4.Ejercicio10.controller.GestorCalificaciones;
import EjerciciosTema4.EjerciciosNotionTema4.Ejercicio10.model.Alumno;

public class Main {

    /*
        Ejercicio 10 - Sistema Completo: Gestor de Calificaciones Avanzado

        Crea un sistema de gestión de calificaciones que utilice:

        - BiFunction para calcular la nota final (teoría 60%, práctica 40%)
        - BiPredicate para verificar si un alumno ha aprobado (nota >= 5)
        - Function para convertir notas numéricas a letras (A, B, C, D, F)
        - BiConsumer para imprimir el informe completo del alumno
        - Predicate para filtrar alumnos aprobados/suspensos

        Implementa una clase Alumno con nombre, nota de teoría y nota de práctica.
        Crea una lista de al menos 8 alumnos y aplica todas las funciones lambda para generar un informe completo.
     */

    public static void main(String[] args) {

        GestorCalificaciones gestor = new GestorCalificaciones();

        gestor.anhadirDatosAlumno(new Alumno("Manuel", 10, 5));
        gestor.anhadirDatosAlumno(new Alumno("Inés", 2, 5));
        gestor.anhadirDatosAlumno(new Alumno("Lucía", 7, 8));
        gestor.anhadirDatosAlumno(new Alumno("Carlos", 6, 6));
        gestor.anhadirDatosAlumno(new Alumno("Ana", 9, 9));
        gestor.anhadirDatosAlumno(new Alumno("Pablo", 4, 3));
        gestor.anhadirDatosAlumno(new Alumno("Marta", 5, 5));
        gestor.anhadirDatosAlumno(new Alumno("Sergio", 8, 6));

        gestor.generarInformeCompleto();
        gestor.mostrarSoloAprobados();
    }
}

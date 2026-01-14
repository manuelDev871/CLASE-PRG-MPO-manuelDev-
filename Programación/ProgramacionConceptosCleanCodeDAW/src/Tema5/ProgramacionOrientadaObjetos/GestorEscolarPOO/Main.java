package Tema5.ProgramacionOrientadaObjetos.GestorEscolarPOO;

import Tema5.ProgramacionOrientadaObjetos.GestorEscolarPOO.model.Alumno;
import Tema5.ProgramacionOrientadaObjetos.GestorEscolarPOO.model.Asignatura;
import Tema5.ProgramacionOrientadaObjetos.GestorEscolarPOO.model.Profesor;

    /*
        Modela asignaturas de un alumno y un profesor que pone notas y calcula la media.

        - Asignatura: identificador, calificación; constructor con id; getters y setter de calificación.
        - Alumno: tres Asignaturas; constructores con 3 Asignaturas o con 3 ids.
        - Profesor: ponerNotas(Alumno) asigna aleatorias; calcularMedia(Alumno) devuelve double.
        - Entrada: crear 3 Asignaturas, 1 Alumno, 1 Profesor; poner notas y mostrar media y notas.
    */

public class Main {

    public static void main(String[] args) {

        // Creamos las asignaturas (id, nota = 0.0)
        Asignatura programacion = new Asignatura(1);   // id = 1, calificacion = 0
        Asignatura sistemas = new Asignatura(2);       // id = 2, calificacion = 0
        Asignatura entornos = new Asignatura(3);       // id = 3, calificacion = 0

        // Creamos un alumno con esas asignaturas
        Alumno borja = new Alumno(programacion, sistemas, entornos);
        // asig1 = programacion(1,0) - asig2 = sistemas(2,0) - asig3 = entornos(3,0)

        // Obtenemos la nota de la primera asignatura
        borja.getAsignatura1().getCalificacion(); // -> devuelve la nota de programacion

        // Creamos otro alumno con las mismas asignaturas pero en otro orden
        Alumno maria = new Alumno(entornos, programacion, sistemas);
        maria.getAsignatura1().mostrarDatos(); // -> muestra datos de entornos

        // Creamos otro alumno usando IDs (se crean las asignaturas dentro)
        Alumno celia = new Alumno(7, 8, 9);
        // asig1 = (7,0) - asig2 = (8,0) - asig3 = (9,0)

        celia.getAsignatura1().mostrarDatos(); // -> muestra id y nota de la asignatura 7

        // Mostramos las notas antes de ponerlas
        System.out.println("Comprobamos cuales son las notas de los alumnos");
        System.out.println("De borja");
        borja.mostrarDatos(); // -> todas están a 0

        // Creamos un profesor
        Profesor profesor = new Profesor();

        // El profesor pone notas aleatorias
        System.out.println("Procedemos a poner notas");
        profesor.ponerNotas(borja);

        // Mostramos las notas después de ponerlas
        System.out.println("Comprobamos cuales son las notas de los alumnos despues de ponerlas");
        System.out.println("De borja");
        borja.mostrarDatos(); // -> ahora tienen valores distintos de 0

        // Mostramos la nota media
        System.out.println("La nota media de Borja es " + profesor.calcularMedia(borja));
    }
}


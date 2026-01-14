package Tema5.ProgramacionOrientadaObjetos.GestorEscolarAcademia;

import Tema5.ProgramacionOrientadaObjetos.GestorEscolarAcademia.controller.Academia;
import Tema5.ProgramacionOrientadaObjetos.GestorEscolarAcademia.model.Estudiante;
import Tema5.ProgramacionOrientadaObjetos.GestorEscolarAcademia.model.Profesor;

public class Main {

    public static void main(String[] args) {

        Profesor borjaMartin = new Profesor(); // -> He creado un profesor
        Academia aprendeProgramacion = new Academia(borjaMartin); // -> He creado una academia con el profesor creado anterior

        Estudiante manuel = new Estudiante(1,2,3);
        Estudiante natalia = new Estudiante(4,5,6);

        aprendeProgramacion.agregarEstudiante(manuel); // -> He añadido a manuel a la academia
        aprendeProgramacion.agregarEstudiante(natalia); // -> He añadido a natalia a la academia

        aprendeProgramacion.calificarEstudiante(); // -> la academia pone las notas a todos los estudiantes

        aprendeProgramacion.mostrarResultados(); // -> La academia muestra los resultados de todos los estudiantes
        aprendeProgramacion.mostrarNotaMedia(); // -> La academia muestra la nota media de todos los estudiantes
    }
}
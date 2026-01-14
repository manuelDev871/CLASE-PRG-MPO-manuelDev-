package Tema5.ProgramacionOrientadaObjetos.GestorEscolarPOO;

import Tema5.ProgramacionOrientadaObjetos.GestorEscolarPOO.controller.Colegio;
import Tema5.ProgramacionOrientadaObjetos.GestorEscolarPOO.model.Alumno;
import Tema5.ProgramacionOrientadaObjetos.GestorEscolarPOO.model.Profesor;

public class MainColegio {

    public static void main(String[] args) {

        Profesor profesor = new Profesor();
        Colegio colegio = new Colegio(profesor);
        // alumnos = [], profesor = profesor
        // 6 alumnos
        colegio.matricularAlumno(new Alumno(1,2,3));
        colegio.matricularAlumno(new Alumno(1,2,3));
        colegio.matricularAlumno(new Alumno(1,2,3));
        colegio.matricularAlumno(new Alumno(1,2,3));
        colegio.matricularAlumno(new Alumno(1,2,3));
        colegio.matricularAlumno(new Alumno(1,2,3));

        colegio.calificarAlumnos();
        colegio.mostrarResultados();
    }
}

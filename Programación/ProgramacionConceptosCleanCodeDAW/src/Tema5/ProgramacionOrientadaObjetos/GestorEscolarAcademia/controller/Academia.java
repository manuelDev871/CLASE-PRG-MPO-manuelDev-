package Tema5.ProgramacionOrientadaObjetos.GestorEscolarAcademia.controller;

import Tema5.ProgramacionOrientadaObjetos.GestorEscolarAcademia.model.Estudiante;
import Tema5.ProgramacionOrientadaObjetos.GestorEscolarAcademia.model.Profesor;

import java.util.ArrayList;

public class Academia {

    private Profesor profesor;
    private ArrayList <Estudiante> estudiantes;

    public Academia() { // Constructor vacio
        this.estudiantes = new ArrayList<>();
    }

    public Academia(Profesor profesor) {
        this.profesor = profesor;
        this.estudiantes = new ArrayList<>();
    }

    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
        System.out.println("Matriculado correctamente");
    }

    public void calificarEstudiante() {
        for (Estudiante estudiante : estudiantes) {
            profesor.ponerNotas(estudiante);
        }
    }

    public void mostrarResultados() {
        for (Estudiante estudiante : estudiantes) {
            System.out.println("Notas del estudiante:");
            System.out.println(estudiante.getCurso1().getNota());
            System.out.println(estudiante.getCurso2().getNota());
            System.out.println(estudiante.getCurso3().getNota());
        }
    }

    public void mostrarNotaMedia() {
        for (Estudiante estudiante : estudiantes) {
            double mediaEstudiante = profesor.calcularMedia(estudiante);
            System.out.println("La nota media del estudiante es " + mediaEstudiante);
        }
    }
}
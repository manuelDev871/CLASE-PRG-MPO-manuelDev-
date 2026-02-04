package EjerciciosTema4.EjercicioUnoClase;

import EjerciciosTema4.EjercicioUnoClase.controller.Gestor;
import EjerciciosTema4.EjercicioUnoClase.model.Alumno;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Gestor gestor = new Gestor();
        //  gestor.agregarUsuarioConMap(new Alumno("Alumno1", "Alumno1", "123A"));
        //  gestor.agregarUsuarioConMap(new Alumno("Alumno1", "Alumno1", "123A"));

        gestor.agregarUsuarioConLista(new Alumno("Alumno1", "Alumno1", "123A",1));
        gestor.agregarUsuarioConLista(new Alumno("Alumno2", "Alumno2", "123B",2));
        gestor.agregarUsuarioConLista(new Alumno("Alumno3", "Alumno3", "123C",3));
        gestor.agregarUsuarioConLista(new Alumno("Alumno4", "Alumno4", "123D",4));
        gestor.agregarUsuarioConLista(new Alumno("Alumno5", "Alumno5", "123E",5));
        gestor.agregarUsuarioConLista(new Alumno("Alumno6", "Alumno6", "123F",6));

        gestor.calificarAlumnos();
        gestor.calcularNotaMedia();
        gestor.mostrarUsuarios();
    }
}

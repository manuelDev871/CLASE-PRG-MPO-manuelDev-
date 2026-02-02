package Tema5.ProgramacionOrientadaObjetos.GestorColegioHerencia;

import Tema5.ProgramacionOrientadaObjetos.GestorColegioHerencia.model.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Alumno alumno1 = new Alumno("Borja", "Martin", 1234);
        Alumno alumno2 = new Alumno("Celia", "Martin", 1234);
        Persona alumno3 = new Alumno("Marcos", "Lopez", 1234);

        Interino interino1 = new Interino("Roberto", "Gonzalez", 30000, 1);
        Interino interino2 = new Interino("Maria", "Gonzales", 20000, 1, 1);

        Fijo fijo1 = new Fijo("Roberto", "Gonzalez", 20000, 10);
        Fijo fijo2 = new Fijo("Julia", "Martin", 20000, 10, 6);

        Director director1 = new Director("Seymour", "Skinner");

        ArrayList <Persona> listaPersonas = new ArrayList<>();
        listaPersonas.add(alumno1);
        listaPersonas.add(alumno2);
        listaPersonas.add(alumno3);

        listaPersonas.add(interino1);
        listaPersonas.add(interino2);
        listaPersonas.add(fijo1);
        listaPersonas.add(fijo2);

        listaPersonas.add(director1);


        for (Persona persona : listaPersonas) {
            //  persona.saludar();
            //  persona.mostrarDatos();

            if (persona instanceof Inspector) {
                ((Inspector) persona).realizarInspeccion();
            }
        }
    }
}

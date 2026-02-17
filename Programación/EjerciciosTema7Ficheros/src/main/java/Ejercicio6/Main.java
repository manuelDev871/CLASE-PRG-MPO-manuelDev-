package Ejercicio6;

import Ejercicio6.controller.Gestor;
import Ejercicio6.model.Estudiante;

public class Main {

    /*
        Escribe un programa que cree un archivo CSV (valores separados por comas)
        con información de 3 estudiantes. Para cada estudiante, guarda su nombre,
        edad y calificación. Luego, lee el archivo y muestra su contenido en la consola.
     */

    public static void main(String[] args) {

        Gestor gestor = new Gestor();

        gestor.agregarEstudiante(new Estudiante("Manuel", 24, 8.9));
        gestor.agregarEstudiante(new Estudiante("Natalia", 22, 9.9));
        gestor.agregarEstudiante(new Estudiante("Ines", 34, 10));

        gestor.crearFichero("src/main/java/Ejercicio6/fichero6.csv");
        gestor.escribirInformacionFichero("src/main/java/Ejercicio6/fichero6.csv");
        gestor.leerInformacionFichero("src/main/java/Ejercicio6/fichero6.csv");
    }
}

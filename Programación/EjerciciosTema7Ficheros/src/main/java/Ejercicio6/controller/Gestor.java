package Ejercicio6.controller;

import Ejercicio6.model.Estudiante;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Gestor {

    private List<Estudiante> listaEstudiantes;

    public Gestor() {
        listaEstudiantes = new ArrayList<>();
    }

    public void agregarEstudiante(Estudiante estudiante) {
        listaEstudiantes.add(estudiante);
    }

    public void crearFichero(String path) {
        File file = new File(path);

        try {
            if (file.createNewFile()) {
                System.out.println("Fichero creado correctamente");
            } else  {
                System.out.println("El fichero ya existe.");
            }
        } catch (IOException e) {
            System.out.println("Error al crear el fichero: " + e.getMessage());
        }
    }

    public void escribirInformacionFichero(String path) {
       FileWriter fileWriter = null;
       BufferedWriter bufferedWriter = null;

        try {
            fileWriter = new FileWriter(path);
            bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write("Nombre,Edad,Calificacion");
            bufferedWriter.newLine();

            for (Estudiante estudiante : listaEstudiantes) {
                bufferedWriter.write(estudiante.toString());
                bufferedWriter.newLine();
            }

            System.out.println("Informacion escrita en el fichero");

        } catch (IOException e) {
            System.out.println("Error al escribir el fichero");
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException | NullPointerException e) {
                System.out.println("Error al cerrar el fichero");
            }
        }
    }

    public void leerInformacionFichero(String path) {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            fileReader = new FileReader(path);
            bufferedReader = new BufferedReader(fileReader);

            String linea;
            while ((linea = bufferedReader.readLine()) != null) {
                System.out.println(linea);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error, fichero no encontrado");
        } catch (IOException e) {
            System.out.println("Error, no tengo los suficientes permisos");
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException | NullPointerException e) {
                System.out.println("Error al cerrar el fichero");
            }
        }
    }
}

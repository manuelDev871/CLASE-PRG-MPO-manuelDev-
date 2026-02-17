package Ejercicio5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    /*
        Desarrolla un programa que cuente el número de líneas que contiene un archivo de texto.
        El programa debe solicitar al usuario la ruta del archivo a analizar.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la ruta del archivo: ");
        String rutaArchivo = scanner.nextLine();

        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        int contadorLineas = 0;

        try {
            fileReader = new FileReader(rutaArchivo);
            bufferedReader = new BufferedReader(fileReader);

            while (bufferedReader.readLine() != null) {
                contadorLineas++;
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error, no se ha encontrado el archivo");
        } catch (IOException e) {
            System.out.println("Error, el fichero no tiene los suficientes permisos");
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException | NullPointerException e) {
                System.out.println("Error, no se ha podido cerrar el fichero");
            }
        }

        System.out.println("Total de lineas: " + contadorLineas + " lineas");

        scanner.close();
    }
}

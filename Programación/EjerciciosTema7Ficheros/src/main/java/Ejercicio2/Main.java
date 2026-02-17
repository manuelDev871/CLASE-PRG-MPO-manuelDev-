package Ejercicio2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    /*
        Escribe un programa que busque cuántas veces aparece una palabra específica en un archivo de texto.
        El usuario debe introducir la ruta del archivo y la palabra a buscar.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la ruta del archivo: ");
        String ruta = scanner.nextLine();

        System.out.print("Palabra a buscar: ");
        String palabra = scanner.nextLine();

        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        int contador = 0;

        try {
            fileReader = new FileReader(ruta);
            bufferedReader = new BufferedReader(fileReader);

            String linea;
            while ((linea = bufferedReader.readLine()) != null) {
                String[] palabras = linea.split("\\W");

                for (int i = 0; i < palabras.length; i++) {
                    if (palabras[i].equalsIgnoreCase(palabra)) {
                        contador++;
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error, no se ha encontrado el archivo");
        } catch (IOException e) {
            System.out.println("Error, no tiene suficientes permisos");
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException | NullPointerException e) {
                System.out.println("Error al cerrar el fichero");
            }
        }

        System.out.println("La palabra " + palabra + " esta repetida en el fichero " + contador + " veces");
    }
}

package Ejercicio1;

import java.io.*;
import java.util.Scanner;

public class Main {

    /*
        Escribe un programa que lea el contenido de un archivo de texto existente y lo muestre por consola.
        El programa debe solicitar al usuario la ruta del archivo a leer.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la ruta del archivo: ");
        String ruta = scanner.nextLine();

        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            fileReader = new FileReader(ruta);
            bufferedReader = new BufferedReader(fileReader);

            String linea;
            while ((linea = bufferedReader.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no se ha encontrado");
        } catch (IOException e) {
            System.out.println("No se puede leer el fichero");
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException | NullPointerException e) {
                System.out.println("Error en el cerrado del fichero");
            }
        }
    }
}

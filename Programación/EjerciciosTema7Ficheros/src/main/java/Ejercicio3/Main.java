package Ejercicio3;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ruta del archivo origen:");
        String rutaOrigen = scanner.nextLine();

        System.out.print("Ruta del archivo copia:");
        String rutaCopia = scanner.nextLine();

        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;

        try {
            fileReader = new FileReader(rutaOrigen);
            bufferedReader = new BufferedReader(fileReader);

            fileWriter = new FileWriter(rutaCopia);
            bufferedWriter = new BufferedWriter(fileWriter);

            String linea;

            while ((linea = bufferedReader.readLine()) != null) {
                bufferedWriter.write(linea);
                bufferedWriter.newLine(); // Salto de linea
            }

            System.out.println("Archivo copiado correctamente.");

        } catch (FileNotFoundException e) {
            System.out.println("Error: archivo no encontrado.");
        } catch (IOException e) {
            System.out.println("Error de lectura/escritura.");
        } finally {
            try {
                if (bufferedReader != null) bufferedReader.close();
                if (fileReader != null) fileReader.close();
                if (bufferedWriter != null) bufferedWriter.close();
                if (fileWriter != null) fileWriter.close();
            } catch (IOException | NullPointerException e) {
                System.out.println("Error al cerrar archivos.");
            }
        }

        scanner.close();
    }
}
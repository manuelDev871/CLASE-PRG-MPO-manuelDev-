package Ejercicio8;

import Ejercicio8.model.Palabra;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        int totalPalabras = 0;
        List<Palabra> palabras = new ArrayList<>();

        try {
            fileReader = new FileReader("src/main/java/Ejercicio8/fichero8.txt");
            bufferedReader = new BufferedReader(fileReader);

            String linea;

            while ((linea = bufferedReader.readLine()) != null) {

                linea = linea.toLowerCase();
                String[] arrayPalabras = linea.split("\\s+");

                for (String palabra : arrayPalabras) {
                    if (!palabra.isEmpty()) {
                        totalPalabras++;
                        sumarPalabra(palabra, palabras);
                    }
                }
            }

            System.out.println("Total de palabras: " + totalPalabras);
            System.out.println("\nTop 5 palabras más frecuentes:");

            palabras.stream()
                    .sorted(Comparator.comparingInt(p -> -p.getContador()))
                    .limit(5)
                    .forEach(p ->
                            System.out.println("- " + p.getTexto() + ": " + p.getContador() + " veces")
                    );

        } catch (FileNotFoundException e) {
            System.out.println("No se ha encontrado el fichero");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo");
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException | NullPointerException e) {
                System.out.println("Error al cerrar el archivo");
            }
        }
    }

    private static void sumarPalabra(String palabra, List<Palabra> lista) {
        for (Palabra p : lista) {
            if (p.getTexto().equals(palabra)) {
                p.incrementar();
                return;
            }
        }
        lista.add(new Palabra(palabra));
    }
}
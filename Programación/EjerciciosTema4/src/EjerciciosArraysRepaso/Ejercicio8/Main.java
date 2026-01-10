package EjerciciosArraysRepaso.Ejercicio8;

import java.util.Scanner;

public class Main {

    /*
        Crea un programa con un array de 10 palabras (pueden repetirse).
        Pide al usuario una palabra y usa un bucle for para contar cuántas
        veces aparece esa palabra en el array.
     */

    public static void main(String[] args) {

        String[] palabras = new String[]{"gato", "perro", "gato", "pájaro", "gato", "pez", "perro", "gato", "conejo", "perro"};

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la palabra a buscar: ");
        String respuesta = sc.nextLine();

        int contador = 0;

        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].equalsIgnoreCase(respuesta)) {
                contador++;
            }
        }

        System.out.println("La palabra " + respuesta + " aparece " + contador + " veces en el array");
    }
}

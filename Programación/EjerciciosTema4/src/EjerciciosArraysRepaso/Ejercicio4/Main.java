package EjerciciosArraysRepaso.Ejercicio4;

import java.util.Scanner;

public class Main {

    /*
        Crea un programa con un array de 7 números. Pide al usuario un número a
        buscar y usa un bucle for para recorrer el array. Si el número existe,
        muestra su posición. Si no existe, indica que no se encontró.
     */

    public static void main(String[] args) {

        int[] numeros = new int[] {5,12,8,3,15,9,6};

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el número a buscar: ");
        int numeroBuscado = sc.nextInt();
        boolean numeroEncontrado = false;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numeroBuscado) {
                System.out.println("El numero " + numeroBuscado + " se encuentra en la posición " + i);
                numeroEncontrado = true;
                break;
            }
        }

        if (!numeroEncontrado) {
            System.out.println("El numero " + numeroBuscado + " no se encuentra en el array");
        }
    }
}

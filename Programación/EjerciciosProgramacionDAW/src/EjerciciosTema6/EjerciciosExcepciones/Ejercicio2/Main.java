package EjerciciosTema6.EjerciciosExcepciones.Ejercicio2;

import java.util.Scanner;

public class Main {

    /*
        Crea un programa que defina un array de 5 elementos con números enteros.
        Pide al usuario una posición del array y muestra el elemento en esa posición.
        Usa try-catch para capturar la excepción ArrayIndexOutOfBoundsException si
        el usuario introduce un índice inválido.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[] {1,2,3,4,5};

        System.out.print("Array: [");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]);
            if (i < numeros.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        try {
            System.out.print("Introduce la posicion: ");
            int posicion = scanner.nextInt();

            System.out.println("Elemento en posicion: " + numeros[posicion]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Posicion fuera de los limites del array");
        }

        System.out.println("Fin del ejercicio");

        scanner.close();
    }
}

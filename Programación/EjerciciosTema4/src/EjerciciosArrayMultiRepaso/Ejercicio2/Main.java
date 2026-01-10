package EjerciciosArrayMultiRepaso.Ejercicio2;

import java.util.Scanner;

public class Main {

    /*
        Desarrolla un programa que cree una matriz de 2x4.
        Usa bucles for anidados para pedir al usuario que introduzca
        8 números y los almacene en la matriz. Al final, muestra la matriz completa.
     */

    public static void main(String[] args) {

        int[][] matriz = new int[2][4];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Introduce el valor para la posicion [" + i + "][" + j + "]: ");
                int respuesta = sc.nextInt();

                matriz[i][j] = respuesta;
            }
        }

        System.out.println();
        System.out.println("Matriz resultante: ");

        for (int[] fila : matriz) {
            for (int item : fila) {
                System.out.print(item + "\t");
            }
            System.out.println();
        }
    }
}

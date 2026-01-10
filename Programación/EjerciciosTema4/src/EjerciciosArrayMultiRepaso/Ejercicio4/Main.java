package EjerciciosArrayMultiRepaso.Ejercicio4;

import java.util.Scanner;

public class Main {

    /*
        Crea un programa con una matriz de 3x5 con números.
        Pide al usuario un número a buscar y usa bucles for anidados para encontrarlo.
        Si existe, muestra su posición (fila y columna). Si no existe, indica que no se encontró.
     */

    public static void main(String[] args) {

        int[][] matrizNumeros = new int[][] {{12, 45, 23, 67, 89},{34, 56, 78, 90, 11},{22, 33, 44, 55, 66}};

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el número a buscar: ");
        int numeroBucado = sc.nextInt();
        boolean numeroEncontrado = false;

        for (int i = 0; i < matrizNumeros.length; i++) {
            for (int j = 0; j < matrizNumeros[i].length; j++) {
                if (matrizNumeros[i][j] == numeroBucado) {
                    System.out.println("El numero " + numeroBucado + " se encuentra en la posición [" + i + "][" + j + "]");
                    numeroEncontrado = true;
                }
            }
        }

        if (!numeroEncontrado) {
            System.out.println("El numero " + numeroBucado + " no se encuentra en la matriz");
        }
    }
}

package EjercicioUno;

import java.util.Scanner;

public class Main {

    /*
        1. Crea un programa que permita sumar arrays multidimensionales. Para ello
        siguiente estos pasos:
            a. Pide al usuario el tamaño de las matrices
            b. Se crearán automáticamente dos matrices con números aleatorios entre 0 y
            50
            c. Se crea una tercera matriz llamada sumaMatrices donde se guarda la suma
            de las celdas de las generadas en el punto anterior
            d. Mostrar cada una de las matrices donde cada una tiene un titulo diferente
            para poder identificarlas
     */

    // Se declaran dos matrices (array multidimensional) static
    static int[][] matrizUno;
    static int[][] matrizDos;

    public static void main(String[] args) {

        // Se crea el objeto Scanner para leer datos desde teclado
        Scanner sc = new Scanner(System.in);

        // Se solicita al usuario el tamaño de la matriz (filas y columnas)
        System.out.print("Indique el tamaño de la matriz (fila - columna): ");
        int tamanho = sc.nextInt();

        // llamamos las matrices creadas fuera del metodo
        matrizUno = new int[tamanho][tamanho];
        matrizDos = new int[tamanho][tamanho];

        // Se rellenan ambas matrices con números aleatorios entre 0 y 15
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                matrizUno[i][j] = (int) (Math.random() * 16);
                matrizDos[i][j] = (int) (Math.random() * 16);
            }
        }

        // Se imprime por pantalla la primera matriz
        System.out.println("Imprimiendo Matriz Uno...");
        imprimirArray(matrizUno);

        // Se imprime por pantalla la segunda matriz
        System.out.println("Imprimiendo Matriz Dos...");
        imprimirArray(matrizDos);

        // Se crea una tercera matriz para almacenar la suma de las anteriores
        int[][] sumaMatrices = new int[tamanho][tamanho];

        // Se suman las posiciones correspondientes de ambas matrices
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                sumaMatrices[i][j] = matrizUno[i][j] + matrizDos[i][j];
            }
        }

        // Se imprime por pantalla la matriz resultante de la suma
        System.out.println("Imprimiendo suma de matrices...");
        imprimirArray(sumaMatrices);
    }

    public static void imprimirArray(int[][] matriz) {
        // matriz es una referencia para utilizarlo en el cuerpo del metodo
        for (int[] fila : matriz) {
            for (int item : fila) {
                System.out.print(item + "\t");
            }
            System.out.println();
        }
    }
}

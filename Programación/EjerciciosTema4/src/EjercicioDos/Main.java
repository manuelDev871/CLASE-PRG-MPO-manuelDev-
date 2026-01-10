package EjercicioDos;

import java.util.Scanner;

public class Main {

    /*
        2. Crea un array de 10 posiciones y rellénalo con números aleatorios entre el 1
        y el 20, pudiendo repetirse. Una vez rellenado, crear un menú para que el usuario
        seleccione la acción que quiere realizar:
            a. Imprimir array
            b. Mover a izquierda
            c. Mover a derecha
            d. Invertir
            e. Rotar pares
    */

    static int[] numeros;

    public static void main(String[] args) {

        // array de 10 posiciones
        numeros = new int[10];

        // rellenar array con numeros aleatorios del 1 al 20
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random()*20) + 1;
        }

        // menú de opciones
        Scanner sc = new Scanner(System.in);

        System.out.println("Menú de opciones:");
        System.out.println("1. Imprimir array");
        System.out.println("2. Mover a la izquierda");
        System.out.println("3. Mover a la derecha");
        System.out.println("4. Invertir");
        System.out.println("5. Rotar por pares");
        System.out.println("6. Salir");

        int opcion;

        do {
            System.out.println();
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> {
                    imprimirArray(numeros);
                }

                case 2 -> {
                    moverIzquierda(numeros);
                    imprimirArray(numeros);
                }

                case 3 -> {
                    moverDerecha(numeros);
                    imprimirArray(numeros);
                }

                case 4 -> {
                    invertir(numeros);
                    imprimirArray(numeros);
                }

                case 5 -> {
                    rotarPares(numeros);
                    imprimirArray(numeros);
                }

                case 6 -> {
                    System.out.println("Saliendo del programa...");
                }

                default -> {
                    System.out.println("Opción no contemplada ");
                }
            }
        }while (opcion != 6);
    }

    public static void imprimirArray(int[] array) {

        for (int item : array) {
            System.out.print(item + " ");
        }
    }

    public static void moverIzquierda(int[] array) {

        int temporal = numeros[0];

        for (int i = 0; i < numeros.length - 1; i++) {
            numeros[i] = numeros[i + 1];
        }

        numeros[numeros.length - 1] = temporal;
    }

    public static void moverDerecha(int[] array) {

        int temporal = numeros[numeros.length - 1]; // ultima posicion

        for (int i = numeros.length - 1; i > 0; i--) {      // Empezamos el for en la ultima posicion hasta que la i sea mayor que 0, es decir, sea 1 y en decremento porque vamos de 10,9,8...
            numeros[i] = numeros[i - 1];
        }

        numeros[0] = temporal;
    }

    public static void invertir(int[] array) {

        for (int i = 0; i < numeros.length / 2; i++) {
            int temporal = numeros[i];
            numeros[i] = numeros[numeros.length - 1 - i];
            numeros[numeros.length - 1 - i] = temporal;
        }
    }

    public static void rotarPares(int[] array) {

        for (int i = 0; i < numeros.length; i+=2) {
            int temporal = numeros[i];
            numeros[i] = numeros[i + 1];
            numeros[i + 1] = temporal;
        }
    }
}

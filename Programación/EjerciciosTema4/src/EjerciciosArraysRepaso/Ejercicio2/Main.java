package EjerciciosArraysRepaso.Ejercicio2;

public class Main {

    /*
        Escribe un programa que cree un array de 6 números enteros.
        Usa un bucle for para recorrer el array y mostrar cada número junto con su posición (índice).
     */

    public static void main(String[] args) {

        int[] numerosEnteros = new int[] {10,20,30,40,50,60};

        System.out.println("Recorreindo el array: ");
        for (int i = 0; i < numerosEnteros.length; i++) {
            System.out.println("Posición " + i + " : " + numerosEnteros[i]);
        }
    }
}

package Tema5.Estructuras;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList <Integer> listaNumeros = new ArrayList<>();
        // [] -> lista vacia

        System.out.println("El tamaño de esta coleccion es de " + listaNumeros.size());

        // Añadir elementos
        listaNumeros.add(99); // -> Se guarda en la posicion 0
        System.out.println("El tamaño de esta coleccion es de " + listaNumeros.size());

        // Añadir elementos de manera aleatoria
        for (int i = 0; i < 10; i++) {
            listaNumeros.add((int) (Math.random()*21));
        }
        System.out.println("El tamaño de esta coleccion es de " + listaNumeros.size());

        // Eliminar elementos
        listaNumeros.remove(6); // Elimina el numero que esta en el indice 6

        // Para obtener el valor de un dato utilizo GET
        listaNumeros.add(1);
        listaNumeros.add(2);
        listaNumeros.add(3);
        listaNumeros.add(4);

        int numero = listaNumeros.get(1);
        System.out.println("El numero obtenido es: "+ numero);
        System.out.println("El tamaño de esta coleccion es de " + listaNumeros.size());

        // Obtener todos los datos
        for (int i = 0; i < listaNumeros.size(); i++) {
            System.out.print(listaNumeros.get(i) + "\t");
        }
    }
}

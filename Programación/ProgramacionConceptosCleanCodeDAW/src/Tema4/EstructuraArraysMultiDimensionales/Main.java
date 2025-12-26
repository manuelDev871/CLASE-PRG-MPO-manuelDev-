package Tema4.EstructuraArraysMultiDimensionales;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        //==============================================================
        // Array UniDimensional
        int[] numeros = new int[] {8, 12, 5, 45, 2};

        // Como ordenar los elementos de un array
        Arrays.sort(numeros);
        for (int item: numeros) {
            System.out.println(item);
        }

        // Bucle for que imprime la misma longitud del array pero con elementos ramdom
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random()*21);
            System.out.println(numeros[i]);
        }

        Object[] cosas = new Object[] {"borja", 42, "borja@gmail.com", true, 'A'};

        // Creamos un array de palabras (String)
        String[] palabras = new String[] {"palabra1", "hola", "adios", "juego", "programacion"};

        // Utilizamos el metodo sort Comparator para comparar los elementos como en la explicacion de la "Burbuja"
        Arrays.sort(palabras, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length()) {
                    return 1;
                } else if (o1.length() < o2.length()) {
                    return -1;
                }
                return 0;
            }
        });
        // Uso un forEach para imprimir los elementos del array
        for (String item: palabras) {
            System.out.println(item);
        }


        //==============================================================
        // Array MultiDimensional

        int[][] matrizUno = new int[3][3];
        // 3 filas
        // 3 columnas
        // 0 0 0
        // 0 0 0
        // 0 0 0
        // matriz[2] -> [0,0,0]
        // matriz[2][1] -> 0

        int[][] matrizDos = new int[][] {{4,7,9},{14,17,19},{13,4,7}};
        // 3 filas
        // 3 columnas
        // 4 7 9
        // 14 17 19
        // 13 4 7

        // ¿Cuantas filas tengo?
        System.out.println("El tamaño de las filas es " + matrizDos.length);

        // ¿Cuantas columnas tiene la 1º,2º y 3º fila?
        System.out.println("El tamaño de las columnas de la primera fila es " + matrizDos[0].length);
        System.out.println("El tamaño de las columnas de la segunda fila es " + matrizDos[1].length);
        System.out.println("El tamaño de las columnas de la tercera fila es " + matrizDos[2].length);

        // ¿Como saco un elemento concreto?
        System.out.println("El elemento buscado es " + matrizDos[0][2]);

        // Sacar todos lo elementos -> for anidado
        for (int i = 0; i < matrizDos.length; i++) {
            for (int j = 0; j < matrizDos[i].length; j++) {
                System.out.print(matrizDos[i][j] + "\t");
            }
            System.out.println();
        }


        // Sacar todos lo elementos -> forEach
        for (int[] fila : matrizDos) {
            for (int item : fila) {
                System.out.print(item + "\t");
            }
            System.out.println();
        }


        //==============================================================
        // Métodos

        Sudoku sudoku = new Sudoku();
        // int[3][3]

        sudoku.empezarJuego();




































    }
}

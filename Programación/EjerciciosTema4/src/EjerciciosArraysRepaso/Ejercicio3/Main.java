package EjerciciosArraysRepaso.Ejercicio3;

import java.util.Scanner;

public class Main {

    /*
        Desarrolla un programa que cree un array vacío de tamaño 5.
        Usa un bucle for para pedir al usuario que introduzca 5 nombres,
        guardándolos en el array. Al final, muestra todos los nombres almacenados.
     */

    public static void main(String[] args) {

        String[] nombres = new String[5];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Introduce el nombre " + (i + 1) + " : ");
            String nombre = sc.nextLine();
            nombres[i] = nombre;
        }

        System.out.println();
        System.out.println("Nombres introducidos: ");
        for (String item : nombres) {
            System.out.println(item);
        }
    }
}

/*  Desarrolla un programa que pida un número al usuario y determine si es positivo,
    negativo o cero. Muestra el resultado por consola. */

import java.util.Scanner;

public class Ejercicio2_Tema_3 {

    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner(System.in);
        System.out.println("Introduce un número");
        int numero = entradaTeclado.nextInt();

        if (numero > 0) {
            System.out.println("El número es positivo");
        } else if (numero < 0) {
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número es 0");
        }

        entradaTeclado.close();
    }
}

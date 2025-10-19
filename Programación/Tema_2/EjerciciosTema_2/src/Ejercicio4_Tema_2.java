/*Desarrolla un programa que pida un número al usuario y determine si es par o impar usando el
  operador módulo. Muestra el resultado por consola. */

import java.util.Scanner;

public class Ejercicio4_Tema_2 {

    public static void main(String[] args) {

        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("Introduce un valor");
        int valor = entradaTeclado.nextInt();

        boolean numero = (valor % 2 == 0);
        System.out.println("¿Es el valor introducido, numero par? " + numero);

        entradaTeclado.close();
    }
}

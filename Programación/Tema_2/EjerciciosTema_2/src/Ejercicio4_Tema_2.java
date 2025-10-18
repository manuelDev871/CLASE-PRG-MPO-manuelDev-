/*Desarrolla un programa que pida un número al usuario y determine si es par o impar usando el
  operador módulo. Muestra el resultado por consola. */

import java.util.Scanner;

public class Ejercicio4_Tema_2 {

    public static void main(String[] args) {

        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("Introduce un valor");
        int valor = entradaTeclado.nextInt();

        if (valor % 2 == 0) {
            System.out.println("El numero introducido es par");
        } else {
            System.out.println("El numero introducido es impar");
        }

        entradaTeclado.close();
    }
}

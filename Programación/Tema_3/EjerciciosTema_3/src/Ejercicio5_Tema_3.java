/*  Desarrolla un programa que pida un número entero y determine si es par o impar usando el operador módulo.
    Muestra un mensaje personalizado para cada caso. */

import java.util.Scanner;

public class Ejercicio5_Tema_3 {

    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner(System.in);
        System.out.println("Introduce un número");
        int numero = entradaTeclado.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El número introducido es par");
        } else {
            System.out.println("El número introducido es impar");
        }

        entradaTeclado.close();
    }
}
/*  Crea un programa que pida la edad del usuario y determine si es mayor de edad (18 años o más).
    Muestra un mensaje indicando si puede votar o no. */

import java.util.Scanner;

public class Ejercicio1_Tema_3 {

    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner(System.in);
        System.out.println("Introduce tu edad");
        int edad = entradaTeclado.nextInt();

        if (edad >= 18) {
            System.out.println("Eres mayor de edad, puedes votar");
        } else {
            System.out.println("Eres menor de edad, no puedes votar");
        }

        entradaTeclado.close();
    }
}

/*  Escribe un programa que pida la edad del usuario y determine si puede acceder a contenido para mayores de 16 años.
    Si tiene 16 o más años, muestra "Acceso permitido", si no, muestra "Acceso denegado". */

import java.util.Scanner;

public class Ejercicio6_Tema_3 {

    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner(System.in);
        System.out.println("Introduce tu edad");
        int edad = entradaTeclado.nextInt();

        if (edad >= 16) {
            System.out.println("Acceso permitido");
        } else {
            System.out.println("Acceso denegado");
        }

        entradaTeclado.close();
    }
}
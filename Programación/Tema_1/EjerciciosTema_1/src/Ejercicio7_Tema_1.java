/* Ejercicio Nº 7 : Crea un programa que almacene tu información personal
   (nombre, apellido, edad y ciudad) en variables y muestre un mensaje de presentación por consola. */

import java.util.Scanner;

public class Ejercicio7_Tema_1 {

    public static void main (String[] args) {

        Scanner ejercicio7 = new Scanner(System.in);

        System.out.println("Introduce tu nombre");
        String nombre = ejercicio7.nextLine();

        System.out.println("Introduce tus apellidos");
        String apellidos = ejercicio7.nextLine();

        System.out.println("Introduce tu edad");
        int edad = ejercicio7.nextInt();
        ejercicio7.nextLine();

        System.out.println("Dime el nombre de tu ciudad");
        String ciudad = ejercicio7.nextLine();


        System.out.println("¡Hola! Me llamo " + nombre + " " + apellidos + ".\n" + "Tengo " + edad + " años y vivo en " + ciudad + ".");
    }

}

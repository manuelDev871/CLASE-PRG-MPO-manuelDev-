/* Ejercicio Nº 8 : Desarrolla un programa que calcule el área de un rectángulo.
   Declara variables para la base y la altura, y muestra el resultado del cálculo. */

import java.util.Scanner;

public class Ejercicio8_Tema_1 {

    public static void main (String [] args) {

        Scanner ejercicio8 = new Scanner(System.in);
        System.out.println("Introduce la longitud en cms de la base del rectángulo");
        float base = ejercicio8.nextFloat();

        System.out.println("Introduce la longitud en cms de la altura del rectángulo");
        float altura = ejercicio8.nextFloat();

        float resultado = base * altura;
        System.out.println("El area del rectangulo es: " + resultado + " cm^2");
    }
}

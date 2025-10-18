/* Ejercicio Nº 10 : Crea un programa que convierta una temperatura de grados Celsius a Fahrenheit.
   Usa una variable para la temperatura en Celsius y muestra el resultado de la conversión.
   La fórmula para convertir de Celsius a Fahrenheit es:

   F = C × 9/5 + 32
   */

import java.util.Scanner;

public class Ejercicio10_Tema_1 {

    public static void main (String[] args) {

        Scanner ejercicio10 = new Scanner(System.in);

        System.out.println("Introduce cuantos grados Celsius quieres convertir");
        float celsius = ejercicio10.nextFloat();

        float fahrenheit;
        fahrenheit = ((celsius * 9) / 5) + 32;

        System.out.println("Temperatura en grados Celsius: " + celsius + "º");
        System.out.println("Temperatura en grados Fahrenheit: " + fahrenheit + "º");

    }
}

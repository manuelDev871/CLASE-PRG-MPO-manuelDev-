package EjerciciosTema6.EjerciciosExcepciones.Ejercicio1;

import java.util.Scanner;

public class Main {

    /*
        Crea un programa que pida al usuario dos números y realice la división del primero entre el segundo.
        Usa try-catch para capturar la excepción ArithmeticException que ocurre cuando se intenta dividir por cero.
        Muestra un mensaje apropiado si ocurre el error.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Introduce el primer numero: ");
            int operador1 = scanner.nextInt();

            System.out.print("Introduce el segundo numero: ");
            int operador2 = scanner.nextInt();

            int resultado = operador1 / operador2;
            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero");
        }

        System.out.println("Fin de la operacion");

        scanner.close();
    }
}

package EjerciciosTema6.EjerciciosExcepciones.Ejercicio5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    /*
        Crea un programa que pida al usuario dos números y la operación a realizar (+, -, *, /).
        Usa múltiples bloques catch para manejar diferentes excepciones: ArithmeticException (división por cero),
        NumberFormatException (entrada no numérica) e InputMismatchException (si usas Scanner).
        Añade un bloque finally que siempre muestre el mensaje "Fin del programa".
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("--------------------------------");
        System.out.println("Calculadora Try / Catch");
        System.out.println("--------------------------------");

        int opcion = 0;
        int operador1 = 0;
        int operador2 = 0;
        int resultado;

        do {
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Division");
            System.out.println("5. Salir");
            System.out.print("Indica la operacion que desea realizar: ");

            try {
                opcion = scanner.nextInt();

                if (opcion >= 1 && opcion <= 4) {
                    System.out.print("Indica el operador uno: ");
                    operador1 = scanner.nextInt();

                    System.out.print("Indica el operador dos: ");
                    operador2 = scanner.nextInt();
                }

                switch (opcion) {
                    case 1 -> {
                        resultado = operador1 + operador2;
                        System.out.println("El resultado de la suma es: " + resultado);
                    }
                    case 2 -> {
                        resultado = operador1 - operador2;
                        System.out.println("El resultado de la resta es: " + resultado);
                    }
                    case 3 -> {
                        resultado = operador1 * operador2;
                        System.out.println("El resultado de la multiplicacion es: " + resultado);
                    }
                    case 4 -> {
                        resultado = operador1 / operador2;
                        System.out.println("El resultado de la division es: " + resultado);
                    }
                    case 5 -> {
                        System.out.println("Saliendo...");
                    }
                    default -> {
                        System.out.println("Opcion no contemplada");
                    }
                }

            } catch (InputMismatchException e) {
                System.out.println("ERROR: Debes introducir números validos");
                scanner.nextLine();
                opcion = 0;
            } catch (ArithmeticException e) {
                System.out.println("ERROR: No se puede dividir por cero");
                scanner.nextLine();
            } finally {
                System.out.println("Fin del programa");
            }
        } while (opcion != 5);
    }
}

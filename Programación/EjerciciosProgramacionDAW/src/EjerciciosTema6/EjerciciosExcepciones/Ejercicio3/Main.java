package EjerciciosTema6.EjerciciosExcepciones.Ejercicio3;

import java.util.Scanner;

public class Main {

    /*
        Crea un programa que pida al usuario que introduzca un número como texto
        y lo convierta a entero usando Integer.parseInt(). Usa try-catch para capturar
        la excepción NumberFormatException si el usuario introduce algo que no es un
        número válido. El programa debe seguir pidiendo un número hasta que el usuario
        introduzca uno válido.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean numeroValido = false;
        int numero = 0;

        while (!numeroValido) {
            System.out.print("Introduce un numero: ");

            try {
                String numeroTexto = scanner.nextLine();
                numero = Integer.parseInt(numeroTexto);
                numeroValido = true;
            } catch (NumberFormatException e) {
                System.out.println("Error: Eso no es un numero valido. Intentalo de nuevo");
            }
        }

        System.out.println("Has introducido el numero: " + numero);

        scanner.close();
    }
}

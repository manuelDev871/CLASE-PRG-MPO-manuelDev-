package Tema3.EstructuraDeRepeticion;
import java.util.Scanner;

public class MainWhile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


         // BUCLE WHILE
         /*
            Se ejecuta mientras la condición sea true.
            Puede ejecutarse de 0 a N veces.
         */

        int numero = 0;

        while (numero >= 0) {
            System.out.println("Por favor, introduce un número (negativo para salir)");
            numero = sc.nextInt();
        }

        System.out.println("Sistema detenido");

        /*
            EJEMPLO: PIN DE MÓVIL CON INTENTOS
            El bucle se repite mientras queden intentos y el pin sea incorrecto.
        */

        int intentos = 3;
        int pinCorrecto = 1234;
        int pinUsuario = 0;
        boolean bloqueado = false;

        while (intentos > 0 && pinUsuario != pinCorrecto) {
            System.out.println("Introduce el PIN:");
            pinUsuario = sc.nextInt();
            intentos--;

            if (intentos == 0 && pinUsuario != pinCorrecto) {
                bloqueado = true;
            }
        }

        if (bloqueado) {
            System.out.println("Teléfono bloqueado");
        } else {
            System.out.println("Bienvenido al teléfono");
        }


         // BUCLE DO-WHILE
         /*
            El cuerpo se ejecuta al menos una vez.
            Luego se evalúa la condición.
         */

        int numeroDoWhile = 10;

        do {
            System.out.println("Introduce un nuevo valor para el número (menor que 10 para salir)");
            numeroDoWhile = sc.nextInt();
        } while (numeroDoWhile >= 10);


         // MENÚ CON DO-WHILE
         /* El menú se repite hasta que el usuario elige salir. */

        int opcion;

        do {
            System.out.println("\nMENÚ");
            System.out.println("1 - Sumar");
            System.out.println("2 - Restar");
            System.out.println("3 - Salir");
            System.out.print("Elige una opción: ");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Vamos a sumar");
                    break;

                case 2:
                    System.out.println("Vamos a restar");
                    break;

                case 3:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida");
            }

        } while (opcion != 3);

        sc.close();
    }
}

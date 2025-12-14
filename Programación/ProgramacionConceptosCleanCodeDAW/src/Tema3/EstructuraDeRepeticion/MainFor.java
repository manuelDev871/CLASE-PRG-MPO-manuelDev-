package Tema3.EstructuraDeRepeticion;
import java.util.Scanner;

public class MainFor {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /*
            Este programa pide una serie de números y calcula:
            Cuántos son pares e impares
            El valor medio
            El número mayor y el menor
        */

        int contadorPares = 0;
        int contadorImpares = 0;
        int sumatorio = 0;
        int maximo = 0;
        int minimo = 0;

        // Bucle for clásico: inicio; condición; incremento
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce un número en la posición " + i);
            int numero = scanner.nextInt();

            // Inicializamos máximo y mínimo con el primer número introducido
            if (i == 0) {
                maximo = numero;
                minimo = numero;
            }

            // Actualizamos el valor máximo
            if (numero > maximo) {
                maximo = numero;
            }

            // Actualizamos el valor mínimo
            if (numero < minimo) {
                minimo = numero;
            }

            // Comprobamos si el número es par o impar
            if (numero % 2 == 0) {
                contadorPares++;
            } else {
                contadorImpares++;
            }

            // Acumulamos el total para calcular la media
            sumatorio += numero;
        }

        System.out.println("El número de pares es " + contadorPares);
        System.out.println("El número de impares es " + contadorImpares);
        System.out.println("El número medio es " + (sumatorio / 5));
        System.out.println("El número máximo es " + maximo);
        System.out.println("El número mínimo es " + minimo);

        /*
            Bucle for en decremento.
            Empieza en 10 y va restando 2 hasta llegar a 0.
        */

        for (int i = 10; i >= 0; i -= 2) {
            System.out.println("Ejecución en línea repetida " + i);
        }

        /*
            Tabla de multiplicar del 5.
            Se usa printf para formatear la salida.
        */

        System.out.println("Tabla del 5");
        for (int i = 0; i <= 10; i++) {
            System.out.printf("%d * %d = %d%n", 5, i, 5 * i);
        }

        /*
            Array de días de la semana.
            Se imprime solo el contenido en posiciones pares.
        */

        String[] diasSemana = {
                "Lunes", "Martes", "Miércoles",
                "Jueves", "Viernes", "Sábado", "Domingo"
        };

        for (int i = 0; i < diasSemana.length; i++) {
            if (i % 2 == 0) {
                System.out.println(diasSemana[i]);
            }
        }

        /*
            Bucle for-each.
            Recorre todos los elementos del array sin usar índices.
        */

        for (String dia : diasSemana) {
            System.out.println(dia);
        }

        scanner.close();
    }
}



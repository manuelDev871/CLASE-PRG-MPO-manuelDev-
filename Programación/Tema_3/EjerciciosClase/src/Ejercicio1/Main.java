package Ejercicio1;

import java.util.Scanner;

public class Main {

    /*
         1.
         Crea un programa de adivinación de números El programa genera de manera
         aleatoria un número entre 1 y 50. El usuario debe adivinar el número en un
         máximo de 7 intentos. Después de cada intento, indica si el número es mayor
         o menor que el elegido. Si el usuario acierta, mostrar un aviso con el número
         de intentos utilizado; si no, mostrar un aviso de que debe introducir
         nuevamente un número.
     */

    // 0 - Necesito pedir cosas por tecado
    // 1 - Generar numero aleatoio entre 1-50
    // 2 - 7 intentos / repeticiones
    // 3 - Indicar si elnumero es mayor o menor del elegido
    // 4 - Mostrar un aviso con elnumerodeintentos utilizado


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numeroSistemas = (int) ((Math.random()*50) + 1); // 0.0-0.999999 - > 1 - 50
        System.out.println("El nuero de sistema es " + numeroSistemas);

        int intentos = 7;
        int numeroUsuario;
        do {
            // vas a pedir el numero n veces como maximo 7 y como minimo 1
            System.out.println("Indica el numero con el que juegas");
            numeroUsuario = sc.nextInt();
            intentos--;

            if (numeroUsuario ==  numeroSistemas) {
                System.out.println("ENHORABUENA, HAS ACERTADO :)");
                break;
            } else {

                if (numeroSistemas < numeroUsuario) {
                    System.out.println("Numero demasiado grande");
                } else {
                    System.out.println("Numero demasiado pequeño");
                }
            }

            // Nº de intentos restantes
            System.out.println("Has consumido "+ (7 - intentos) + " intentos");
            System.out.println("Te quedan "+ (intentos) + " intentos");

        } while (intentos > 0);

        if (numeroUsuario != numeroSistemas) {
            System.out.println("Lo siento, has perdido :(");
        }

        sc.close();
    }
}

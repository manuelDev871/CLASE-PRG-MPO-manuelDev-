package Ejercicio2;

import java.util.Scanner;

public class Main {

    /*  2.
        Crea una aplicación que simule el funcionamiento del wordle. Para ello realiza
        las siguientes acciones:

        a. Crea una palabra de 5 letras. (funcionará como la palabra a adivinar)

        b. El programa debe seleccionar aleatoriamente una palabra del array y
        almacenarla como la palabra secreta.

        c. El usuario tiene 5 intentos como máximo para adivinar la palabra secreta.

        d. En cada intento, el usuario introduce una palabra por teclado.

        e. Tras cada intento, el programa debe indicar al usuario:

                i. Aciertos: cuántas letras tiene en la misma posición que la palabra
                secreta.
                ii. Aproximaciones: cuántas letras están en la palabra secreta, pero en una
                posición diferente.
                iii. Fallos: cuántas letras no están presentes en la palabra secreta.
                El juego termina cuando el usuario adivina la palabra o se acaban los 5 intentos.
   */

    public static void main(String[] args) {
        // Pedir la palabra al usuario:
        Scanner sc = new Scanner(System.in);

        // Array de palabras; Mostrar la palabra de manera aleatoria:
        String [] palabras = {"datos","cosas","lucia","manta"};
        String palabraSecreta = palabras[(int) (Math.random()*4)];
        System.out.println("La palabra a adivinar es " + palabraSecreta);

        // Variable para guardar la palabra que introduce el usuario; nº de intentos:
        String palabraUsuario;
        int intentos = 5;

        // Bucle do while para nº de intentos; pide la palabra un max de (variable intentos):
        do {
            // Bucle do while que pide la palabra y verifica que cumple los requisitos de tener una longitud de 5 letras:
            do {
                System.out.println("Introduce la palabra");
                palabraUsuario = sc.next();

                if (palabraUsuario.length() != 5) {
                    System.out.println("Palabra invalida");
                }

            } while (palabraUsuario.length() != 5);

            System.out.println("Intento gastado");
            intentos--;

            // VARIABLES DEL BUCLE FOR:
            int numeroAciertos = 0;
            int numeroAproximaciones = 0;
            int numeroErrores = 0;

            if (palabraUsuario.equals(palabraSecreta)) {
                System.out.println("Palabra adivinada");
                numeroAciertos = 5;
                break;
            }

            // Analizar:
            for (int i = 0; i < palabraSecreta.length(); i++) {
                // i=0, 1, 2, 3, 4
                // cosas
                // datos

               if (palabraUsuario.charAt(i) == palabraSecreta.charAt(i)) {
                    numeroAciertos++;
                } else if (palabraSecreta.contains(String.valueOf(palabraUsuario.charAt(i)))) {
                    numeroAproximaciones++;
                } else {
                    numeroErrores++;
                }
            }

            System.out.println("El numero de aciertos es " + numeroAciertos);
            System.out.println("El numero de aproximaciones es " + numeroAproximaciones);
            System.out.println("El numero de errores es " + numeroErrores);

        } while (intentos > 0);

        System.out.println("Saliendo del juego...");
    }
}

/*
    Realizar el juego bonoloto
    Para ello el sistema contará con dos cadenas de numeros
        - numeros del sistema
        - numeros del usuario

    De primeras, el sistema guardará 5 numeros aleatorios entre 1 y 20
    El sistema pedira al usuario que introduzca sus numeros

    El sistema deberá decidir si he ganado un premio. Para ello los premios se reparten de la siguiente forma.

    5 aciertos -> 1 millon de euros
    4 aciertos -> 10000 euros
    3 aciertos -> 1000 euros
    1-2 aciertos -> 10 euros
    0 -> prueba suerte la siguiente vez

    Ej: numeroSistema -> 9, 12, 3, 5, 11
    Ej: numeroUsuario -> 12, 9, 6, 10, 3
 */

import java.util.Scanner;

public class Bonoloto {

    private int[] numeroSistema = new int[5];

    private int[] numeroUsuario = new int[5];

    private Scanner sc = new Scanner(System.in);

    public void generarNumeroSistemas() {
        for (int i = 0; i < numeroSistema.length; i++) {
            numeroSistema[i] = (int)(Math.random() * 20) + 1;
            // System.out.println("Los numero generados por el sistema son: " + numeroSistema[i]);
            // (Con esta linea puedo ver los numeros generados por el sistema)
        }
    }

    public void pedirNumerosUsuario() {
        for (int i = 0; i < numeroUsuario.length; i++) {
            int numero;

            do {
                System.out.println("Introduce un valor");
                numero = sc.nextInt();
                if (numero < 1 || numero > 20) {
                    System.out.println("Este numero no es valido");
                }
            } while (numero < 1 || numero > 20);
            numeroUsuario[i] = numero;
        }
    }

    // Comprobar cuantos aciertos hay entre numeroSistema y numeroUsuario y decir que premio le corresponde...

    public void comprobarNumeros() {
        int aciertos = 0;

        for (int i = 0; i < numeroSistema.length; i++) {
            for (int j = 0; j < numeroUsuario.length; j++) {
                if (numeroSistema[i] == numeroUsuario[j]){
                    aciertos++;
                }
            }
        }

        System.out.println("Numero de aciertos: " + aciertos);
        if (aciertos == 5) {
            System.out.println("ENHORABUENA, HAS GANADO EL 1º PREMIO -> 1 MILLÓN DE EUROS");
        } else if (aciertos == 4) {
            System.out.println("ENHORABUENA, HAS GANADO EL 2º PREMIO -> 10000 EUROS");
        } else if (aciertos == 3) {
            System.out.println("ENHORABUENA, HAS GANADO EL 3º PREMIO -> 1000 EUROS");
        } else if (aciertos == 2 || aciertos == 1) {
            System.out.println("ENHORABUENA, HAS GANADO EL 4º PREMIO -> 100 EUROS");
        } else {
            System.out.println("Lo siento, prueba suerte la siguinte vez");
        }
    }
}

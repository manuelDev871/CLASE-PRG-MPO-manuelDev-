/*  Escribe un programa que pida la nota de un examen (entre 0 y 10) y determine si el alumno ha aprobado
    (nota mayor o igual a 5) o ha suspendido. */

import java.util.Scanner;

public class Ejercicio3_Tema_3 {

    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner(System.in);
        System.out.println("Introduce tu nota del examen");
        float nota = entradaTeclado.nextFloat();

        if (nota >= 5) {
            System.out.println("¡ENHORABUENA!, has aprobado.");
        } else {
            System.out.println("Lo siento, has suspendido.");
        }

        entradaTeclado.close();
    }
}

/*  Crea un programa que pida una nota numérica (0-10) y determine la calificación: Suspenso (0-4),
    Aprobado (5-6), Notable (7-8) o Sobresaliente (9-10). */

import java.util.Scanner;

public class Ejercicio7_Tema_3 {

    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner(System.in);
        System.out.println("Introduce tu nota");
        double nota = entradaTeclado.nextDouble();

        if ((nota >= 0) && (nota < 5)) {
            System.out.println("Tu calificación es: Suspenso");
        } else if ((nota >= 5) && (nota <= 6)) {
            System.out.println("Tu calificación es: Aprobado");
        } else if ((nota > 6) && (nota <= 8)) {
            System.out.println("Tu calificación es: Notable");
        } else if ((nota > 8) && (nota <= 10)){
            System.out.println("Tu calificación es: Sobresaliente");
        } else {
            System.out.println("Error en la calificación");
        }

        entradaTeclado.close();
    }
}

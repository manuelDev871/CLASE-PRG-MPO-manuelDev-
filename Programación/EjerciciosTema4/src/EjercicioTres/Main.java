package EjercicioTres;

import java.util.Scanner;

public class Main {

    /*
        3. Desarrolla un programa en Java que permita registrar, calcular e informar
        las notas de varios alumnos utilizando arrays.

            a. Declara un array de tipo double para almacenar las notas de 10 alumnos.
            b. Solicita al usuario que introduzca las 10 notas. En caso de introducir una
            nota inferior a 0 y superior a 10 volverá a pedirla
            c. Calcula y muestra:
                i. La nota media de la clase.
                ii. La nota más alta y la más baja.
                iii. Cuántos alumnos han aprobado (nota igual o mayor a 5) y cuántos han
                suspendido.
    */

    public static void main(String[] args) {

        Metodos metodosEjercicioTres = new Metodos();
        Scanner sc = new Scanner(System.in);

        System.out.println("Gestor de Calificaciones 1º de DAW");
        System.out.println("===================================");
        System.out.println("1. Rellenar notas");
        System.out.println("2. Imprimir notas");
        System.out.println("3. Sacar nota media");
        System.out.println("4. Sacar la nota más alta");
        System.out.println("5. Sacar la nota más baja");
        System.out.println("6. Sacar número de aprobados/suspensos");
        System.out.println("7. Salir del programa");

        int opcion = 0;

        do {
            System.out.print("Introduce una opción (1 - 7): ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> {
                    metodosEjercicioTres.rellenarNotas();
                }

                case 2 -> {
                    metodosEjercicioTres.imprimirNotas();
                }

                case 3 -> {
                    metodosEjercicioTres.notaMedia();
                }

                case 4 -> {
                    metodosEjercicioTres.sacarNotaAlta();
                }

                case 5 -> {
                    metodosEjercicioTres.sacarNotaBaja();
                }

                case 6 -> {
                    metodosEjercicioTres.numeroAprobados();
                }

                case 7 -> {
                    System.out.println("Saliendo del gestor de notas...");
                }

                default -> {
                    System.out.println("Opción no contemplada, pruebe de nuevo");
                }
            }

        } while (opcion != 7);

        sc.close();
    }
}

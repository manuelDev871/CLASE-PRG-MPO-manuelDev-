package EjerciciosTema4.EjercicioAgenda;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Scanner para solicitar datos al usuario.

        MetodosAgenda agenda = new MetodosAgenda(); // Metodo para llamar a los metodos de la clase MetodosAgenda.java

        // 1 -> Hacer bienvenida y menú de mi agenda.

        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("BIENVENID@ A TU AGENDA PERSONAL");
        System.out.println("----------------------------------------------------------------------------------");

        int elegirOpcion;
        do {
            System.out.println();
            System.out.println("---MENÚ AGENDA---");
            System.out.println("1. Agregar persona");
            System.out.println("2. Buscar persona");
            System.out.println("3. Borrar persona");
            System.out.println("4. Listar persona");
            System.out.println("5. Salir");
            System.out.print("Elige una opción (1 - 5): ");
            elegirOpcion = sc.nextInt();

            // Switch para opciones.

            switch (elegirOpcion) {
                case 1 -> {
                    agenda.agregarPersona();
                }
                case 2 -> {
                    agenda.buscarPersona();
                }

                default -> {
                    System.out.println("Opcion no contemplada.");
                }
            }

        } while (elegirOpcion != 5);
    }
}

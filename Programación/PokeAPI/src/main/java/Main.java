import controller.APIController;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        APIController controller = new APIController();

        System.out.println("----------Bienvenido a mi PokéAPI----------");
        System.out.println();

        int opcion = 0;

        do {

            System.out.println("1 - Mostrar información de un pokemon");
            System.out.println("2 - Salir de la PokéAPI...");
            System.out.print("Indica una opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {

                case 1 -> {
                    System.out.print("Introduce el nombre del pokemon: ");
                    String name = scanner.next().toLowerCase();
                    controller.obtenerDatos(name);
                }

                case 2 -> {
                    System.out.println("Saliendo de la PokéAPI...");
                }

                default -> {
                    System.out.println("Opción no contemplada...");
                }
            }

        } while (opcion != 2);

        scanner.close();
    }
}
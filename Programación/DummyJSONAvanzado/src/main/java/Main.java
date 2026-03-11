import controller.APIController;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        APIController controller = new APIController();

        int opcion;

        do {
            System.out.println("---------- API DummyJSON ----------");
            System.out.println("1 - Mostrar datos por ID");
            System.out.println("2 - Salir");
            System.out.print("Indica que desea realizar: ");

            opcion = scanner.nextInt();

            switch (opcion) {

                case 1 -> {
                    System.out.print("Indica el ID del producto: ");
                    int id = scanner.nextInt();
                    controller.obtenerDatos(id);
                }

                case 2 -> System.out.println("Saliendo del programa...");

                default -> System.out.println("❌ Opción no válida\n");
            }

        } while (opcion != 2);

        scanner.close();
    }
}
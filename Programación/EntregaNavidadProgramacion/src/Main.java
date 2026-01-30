import controller.CampeonatoController;
import model.Coche;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Coche> coches = new ArrayList<>();

        int numCoches;

        do {
            System.out.print("Introduce el número de coches: ");
            numCoches = scanner.nextInt();
            scanner.nextLine();

            if (numCoches <= 1) {
                System.out.print("El número de coches debe ser mayor que 1, por favor, inténtelo de nuevo: ");
            }

        } while (numCoches <= 1);

        // Crear coches:
        for (int i = 1; i <= numCoches; i++) {

            System.out.println();
            System.out.println("Coche " + i + ":");

            System.out.print("Marca: ");
            String marca = scanner.nextLine();

            System.out.print("Modelo: ");
            String modelo = scanner.nextLine();

            coches.add(new Coche(marca, modelo));
        }

        // Crear y empezar el campeonato:
        CampeonatoController campeonatoController = new CampeonatoController();
        campeonatoController.empezarCampeonato(coches);

        scanner.close();
    }
}
package main;

import controller.CampeonatoController;
import model.Campeonato;
import model.Coche;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Coche> coches = new ArrayList<>();

        System.out.print("Número de coches: ");
        int numCoches = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= numCoches; i++) {
            System.out.print("Nombre del coche " + i + ": ");
            String nombre = sc.nextLine();
            coches.add(new Coche(nombre, i));
        }

        System.out.print("Número de carreras: ");
        int numCarreras = sc.nextInt();

        System.out.print("Km por carrera: ");
        int kmCarrera = sc.nextInt();

        Campeonato campeonato = new Campeonato(coches);
        CampeonatoController controller = new CampeonatoController();
        controller.ejecutarCampeonato(campeonato, numCarreras, kmCarrera);
    }
}

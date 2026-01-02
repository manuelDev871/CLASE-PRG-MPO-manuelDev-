package controller;

import model.Carrera;
import model.Coche;

import java.util.*;

public class CarreraController {

    private static final int[] PUNTOS = {10, 8, 6};

    public void simularCarrera(Carrera carrera) {

        Random random = new Random();
        boolean terminada = false;

        while (!terminada) {
            for (Coche c : carrera.getCoches()) {
                c.avanzar(random.nextInt(31) + 20);
                if (c.getKm() >= carrera.getKmTotales()) {
                    terminada = true;
                }
            }
        }

        carrera.getCoches().sort(
                Comparator.comparingInt(Coche::getKm).reversed()
        );

        for (int i = 0; i < carrera.getCoches().size() && i < 3; i++) {
            carrera.getCoches().get(i).sumarPuntos(PUNTOS[i]);
        }
    }

    public void mostrarPodio(List<Coche> coches, int numCarrera) {
        System.out.println("=== CARRERA " + numCarrera + " ===");
        System.out.println("1º - " + coches.get(0).getNombre() + " [10 puntos]");
        System.out.println("2º - " + coches.get(1).getNombre() + " [8 puntos]");
        System.out.println("3º - " + coches.get(2).getNombre() + " [6 puntos]");
        System.out.println();
    }
}

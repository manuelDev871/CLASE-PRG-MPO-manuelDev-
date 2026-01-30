package controller;

import model.Carrera;
import model.Coche;

import java.util.ArrayList;
import java.util.Random;

public class CarreraController {

    // Clase CarreraController:
        /*
            1. Atributo -> random.
            2. Constructor.
            3. Metodo simularCarrera.
            4. Metodo mostrarResultados.
         */

    private Random random;

    public CarreraController() {
        random = new Random();
    }

    public ArrayList<Coche> simularCarrera(Carrera carrera, int numeroCarrera) {

        ArrayList<Coche> coches = carrera.getCoches();

        for (Coche coche : coches) {
            coche.resetearKm();
        }

        while (!carrera.hayGanador()) {

            for (Coche coche : coches) {

                int kmAleatorios = random.nextInt(31) + 20;

                if (coche.getKmRecorridos() + kmAleatorios >= carrera.getKmTotales()) {
                    coche.sumarKm(carrera.getKmTotales() - coche.getKmRecorridos());
                    break;
                } else {
                    coche.sumarKm(kmAleatorios);
                }
            }
        }

        carrera.ordenarPorKm();

        mostrarResultados(carrera, numeroCarrera);

        return coches;
    }

    private void mostrarResultados(Carrera carrera, int numeroCarrera) {

        ArrayList<Coche> coches = carrera.getCoches();

        System.out.println("=== CARRERA " + numeroCarrera + " (" + carrera.getKmTotales() + " km) ===");
        System.out.println();

        for (int i = 0; i < coches.size(); i++) {
            Coche coche = coches.get(i);

            String puntos;

            if (i == 0) {
                puntos = "[10 puntos]";
            } else if (i == 1) {
                puntos = "[8 puntos]";
            } else if (i == 2) {
                puntos = "[6 puntos]";
            } else {
                puntos = "[0 puntos]";
            }

            System.out.println((i + 1) + "º - " + coche.getNombre() + " (" + coche.getKmRecorridos() + " km)" + puntos);
        }
        System.out.println();
    }
}
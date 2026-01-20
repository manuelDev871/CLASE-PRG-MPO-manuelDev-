package controller;

import model.Carrera;
import model.Coche;
import java.util.ArrayList;
import java.util.Random;

public class CarreraController {

    public void simularCarrera(Carrera carrera) {
        Random random = new Random();
        boolean terminada = false;

        while (!terminada) {
            for (Coche c : carrera.getCoches()) {
                int km = random.nextInt(31) + 20; // 20-50
                c.sumarKm(km);

                if (c.getKmRecorridos() >= carrera.getKmCarrera()) {
                    terminada = true;
                }
            }
        }

        ordenarPorKm(carrera.getCoches());
        asignarPuntos(carrera.getCoches());
        mostrarResultados(carrera.getCoches());
    }

    private void ordenarPorKm(ArrayList<Coche> coches) {
        for (int i = 0; i < coches.size() - 1; i++) {
            for (int j = i + 1; j < coches.size(); j++) {
                if (coches.get(j).getKmRecorridos() > coches.get(i).getKmRecorridos()) {
                    Coche aux = coches.get(i);
                    coches.set(i, coches.get(j));
                    coches.set(j, aux);
                }
            }
        }
    }

    private void asignarPuntos(ArrayList<Coche> coches) {
        if (coches.size() > 0) coches.get(0).sumarPuntos(10);
        if (coches.size() > 1) coches.get(1).sumarPuntos(8);
        if (coches.size() > 2) coches.get(2).sumarPuntos(6);
    }

    private void mostrarResultados(ArrayList<Coche> coches) {
        System.out.println("Resultados de la carrera:");
        for (int i = 0; i < coches.size(); i++) {
            System.out.println((i + 1) + "º - " + coches.get(i).getNombre()
                    + " (" + coches.get(i).getKmRecorridos() + " km)");
        }

        System.out.println("Podio:");
        if (coches.size() > 0) System.out.println("1º - " + coches.get(0).getNombre() + " [10 puntos]");
        if (coches.size() > 1) System.out.println("2º - " + coches.get(1).getNombre() + " [8 puntos]");
        if (coches.size() > 2) System.out.println("3º - " + coches.get(2).getNombre() + " [6 puntos]");
    }
}

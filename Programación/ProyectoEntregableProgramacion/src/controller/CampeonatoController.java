package controller;

import model.Campeonato;
import model.Carrera;
import model.Coche;
import java.util.ArrayList;

public class CampeonatoController {

    public void ejecutarCampeonato(Campeonato campeonato) {
        CarreraController carreraController = new CarreraController();
        int numCarrera = 1;

        for (Carrera carrera : campeonato.getCarreras()) {
            System.out.println("\n=== CARRERA " + numCarrera + " ===");

            for (Coche c : campeonato.getCoches()) {
                c.resetKm();
            }

            carreraController.simularCarrera(carrera);
            mostrarClasificacion(campeonato.getCoches());

            numCarrera++;
        }

        System.out.println("\n=== CLASIFICACIÓN FINAL ===");
        ordenarPorPuntos(campeonato.getCoches());
        mostrarClasificacion(campeonato.getCoches());
    }

    private void ordenarPorPuntos(ArrayList<Coche> coches) {
        for (int i = 0; i < coches.size() - 1; i++) {
            for (int j = i + 1; j < coches.size(); j++) {
                if (coches.get(j).getPuntos() > coches.get(i).getPuntos()) {
                    Coche aux = coches.get(i);
                    coches.set(i, coches.get(j));
                    coches.set(j, aux);
                }
            }
        }
    }

    private void mostrarClasificacion(ArrayList<Coche> coches) {
        System.out.println("Posición | Coche | Puntos");
        for (int i = 0; i < coches.size(); i++) {
            System.out.println((i + 1) + "º | " + coches.get(i).getNombre()
                    + " | " + coches.get(i).getPuntos());
        }
    }
}

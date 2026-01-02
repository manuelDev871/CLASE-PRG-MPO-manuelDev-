package controller;

import model.Campeonato;
import model.Carrera;
import model.Coche;

import java.util.*;

public class CampeonatoController {

    private CarreraController carreraController = new CarreraController();

    public void ejecutarCampeonato(Campeonato campeonato, int numCarreras, int kmCarrera) {

        for (int i = 1; i <= numCarreras; i++) {

            for (Coche c : campeonato.getCoches()) {
                c.resetKm();
            }

            Carrera carrera = new Carrera(kmCarrera, campeonato.getCoches());
            carreraController.simularCarrera(carrera);
            carreraController.mostrarPodio(carrera.getCoches(), i);
        }

        mostrarClasificacionFinal(campeonato.getCoches());
    }

    private void mostrarClasificacionFinal(List<Coche> coches) {

        coches.sort(
                Comparator.comparingInt(Coche::getPuntos).reversed()
        );

        System.out.println("=== CLASIFICACIÓN GENERAL ===");
        System.out.println("Posición Vehículo Dorsal Puntos");

        int pos = 1;
        for (Coche c : coches) {
            System.out.println(pos + "º " + c.getNombre() + " " + c.getDorsal() + " " + c.getPuntos());
            pos++;
        }
    }
}

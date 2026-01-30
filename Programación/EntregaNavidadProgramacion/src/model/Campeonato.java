package model;

import java.util.ArrayList;
import java.util.HashMap;

public class Campeonato {

    // Clase Campeonato:
        /*
            1. Atributos.
            2. Constructor.
            3. Getters.
            4. Metodo anhadirCarrera.
            5. Metodo inicializarClasificacion -> inicializa con 0 puntos.
            6. Metodo sumarPuntos.
         */

    private ArrayList<Carrera> carreras;
    private HashMap<Coche, Integer> clasificacion;

    public Campeonato() {
        carreras = new ArrayList<>();
        clasificacion = new HashMap<>();
    }

    public ArrayList<Carrera> getCarreras() {
        return carreras;
    }

    public HashMap<Coche, Integer> getClasificacion() {
        return clasificacion;
    }

    public void anhadirCarrera(Carrera carrera) {
        carreras.add(carrera);
    }

    public void inicializarClasificacion(ArrayList<Coche> coches) {
        for (Coche coche : coches) {
            clasificacion.put(coche, 0);
        }
    }

    public void sumarPuntos(Coche coche, int puntos) {
        if (clasificacion.containsKey(coche)) {
            clasificacion.put(coche, clasificacion.get(coche) + puntos);
        }
    }
}
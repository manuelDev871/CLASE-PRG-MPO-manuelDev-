package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Carrera {

    // Clase Carrera:
        /*
            1. Atributos.
            2. Constructor.
            3. Getters.
            4. Metodo hayGanador -> Compruebo si algun coche ha llegado a la meta.
            5. Metodo ordenarPorKm -> Ordeno los coches por kilómetros recorridos (de mayor a menor).
         */

    private ArrayList<Coche> coches;
    private int kmTotales;

    public Carrera(ArrayList<Coche> coches, int kmTotales) {
        this.coches = new ArrayList<>(coches);
        this.kmTotales = kmTotales;
    }

    public ArrayList<Coche> getCoches() {
        return coches;
    }

    public int getKmTotales() {
        return kmTotales;
    }

    public boolean hayGanador() {
        for (Coche coche : coches) {
            if (coche.getKmRecorridos() >= kmTotales) {
                return true;
            }
        }
        return false;
    }

    public void ordenarPorKm() {
        Collections.sort(coches, new Comparator<Coche>() {
            @Override
            public int compare(Coche coche1, Coche coche2) {
                return coche2.getKmRecorridos() - coche1.getKmRecorridos();
            }
        });
    }
}
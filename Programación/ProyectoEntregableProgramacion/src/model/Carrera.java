package model;

import java.util.List;

public class Carrera {

    private int kmTotales;
    private List<Coche> coches;

    public Carrera(int kmTotales, List<Coche> coches) {
        this.kmTotales = kmTotales;
        this.coches = coches;
    }

    public int getKmTotales() {
        return kmTotales;
    }

    public List<Coche> getCoches() {
        return coches;
    }
}

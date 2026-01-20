package model;

import java.util.ArrayList;

public class Carrera {

    private ArrayList<Coche> coches;
    private int kmCarrera;

    public Carrera(ArrayList<Coche> coches, int kmCarrera) {
        this.coches = coches;
        this.kmCarrera = kmCarrera;
    }

    public ArrayList<Coche> getCoches() {
        return coches;
    }

    public int getKmCarrera() {
        return kmCarrera;
    }
}

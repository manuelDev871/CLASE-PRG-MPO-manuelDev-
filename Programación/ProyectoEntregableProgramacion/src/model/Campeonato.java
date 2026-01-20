package model;

import java.util.ArrayList;

public class Campeonato {

    private ArrayList<Carrera> carreras;
    private ArrayList<Coche> coches;

    public Campeonato(ArrayList<Carrera> carreras, ArrayList<Coche> coches) {
        this.carreras = carreras;
        this.coches = coches;
    }

    public ArrayList<Carrera> getCarreras() {
        return carreras;
    }

    public ArrayList<Coche> getCoches() {
        return coches;
    }
}

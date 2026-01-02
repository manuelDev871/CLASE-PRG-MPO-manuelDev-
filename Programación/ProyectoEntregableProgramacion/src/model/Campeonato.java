package model;

import java.util.List;

public class Campeonato {

    private List<Coche> coches;

    public Campeonato(List<Coche> coches) {
        this.coches = coches;
    }

    public List<Coche> getCoches() {
        return coches;
    }
}

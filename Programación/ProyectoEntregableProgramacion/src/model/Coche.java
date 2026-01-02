package model;

public class Coche {

    private String nombre;
    private int dorsal;
    private int km;
    private int puntos;

    public Coche(String nombre, int dorsal) {
        this.nombre = nombre;
        this.dorsal = dorsal;
        this.km = 0;
        this.puntos = 0;
    }

    public void resetKm() {
        km = 0;
    }

    public void avanzar(int km) {
        this.km += km;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDorsal() {
        return dorsal;
    }

    public int getKm() {
        return km;
    }

    public int getPuntos() {
        return puntos;
    }

    public void sumarPuntos(int puntos) {
        this.puntos += puntos;
    }
}

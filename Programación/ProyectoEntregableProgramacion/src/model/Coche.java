package model;

public class Coche {

    private String marca;
    private String modelo;
    private int kmRecorridos;
    private int puntos;

    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.kmRecorridos = 0;
        this.puntos = 0;
    }

    public String getNombre() {
        return marca + " " + modelo;
    }

    public int getKmRecorridos() {
        return kmRecorridos;
    }

    public int getPuntos() {
        return puntos;
    }

    public void sumarKm(int km) {
        kmRecorridos += km;
    }

    public void resetKm() {
        kmRecorridos = 0;
    }

    public void sumarPuntos(int puntos) {
        this.puntos += puntos;
    }
}

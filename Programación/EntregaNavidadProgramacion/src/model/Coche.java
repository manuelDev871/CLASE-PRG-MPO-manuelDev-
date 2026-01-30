package model;

public class Coche {

    // Clase Coche:
        /*
            1. Atributos.
            2. Constructor.
            3. Getters.
            4. Metodo sumarKm.
            5. Metodo resetearKm.
            6. Metodo toString.
         */

    private String marca;
    private String modelo;
    private int kmRecorridos;

    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.kmRecorridos = 0;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getKmRecorridos() {
        return kmRecorridos;
    }

    public String getNombre() {
        return marca + " " + modelo;
    }

    public void sumarKm(int km) {
        this.kmRecorridos += km;
    }

    public void resetearKm() {
        this.kmRecorridos = 0;
    }

    @Override
    public String toString() {
        return marca + " " + modelo;
    }
}
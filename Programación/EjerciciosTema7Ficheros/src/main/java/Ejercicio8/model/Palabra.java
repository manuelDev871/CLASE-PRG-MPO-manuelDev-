package Ejercicio8.model;

public class Palabra {
    private String texto;
    private int contador;

    public Palabra(String texto) {
        this.texto = texto;
        this.contador = 1;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public void incrementar() {
        contador++;
    }
}

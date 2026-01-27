package EjerciciosTema5.EjerciciosClase.Ejercicio2.model;

public class Equipo {

    private String nombre;
    private int gFavor, gContra;

    public Equipo() {}

    public Equipo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getgFavor() {
        return gFavor;
    }

    public int getgContra() {
        return gContra;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setgFavor(int gFavor) {
        this.gFavor = gFavor;
    }

    public void setgContra(int gContra) {
        this.gContra = gContra;
    }

    public void mostrarEstadisticas() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Los goles a favor son " + gFavor);
        System.out.println("Los goles en contra son " + gContra);
    }
}

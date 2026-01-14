package EjerciciosTema5.EjerciciosPOO.Ejercicio10.model;

public class Usuario {

    private String nombre;
    private int numeroSocio;

    public Usuario(String nombre, int numeroSocio) {
        this.nombre = nombre;
        this.numeroSocio = numeroSocio;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getNumeroSocio() {
        return this.numeroSocio;
    }

}

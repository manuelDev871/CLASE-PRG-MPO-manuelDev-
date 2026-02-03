package EjerciciosTema5.EjerciciosClaseHerencia.Ejercicio2.model;

public class Audio extends Multimedia {

    private double duracion;
    private String soporte;

    public Audio() {}

    public Audio(String identificador, String titulo, String autor, String tamanio, String formato, double duracion, String soporte) {
        super(identificador, titulo, autor, tamanio, formato);
        this.duracion = duracion;
        this.soporte = soporte;
    }

    public double getDuracion() {
        return duracion;
    }

    public String getSoporte() {
        return soporte;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public void setSoporte(String soporte) {
        this.soporte = soporte;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Duracion: " + duracion + " min");
        System.out.println("Soporte: " + soporte);
    }
}

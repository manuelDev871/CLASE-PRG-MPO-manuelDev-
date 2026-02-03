package EjerciciosTema5.EjerciciosClaseHerencia.Ejercicio2.model;

public class Video extends Multimedia{

    private String director;
    private int numActores;

    public Video() {}

    public Video(String identificador, String titulo, String autor, String tamanio, String formato, String director, int numActores) {
        super(identificador, titulo, autor, tamanio, formato);
        this.director = director;
        this.numActores = numActores;
    }

    public String getDirector() {
        return director;
    }

    public int getNumActores() {
        return numActores;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setNumActores(int numActores) {
        this.numActores = numActores;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Director: " + director);
        System.out.println("Numero de Actores: " + numActores);
    }
}

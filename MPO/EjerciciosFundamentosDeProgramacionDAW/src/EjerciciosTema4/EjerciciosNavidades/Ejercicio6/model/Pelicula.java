package EjerciciosTema4.EjerciciosNavidades.Ejercicio6.model;

import java.time.Year;

public class Pelicula {

    private String titulo, director;
    private int duracion, anio;
    private double calificacion;

    public Pelicula() {}

    public Pelicula(String titulo, String director, int duracion, int anio, double calificacion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
        this.anio = anio;
        setCalificacion(calificacion);
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDirector() {
        return director;
    }

    public int getDuracion() {
        return duracion;
    }

    public int getAnio() {
        return anio;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setCalificacion(double calificacion) {
        if ((calificacion >= 0) && (calificacion <= 10)) {
            this.calificacion = calificacion;
        } else {
            this.calificacion = 0;
        }
    }

    public String obtenerDuracionFormateada() {
        int horas = duracion / 60;
        int minutos = duracion % 60;

        return horas + "h " + minutos + "min";
    }

    public boolean esClasica() {
        int anioActual = Year.now().getValue();
        return (anioActual - anio) > 25;
    }

    public boolean esRecomendable() {
        return calificacion >= 7;
    }

    public void mostrarInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Director: " + director);
        System.out.println("Duración: " + obtenerDuracionFormateada());
        System.out.println("Año: " + anio);
        System.out.println("Calificación: " + calificacion);
    }
}

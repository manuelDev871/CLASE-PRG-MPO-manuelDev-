package EjerciciosTema5.EjerciciosClaseHerencia.Ejercicio2.model;

public class Multimedia {

    private String identificador, titulo, autor, tamanio, formato;

    public Multimedia() {}

    public Multimedia(String identificador, String titulo, String autor, String tamanio, String formato ) {
        this.identificador = identificador;
        this.titulo = titulo;
        this.autor = autor;
        this.tamanio = tamanio;
        this.formato = formato;
    }

    public String getIdentificador() {
        return identificador;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getFormato() {
        return formato;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public void mostrarDatos() {
        System.out.println("Identificador: " + identificador);
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Tamaño: " + tamanio);
        System.out.println("Formato: " + formato);
    }
}

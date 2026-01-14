package EjerciciosTema5.EjerciciosPOO.Ejercicio4.model;

public class Libro {

    private String titulo, autor;
    private int numeroPaginas;

    public Libro() {
        this.titulo = "Sin título";
        this.autor = "Autor desconocido";
        this.numeroPaginas = 0;
    }

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = 0;
    }

    public Libro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public int getNumeroPaginas() {
        return this.numeroPaginas;
    }
}

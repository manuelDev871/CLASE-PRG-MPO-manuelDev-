package EjerciciosTema5.EjerciciosPOO.Ejercicio10.model;

public class Libro {

    private String libro;
    private String autor;
    private String isbn;
    private boolean disponible;

    public Libro(String libro, String autor, String isbn) {
        this.libro = libro;
        this.autor = autor;
        this.isbn = isbn;
        this.disponible = true;
    }

    public String getLibro() {
        return this.libro;
    }

    public String getAutor() {
        return this.autor;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public boolean isDisponible() {
        return true;
    }

    public void prestar() {
        disponible = false;
    }

    public void devolver() {
        disponible = true;
    }

    public String toString() {
        return "- " + libro + " (" + autor + ") ISBN: " + isbn;
    }
}

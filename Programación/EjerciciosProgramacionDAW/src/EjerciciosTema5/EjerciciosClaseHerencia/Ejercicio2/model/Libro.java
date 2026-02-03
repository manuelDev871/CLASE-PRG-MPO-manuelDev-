package EjerciciosTema5.EjerciciosClaseHerencia.Ejercicio2.model;

public class Libro extends Multimedia {

    private String isbn;
    private int numPaginas;

    public Libro() {}

    public Libro(String identificador, String titulo, String autor, String formato, String tamanio, String isbn, int numPaginas) {
        super(identificador, titulo, autor, tamanio, formato);
        this.isbn = isbn;
        this.numPaginas = numPaginas;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("ISBN: " + isbn);
        System.out.println("Numero de Paginas: " + numPaginas);
    }
}

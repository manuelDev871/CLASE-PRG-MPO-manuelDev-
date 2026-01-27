package EjerciciosTema5.EjerciciosNavidades.Ejercicio1.model;

public class Libro {

    private String titulo, autor;
    private int numPaginas;
    private double precio;

    public Libro() {}

    public Libro(String titulo, String autor, int numPaginas, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
        this.precio = precio;
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public double getPrecio() {
        return precio;
    }

    // Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Metodo mostrarInfo
    public void mostrarInfo() {
        System.out.println("Imprimiendo información del libro: ");
        System.out.println("Titulo = " + titulo);
        System.out.println("Autor = " + autor);
        System.out.println("Número de Páginas = " + numPaginas);
        System.out.println("Precio = " + precio);
    }

    // Metodo esLibroLargo
    public boolean esLibroLargo() {
        return numPaginas > 300;
    }

    // Metodo aplicarDescuento
    public void aplicarDescuento(double porcentaje) {
        System.out.println("Aplicando descuento de " + porcentaje + " %");
        double descuento = (precio * porcentaje) / 100;
        precio -= descuento;
        System.out.println("Nuevo precio: " + precio + " €");
    }
}

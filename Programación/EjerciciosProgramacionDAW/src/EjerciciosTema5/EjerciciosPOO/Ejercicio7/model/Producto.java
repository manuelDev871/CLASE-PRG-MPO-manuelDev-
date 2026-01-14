package EjerciciosTema5.EjerciciosPOO.Ejercicio7.model;

public class Producto {

    private String nombre;
    private double precio;
    private int cantidad;

    public Producto() {}

    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String toString() {
        return "Producto{nombre='" + nombre + "', precio=" + precio + "€, cantidad=" + cantidad + "}";
    }
}

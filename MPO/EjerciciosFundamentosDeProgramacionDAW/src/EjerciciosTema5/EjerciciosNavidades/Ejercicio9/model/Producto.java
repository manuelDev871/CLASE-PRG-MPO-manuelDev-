package EjerciciosTema5.EjerciciosNavidades.Ejercicio9.model;

public class Producto {

    private String codigo, nombre;
    private double precio;
    private int stock;

    public Producto() {}

    public Producto(String codigo, String nombre, double precio, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    // Getters
    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    // Setters
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    // Metodo hayStock
    public boolean hayStock() {
        return stock > 0;
    }

    // Metodo verder
    public boolean vender(int cantidad) {
        if (stock >= cantidad) {
            stock -= cantidad;
            System.out.print("Venta exitosa: ");
            return true;
        } else {
            System.out.print("Lo siento, no hay stock suficiente: ");
            return false;
        }
    }

    // Metodo reabastecer
    public void reabastecer(int cantidad) {
        stock += cantidad;
        System.out.println("Se han añadido " + cantidad + " unidades a stock");
    }

    // Metodo calcularValorInventario
    public double calcularValorInventario() {
        return precio * stock;
    }

    // Metodo mostrarInfo
    public void mostrarInfo() {
        System.out.println("Codigo: " + codigo + ", Nombre: " + nombre + ", Precio: " + precio + ", Stock: " + stock + ", Valor total: " + calcularValorInventario() + " €");
    }
}

package EjerciciosTema4.EjerciciosDeClase.EjercicioClaseT4.model;

public class Producto {

    private String nombre;
    private String categoria;
    private String codigo;
    private double precio;

    // Constructor vacío
    public Producto() {
    }

    // Constructor completo
    public Producto(String nombre, String categoria, String codigo, double precio) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.codigo = codigo;
        this.precio = precio;
    }

    // Constructor sin precio (inicializa a -1 para luego asignarlo)
    public Producto(String nombre, String categoria, String codigo) {
        this(nombre, categoria, codigo, -1);
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre +
                " | Categoría: " + categoria +
                " | Código: " + codigo +
                " | Precio: " + precio);
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}


package EjerciciosTema5.EjerciciosPOO.Ejercicio11.model;

public class Cliente {

    private String nombre;
    private String email;
    private Carrito carrito;

    public Cliente(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
        this.carrito = new Carrito();
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public Carrito getCarrito() {
        return carrito;
    }
}


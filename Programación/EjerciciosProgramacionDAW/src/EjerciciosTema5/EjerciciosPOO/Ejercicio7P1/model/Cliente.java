package EjerciciosTema5.EjerciciosPOO.Ejercicio7P1.model;

public class Cliente {

    private String nombre, email;
    private Direccion direccion;


    public Cliente(String nombre, String email, Direccion direccion) {
        this.nombre = nombre;
        this.email = email;
        this.direccion = direccion;
    }

    public void mostrarDatos() {
        System.out.println("Cliente: " + this.nombre);
        System.out.println("Email: " + this.email);
        System.out.println("Dirección: " + direccion.getCalle() + ", " + direccion.getCiudad() + ", " + direccion.getCodigoPostal());
    }
}

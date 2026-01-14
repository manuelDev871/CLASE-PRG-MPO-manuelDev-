package EjerciciosTema5.EjerciciosPOO.Ejercicio1.model;

public class Persona {

    private String nombre;
    private int edad;

    public Persona() {} // -> metodo vacio

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}

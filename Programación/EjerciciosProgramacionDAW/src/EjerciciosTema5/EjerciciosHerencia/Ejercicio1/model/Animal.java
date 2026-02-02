package EjerciciosTema5.EjerciciosHerencia.Ejercicio1.model;

public abstract class Animal {

    private String nombre;
    private int edad;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public abstract void hacerSonido();

    public void mostrarDatos() {
        System.out.println("Animal: " + nombre + ", " + edad + " años");
    }
}

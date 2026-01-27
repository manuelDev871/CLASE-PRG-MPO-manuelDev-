package EjerciciosTema5.EjercicioAgendaTop.model;

public class Contacto {

    private int id;
    private String nombre, apellido, dni;
    private int telefono;

    public Contacto(){} //-> Constructor vacio

    public Contacto(String nombre, String apellido, String dni, int telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    public int getTelefono() {
        return telefono;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    // Metodo mostrar datos
    public void mostrarDatos() {
        System.out.println("Mostrando los datos del contacto " + id);
        System.out.println("Nombre = " + nombre);
        System.out.println("Apellido = " + apellido);
        System.out.println("Dni = " + dni);
        System.out.println("Telefono = " + telefono);
    }

    // Metodo toString -> no usar para sacar los datos por consola
    public String toString() {
        return "Nombre: " + nombre + " Apellido: " + apellido + " Telefono: " + telefono;
    }
}

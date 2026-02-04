package Tema4.Funciones.EjercicioGestionNotas.model;

public class Alumno {

    private String nombre, apellido, dni;
    private int nota;

    public Alumno(String nombre, String apellido,String dni, int nota) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.nota = nota;
    }

    public Alumno(String nombre, String apellido, String dni) {
        this(nombre,apellido,dni,0);
        // nota = 0
    }

    public void mostrarDatos() {
        System.out.println("nombre = " + nombre);
        System.out.println("apellido = " + apellido);
        System.out.println("dni = " + dni);
        System.out.println("nota = " + nota);
    }

    public void calcularMedia() {
        double media = (double) (nota*3+nota*4) / 2;
        System.out.println("media = " + media);
    }

    public int sumar(int p1, int p2) {
        return p1 + p2;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
}

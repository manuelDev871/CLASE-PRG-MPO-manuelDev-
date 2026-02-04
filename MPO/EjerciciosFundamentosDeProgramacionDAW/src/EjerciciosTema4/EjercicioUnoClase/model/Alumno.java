package EjerciciosTema4.EjercicioUnoClase.model;

public class Alumno {

    private String nombre, apellido, dni;
    private int nota;

    public Alumno(){}

    public Alumno(String nombre, String apellido, String dni, int nota) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.nota = nota;
    }

    public Alumno(String nombre,String apellido, String dni) {
        this(nombre,apellido,dni,-1);

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

    public int getNota() {
        return nota;
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

    public void setNota(int nota) {
        this.nota = nota;
    }

    public void mostrarDatos() {
        System.out.println("nombre = " + nombre);
        System.out.println("apellido = " + apellido);
        System.out.println("dni = " + dni);
        System.out.println("nota = " + nota);
    }
}

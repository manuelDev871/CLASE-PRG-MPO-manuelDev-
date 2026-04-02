package model;

public class Usuario {

    private String nombre;
    private String apellido;
    private String dni;
    private String correo;
    private String password;
    public Usuario() {}
    public Usuario(String nombre, String apellido, String dni, String correo, String password) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.correo = correo;
        this.password = password;
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

    public String getCorreo() {
        return correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido + " - DNI: " + dni + " - Email: " + correo;
    }
}

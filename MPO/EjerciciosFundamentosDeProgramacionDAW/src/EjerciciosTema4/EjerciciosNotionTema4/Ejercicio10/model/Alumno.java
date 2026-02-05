package EjerciciosTema4.EjerciciosNotionTema4.Ejercicio10.model;

public class Alumno {

    private String nombre;
    private double notaTeoria, notaPractica;

    public Alumno() {}

    public Alumno(String nombre, double notaTeoria, double notaPractica) {
        this.nombre = nombre;
        this.notaTeoria = notaTeoria;
        this.notaPractica = notaPractica;
    }

    public String getNombre() {
        return nombre;
    }

    public double getNotaTeoria() {
        return notaTeoria;
    }

    public double getNotaPractica() {
        return notaPractica;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNotaTeoria(double notaTeoria) {
        this.notaTeoria = notaTeoria;
    }

    public void setNotaPractica(double notaPractica) {
        this.notaPractica = notaPractica;
    }
}

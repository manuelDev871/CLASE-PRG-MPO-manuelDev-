package Tema5.ProgramacionOrientadaObjetos.GestorEscolarPOO.model;

public class Asignatura {

    // Atributos
    private int id;
    private double calificacion;

    // Constructor por defecto -> Queda enmascarado cuando escribo explicitamente un constructor

    public Asignatura(int id) {
        this.id = id;
    }

    public Asignatura() {} // -> Constructor vacio

    public void mostrarDatos() {
        System.out.println("Mostrando los datos de la asignatura requerida:");
        System.out.println("id: " + id);
        System.out.println("calificacion: " + calificacion);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
}

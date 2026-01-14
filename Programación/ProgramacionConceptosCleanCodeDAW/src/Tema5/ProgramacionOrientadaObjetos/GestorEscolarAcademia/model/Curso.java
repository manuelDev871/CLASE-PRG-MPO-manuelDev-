package Tema5.ProgramacionOrientadaObjetos.GestorEscolarAcademia.model;

public class Curso {

    private int id;
    private double nota;

    public Curso() {} // CONTRUCTOR VACIO

    public Curso(int id) { // Constructor que recibe el id
        this.id = id;
    }

    // Getters
    public int getId() {
        return id;
    }

    public double getNota() {
        return nota;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}

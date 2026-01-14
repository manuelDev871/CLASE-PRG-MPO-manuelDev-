package Tema5.ProgramacionOrientadaObjetos.GestorEscolarAcademia.model;

public class Estudiante {

    private Curso curso1, curso2, curso3;

    public Estudiante(){} // CONSTRUCTOR VACIO

    public Estudiante(int idCurso1, int idCurso2, int idCurso3) {
        this.curso1 = new Curso(idCurso1);
        this.curso2 = new Curso(idCurso2);
        this.curso3 = new Curso(idCurso3);
    }

    // Getters
    public Curso getCurso1() {
        return curso1;
    }

    public Curso getCurso2() {
        return curso2;
    }

    public Curso getCurso3() {
        return curso3;
    }

    // Setters
    public void setCurso1(Curso curso1) {
        this.curso1 = curso1;
    }

    public void setCurso2(Curso curso2) {
        this.curso2 = curso2;
    }

    public void setCurso3(Curso curso3) {
        this.curso3 = curso3;
    }
}

package Tema5.ProgramacionOrientadaObjetos.GestorColegioHerencia.model;

public final class Alumno extends Persona {

    private int numeroMatricula, cursoMatriculado;

    public Alumno() {}

    public Alumno(String nombre, String apellido, int numeroMatricula) {
        super(nombre, apellido);
        this.numeroMatricula = numeroMatricula;
    }
    public Alumno(String nombre, String apellido, int numeroMatricula, int cursoMatriculado) {
        super(nombre, apellido);
        this.numeroMatricula = numeroMatricula;
        this.cursoMatriculado = cursoMatriculado;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public int getCursoMatriculado() {
        return cursoMatriculado;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public void setCursoMatriculado(int cursoMatriculado) {
        this.cursoMatriculado = cursoMatriculado;
    }

    @Override
    public void saludar() {
        System.out.println("Soy alumno y saludo asi");
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Número Matricula: " + numeroMatricula);
        System.out.println("Curso Matriculado: " + cursoMatriculado);
    }

    public void realizarExamen() {
        System.out.println("Voy a realizar un examen");
        int nota = (int) (Math.random()*11);
        System.out.println("La nota del examen ha sido " + nota);
    }
}

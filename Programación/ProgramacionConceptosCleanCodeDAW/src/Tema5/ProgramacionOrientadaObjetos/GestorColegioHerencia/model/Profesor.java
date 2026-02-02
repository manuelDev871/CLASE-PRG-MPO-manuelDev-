package Tema5.ProgramacionOrientadaObjetos.GestorColegioHerencia.model;

public abstract class Profesor extends Persona{

    private int salario, nHoras;

    public Profesor() {}

    public Profesor(String nombre, String apellido, int salario) {
        super(nombre, apellido);
        this.salario = salario;
    }

    public Profesor(String nombre, String apellido, int salario, int nHoras) {
        super(nombre, apellido);
        this.salario = salario;
        this.nHoras = nHoras;
    }

    public int getSalario() {
        return salario;
    }

    public int getnHoras() {
        return nHoras;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public void setnHoras(int nHoras) {
        this.nHoras = nHoras;
    }

    @Override
    public void saludar() {
        System.out.println("Soy profesor y vamos a impartir la clase");
    }

    public void corregirExamen() {
        System.out.println("Empezando la tarea");
        System.out.println("Vamos a corregir el examen");
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Salario: " + salario + " €");
        System.out.println("Numero de Horas: " + nHoras);
    }
}

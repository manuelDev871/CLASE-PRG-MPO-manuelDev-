package EjerciciosTema5.EjerciciosHerencia.Ejercicio3.model;

public class Estudiante extends Persona {

    private int curso;

    public Estudiante(String nombre, int edad, int curso) {
        super(nombre, edad);
        this.curso = curso;
    }

    @Override
    public void presentarse() {
        super.presentarse();
    }

    public void estudiar() {
        System.out.println("Estoy estudiando " + curso + "º de DAM");
    }
}

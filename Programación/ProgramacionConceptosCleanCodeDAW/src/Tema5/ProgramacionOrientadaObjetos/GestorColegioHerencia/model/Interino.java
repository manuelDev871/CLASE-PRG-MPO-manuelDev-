package Tema5.ProgramacionOrientadaObjetos.GestorColegioHerencia.model;

public class Interino extends Profesor {

    private int aniosExperiencia;

    public Interino() {}

    public Interino(String nombre, String apellido, int salario) {
        super(nombre, apellido, salario);
        // aniosExperiencia = 0
    }

    public Interino(String nombre, String apellido, int salario, int aniosExperiencia) {
        super(nombre, apellido, salario);
        this.aniosExperiencia = aniosExperiencia;
    }

    public Interino(String nombre, String apellido, int salario, int nHoras, int aniosExperiencia) {
        super(nombre, apellido, salario, nHoras);
        this.aniosExperiencia = aniosExperiencia;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    @Override
    public void saludar() {
        super.saludar();
        if (aniosExperiencia > 0) {
            System.out.println("Solo tengo unos pocos años de experiencia");
        } else {
            System.out.println("Soy novato");
        }

        System.out.println("Vamos a ver que tal se da la clase");
    }

    public void realizarOposicion() {
        System.out.println("Vamos a realizar el examen de oposicion para la plaza fija");
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Años Experiencia: " + aniosExperiencia);
    }
}

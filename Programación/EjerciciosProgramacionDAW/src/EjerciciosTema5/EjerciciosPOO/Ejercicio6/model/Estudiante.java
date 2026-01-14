package EjerciciosTema5.EjerciciosPOO.Ejercicio6.model;

public class Estudiante {

    private String nombre;
    private int edad;
    private double nota;

    public Estudiante() {} // -> CONSTRUCTOR VACIO

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.nota = 0;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public double getNota() {
        return this.nota;
    }

    public void setNota(double nota) {
        System.out.print("Asignando nota " + nota + ": ");

        if ((nota >= 0) && (nota <= 10)) {
            this.nota = nota;
            System.out.println("Correcto");
        } else {
            System.out.println("Error - La nota debe estar entre 0 y 10");
        }
    }
}

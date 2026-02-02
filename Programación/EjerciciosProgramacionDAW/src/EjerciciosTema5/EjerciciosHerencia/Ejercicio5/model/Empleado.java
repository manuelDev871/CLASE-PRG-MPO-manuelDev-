package EjerciciosTema5.EjerciciosHerencia.Ejercicio5.model;

public class Empleado {

    private String nombre;
    private double salarioBase;
    private String puesto;

    public Empleado(String nombre, double salarioBase, String puesto) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
        this.puesto = puesto;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void mostrarDatos() {
        System.out.println("Empleado: " + nombre);
        System.out.println("Puesto: " + puesto);
        System.out.println("Salario base: " + salarioBase + "€");
    }
}

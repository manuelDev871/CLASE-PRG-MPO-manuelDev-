package EjerciciosTema5.EjerciciosHerencia.Ejercicio5.model;

public class Gerente extends Empleado {

    private double bonus;

    public Gerente(String nombre, double salarioBase, String puesto, double bonus) {
        super(nombre, salarioBase, puesto);
        this.bonus = bonus;
    }

    public double calcularSalarioTotal() {
        return getSalarioBase() + bonus;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Bonus: " + bonus + "€");
        System.out.println("Salario total: " + calcularSalarioTotal() + "€");
    }
}

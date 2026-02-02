package EjerciciosTema5.EjerciciosHerencia.Ejercicio5.model;

public class Desarrollador extends Empleado {

    private String lenguajePrincipal;

    public Desarrollador(String nombre, double salarioBase, String puesto, String lenguajePrincipal) {
        super(nombre, salarioBase, puesto);
        this.lenguajePrincipal = lenguajePrincipal;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Lenguaje principal: " + lenguajePrincipal);
    }
}

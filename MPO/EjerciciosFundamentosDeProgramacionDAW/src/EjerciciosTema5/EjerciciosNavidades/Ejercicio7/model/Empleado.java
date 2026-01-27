package EjerciciosTema5.EjerciciosNavidades.Ejercicio7.model;

public class Empleado {

    private String nombre, dni;
    private double salarioBase;
    private int horasExtras;

    public Empleado() {
        this.horasExtras = 0;
    }

    public Empleado(String nombre, String dni, double salarioBase) {
        this.nombre = nombre;
        this.dni = dni;
        this.salarioBase = salarioBase;
        this.horasExtras = 0;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public int getHorasExtras() {

        return horasExtras;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

    public void agregarHorasExtras(int horas) {
        horasExtras += horas;
    }

    public double calcularSalarioTotal() {
        return (horasExtras * 20) + salarioBase;
    }

    public void aplicarAumento(double porcentaje) {
        double aumento = (salarioBase * porcentaje) / 100;
        this.salarioBase = salarioBase + aumento;
    }

    public void resetearHorasExtras() {
        this.horasExtras = 0;
    }

    public void mostrarInforme() {
        System.out.println("Nombre = " + nombre);
        System.out.println("Dni = " + dni);
        System.out.println("Salario Base = " + salarioBase);
        System.out.println("Horas extras = " + horasExtras);
        System.out.println("Salario total = " + calcularSalarioTotal());
    }
}

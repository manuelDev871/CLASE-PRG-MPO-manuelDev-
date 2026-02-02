package EjerciciosTema5.EjerciciosHerencia.Ejercicio4.model;

public class Cuadrado extends Figura{

    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public void calcularArea() {
        double area = (lado * lado);
        System.out.printf("Area: %.2f \n", area);
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Cuadrado con lado: " + lado);
    }
}

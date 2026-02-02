package EjerciciosTema5.EjerciciosHerencia.Ejercicio4.model;

public class Circulo extends Figura {

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public void calcularArea() {
        double area = Math.PI * (radio * radio);
        System.out.printf("Area: %.2f \n", area);
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Circulo con radio: " + radio);
    }
}

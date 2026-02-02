package EjerciciosTema5.EjerciciosHerencia.Ejercicio2.model;

public class Coche extends Vehiculo {

    private int numeroPuertas;

    public Coche(String marca, String modelo, int numeroPuertas) {
        super(marca, modelo);
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Coche: " + getMarca() + " " + getModelo() + ", " + numeroPuertas + " puertas");
    }
}

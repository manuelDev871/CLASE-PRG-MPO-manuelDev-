package EjerciciosTema5.EjerciciosHerencia.Ejercicio1.model;

public class Perro extends Animal {

    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " hace: Guau guau");
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
    }
}

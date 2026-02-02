package EjerciciosTema5.EjerciciosHerencia.Ejercicio1.model;

public class Gato extends Animal {

    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " hace: Miau miau");
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
    }
}

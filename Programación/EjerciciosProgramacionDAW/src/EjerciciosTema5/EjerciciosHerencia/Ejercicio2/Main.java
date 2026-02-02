package EjerciciosTema5.EjerciciosHerencia.Ejercicio2;

import EjerciciosTema5.EjerciciosHerencia.Ejercicio2.model.Coche;
import EjerciciosTema5.EjerciciosHerencia.Ejercicio2.model.Vehiculo;

public class Main {

    /*
        Crea una clase Vehiculo con atributos marca y modelo.
        Crea una clase Coche que herede de Vehiculo y añada
        el atributo numeroPuertas. Implementa constructores en
        ambas clases usando super(). Crea varios objetos y muestra su información.
     */

    public static void main(String[] args) {

        Vehiculo vehiculo = new Vehiculo("Toyota", "Corolla");
        vehiculo.mostrarDatos();

        Coche coche1 = new Coche("Ford", "Focus", 5);
        Coche coche2 = new Coche("Seat", "Ibiza", 3);

        coche1.mostrarDatos();
        coche2.mostrarDatos();
    }
}

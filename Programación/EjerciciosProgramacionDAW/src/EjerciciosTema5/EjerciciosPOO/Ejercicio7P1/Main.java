package EjerciciosTema5.EjerciciosPOO.Ejercicio7P1;

import EjerciciosTema5.EjerciciosPOO.Ejercicio7P1.model.Cliente;
import EjerciciosTema5.EjerciciosPOO.Ejercicio7P1.model.Direccion;

public class Main {

    public static void main(String[] args) {

        Direccion direccion = new Direccion("Calle Mayor 15", "Madrid", 28001);

        Cliente cliente = new Cliente("Carlos Ruiz", "carlos.ruiz@email.com", direccion);

        cliente.mostrarDatos();
    }
}

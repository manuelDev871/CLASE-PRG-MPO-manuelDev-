package EjerciciosTema5.EjerciciosHerencia.Ejercicio1;

import EjerciciosTema5.EjerciciosHerencia.Ejercicio1.model.Gato;
import EjerciciosTema5.EjerciciosHerencia.Ejercicio1.model.Perro;

public class Main {

    /*
        Crea una clase Animal con atributos nombre y edad,
        y un metodo hacerSonido(). Luego crea dos clases hijas:
        Perro y Gato que hereden de Animal. Sobrescribe el metodo
        hacerSonido() en cada clase hija para que muestre el sonido
        correspondiente. Crea objetos de cada tipo y prueba los métodos.
     */

    public static void main(String[] args) {

        Perro perro = new Perro("Bache", 5);
        perro.mostrarDatos();
        perro.hacerSonido();
        System.out.println();

        Gato gato = new Gato("Mishi", 3);
        gato.mostrarDatos();
        gato.hacerSonido();
    }
}

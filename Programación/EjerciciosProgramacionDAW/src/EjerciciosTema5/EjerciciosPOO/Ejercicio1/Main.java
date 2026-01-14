package EjerciciosTema5.EjerciciosPOO.Ejercicio1;

import EjerciciosTema5.EjerciciosPOO.Ejercicio1.model.Persona;

public class Main {

    /*
        Crea una clase llamada Persona con dos atributos: nombre y edad.
        Define un constructor que inicialice estos atributos.
        En el metodo main, crea un objeto de tipo Persona y muestra sus datos.
     */

    public static void main(String[] args) {

        Persona persona = new Persona("Manuel", 24);
        persona.mostrarDatos();
    }
}

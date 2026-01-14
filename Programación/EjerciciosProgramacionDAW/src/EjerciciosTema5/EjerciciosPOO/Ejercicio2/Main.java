package EjerciciosTema5.EjerciciosPOO.Ejercicio2;

import EjerciciosTema5.EjerciciosPOO.Ejercicio2.model.Persona;

public class Main {

    /*
        Amplía la clase Persona del ejercicio anterior añadiendo métodos getter y setter
        para los atributos nombre y edad. Crea un objeto, modifica sus valores usando
        los setters y muestra los datos usando los getters.
     */

    public static void main(String[] args) {

        Persona persona = new Persona("Manuel",24);
        System.out.println("Mi nombre es " + persona.getNombre() + " y tengo " + persona.getEdad() + " años");

        persona.setNombre("Natalia"); // -> cambio mi nombre usando set
        persona.setEdad(22); // -> cambio mi edad usando set
        System.out.println("Mi nombre es " + persona.getNombre() + " y tengo " + persona.getEdad() + " años");
    }
}

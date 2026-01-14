package EjerciciosTema5.EjerciciosPOO.Ejercicio6;

import EjerciciosTema5.EjerciciosPOO.Ejercicio6.model.Estudiante;

public class Main {

    /*
        Crea una clase Estudiante con atributos privados nombre, edad y nota.
        La nota debe estar entre 0 y 10. Implementa el setter de nota validando
        que esté en el rango correcto (si no lo está, muestra un mensaje de error).
        Crea un objeto y prueba con diferentes valores.
     */

    public static void main(String[] args) {

        Estudiante estudiante = new Estudiante("Laura Fernández", 24);
        System.out.println("Estudiante: " + estudiante.getNombre() + ". Edad: " + estudiante.getEdad());

        estudiante.setNota(8.5);
        System.out.println("Nota actual: " + estudiante.getNota());

        estudiante.setNota(12);
        System.out.println("Nota actual: " + estudiante.getNota());

        estudiante.setNota(-3);
        System.out.println("Nota actual: " + estudiante.getNota());
    }
}

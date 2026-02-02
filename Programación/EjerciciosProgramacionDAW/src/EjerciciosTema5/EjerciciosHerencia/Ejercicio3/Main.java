package EjerciciosTema5.EjerciciosHerencia.Ejercicio3;

import EjerciciosTema5.EjerciciosHerencia.Ejercicio3.model.Estudiante;

public class Main {

    /*
        Crea una clase Persona con atributos nombre y edad, y un metodo presentarse().
        Crea una clase Estudiante que herede de Persona y añada el atributo curso.
        Añade un metodo estudiar() en la clase Estudiante. Crea objetos y prueba todos los métodos.
     */

    public static void main(String[] args) {

        Estudiante estudiante1 = new Estudiante("Laura",20, 2);
        Estudiante estudiante2 = new Estudiante("Carlos",19, 1);

        estudiante1.presentarse();
        estudiante1.estudiar();

        System.out.println();

        estudiante2.presentarse();
        estudiante2.estudiar();
    }
}


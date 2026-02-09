package EjerciciosTema6.EjerciciosExcepciones.Ejercicio4;

import EjerciciosTema6.EjerciciosExcepciones.Ejercicio4.model.Validaciones;
import EjerciciosTema6.EjerciciosExcepciones.Ejercicio4.utils.EdadInvalidaException;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Validaciones validaciones = new Validaciones();

        System.out.print("Introduce tu edad: ");
        int edad = scanner.nextInt();

        try {
            validaciones.validarEdad(edad);
        } catch (EdadInvalidaException e) {
            System.out.println(e.getMessage());
        }
    }
}

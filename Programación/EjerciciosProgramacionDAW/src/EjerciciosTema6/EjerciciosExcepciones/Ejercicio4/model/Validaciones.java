package EjerciciosTema6.EjerciciosExcepciones.Ejercicio4.model;

import EjerciciosTema6.EjerciciosExcepciones.Ejercicio4.utils.EdadInvalidaException;

public class Validaciones {

    public void validarEdad(int edad) throws EdadInvalidaException {

        if (edad < 0) {
            throw new EdadInvalidaException("Error: La edad no puede ser negativa");
        } else if (edad > 120) {
            throw new EdadInvalidaException("Error: La edad no puede ser mayor de 120");
        }

        System.out.println("Edad válida: " + edad + " años");
    }
}

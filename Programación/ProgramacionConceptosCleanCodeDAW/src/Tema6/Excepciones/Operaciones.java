package Tema6.Excepciones;

import Tema6.Excepciones.utils.ResultadoException;

public class Operaciones {

    public void operar(int op1, int op2) throws ArithmeticException, RuntimeException {
        int suma = op1 + op2;
        int multiplicacion = op1 * op2;
        int division = op1 / op2;
        int resta = 0;

        if (op2 > op1) {
            throw new ResultadoException("El sistema detecta una resta negativa " + (op1 - op2));
        }
        resta = op1 - op2;

                // = op1 - op2;
        // En caso de tener una resta negativa, quiero un fallo
            // La solucion será poner la resta = 0

        System.out.println("Los resultados son: ");
        System.out.println("Suma: " + suma);
        System.out.println("Multiplicacion: " + multiplicacion);
        System.out.println("Division: " + division);
        System.out.println("Resta: " + resta);
    }
}

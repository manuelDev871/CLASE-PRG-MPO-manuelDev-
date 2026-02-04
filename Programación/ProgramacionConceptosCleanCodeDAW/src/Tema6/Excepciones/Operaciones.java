package Tema6.Excepciones;

public class Operaciones {

    public void sumar(int op1, int op2) throws ArithmeticException {
        int suma = op1 + op2;
        int multiplicacion = op1 * op2;
        int division = op1 / op2;

        System.out.println("Los resultados son: ");
        System.out.println("Suma: " + suma);
        System.out.println("Multiplicacion: " + multiplicacion);
        System.out.println("Division: " + division);
    }
}

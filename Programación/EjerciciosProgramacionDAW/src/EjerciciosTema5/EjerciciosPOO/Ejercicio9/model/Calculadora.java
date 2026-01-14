package EjerciciosTema5.EjerciciosPOO.Ejercicio9.model;

public class Calculadora {

    public static void suma(int numeroUno, int numeroDos) {
        int suma = numeroUno + numeroDos;
        System.out.println("Suma: " + numeroUno + " + " + numeroDos + " = " + suma);
    }

    public static void resta(int numeroUno, int numeroDos) {
        int resta = numeroUno - numeroDos;
        System.out.println("Resta: " + numeroUno + " - " + numeroDos + " = " + resta);
    }

    public static void multiplicacion(int numeroUno, int numeroDos) {
        int multiplicacion = numeroUno * numeroDos;
        System.out.println("Multiplicación: " + numeroUno + " * " + numeroDos + " = " + multiplicacion);
    }

    public static void division(int numeroUno, int numeroDos) {

        if (numeroDos == 0) {
            System.out.println("Operación errónea, no se puede dividir entre 0");
        } else {
            double division = (double) numeroUno / numeroDos;
            System.out.println("División: " + numeroUno + " / " + numeroDos + " = " + division);
        }
    }

    public static void potencia(int numeroUno, int numeroDos) {
        double potencia = Math.pow(numeroUno,numeroDos);
        System.out.println("Potencia: " + numeroUno + "^" + numeroDos + " = " + potencia);
    }
}

package EjerciciosTema5.EjerciciosPOO.Ejercicio9;

import EjerciciosTema5.EjerciciosPOO.Ejercicio9.model.Calculadora;

public class Main {

    /*
        Crea una clase Calculadora con métodos estáticos para sumar,
        restar, multiplicar y dividir dos números. Añade también un
        metodo estático potencia(base, exponente). Usa estos métodos sin crear objetos de la clase.
     */

    public static void main(String[] args) {

        Calculadora.suma(10,5);
        Calculadora.resta(10,5);
        Calculadora.multiplicacion(10,5);
        Calculadora.division(10, 5);
        Calculadora.potencia(2,3);
    }
}

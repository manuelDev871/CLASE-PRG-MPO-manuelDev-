/* Ejercicio Nº 6 : Escribe un programa que declare dos variables numéricas,
   realice las operaciones básicas (suma, resta, multiplicación y división) y muestre los resultados por consola. */

public class Ejercicio6_Tema_1 {

    public static void main (String[] args) {

        int num1 = 50;
        int num2 = 5;

        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        int division = num1 / num2;

        System.out.println("El resultado de la suma es " + suma);
        System.out.println("El resultado de la resta es " + resta);
        System.out.println("El resultado de la multiplicacion es " + multiplicacion);
        System.out.println("El resultado de la division es " + division);
    }
}

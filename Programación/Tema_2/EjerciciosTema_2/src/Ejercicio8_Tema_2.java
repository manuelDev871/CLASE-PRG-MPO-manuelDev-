/* Desarrolla un programa que pida tres números al usuario y calcule: la suma de los tres,
   el promedio, el resultado de multiplicar el primero por el segundo y dividirlo entre el tercero.
   Usa paréntesis para controlar la precedencia de operadores. */


import java.util.Scanner;

public class Ejercicio8_Tema_2 {

    public static void main(String[] args) {

        // 1 -> Solicitar datos.

        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("Introduce el primer valor");
        double numeroUno = entradaTeclado.nextDouble();

        System.out.println("Introduce el segundo valor");
        double numeroDos = entradaTeclado.nextDouble();

        System.out.println("Introduce el tercer valor");
        double numeroTres = entradaTeclado.nextDouble();

        // 2 -> Realizar operaciones.

        double suma = numeroUno + numeroDos + numeroTres;
        double promedio = (numeroUno + numeroDos + numeroTres) / 3;
        double multiplicar = (numeroUno * numeroDos) / numeroTres;

        // 3 -> Mostrar los resultados.

        System.out.printf("El resultado de la suma es %.2f \n", suma);
        System.out.printf("El promedio es %.2f \n", promedio);
        System.out.printf("El resultado de (%.2f * %.2f) / %.2f es %.2f", numeroUno, numeroDos, numeroTres, multiplicar);

        entradaTeclado.close();
    }
}
/*Crea un programa que pida al usuario dos números enteros por consola y muestre el resultado de las cinco
  operaciones aritméticas básicas: suma, resta, multiplicación, división y módulo (resto). */

import java.util.Scanner;

public class Ejercicio1_Tema_2 {

    public static void main(String[] args) {

        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("Introduce un primer valor");
        double numeroUno = entradaTeclado.nextDouble();

        System.out.println("Introduce un segundo valor");
        double numeroDos = entradaTeclado.nextDouble();

        float division = (float) (numeroUno /  numeroDos);

        System.out.println("El resultado de la suma es " + (numeroUno + numeroDos));
        System.out.println("El resultado de la resta es " + (numeroUno - numeroDos));
        System.out.println("El resultado de la multiplicación es " + (numeroUno * numeroDos));
        System.out.printf("El resultado de la división es %.2f \n", division);
        System.out.println("El resultado del módulo (Resto) es " + (numeroUno % numeroDos));

        entradaTeclado.close();
    }
}

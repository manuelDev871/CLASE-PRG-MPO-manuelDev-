/*Escribe un programa que pida dos números al usuario y muestre el resultado de todas las comparaciones
  relacionales entre ellos (mayor que, menor que, igual, diferente, mayor o igual, menor o igual).*/

import java.util.Scanner;

public class Ejercicio2_Tema_2 {

    public static void main(String[] args) {

        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("Introduce un primer valor");
        int numeroUno = entradaTeclado.nextInt();

        System.out.println("Introduce un segundo valor");
        int numeroDos = entradaTeclado.nextInt();

        boolean mayorQue = numeroUno > numeroDos;
        System.out.println("¿Es " + numeroUno + " mayor que " + numeroDos + " ?: " + mayorQue);

        boolean menorQue = numeroUno < numeroDos;
        System.out.println("¿Es " + numeroUno + " menor que " + numeroDos + " ?: " + menorQue);

        boolean igual = numeroUno == numeroDos;
        System.out.println("¿Es " + numeroUno + " igual a " + numeroDos + " ?: " + igual);

        boolean diferente = numeroUno != numeroDos;
        System.out.println("¿Es " + numeroUno + " diferente de " + numeroDos + " ?: " + diferente);

        boolean mayorIgual = numeroUno >= numeroDos;
        System.out.println("¿Es " + numeroUno + " mayor o igual que " + numeroDos + " ?: " + mayorIgual);

        boolean menorIgual = numeroUno <= numeroDos;
        System.out.println("¿Es " + numeroUno + " menor o igual que " + numeroDos + " ?: " + menorIgual);

        entradaTeclado.close();
    }
}

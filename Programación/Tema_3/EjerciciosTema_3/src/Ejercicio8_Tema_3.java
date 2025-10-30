/*  Desarrolla un programa que pida dos números al usuario y determine cuál es mayor, o si son iguales.
    Muestra el resultado por consola. */


import java.util.Scanner;

public class Ejercicio8_Tema_3 {

    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner(System.in);
        System.out.println("Introduce un primer número");
        int num1 = entradaTeclado.nextInt();
        System.out.println("Introduce un segundo número");
        int num2 = entradaTeclado.nextInt();

        if (num1 > num2 ) {
            System.out.println("El numero uno es mayor que numero dos");
        } else if (num1 == num2) {
            System.out.println("El numero uno es igual al numero dos");
        } else {
            System.out.println("Numero uno es mas pequeño que numero dos");
        }

        entradaTeclado.close();
    }
}

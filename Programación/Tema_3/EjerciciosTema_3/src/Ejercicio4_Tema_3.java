/*  Crea un programa que pida el importe de una compra. Si el importe es mayor o igual a 100€,
    aplica un descuento del 10%. Muestra el importe original y el importe final a pagar. */

import java.util.Scanner;

public class Ejercicio4_Tema_3 {

    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner(System.in);
        System.out.println("Introduce el importe de la compra");
        double importe = entradaTeclado.nextDouble();

        if (importe >= 100) {
            System.out.println("El importe inicial es de " + importe + " €");
            double descuentoInicial = importe * 0.10;
            double descuentoFinal = importe - descuentoInicial;
            System.out.println("El importe final es de " + descuentoFinal + " €");
        } else {
            System.out.println("El importe final es de " + importe + " €");
            System.out.println("No se le aplica descuento");
        }

        entradaTeclado.close();
    }
}
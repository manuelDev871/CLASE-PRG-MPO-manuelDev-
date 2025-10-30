/*  Desarrolla un programa que pida el importe de una compra y si el cliente es socio (true/false).
    Aplica descuentos según estas reglas: Si es socio Y la compra es mayor o igual a 200€, descuento del 20%.
    Si es socio Y la compra es menor de 200€, descuento del 10%. Si NO es socio pero la compra es mayor o igual a 300€,
    descuento del 5%. En cualquier otro caso, no hay descuento. Muestra el importe original, el descuento aplicado y el importe final. */


import java.util.Scanner;

public class Ejercicio11_Tema_3 {
    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("Introduce el importe de la compra");
        double importe = entradaTeclado.nextDouble();

        System.out.println("¿Eres socio? : (true / false)");
        boolean socio = entradaTeclado.nextBoolean();

        double descuento;
        double importeFinal;

        if ((socio) && (importe >= 200)) {
            descuento = importe * 0.2;
            importeFinal = importe - descuento;
            System.out.println("El importe original es de " + importe + " €");
            System.out.println("El total a pagar es de " + importeFinal + " €");
            System.out.println("El descuento aplicado es de " + descuento + " €");
        } else if ((socio) && (importe < 200)) {
            descuento = importe * 0.1;
            importeFinal = importe - descuento;
            System.out.println("El importe original es de " + importe + " €");
            System.out.println("El total a pagar es de " + importeFinal + " €");
            System.out.println("El descuento aplicado es de " + descuento + " €");
        } else if ((socio == false) && (importe >= 300)) {
            descuento = importe * 0.05;
            importeFinal = importe - descuento;
            System.out.println("El importe original es de " + importe + " €");
            System.out.println("El total a pagar es de " + importeFinal + " €");
            System.out.println("El descuento aplicado es de " + descuento + " €");
        } else {
            System.out.println("El total a pagar es de " + importe + " €");
            System.out.println("No se le ha aplicado ningún descuento");
        }

        entradaTeclado.close();
    }
}

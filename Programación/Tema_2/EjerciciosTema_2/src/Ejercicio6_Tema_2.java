/* Escribe un programa que pida el precio de un producto y el porcentaje de descuento.
   Calcula el precio final después del descuento usando operadores aritméticos y
   muestra todos los pasos del cálculo. */

import java.util.Scanner;

public class Ejercicio6_Tema_2 {

    public static void main(String[] args) {

        // 1 -> Pedir datos al usuario.

        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("Introduce el precio total del producto");
        double precioTotal = entradaTeclado.nextDouble();

        System.out.println("Introduce el % de descuento del producto");
        int descuento = entradaTeclado.nextInt();

        // 2 -> Hacer las diferentes operaciones.

            // Ejemplo: tenemos un producto de 80 €. Un 20% de descuento.
            // Operacion: (% * 100) / Precio total  = 16 €
            // Precio final = precio inicial 80 - operacion 16 =  64 €.

        double operacionInicial = (precioTotal * descuento) / 100;
        double operacionFinal = precioTotal - operacionInicial;

        // 3 -> Mostar la información.

        System.out.printf("Precio original: %.2f €%n", precioTotal);
        System.out.printf("Descuento (%d%%) %.2f € \n", descuento, operacionInicial);
        System.out.printf("Precio final: %.2f €%n", operacionFinal);

        entradaTeclado.close();
    }
}
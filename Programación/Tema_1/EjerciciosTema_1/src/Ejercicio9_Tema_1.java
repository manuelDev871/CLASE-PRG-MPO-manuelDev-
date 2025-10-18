/* Ejercicio Nº 9 : Escribe un programa que almacene la información de un producto (nombre, precio, código y disponibilidad)
   y muestre estos datos formateados por consola. */

import java.util.Scanner;

public class Ejercicio9_Tema_1 {

    public static void main (String[] args) {

        Scanner ejercicio9 = new Scanner(System.in);
        System.out.println("Nombre del producto");
        String nombreProdcuto = ejercicio9.nextLine();

        System.out.println("Precio del producto");
        float precio = ejercicio9.nextFloat();
        ejercicio9.nextLine();

        System.out.println("Código del producto");
        String codigo = ejercicio9.nextLine();

        System.out.println("¿Está disponible el producto?");
        boolean disponibilidad = ejercicio9.nextBoolean();

        System.out.println("------------------------");
        System.out.println("INFORMACIÓN DEL PRODUCTO");
        System.out.println("------------------------");

        System.out.println("Nombre: " + nombreProdcuto);
        System.out.println("Precio: " + precio + " €");
        System.out.println("Código: " + codigo);
        System.out.println("Disponibilidad: " + disponibilidad);
    }
}

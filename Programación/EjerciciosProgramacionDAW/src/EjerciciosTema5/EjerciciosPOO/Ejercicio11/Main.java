package EjerciciosTema5.EjerciciosPOO.Ejercicio11;

import EjerciciosTema5.EjerciciosPOO.Ejercicio11.model.*;

public class Main {

    /*
        Crea un sistema de tienda online con las clases:

            Producto (codigo, nombre, precio, stock),
            Cliente (nombre, email, carrito) y
            Carrito (lista de productos, cantidades).

        Implementa métodos para añadir productos al carrito, eliminarlos, calcular el total y finalizar la compra
        (actualizando el stock). Simula una compra completa.
     */

    public static void main(String[] args) {

        Producto p1 = new Producto("P01", "Portátil", 899.99, 10);
        Producto p2 = new Producto("P02", "Ratón", 25.50, 20);
        Producto p3 = new Producto("P03", "Teclado", 45.99, 15);

        Cliente cliente = new Cliente("Ana Martínez", "ana@email.com");

        System.out.println("--- TIENDA ONLINE ---");
        System.out.println("Cliente: " + cliente.getNombre() + " (" + cliente.getEmail() + ")");

        cliente.getCarrito().agregarProducto(p1, 1);
        cliente.getCarrito().agregarProducto(p2, 2);
        cliente.getCarrito().agregarProducto(p3, 1);

        cliente.getCarrito().mostrarCarrito();

        cliente.getCarrito().eliminarProducto("P02");

        cliente.getCarrito().mostrarCarrito();

        System.out.println("\nFinalizando compra...");
        cliente.getCarrito().finalizarCompra();
    }
}

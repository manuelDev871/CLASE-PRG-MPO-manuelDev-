package EjerciciosTema5.EjerciciosNavidades.Ejercicio4;

import EjerciciosTema5.EjerciciosNavidades.Ejercicio4.model.Producto;

public class Main {

    /*
        Objetivo: Crear una clase `Producto` para gestionar el inventario de una tienda.

        Requisitos:

        1. Crear una clase `Producto` con atributos: `codigo` (String), `nombre` (String), `precio` (double), `stock` (int).
        2. Crear constructor con todos los parámetros.
        3. Crear getters y setters.
        4. Crear metodo `boolean hayStock()` que devuelva `true` si el stock es mayor que 0.
        5. Crear metodo `boolean vender(int cantidad)` que reduzca el stock si hay suficiente. Devuelve `true` si la venta es exitosa.
        6. Crear metodo `void reabastecer(int cantidad)` que añada unidades al stock.
        7. Crear metodo `double calcularValorInventario()` que devuelva el valor total del stock (precio × stock).
        8. Crear metodo `void mostrarInfo()` con formato: "Código: XXX, Nombre: XXX, Precio: XXX€, Stock: XXX, Valor total: XXX€"
        9. En el `main`, crear varios productos y simular ventas y reabastecimientos.
     */

    public static void main(String[] args) {

        Producto ordenador = new Producto("123-A", "Asus", 998.99, 0);
        Producto monitor = new Producto("E123-GPRO", "Koorui", 159.99, 10);
        Producto mouse = new Producto("LOGI-GPRO", "Logitech", 99.99, 0);

        System.out.println(ordenador.getNombre() + " -> ¿Hay stock?: " + ordenador.hayStock());
        System.out.println(monitor.getNombre() + " -> ¿Hay stock?: " + monitor.hayStock());
        System.out.println(mouse.getNombre() + " -> ¿Hay stock?: " + mouse.hayStock());

        System.out.println();

        System.out.println(ordenador.vender(1));
        System.out.println(monitor.vender(5));
        System.out.println(mouse.vender(1));

        System.out.println();

        ordenador.mostrarInfo();
        monitor.mostrarInfo();
        mouse.mostrarInfo();

        System.out.println();

        System.out.print(mouse.getNombre() + ": ");
        mouse.reabastecer(5);

        System.out.print(ordenador.getNombre() + ": ");
        ordenador.reabastecer(1);

        mouse.mostrarInfo();
        ordenador.mostrarInfo();

        System.out.println();

        System.out.println("El valor total del inventario de " + ordenador.getNombre() + " es de " + ordenador.calcularValorInventario() + " €");
        System.out.println("El valor total del inventario de " + monitor.getNombre() + " es de " + monitor.calcularValorInventario() + " €");
        System.out.println("El valor total del inventario de " + mouse.getNombre() + " es de " + mouse.calcularValorInventario() + " €");
    }
}

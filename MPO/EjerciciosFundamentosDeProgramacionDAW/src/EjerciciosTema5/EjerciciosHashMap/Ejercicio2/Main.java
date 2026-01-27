package EjerciciosTema5.EjerciciosHashMap.Ejercicio2;

import EjerciciosTema5.EjerciciosHashMap.Ejercicio2.model.InventarioProductos;

public class Main {

    /*
        Objetivo: Crear un sistema de inventario que gestione productos usando un HashMap donde la clave sea el código del producto y el valor sea la cantidad en stock.

        Requisitos:

        1. Crear un `HashMap&lt;String, Integer&gt;` para almacenar productos (código como clave, cantidad como valor).
        2. Crear metodo `void agregarProducto(String codigo, int cantidad)` que añada un producto o incremente su cantidad si ya existe.
        3. Crear metodo `boolean venderProducto(String codigo, int cantidad)` que reduzca la cantidad si hay suficiente stock.
        4. Crear metodo `Integer consultarStock(String codigo)` que devuelva la cantidad disponible o `null` si no existe.
        5. Crear metodo `void listarInventario()` que muestre todos los productos y sus cantidades.
        6. Crear metodo `void listarProductosBajoStock(int minimo)` que muestre productos con stock menor al mínimo especificado.
        7. Crear metodo `int calcularStockTotal()` que sume todas las cantidades del inventario.
        8. Crear metodo `String productoConMasStock()` que devuelva el código del producto con mayor cantidad.
        9. En el `main`, crear un inventario, realizar operaciones de entrada, venta y consultas.
     */

    public static void main(String[] args) {

        InventarioProductos inventario = new InventarioProductos();

        System.out.println("Sistema de inventario");
        System.out.println("=====================");

        System.out.println("Agregando productos...");
        // Entrada de productos
        inventario.agregarProducto("P001", 50);
        inventario.agregarProducto("P002", 20);
        inventario.agregarProducto("P003", 5);
        inventario.agregarProducto("P001", 10); // suma stock

        // Listar inventario
        inventario.listarInventario();

        System.out.println("Stock total: " + inventario.obtenerStockTotal());

        // Venta de productos
        System.out.println("\nVenta P002 (10): " +
                inventario.venderProducto("P002", 10));

        System.out.println("Venta P003 (10): " +
                inventario.venderProducto("P003", 10));

        // Consultar stock
        System.out.println("\nStock de P001: " +
                inventario.consultarStock("P001"));

        System.out.println("Stock de P999: " +
                inventario.consultarStock("P999"));

        // Productos bajo stock
        inventario.listarProductosBajoStock(15);

        // Stock total
        System.out.println("\nStock total: " +
                inventario.calcularStockTotal());

        // Producto con más stock
        System.out.println("Producto con más stock: " +
                inventario.productoConMasStock());
    }
}


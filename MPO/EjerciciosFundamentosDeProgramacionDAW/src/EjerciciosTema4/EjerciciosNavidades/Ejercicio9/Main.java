package EjerciciosTema4.EjerciciosNavidades.Ejercicio9;

import EjerciciosTema4.EjerciciosNavidades.Ejercicio9.model.Producto;
import EjerciciosTema4.EjerciciosNavidades.Ejercicio9.controller.Tienda;

public class Main {

    /*
        Objetivo: Crear una clase `Tienda` que gestione un inventario de productos usando la clase `Producto` del ejercicio anterior.

        Requisitos:

        1. Usar la clase `Producto` del Ejercicio 4.
        2. Crear una clase `Tienda` con atributos: `nombre` (String), `productos` (array de Producto), `numProductos` (int).
        3. Crear constructor que inicialice el nombre y cree un array de productos con capacidad para 50 productos.
        4. Crear metodo `boolean agregarProducto(Producto producto)` que añada un producto al array si hay espacio.
        5. Crear metodo `Producto buscarProducto(String codigo)` que busque y devuelva un producto por su código (o `null` si no existe).
        6. Crear metodo `void listarProductos()` que muestre todos los productos del inventario.
        7. Crear metodo `double calcularValorTotalInventario()` que sume el valor de todos los productos.
        8. Crear metodo `void listarProductosSinStock()` que muestre solo los productos sin stock.
        9. En el `main`, crear una tienda, añadir varios productos y probar todos los métodos.
     */

    public static void main(String[] args) {

        Tienda superLaCarretera = new Tienda("Super La Carretera");

        Producto patatas = new Producto("123","Papas Bravas", 2.99, 10);
        Producto panini = new Producto("123", "Paninisss", 1.99, 12);
        Producto cocaCola = new Producto("123-A123", "Coca Cola", 0.99, 20);
        Producto sinStock = new Producto("999", "Agua", 1.20, 0);

        // Añadir productos
        System.out.println("Añadiendo productos...");
        System.out.println("Patatas añadidas: " + superLaCarretera.agregarProducto(patatas));
        System.out.println("Panini añadido: " + superLaCarretera.agregarProducto(panini));
        System.out.println("CocaCola añadida: " + superLaCarretera.agregarProducto(cocaCola));
        System.out.println("Agua añadida: " + superLaCarretera.agregarProducto(sinStock));

        System.out.println("\n--- LISTADO DE PRODUCTOS ---");
        superLaCarretera.listarProductos();

        // Buscar productos
        System.out.println("\n--- BUSCAR PRODUCTO ---");
        Producto buscado = superLaCarretera.buscarProducto("123-A123");
        if (buscado != null) {
            System.out.print("Producto encontrado: ");
            buscado.mostrarInfo();
        } else {
            System.out.println("Producto no encontrado");
        }

        // Valor total inventario
        System.out.println("\n--- VALOR TOTAL DEL INVENTARIO ---");
        System.out.printf("Valor total: %.2f €\n", superLaCarretera.calcularValorTotalInventario());

        // Productos sin stock
        System.out.println("\n--- PRODUCTOS SIN STOCK ---");
        superLaCarretera.listarProductosSinStock();
    }
}

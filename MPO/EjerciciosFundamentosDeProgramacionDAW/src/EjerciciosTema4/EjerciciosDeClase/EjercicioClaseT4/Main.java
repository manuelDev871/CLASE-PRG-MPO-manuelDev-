package EjerciciosTema4.EjerciciosDeClase.EjercicioClaseT4;

import EjerciciosTema4.EjerciciosDeClase.EjercicioClaseT4.controller.GestorProductos;
import EjerciciosTema4.EjerciciosDeClase.EjercicioClaseT4.model.Producto;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        GestorProductos gestor = new GestorProductos();

        gestor.agregarProducto(new Producto("Portátil", "Informática", "P01", 800));
        gestor.agregarProducto(new Producto("Ratón", "Informática", "P02"));
        gestor.agregarProducto(new Producto("Teclado", "Informática", "P03", 40));
        gestor.agregarProducto(new Producto("Monitor", "Pantallas", "P04"));

        // Buscar con ifPresent
        gestor.buscarPorCodigo("P01")
                .ifPresent(Producto::mostrarDatos);

        // Buscar con ifPresentOrElse
        gestor.buscarPorCodigo("P10")
                .ifPresentOrElse(
                        Producto::mostrarDatos,
                        () -> gestor.agregarProducto(
                                new Producto("Nuevo", "Otros", "P10", 25))
                );

        // Asignar precios y ordenar
        gestor.asignarPrecios();
        gestor.ordenarPorPrecioDesc();

        System.out.println("\n--- Productos ordenados por precio ---");
        gestor.mostrarProductos();

        // Probar BiPredicate
        System.out.println("\n--- Productos con precio > 50 ---");
        List<Producto> caros = gestor.getProductosPorCondicion(
                (p, limite) -> p.getPrecio() > limite, 50.0);

        caros.forEach(Producto::mostrarDatos);

        System.out.println("Precio medio: " + gestor.calcularPrecioMedio() + " €");
        System.out.println("Numero de producto mas caros de 500 €: " + gestor.getNumeroProductosCaros(500));
    }
}

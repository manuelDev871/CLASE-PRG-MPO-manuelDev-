package EjerciciosTema4.EjerciciosDeClase.EjercicioClaseT4.controller;

import EjerciciosTema4.EjerciciosDeClase.EjercicioClaseT4.model.Producto;

import java.util.*;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

public class GestorProductos {

    private List<Producto> productos = new ArrayList<>();

    // 1. Agregar producto si el código no existe
    public void agregarProducto(Producto p) {
        boolean existe = productos.stream()
                .anyMatch(prod -> prod.getCodigo().equals(p.getCodigo()));

        if (!existe) {
            productos.add(p);
        }
    }

    // 2. Asignar precios aleatorios a productos sin precio
    public void asignarPrecios() {
        Random r = new Random();
        productos.stream()
                .filter(p -> p.getPrecio() < 0)
                .forEach(p -> p.setPrecio(r.nextInt(100) + 1));
    }

    // 3. Mostrar productos
    public void mostrarProductos() {
        productos.forEach(Producto::mostrarDatos);
    }

    // 4. Precio medio
    public double calcularPrecioMedio() {
        return productos.stream()
                .mapToDouble(Producto::getPrecio)
                .average()
                .orElse(0);
    }

    // 5. Número de productos caros
    public long getNumeroProductosCaros(double limite) {
        return productos.stream()
                .filter(p -> p.getPrecio() >= limite)
                .count();
    }

    // 6. Lista de productos caros
    public List<Producto> getProductosCaros(double limite) {
        return productos.stream()
                .filter(p -> p.getPrecio() > limite)
                .collect(Collectors.toList());
    }

    // 7. Buscar por código
    public Optional<Producto> buscarPorCodigo(String codigo) {
        return productos.stream()
                .filter(p -> p.getCodigo().equals(codigo))
                .findFirst();
    }

    // 8. Ordenar por precio descendente
    public void ordenarPorPrecioDesc() {
        productos.sort(Comparator.comparingDouble(Producto::getPrecio).reversed());
    }

    // 9. Productos por condición
    public List<Producto> getProductosPorCondicion(
            BiPredicate<Producto, Double> condicion, double valor) {

        return productos.stream()
                .filter(p -> condicion.test(p, valor))
                .collect(Collectors.toList());
    }
}


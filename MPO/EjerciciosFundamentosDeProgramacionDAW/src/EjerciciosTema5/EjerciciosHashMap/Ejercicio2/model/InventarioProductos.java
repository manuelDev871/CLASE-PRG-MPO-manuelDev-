package EjerciciosTema5.EjerciciosHashMap.Ejercicio2.model;

import java.util.HashMap;
import java.util.Map;

public class InventarioProductos {

    // 1. HashMap: código → cantidad en stock
    private HashMap<String, Integer> productos;

    // Constructor
    public InventarioProductos() {
        productos = new HashMap<>();
    }

    // 2. Agregar producto o incrementar cantidad
    public void agregarProducto(String codigo, int cantidad) {
        if (productos.containsKey(codigo)) {
            int stockActual = productos.get(codigo);
            productos.put(codigo, stockActual + cantidad);
        } else {
            productos.put(codigo, cantidad);
        }
    }

    // 3. Stock total
    public int obtenerStockTotal() {
        int total = 0;
        for (int cantidad : productos.values()) {
            total += cantidad;
        }
        return total;
    }

    // 4. Vender producto (si hay stock suficiente)
    public boolean venderProducto(String codigo, int cantidad) {
        if (!productos.containsKey(codigo)) {
            return false;
        }

        int stockActual = productos.get(codigo);

        if (stockActual >= cantidad) {
            productos.put(codigo, stockActual - cantidad);
            return true;
        }

        return false;
    }

    // 5. Consultar stock
    public Integer consultarStock(String codigo) {
        return productos.get(codigo); // devuelve null si no existe
    }

    // 6. Listar inventario
    public void listarInventario() {
        if (productos.isEmpty()) {
            System.out.println("El inventario está vacío.");
            return;
        }

        System.out.println("Inventario:");
        productos.forEach((codigo, cantidad) ->
                System.out.println("Código: " + codigo + " | Stock: " + cantidad)
        );
    }

    // 7. Listar productos con bajo stock
    public void listarProductosBajoStock(int minimo) {
        System.out.println("Productos con stock menor a " + minimo + ":");

        for (Map.Entry<String, Integer> entry : productos.entrySet()) {
            if (entry.getValue() < minimo) {
                System.out.println("Código: " + entry.getKey()
                        + " | Stock: " + entry.getValue());
            }
        }
    }

    // 8. Calcular stock total
    public int calcularStockTotal() {
        int total = 0;

        for (int cantidad : productos.values()) {
            total += cantidad;
        }

        return total;
    }

    // 9. Producto con más stock
    public String productoConMasStock() {
        if (productos.isEmpty()) {
            return null;
        }

        String codigoMax = null;
        int maxStock = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> entry : productos.entrySet()) {
            if (entry.getValue() > maxStock) {
                maxStock = entry.getValue();
                codigoMax = entry.getKey();
            }
        }

        return codigoMax;
    }
}

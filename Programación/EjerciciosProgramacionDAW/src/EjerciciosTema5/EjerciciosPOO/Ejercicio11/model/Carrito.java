package EjerciciosTema5.EjerciciosPOO.Ejercicio11.model;

public class Carrito {

    Producto[] productos = new Producto[10];
    int[] cantidades = new int[10];
    int totalProductos = 0;

    public void agregarProducto(Producto p, int cantidad) {
        if (cantidad <= p.getStock()) {
            productos[totalProductos] = p;
            cantidades[totalProductos] = cantidad;
            totalProductos++;
            System.out.println("Añadiendo " + p.getNombre() + " x" + cantidad + " al carrito ✓");
        } else {
            System.out.println("No hay stock suficiente de " + p.getNombre());
        }
    }

    public void eliminarProducto(String codigo) {
        for (int i = 0; i < totalProductos; i++) {
            if (productos[i].getCodigo().equals(codigo)) {
                System.out.println("Eliminando " + productos[i].getNombre() + " del carrito ✓");

                for (int j = i; j < totalProductos - 1; j++) {
                    productos[j] = productos[j + 1];
                    cantidades[j] = cantidades[j + 1];
                }
                totalProductos--;
                return;
            }
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < totalProductos; i++) {
            total += productos[i].getPrecio() * cantidades[i];
        }
        return total;
    }

    public void mostrarCarrito() {
        System.out.println("\n--- CARRITO ---");
        for (int i = 0; i < totalProductos; i++) {
            System.out.println((i + 1) + ". " + productos[i].getNombre() + " x" +
                    cantidades[i] + " - " +
                    (productos[i].getPrecio() * cantidades[i]) + "€");
        }
        System.out.println("Total: " + calcularTotal() + "€");
    }

    public void finalizarCompra() {
        for (int i = 0; i < totalProductos; i++) {
            productos[i].reducirStock(cantidades[i]);
        }
        System.out.println("✓ Compra realizada");
        System.out.println("Stock actualizado");
    }
}


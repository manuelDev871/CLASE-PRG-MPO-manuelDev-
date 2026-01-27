package EjerciciosTema5.EjerciciosNavidades.Ejercicio9.controller;

import EjerciciosTema5.EjerciciosNavidades.Ejercicio9.model.Producto;

public class Tienda {

    private String nombre;
    private int numProductos;
    private Producto[] productos;

    public Tienda() {
        productos = new Producto[50];
    }

    public Tienda(String nombre) {
        this.nombre = nombre;
        this.productos = new Producto[50];
    }

    public boolean agregarProducto(Producto producto) {

        if (numProductos >= productos.length) {
            return false;
        }

        productos[numProductos] = producto;
        numProductos++;

        return true;
    }

    public Producto buscarProducto(String codigo) {

        for (int i = 0; i < numProductos; i++) {
            if (productos[i].getCodigo().equals(codigo)) {
                return productos[i];
            }
        }

        return null;
    }

    public void listarProductos() {

        for (int i = 0; i < numProductos; i++) {
            productos[i].mostrarInfo();
        }
    }

    public double calcularValorTotalInventario() {

        double sumaTotal = 0;

        for (int i = 0; i < numProductos; i++) {
            sumaTotal += productos[i].calcularValorInventario();
        }

        return sumaTotal;
    }

    public void listarProductosSinStock() {

        for (int i = 0; i < numProductos; i++) {
            if (productos[i].getStock() == 0) {
                productos[i].mostrarInfo();
            }
        }
    }




}

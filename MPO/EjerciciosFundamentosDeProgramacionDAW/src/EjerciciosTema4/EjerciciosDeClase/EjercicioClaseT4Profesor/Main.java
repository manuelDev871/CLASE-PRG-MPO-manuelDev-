package EjerciciosTema4.EjerciciosDeClase.EjercicioClaseT4Profesor;

import EjerciciosTema4.EjerciciosDeClase.EjercicioClaseT4Profesor.controller.Gestor;
import EjerciciosTema4.EjerciciosDeClase.EjercicioClaseT4Profesor.model.Categoria;
import EjerciciosTema4.EjerciciosDeClase.EjercicioClaseT4Profesor.model.Producto;

public class Main {

    public static void main(String[] args) {

        Gestor gestor = new Gestor();

        Producto producto1 = new Producto("Telefono", "001T", 300.0, Categoria.TECNOLOGIA);
        Producto producto2 = new Producto("Movil", "101T", 200.0, Categoria.TECNOLOGIA);
        Producto producto3 = new Producto("Zapatillas", "003NK_ZAP", 300.0, Categoria.ROPA);

        gestor.agregarProducto(producto1);
        gestor.agregarProducto(producto2);
        gestor.agregarProducto(producto3);

        /*
        System.out.println(gestor.calcularPrecioMedio());

        gestor.buscarPorCodigo("101T").ifPresentOrElse(Producto::mostrarDatos, () -> {
            // accion a realizar cunado el producto no este
        });

        gestor.getProductoPorCondicion((Producto producto, Double valor) -> producto.getPrecio() < valor, 10.0);
        gestor.getProductoPorCondicion((Producto producto, Double valor) -> producto.getPrecio() >= valor
                && producto.getCategoria() == Categoria.ALIMENTO, 10.0);
        */

        System.out.println(gestor.getEstadisticas());
        gestor.obtenerProductosAPI();
    }
}

package EjerciciosTema4.EjerciciosNotionTema4.Ejercicio7;

import EjerciciosTema4.EjerciciosNotionTema4.Ejercicio7.model.Producto;

import java.util.function.BiFunction;

public class Main {

    /*
        Ejercicio 7 - BiFunction con Objetos: Gestión de Productos

        Crea una clase Producto con nombre y precio. Implementa una BiFunction que reciba dos Productos y devuelva el producto con mayor precio. Pruébala con una lista de al menos 5 productos.
     */

    public static void main(String[] args) {

        BiFunction<Producto, Producto, Producto> productoMasCaro = (p1, p2) -> {
            if (p1.getPrecio() > p2.getPrecio()) {
                return p1;
            }
            return p2;
        };

        Producto p1 = new Producto("Portatil", 1999.99);
        Producto p2 = new Producto("Mouse", 300);

        System.out.println(productoMasCaro.apply(p1, p2));
    }
}

package EjerciciosTema4.EjerciciosDeClase.EjercicioClaseT4Profesor.controller;

import EjerciciosTema4.EjerciciosDeClase.EjercicioClaseT4Profesor.model.Producto;
import org.json.JSONObject;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.*;
import java.util.function.BiPredicate;

public class Gestor {

    private List<Producto> productos;

    public Gestor() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto p) {
        // recorrer - preguntar - bool
        // productos.stream().filter(); // retorna un stream
        boolean exite = productos.stream().anyMatch(item -> item.getCodigo()
                .equalsIgnoreCase(p.getCodigo())); // retorna un bool

        if(exite) {
            System.out.println("Codigo utilizado, puedes volver a intentarlos");
        } else {
            productos.add(p);
        }

        /*
        if (buscarPorCodigo(p.getCodigo()).isPresent()) {
            System.out.println("El codigo ya se utiliza");
        } else {
            productos.add(p);
            System.out.println("Prodcuto agregado correctamente");
        }
        */
    }

    public void asignarPrecios() {
        productos
                .stream()
                .filter(item -> item.getPrecio() < 0 )
                .forEach(item -> item.setPrecio((Math.random()*100) + 1));
    }

    public void mostrarDatos() {
        productos.forEach(Producto::mostrarDatos);
    }

    public double calcularPrecioMedio() {
        // return (productos.stream().mapToDouble(Producto::getPrecio).sum()/productos.size());
        return productos.stream()
                .mapToDouble(Producto::getPrecio)
                .average()
                .orElse(0.0);
    }

    public long getNumeroProductosCaros(int limite) {
        return productos.stream().filter(item -> item.getPrecio() >= limite).count();
    }

    public List<Producto> getProductosCaros(double limite) {
        return  productos.stream().filter(item -> item.getPrecio() >= limite).toList();
    }

    public Optional<Producto> buscarPorCodigo(String codigo) {
        return productos.stream()
                .filter(item -> item.getCodigo().equalsIgnoreCase(codigo))
                .findFirst();
    }

    public void ordenarPorPrecioDesc(){
        productos.sort(Comparator.comparingDouble(Producto::getPrecio).reversed());
    }

    public List<Producto> getProductoPorCondicion(BiPredicate<Producto,Double> condicion, double parametro) {
        return productos.stream()
                .filter(item -> condicion.test(item, parametro))
                .toList();
    }

    public DoubleSummaryStatistics getEstadisticas() {
        return productos.stream().mapToDouble(Producto::getPrecio)
                .summaryStatistics();
    }

    public void obtenerProductosAPI() {
        HttpClient client = null;

        try {
            String urlProductos = "https://dummyjson.com/products";
            // Abro el navegador
            client = HttpClient.newHttpClient();
            // Crea la peticion
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(urlProductos)).GET().build();
            // Lanza la peticion y espera una respuesta
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String body = response.body();
            JSONObject jsonObject = new JSONObject(body);
            JSONObject producto1 = jsonObject.getJSONArray("products").getJSONObject(0);
            System.out.println(producto1.getString("title"));
            System.out.println(body);
            System.out.println(response.statusCode());
        } catch (IOException e) {
            System.out.println("Error en de I/O");
        } catch (InterruptedException e) {
            System.out.println("Error en la conexion");
        } finally {
            try {
                client.close();
            } catch (Exception e) {
                System.out.println("Error en el cerradp");
            }
        }
    }
}

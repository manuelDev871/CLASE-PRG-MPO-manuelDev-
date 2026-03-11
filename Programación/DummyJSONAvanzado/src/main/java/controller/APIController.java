package controller;

import com.google.gson.Gson;
import model.Productos;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class APIController {

    private String urlBase = "https://dummyjson.com/products/";

    public void obtenerDatos(int id) {

        try {

            Gson gson = new Gson();
            HttpClient client = HttpClient.newHttpClient();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(urlBase + id))
                    .GET()
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 200) {

                Productos producto = gson.fromJson(response.body(), Productos.class);

                System.out.printf("""
                        
                        ----- PRODUCTO -----
                        Title: %s
                        Description: %s
                        Category: %s
                        
                        """,
                        producto.getTitle(),
                        producto.getDescription(),
                        producto.getCategory());

            } else {

                System.out.println("❌ El producto con ese ID no existe.\n");

            }

        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
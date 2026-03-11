package controller;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class APIController {

    private String urlBase = "https://dummyjson.com/products?limit=5";

    public void obtenerDatos() {
        try {

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(urlBase)).GET().build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            JSONObject objectDatos = new JSONObject(response.body());
            JSONArray arrayDatos = objectDatos.getJSONArray("products");

            for (int i = 0; i < arrayDatos.length(); i++) {

                JSONObject datosProduct = arrayDatos.getJSONObject(i);

                int idProduct = datosProduct.getInt("id");
                String titleProduct = datosProduct.getString("title");
                double priceProduct = datosProduct.getDouble("price");

                System.out.printf("%s - %s - %.2f \n", idProduct, titleProduct, priceProduct);

            }



        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

package controller;

import model.Libro;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

public class APIController {

    private final String URL_LIBROS = "https://stephen-king-api.onrender.com/api/books";
    private final String URL_LIBRO = "https://stephen-king-api.onrender.com/api/book/";

    public List<Libro> obtenerLibros() {

        List<Libro> listaLibros = new ArrayList<>();

        try {

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(URL_LIBROS)).GET().build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            JSONObject json = new JSONObject(response.body());
            JSONArray arrayLibros = json.getJSONArray("data");

            for (int i = 0; i < arrayLibros.length(); i++) {

                JSONObject objLibro = arrayLibros.getJSONObject(i);

                int id = objLibro.getInt("id");
                String title = objLibro.getString("Title");

                // En caso de no existir algún campo...
                String author = objLibro.optString("author", "Stephen King");
                String year = objLibro.optString("Year", "N/A");
                String publisher = objLibro.optString("publisher", "N/A");

                Libro libro = new Libro(id, title, author, year, publisher);

                listaLibros.add(libro);
            }

        } catch (IOException | InterruptedException e) {
            System.out.println("Error al conectar con la API: " + e.getMessage());
        }

        return listaLibros;
    }

    public Libro obtenerLibroPorId(int idBuscado) {

        try {

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(URL_LIBRO + idBuscado)).GET().build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            JSONObject json = new JSONObject(response.body());

            if (!json.has("data")) {
                System.out.println("Libro no encontrado en la API");
                return null;
            }

            JSONObject objLibro = json.getJSONObject("data");

            int id = objLibro.getInt("id");
            String title = objLibro.getString("Title");
            String author = objLibro.optString("author", "Stephen King");
            String year = objLibro.optString("Year", "N/A");
            String publisher = objLibro.optString("publisher", "N/A");

            return new Libro(id, title, author, year, publisher);

        } catch (IOException | InterruptedException e) {
            System.out.println("Error al conectar con la API: " + e.getMessage());
            return null;
        }
    }
}
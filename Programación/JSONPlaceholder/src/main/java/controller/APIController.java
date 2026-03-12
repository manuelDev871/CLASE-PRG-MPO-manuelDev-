package controller;

import org.json.JSONObject;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class APIController {

    private String urlPost = "https://jsonplaceholder.typicode.com/posts/1";
    private String urlUser = "https://jsonplaceholder.typicode.com/users/";

    public void obtenerDatos() {

        try {

            HttpClient client = HttpClient.newHttpClient();

            // 1️⃣ Petición del post
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(urlPost))
                    .GET()
                    .build();

            HttpResponse<String> response =
                    client.send(request, HttpResponse.BodyHandlers.ofString());

            JSONObject post = new JSONObject(response.body());

            String title = post.getString("title");
            int userId = post.getInt("userId");

            // 2️⃣ Petición del usuario
            HttpRequest requestUser = HttpRequest.newBuilder()
                    .uri(URI.create(urlUser + userId))
                    .GET()
                    .build();

            HttpResponse<String> responseUser =
                    client.send(requestUser, HttpResponse.BodyHandlers.ofString());

            JSONObject user = new JSONObject(responseUser.body());

            String name = user.getString("name");
            String city = user.getJSONObject("address").getString("city");

            // 3️⃣ Mostrar resultados
            System.out.println("Titulo del post: " + title);
            System.out.println("Nombre del usuario: " + name);
            System.out.println("Ciudad del usuario: " + city);

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
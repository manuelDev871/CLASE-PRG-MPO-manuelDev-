package controller;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class APIController {

    private String urlBase = "https://randomuser.me/api/";

    public void obtenerDatos() {

        try {

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(urlBase))
                    .GET()
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            JSONObject objectDatos = new JSONObject(response.body());
            JSONArray arrayRandomUser = objectDatos.getJSONArray("results");

            for (int i = 0; i < arrayRandomUser.length(); i++) {

                JSONObject datosUser = arrayRandomUser.getJSONObject(i);

                JSONObject nameObj = datosUser.getJSONObject("name");
                JSONObject locationObj = datosUser.getJSONObject("location");

                String nombreCompleto =
                        nameObj.getString("title") + " " +
                                nameObj.getString("first") + " " +
                                nameObj.getString("last");

                String email = datosUser.getString("email");
                String country = locationObj.getString("country");

                System.out.printf("%s - %s - %s\n",
                        nombreCompleto,
                        email,
                        country);
            }

        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

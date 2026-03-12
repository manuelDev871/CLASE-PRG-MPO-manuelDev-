package controller;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class APIController {

    private String urlBase = "https://pokeapi.co/api/v2/pokemon/";

    public void obtenerDatos(String name) {

        try {

            HttpClient client = HttpClient.newHttpClient();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(urlBase + name))
                    .GET()
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            JSONObject info = new JSONObject(response.body());

            String nombre = info.getString("name");
            int height = info.getInt("height");
            int weight = info.getInt("weight");

            System.out.println("\n--- Información del Pokémon ---");
            System.out.println("Nombre: " + nombre);
            System.out.println("Altura: " + height);
            System.out.println("Peso: " + weight);

            System.out.println("\nPrimeros 3 stats:");

            JSONArray stats = info.getJSONArray("stats");

            for (int i = 0; i < 3; i++) {

                JSONObject statObj = stats.getJSONObject(i);

                int baseStat = statObj.getInt("base_stat");

                String statName = statObj
                        .getJSONObject("stat")
                        .getString("name");

                System.out.println(statName + " : " + baseStat);
            }

            System.out.println();

        } catch (IOException | InterruptedException e) {

            System.out.println("Error al conectar con la API");

        } catch (Exception e) {

            System.out.println("El Pokémon no existe.");
        }
    }
}

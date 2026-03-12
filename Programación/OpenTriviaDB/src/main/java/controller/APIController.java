package controller;

import com.google.gson.Gson;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class APIController {

    private String urlBase = "https://opentdb.com/api.php?amount=3&type=multiple";

    public void obtenerDatos() {

        try {

            Gson gson = new Gson();
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(urlBase)).GET().build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            JSONObject datos = new JSONObject(response.body());
            JSONArray lista = datos.getJSONArray("results");

            for (int i = 0; i < lista.length(); i++) {

                JSONObject pregunta = lista.getJSONObject(i);

                String categoria = pregunta.getString("category");
                String question = pregunta.getString("question");
                String respuestaCorrecta = pregunta.getString("correct_answer");

                System.out.println("Categoría: " + categoria);
                System.out.println("Pregunta: " + question);
                System.out.println("Respuesta correcta: " + respuestaCorrecta);
                System.out.println("-----------------------------");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

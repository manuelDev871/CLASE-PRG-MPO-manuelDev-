package EjerciciosTema5.EjerciciosHashMap.Ejercicio3.model;

import java.util.*;

public class Diccionario {

    // 1. HashMap para las traducciones
    private HashMap<String, String> traducciones;

    // Constructor
    public Diccionario() {
        traducciones = new HashMap<>();
    }

    // 2. Agregar o actualizar traducción
    public void agregarTraduccion(String espanol, String ingles) {
        traducciones.put(espanol.toLowerCase(), ingles.toLowerCase());
    }

    // 3. Traducir una palabra
    public String traducir(String palabra) {
        palabra = palabra.toLowerCase();
        if (traducciones.containsKey(palabra)) {
            return traducciones.get(palabra);
        }
        return "La traducción buscada no existe";
    }

    // 4. Agregar varias traducciones desde array bidimensional
    public void agregarVariasTraduciones(String[][] traduccionesArray) {
        for (String[] fila : traduccionesArray) {
            if (fila.length >= 2) {
                agregarTraduccion(fila[0], fila[1]);
            }
        }
    }

    // 5. Listar diccionario ordenado alfabéticamente
    public void listarDiccionario() {
        List<String> palabras = new ArrayList<>(traducciones.keySet());
        Collections.sort(palabras);

        for (String espanol : palabras) {
            System.out.println(espanol + " -> " + traducciones.get(espanol));
        }
    }

    // 6. Tamaño del diccionario
    public int tamanioDiccionario() {
        return traducciones.size();
    }

    // 7. Traducir frase completa
    public void traducirFrase(String frase) {
        String[] palabras = frase.toLowerCase().split(" ");
        StringBuilder resultado = new StringBuilder();

        for (String palabra : palabras) {
            if (traducciones.containsKey(palabra)) {
                resultado.append(traducciones.get(palabra));
            } else {
                resultado.append(palabra);
            }
            resultado.append(" ");
        }

        System.out.println(resultado.toString().trim());
    }
}

package EjerciciosTema5.EjerciciosHashMap.Ejercicio3;

import EjerciciosTema5.EjerciciosHashMap.Ejercicio3.model.Diccionario;

public class Main {

    /*
        /*
        Objetivo: Crear un diccionario bilingüe usando un HashMap para traducir palabras del español al inglés.

        Requisitos:

        1. Crear un `HashMap&lt;String, String&gt;` para almacenar traducciones (español como clave, inglés como valor).
        2. Crear metodo `void agregarTraduccion(String espanol, String ingles)` que añada o actualice una traducción.
        3. Crear metodo `String traducir(String palabra)` que devuelva la traducción o un mensaje si no existe.
        4. Crear metodo `void agregarVariasTraduciones(String[][] traducciones)` que permita añadir múltiples traducciones desde un array bidimensional.
        5. Crear metodo `void listarDiccionario()` que muestre todas las palabras y sus traducciones ordenadas alfabéticamente.
        6. Crear metodo `int tamanioDiccionario()` que devuelva el número de palabras en el diccionario.
        7. Crear metodo `void traducirFrase(String frase)` que traduzca palabra por palabra una frase completa.
        8. En el `main`, crear un diccionario, añadir palabras y probar traducciones de palabras y frases.
     */

    public static void main(String[] args) {

        Diccionario dic = new Diccionario();

        System.out.println("Diccionario Español-Inglés");
        System.out.println("==========================");

        System.out.println("Agregando traducciones...");

        String[][] traducciones = {
                {"hola", "hello"},
                {"casa", "house"},
                {"gato", "cat"},
                {"el", "the"},
                {"esta", "is"},
                {"en", "in"},
                {"la", "the"},
                {"perro", "dog"},
                {"rojo", "red"},
                {"verde", "green"}
        };

        dic.agregarVariasTraduciones(traducciones);

        System.out.println("Diccionario cargado con "
                + dic.tamanioDiccionario() + " palabras.\n");

        System.out.println("Traducción de \"hola\": " + dic.traducir("hola"));
        System.out.println("Traducción de \"casa\": " + dic.traducir("casa"));
        System.out.println("Traducción de \"gato\": " + dic.traducir("gato"));

        System.out.println("\nTraduciendo frase: \"el gato esta en la casa\"");
        System.out.print("Traducción: ");
        dic.traducirFrase("el gato esta en la casa");

        System.out.println("\nTotal de palabras en el diccionario: "
                + dic.tamanioDiccionario());
    }
}


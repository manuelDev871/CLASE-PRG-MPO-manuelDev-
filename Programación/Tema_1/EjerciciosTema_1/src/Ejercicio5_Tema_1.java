/* Ejercicio Nº 5 : Crea un programa que use constantes para almacenar información que no debe cambiar (
   como el valor de PI o el nombre de una aplicación) y variables para información que puede cambiar.
   Muestra todos los valores. */

public class Ejercicio5_Tema_1 {

    public static void main (String [] args) {

        final String nombreApp = "MiApp";
        final String version = "1.0.0";

        String usuario = "Laura";
        int level = 1;
        int puntuacion = 0;

        System.out.println("Aplicación: " + nombreApp);
        System.out.println("Versión final: " + version);
        System.out.println("El numero PI es: " + Math.PI);
        System.out.println("Usuario actual: " + usuario);
        System.out.println("Nivel actual: " + level);
        System.out.println("Puntuación actual: " + puntuacion);

        usuario = "Manuel";
        level = 5;
        puntuacion = 10;

        System.out.println("Usuario actualizado: " + usuario);
        System.out.println("Nivel actualizado: " + level);
        System.out.println("Puntuación actualizado: " + puntuacion);
    }
}

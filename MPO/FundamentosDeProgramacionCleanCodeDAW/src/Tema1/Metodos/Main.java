package Tema1.Metodos;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Mensaje inicial del programa
        System.out.println("Ejecución de métodos");


        // Llamada a métodos estáticos de la propia clase
        despedir();
        saludar("Borja");


        // Variables de ejemplo (no se usan, pero sirven para entender tipos de datos)
        int numero = 2;
        String nombre = "Borja";


        // Creación de un objeto de la clase Operaciones
        Operaciones operacionesMatematicas = new Operaciones();


        // Objeto Scanner para leer datos introducidos por el usuario
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el número que quieres validar");


        // Lectura de un número entero desde consola
        int numeroUsuario = scanner.nextInt();


        // Se valida el número usando un método de la clase Operaciones
        boolean esValido = operacionesMatematicas.validarNumero(numeroUsuario);


        // Se muestra el resultado de la validación
        System.out.println("El número es válido: " + esValido);


        // Se cierra el Scanner (buena práctica)
        scanner.close();
    }


    // Metodo que muestra un saludo personalizado
    public static void saludar(String data) {
        System.out.println("Hola " + data);
        System.out.println("Buenos días");
        System.out.println("Qué tal estás");
        System.out.println("Quieres un café");
        System.out.println("Este método se va a repetir en el saludo");
    }


    // Metodo que muestra mensajes de despedida
    public static void despedir() {
        System.out.println("Hasta luego");
        System.out.println("Por hoy ya hemos terminado");
        System.out.println("Vamos a cerrar la clase");
    }
}

package Ejercicio7;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la ruta del directorio: ");
        String ruta = scanner.nextLine();

        File directorio = new File(ruta);

        if (!directorio.exists() || !directorio.isDirectory()) {
            System.out.println("La ruta no corresponde a un directorio válido.");
            return;
        }

        File[] elementos = directorio.listFiles();

        if (elementos == null) {
            System.out.println("No se puede acceder al contenido del directorio.");
            return;
        }

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        System.out.println("\nContenido del directorio:\n");

        for (File elemento : elementos) {

            String tipo = elemento.isDirectory() ? "Directorio" : "Archivo";
            long tamaño = elemento.isFile() ? elemento.length() : 0;
            String fecha = formato.format(new Date(elemento.lastModified()));

            System.out.println("Nombre: " + elemento.getName());
            System.out.println("Tipo: " + tipo);
            System.out.println("Tamaño: " + tamaño + " bytes");
            System.out.println("Última modificación: " + fecha);
            System.out.println("-----------------------------");
        }

        scanner.close();
    }
}

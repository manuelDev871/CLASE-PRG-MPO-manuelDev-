package Ejercicio4;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la ruta del archivo: ");
        String ruta = scanner.nextLine();

        File archivo = new File(ruta);

        if (!archivo.exists()) {
            System.out.println("El archivo no existe.");
            return;
        }

        System.out.println("\n--- Información del archivo ---");
        System.out.println("Nombre: " + archivo.getName());
        System.out.println("Ruta absoluta: " + archivo.getAbsolutePath());
        System.out.println("Tamaño: " + archivo.length() + " bytes");

        Date fecha = new Date(archivo.lastModified());
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println("Última modificación: " + formato.format(fecha));

        System.out.println("¿Se puede leer?: " + archivo.canRead());
        System.out.println("¿Se puede escribir?: " + archivo.canWrite());
        System.out.println("¿Es ejecutable?: " + archivo.canExecute());

        System.out.println("¿Es oculto?: " + archivo.isHidden());
        System.out.println("¿Es archivo?: " + archivo.isFile());
        System.out.println("¿Es directorio?: " + archivo.isDirectory());

        scanner.close();
    }
}

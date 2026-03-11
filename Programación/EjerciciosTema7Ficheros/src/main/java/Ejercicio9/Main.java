package Ejercicio9;

import Ejercicio9.controller.Gestor;
import Ejercicio9.model.Usuario;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
            Crea una aplicación que permita gestionar una agenda de contactos.
            Para ello crea una clase Usuario que tenga las características:
            nombre, apellido, dni. Además de esta clase, crea un main que permita
            gestionar los usuarios, con las siguientes opciones:

                1. Agregar usuario: pedirá por consola todos los datos
                2. Listar usuarios: mostrará por consola todos los usuarios del sistema
                3. Exportar usuarios: guardará en un fichero .txt todos los usurios de la lista
         */

        Scanner scanner = new Scanner(System.in);
        Gestor gestor = new Gestor();

        System.out.println("---------------AGENDA DE CONTACTOS---------------");
        int opcion = 0;

        do {
            System.out.println("1. Agregar usuario");
            System.out.println("2. Listar usuarios");
            System.out.println("3. Exportar usuarios");
            System.out.println("4. Leer fichero Usuarios");
            System.out.println("5. Salir del programa");
            System.out.print("Indica que opción quieres realizar: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1 -> {
                    System.out.print("Introduce el nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Introduce el apellido: ");
                    String apellido = scanner.nextLine();
                    System.out.print("Introduce el DNI: ");
                    String dni = scanner.nextLine();

                    gestor.agregarUsuario(new Usuario(nombre,apellido,dni));
                }
                case 2 -> {
                    gestor.listarUsuarios();
                }
                case 3 -> {
                    gestor.exportarUsuarios();
                }
                case 4 -> {
                    gestor.leerFicheroUsuarios();
                }
                case 5 -> {
                    System.out.println("Saliendo del programa...");
                }
                default -> {
                    System.out.println("Opción no contemplada");
                }
            }

        } while (opcion != 5);

        scanner.close();
    }
}

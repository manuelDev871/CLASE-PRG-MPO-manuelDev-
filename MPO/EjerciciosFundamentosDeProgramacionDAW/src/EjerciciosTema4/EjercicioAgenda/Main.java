package EjerciciosTema4.EjercicioAgenda;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    /*
        Crear una agenda de personas gestionada por menú con operaciones básicas.

        Realizar una aplicación que gestione usuarios mediante arrays.
        Cada usuario: nombre (string), apellido (string), teléfono (int) y dni (string).

        Funcionalidad guiada por menú:

            Agregar persona: pedir nombre, apellido, teléfono y dni. Agregar a la lista

            Buscar persona: pedir un dni y sacar por pantalla todos los datos con el formato
            Nombre: XXX, Apellido: XXX, Teléfono: XXX

            Borrar persona: pedir un dni y eliminar de la lista

            Listar personas: listar todos los elementos con el formato Nombre: XXX, Apellido: XXX, Teléfono: XXX

            En todos los casos dar confirmación al usuario tanto del éxito como de la ejecución incorrecta de la opción
     */

        static Scanner scanner = new Scanner(System.in);

        // Creo el ArrayList static para tener acceso desde todos los metodos.
        static ArrayList <Object[]> listaAgenda = new ArrayList<>();

    public static void main(String[] args) {


        System.out.println("ENTRADA / SALIDA: ");

        int opcion;

        do {
            System.out.println();
            System.out.println("--- MENÚ AGENDA ---");
            System.out.println("1. Agregar persona");
            System.out.println("2. Buscar persona");
            System.out.println("3. Borrar persona");
            System.out.println("4. Listar personas");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> {
                    agregarPersona();
                }

                case 2 -> {
                    buscarPersona();
                }

                case 3 -> {
                    borrarPersona();
                }

                case 4 -> {
                    listarPersonas();
                }

                case 5 -> {
                    System.out.println("Saliendo del programa...");
                }

                default -> {
                    System.out.println("Opción no válida (1 - 5)");
                }
            }

        } while (opcion != 5);
    }

    public static void agregarPersona() {

        System.out.print("Introduce el nombre: ");
        String nombre = scanner.next();
        System.out.print("Introduce el apellido: ");
        String apellido = scanner.next();
        System.out.print("Introduce el teléfono: ");
        int telefono = scanner.nextInt();
        System.out.print("Introduce el DNI: ");
        String dni = scanner.next();

        boolean agregado = listaAgenda.add(new Object[]{nombre,apellido,telefono,dni});

        if (agregado) {
            System.out.println("Persona agregada correctamente");
        } else {
            System.out.println("No se pudo agregar la persona");
        }
    }

    public static void buscarPersona() {

        System.out.print("Introduce el DNI a buscar: ");
        String dniBuscado = scanner.next();
        boolean personaEncontrada = false;

        for (int i = 0; i < listaAgenda.size(); i++) {
            Object[] contacto = listaAgenda.get(i);

            if (contacto[3].equals(dniBuscado)) {
                System.out.println("Imprimiendo datos de contacto");
                System.out.println("Nombre: " + contacto[0] + " Apellido: " + contacto[1] + " Teléfono: " + contacto[2] + " DNI: " + contacto[3]);
                personaEncontrada = true;
            }
        }

        if (!personaEncontrada) {
            System.out.println("Lo siento, el DNI introducido, no corresponde con ninguna persona de esta agenda");
        }
    }

    public static void borrarPersona() {

        System.out.print("Introduce el DNI de la persona que quieres eliminar de la agenda: ");
        String dniBorrar = scanner.next();
        boolean datosEliminados = false;

        for (int i = 0; i < listaAgenda.size(); i++) {
            Object[] contacto = listaAgenda.get(i);

            if (contacto[3].equals(dniBorrar)) {
                listaAgenda.remove(contacto);
                datosEliminados = true;
                break;
            }
        }

        if (!datosEliminados) {
            System.out.println("Lo siento, el DNI introducido, no corresponde con ninguna persona de esta agenda");
            System.out.println("PD: no se ha borrado ningún contacto");
        } else {
            System.out.println("Contacto eliminado correctamente");
        }
    }

    public static void listarPersonas() {

        if (listaAgenda.isEmpty()) {
            System.out.println("No hay ningún contacto en la agenda");
            return;
        }

        for (Object[] contacto : listaAgenda) {
            System.out.println("Imprimiendo datos de contacto");
            System.out.printf(
                    "\tNombre: %s  Apellido: %s  Teléfono: %d  DNI: %s%n",
                    contacto[0], contacto[1], (int) contacto[2], contacto[3]
            );
        }
    }
}

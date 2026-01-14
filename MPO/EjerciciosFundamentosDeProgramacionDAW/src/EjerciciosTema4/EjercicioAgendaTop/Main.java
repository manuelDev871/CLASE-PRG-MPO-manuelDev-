package EjerciciosTema4.EjercicioAgendaTop;

import EjerciciosTema4.EjercicioAgendaTop.controller.AgendaContactos;
import EjerciciosTema4.EjercicioAgendaTop.model.Contacto;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        AgendaContactos agendaContactos = new AgendaContactos();

        int opcion = 0;

        do {
            System.out.println("1. Agregar contacto");
            System.out.println("2. Buscar contacto");
            System.out.println("3. Borrar contacto");
            System.out.println("4. Listar contacto");
            System.out.println("5. Salir");
            System.out.print("Que opcion quieres hacer: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 ->{
                    System.out.print("Introduce el nombre: ");
                    String nombre = scanner.next();
                    System.out.print("Introduce el apellido: ");
                    String apellido = scanner.next();
                    System.out.print("Introduce el correo: ");
                    String correo = scanner.next();
                    System.out.print("Introduce el teléfono: ");
                    int telefono = scanner.nextInt();
                    System.out.print("Introduce el DNI: ");
                    String dni = scanner.next();
                    agendaContactos.agregarContacto(new Contacto(nombre, apellido, dni, telefono));
                }
                case 2 ->{
                    System.out.print("Introduce el DNI: ");
                    String dni = scanner.next();
                    agendaContactos.buscarContacto(dni);
                }
                case 3 ->{
                    System.out.print("Introduce el DNI: ");
                    String dni = scanner.next();
                    agendaContactos.borrarContacto(dni);
                }
                case 4 ->{
                    agendaContactos.listarContactos();
                }
                case 5 ->{
                    System.out.println("Salir");
                }
                default -> {
                    System.out.println("Opción no contemplada");
                }
            }
        } while (opcion != 5);
    }
}


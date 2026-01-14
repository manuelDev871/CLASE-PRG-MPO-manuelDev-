package Tema4.ClaseEjercicioAgenda;

import Tema4.ClaseEjercicioAgenda.controller.Agenda;

import java.util.Scanner;

public class MainAgenda {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        Agenda agenda = new Agenda();
        // listaContactos = [];

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
                    agenda.agregarContacto(new Object[]{nombre, apellido, correo, telefono, dni});
                }
                case 2 ->{
                    System.out.println("Dime el dni de la persona a buscar");
                    String dni = scanner.next();
                    agenda.buscarPersona(dni);
                }
                case 3 ->{
                    System.out.println("Dime el dni de la persona a borrar");
                    String dni = scanner.next();
                    agenda.borrarContacto(dni);
                }
                case 4 ->{
                    agenda.listarContactos();
                }
                case 5 ->{
                    System.out.println("Salir");
                }
                default -> {

                }
            }
        } while (opcion != 5);
    }
}

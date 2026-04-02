import controller.Sistema;
import model.Administrador;
import model.Trabajador;
import model.Usuario;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Sistema sistema = new Sistema();

        sistema.cargarUsuarios();

        System.out.println("=====================");
        System.out.println("     LOGIN SISTEMA   ");
        System.out.println("=====================");

        System.out.print("Correo: ");
        String correo = sc.nextLine();

        System.out.print("Password: ");
        String password = sc.nextLine();

        Usuario usuario = sistema.login(correo, password);

        if (usuario == null) {
            System.out.println("Credenciales incorrectas");
            return;
        }

        if (usuario instanceof Administrador) {

            int opcion;

            do {
                System.out.println("\n==============================");
                System.out.println("      PANEL ADMINISTRADOR");
                System.out.println("==============================");
                System.out.println("1. Alta trabajador");
                System.out.println("2. Baja trabajador");
                System.out.println("3. Ver trabajador");
                System.out.println("4. Listar trabajadores");
                System.out.println("5. Cambiar contraseña");
                System.out.println("6. Ver fichajes");
                System.out.println("0. Salir");
                System.out.println("==============================");
                System.out.print("Seleccione una opción: ");

                while (!sc.hasNextInt()) {
                    System.out.println("Introduce un número válido");
                    sc.next();
                }

                opcion = sc.nextInt();
                sc.nextLine();

                switch (opcion) {

                    case 1:
                        System.out.println("\n--- Alta trabajador ---");

                        System.out.print("Nombre: ");
                        String nombre = sc.nextLine();

                        System.out.print("Apellido: ");
                        String apellido = sc.nextLine();

                        System.out.print("DNI: ");
                        String dni = sc.nextLine();

                        if (sistema.buscarPorDni(dni) != null) {
                            System.out.println("Ya existe un usuario con ese DNI");
                            break;
                        }

                        System.out.print("Correo: ");
                        String correoNuevo = sc.nextLine();

                        System.out.print("Password: ");
                        String passNueva = sc.nextLine();

                        Trabajador t = new Trabajador(nombre, apellido, dni, correoNuevo, passNueva);
                        sistema.anhadirUsuario(t);
                        sistema.guardarUsuario(t);

                        System.out.println("Trabajador creado correctamente");
                        break;

                    case 2:
                        System.out.println("\n--- Baja trabajador ---");
                        System.out.print("DNI: ");
                        String dniEliminar = sc.nextLine();

                        if (sistema.buscarPorDni(dniEliminar) == null) {
                            System.out.println("Usuario no encontrado");
                        } else {
                            sistema.eliminarUsuario(dniEliminar);
                            System.out.println("Trabajador eliminado");
                        }
                        break;

                    case 3:
                        System.out.println("\n--- Ver trabajador ---");
                        System.out.print("DNI: ");
                        Usuario u = sistema.buscarPorDni(sc.nextLine());

                        if (u != null) {
                            System.out.println(u);
                        } else {
                            System.out.println(" Trabajador no encontrado");
                        }
                        break;

                    case 4:
                        System.out.println("\n--- Lista de trabajadores ---");
                        sistema.mostrarUsuarios();
                        break;

                    case 5:
                        System.out.println("\n--- Cambiar contraseña ---");
                        System.out.print("DNI: ");
                        Usuario user = sistema.buscarPorDni(sc.nextLine());

                        if (user != null) {
                            System.out.print("Nueva contraseña: ");
                            user.setPassword(sc.nextLine());
                            sistema.guardarTodosUsuarios();
                            System.out.println("Contraseña actualizada");
                        } else {
                            System.out.println("Usuario no encontrado");
                        }
                        break;

                    case 6:
                        System.out.println("\n--- Registros de fichaje ---");
                        sistema.verFichajes();
                        break;

                    case 0:
                        System.out.println("Saliendo del sistema...");
                        break;

                    default:
                        System.out.println("Opción no válida");
                }

            } while (opcion != 0);
        }

        else if (usuario instanceof Trabajador) {

            System.out.println("\n==============================");
            System.out.println("      PANEL TRABAJADOR");
            System.out.println("==============================");

            sistema.fichar(usuario.getCorreo());

            System.out.println("Fichaje realizado correctamente");
        }

        sc.close();
    }
}
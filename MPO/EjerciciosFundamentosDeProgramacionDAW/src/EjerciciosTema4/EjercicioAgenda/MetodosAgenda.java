package EjerciciosTema4.EjercicioAgenda;

import java.util.Scanner;

public class MetodosAgenda {

    /*
        Crear una agenda de personas gestionada por menú con operaciones básicas.

        Realizar una aplicación que gestione usuarios mediante arrays.
        Cada usuario: nombre (string), apellido (string), teléfono (int) y dni (string).
        Funcionalidad guiada por menú:

        1.  Agregar persona: pedir nombre, apellido, teléfono y dni. Agregar a la lista

        2.  Buscar persona: pedir un dni y sacar por pantalla todos los datos con el formato
            Nombre: XXX, Apellido: XXX, Teléfono: XXX

        3.  Borrar persona: pedir un dni y eliminar de la lista

        4.  Listar personas: listar todos los elementos con el formato Nombre: XXX, Apellido: XXX, Teléfono: XXX

        5.  En todos los casos dar confirmación al usuario tanto del éxito como de la ejecución incorrecta de la opción
     */

    Scanner sc = new Scanner(System.in);
    Object[] datos = new Object[4];

    public void agregarPersona() {
        System.out.println("--------------------------------------------------------");
        System.out.println("Complete el registro para agregar persona a su agenda");
        System.out.println("--------------------------------------------------------");

        System.out.println("Introduce los datos de la persona que desea agregar: ");
        System.out.print("1. Nombre: ");
        datos[0] = sc.nextLine();
        System.out.print("2. Apellidos: ");
        datos[1] = sc.nextLine();
        System.out.print("3. Telefono: ");
        datos[2] = sc.nextInt();
        System.out.print("4. DNI: ");
        datos[3] = sc.next();

        System.out.println("Datos agregados correctamente");
        System.out.println();
        System.out.println("Elige una nueva opción para realizar");
    }

    public void buscarPersona() {
        System.out.println("--------------------------------------------------------");
        System.out.println("Ha seleccionado la opción buscar persona en agenda");
        System.out.println("--------------------------------------------------------");

        System.out.print("Introduce el DNI de la persona que desea buscar: ");
        String dni = sc.next();

        for (int i = 0; i < datos.length; i++) {
            if (datos[3].equals(dni)) {
                System.out.println(datos[i]);
            } else {
                System.out.println("DNI no encontrado");
            }
        }
    }
}

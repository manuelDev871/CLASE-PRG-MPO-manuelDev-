package EjerciciosTema5.EjerciciosHashMap.Ejercicio1;

import EjerciciosTema5.EjerciciosHashMap.Ejercicio1.model.AgendaContactos;

public class Main {

    /*
        Objetivo: Crear un programa que gestione una agenda de contactos usando un HashMap donde la clave sea el nombre y el valor sea el número de teléfono.

        Requisitos:

        1. Crear un `HashMap&lt;String, String&gt;` para almacenar contactos (nombre como clave, teléfono como valor).
        2. Crear metodo `void agregarContacto(String nombre, String telefono)` que añada o actualice un contacto.
        3. Crear metodo `String buscarContacto(String nombre)` que devuelva el teléfono del contacto o un mensaje si no existe.
        4. Crear metodo `boolean eliminarContacto(String nombre)` que elimine un contacto si existe.
        5. Crear metodo `void listarContactos()` que muestre todos los contactos en la agenda.
        6. Crear metodo `int contarContactos()` que devuelva el número total de contactos.
        7. Crear metodo `boolean existeContacto(String nombre)` que verifique si un contacto existe.
        8. En el `main`, crear una agenda, añadir varios contactos, buscar, eliminar y listar.
     */

    public static void main(String[] args) {

        AgendaContactos agenda = new AgendaContactos();

        // Agregar contactos
        agenda.agregarContacto("Ana", "123456789");
        agenda.agregarContacto("Carlos", "987654321");
        agenda.agregarContacto("Luis", "555666777");

        // Buscar contactos
        System.out.println("Teléfono de Ana: " + agenda.buscarContacto("Ana"));
        System.out.println("Teléfono de Pedro: " + agenda.buscarContacto("Pedro"));

        // Verificar existencia
        System.out.println("¿Existe Carlos? " + agenda.existeContacto("Carlos"));

        // Eliminar contacto
        agenda.eliminarContacto("Luis");

        // Listar contactos
        agenda.listarContactos();

        // Contar contactos
        System.out.println("Total de contactos: " + agenda.contarContactos());
    }
}


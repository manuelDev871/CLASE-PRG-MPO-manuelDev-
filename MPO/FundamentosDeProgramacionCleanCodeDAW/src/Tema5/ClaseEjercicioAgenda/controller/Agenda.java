package Tema5.ClaseEjercicioAgenda.controller;

import java.util.ArrayList;

public class Agenda {

    // [nombre, apellido, telefono, correo] -> nunca se inicializa aqui
    private ArrayList <Object[]> listaContactos;

    // Este constructor hace que cuando cree esta lista de contactos, el valor inicial no sea null, sino 0
    public Agenda() {
        listaContactos = new ArrayList<>();
    }

    // AgregarContacto
    public void agregarContacto(Object[] contacto) {
        listaContactos.add(contacto);
        System.out.println("Agregado correctamente");
    }

    // BucarContacto
    public void buscarPersona(String dni) {
        if (listaContactos.isEmpty()) {
            System.out.println("No hay contactos en la agenda");
        }

        for (Object[] contacto : listaContactos) {
            if (contacto[4].equals(dni)) {
                System.out.println("Contacto encontrado");
                System.out.println("Nombre: " + contacto[0]);
                System.out.println("Telefono: " + contacto[3]);
                System.out.println("Correo: " + contacto[2]);
                return;
            }
        }
        System.out.println("Usuario no encontrado");
    }

    // BorrarContacto
    public void borrarContacto(String dni) {
        if (listaContactos.isEmpty()) {
            System.out.println("No hay nada que borrar");
        } else {
            /*

            boolean borrado = listaContactos.removeIf(new Predicate<Object[]>() {
                @Override
                public boolean test(Object[] objects) {
                    return objects[4].equals(dni);
                }
            });

            if (borrado) {
                System.out.println("Borrado correctamente");
            } else {
                System.out.println("Usuario no encontrado");
            }

            */  // -> Esto hace lo mismo que el forEach

            for (Object[] contacto : listaContactos) {
                if (contacto[4].equals(dni)) {
                    listaContactos.remove(contacto);
                    return;
                }
                System.out.println("Usuario no encontrado");
            }
        }
    }

    // ListarContactos
    public void listarContactos() {

        if (listaContactos.isEmpty()) {
            System.out.println("No hay ningun contacto para mostrar");
        }

        for (Object[] contacto : listaContactos) {
                System.out.println("Impriemdo contacto");
                System.out.println("\tNombre: " + contacto[0]);
                System.out.println("\tTelefono: " + contacto[3]);
                System.out.println("\tCorreo: " + contacto[2]);
        }
    }

    // Este metodo lo utilizamos para pedir informacion a la lista de contactos (get)
    public ArrayList<Object[]> getListaContactos() {
        return listaContactos;
    }
}

package EjerciciosTema5.EjercicioAgendaTop.controller;

import EjerciciosTema5.EjercicioAgendaTop.model.Contacto;

import java.util.ArrayList;

public class AgendaContactos {

    private ArrayList <Contacto> listaContactos; // Se inicializan en contadas ocasiones
    private int contador;

    public AgendaContactos() {
        this.listaContactos = new ArrayList<>();
        this.contador = 1;
    }

    public void agregarContacto(Contacto contacto) {

        if (estaContacto(contacto.getDni()) == null) {
            contacto.setId(contador); // -> cambio el id por contador inicializado a 1 que va en aumento por cada contacto agregado
            contador++;
            listaContactos.add(contacto);
        } else {
            System.out.println("Contacto duplicado, no se puede agregar");
        }
    }

    public void buscarContacto(String dni) {
        Contacto contacto = estaContacto(dni);
        if (contacto != null) {
            contacto.mostrarDatos();
        } else {
            System.out.println("El contacto no se ha encontrado");
        }
    }

    public void borrarContacto(String dni) {
        Contacto contacto = estaContacto(dni);
        if (contacto != null) {
            listaContactos.remove(contacto);
            System.out.println("Borrado correctamente");
        } else {
            System.out.println("El contacto no se ha encontrado");
        }
    }

    public void listarContactos() {

        if (listaContactos.isEmpty()) {
            System.out.println("No hay contactos para mostrar");
        }

        for (Contacto contacto : listaContactos) {
            contacto.mostrarDatos();
        }
    }

    private Contacto estaContacto(String dni) {
        // dni
        // listaContactos
        // for
        for (Contacto contacto : listaContactos) {
            if (contacto.getDni().equals(dni)) {
                return contacto;
            }
        }
        return null; // -> no ha encontrado el objeto contacto
    }
}

package EjerciciosTema5.EjerciciosHashMap.Ejercicio1.model;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class AgendaContactos {

    private HashMap<String,String> contactos;

    public AgendaContactos() {
        contactos = new HashMap<>();
    }

    public void agregarContacto(String nombre, String telefono) {
        contactos.put(nombre,telefono);
        System.out.println("Contacto agregado/actualizado correctamente");
    }

    public String buscarContacto(String nombre) {
        if (contactos.containsKey(nombre)) {
            System.out.println("Contacto encontrado");
            return contactos.get(nombre);
        }

        return "El contacto no existe";
    }

    public boolean eliminarContacto(String nombre) {
        if (contactos.containsKey(nombre)) {
            contactos.remove(nombre);
            System.out.println("Contacto eliminado correctamente");
            return true;
        }

        return false;
    }

    public void listarContactos() {
        for (String nombre : contactos.keySet()) {
            String telefono = contactos.get(nombre);
            System.out.println("Nombre: " + nombre + " | Teléfono: " + telefono);
        }
    }

    public int contarContactos() {
        return contactos.size();
    }

    public boolean existeContacto(String nombre) {
        return contactos.containsKey(nombre);
    }
}

package Tema5.HashMap.controller;

import Tema5.HashMap.model.Persona;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Agenda {

    private HashMap<String, Persona> listaPersonas;

    public Agenda() {
        listaPersonas = new HashMap<>();
    }

    public void agregarPersona(Persona persona) {
        // Cuando el dni no este en la lista ya existente -> recorro, busco y retorno true o false
        if (listaPersonas.containsKey(persona.getDni())) {
            System.out.println("La persona ya esta asociado, no puedes agregar");
        } else {
            listaPersonas.put(persona.getDni(),persona);
            System.out.println("Agregado correctamente");
        }
    }

    public void borrarPersona(String dni) {
        // recorremos, esta? , posicion -> borro
        if (listaPersonas.containsKey(dni)) {
            listaPersonas.remove(dni);
        } else {
            System.out.println("No esta en la lista");
        }
    }

    public Persona obtenerPersona(String dni) {
        // si el dni esta en la lista -> persona
        // si el dni no esta en la lista -> null
        return listaPersonas.get(dni);
    }

    public void modificarPersona(String dni, Persona persona) {
        listaPersonas.replace(dni, persona);
    }

    public void mostrarPersonas() {
// 1º Forma        // sacas las keys -> recorres -> cada key -> get -> valor
        Set<String> keys = listaPersonas.keySet();
        // dni1, dni2, dni3, dni4, dni5
        for (String item : keys) {
            Persona persona = listaPersonas.get(item);
            persona.mostrarDatos();
        }

// 2º Forma        // sacas los values -> recorres
        Collection<Persona> values = listaPersonas.values();
        for (Persona data : values) {
            data.mostrarDatos();
        }
    }
}

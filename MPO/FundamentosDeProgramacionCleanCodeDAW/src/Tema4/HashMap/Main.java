package Tema4.HashMap;

import Tema4.HashMap.controller.Agenda;
import Tema4.HashMap.model.Persona;

public class Main {

    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        agenda.agregarPersona(new Persona("Manuel1", "Cruz1", "1234"));
        agenda.agregarPersona(new Persona("Manuel2", "Cruz2", "2234"));
        agenda.obtenerPersona("1234").mostrarDatos();
        agenda.mostrarPersonas();
    }
}

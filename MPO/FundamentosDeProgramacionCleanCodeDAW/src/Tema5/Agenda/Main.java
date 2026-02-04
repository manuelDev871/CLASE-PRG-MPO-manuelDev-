package Tema5.Agenda;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Main {

    static ArrayList <Object[]> listaContactos = new ArrayList<>();

    public static void main(String[] args) {

        // Guardar una agenda telefonica -> ArrayList <Object[]>
        // ArrayList -> lista con tamaño modificable
            // ArrayList <Tipo de objeto guardado> nombre = new ArrayList
            // Object -> elemento que guarda cualquier tipo de dato
            // Object[] -> lista con tamaño fijo de cualquier tipo

            // Contactos -> nombre, apellido, dni, telefono -> Object[]{nombre, apellido, dni, telefono};


        // [{B,M,1234A,1234}, {M,M,2345A,2345}, {J,G,3456A,3456} ]
        listaContactos.add(new Object[]{"Borja", "Martin", "1234A", 1234});
        listaContactos.add(new Object[]{"Maria", "Martin", "2345A", 2345});
        listaContactos.add(new Object[]{"Juan", "Gomez", "3456A", 3456});


        // Como borrar un elemento que tenga como dni 2345A

        //  Metodo 1:

        for (int i = 0; i < listaContactos.size(); i++) {
            Object[] contacto = listaContactos.get(i);
            if (contacto[2].equals("2345A")) {
                // listaContactos.remove(i); -> funciona eligiendo la posicion
                listaContactos.remove(contacto);    // abajo funciona eligiendo el Object[] contacto
                break;
            }
        }


        //  Metodo 2:

        listaContactos.removeIf(new Predicate<Object[]>() {
            @Override
            public boolean test(Object[] objects) {
                return objects[2].equals("1234A");
            }
        });


        // Uso el metodo para mostrar los contactos
        mostrarContactos();
    }

    public static void mostrarContactos() {
        for (Object[] contacto : listaContactos) {
            System.out.println("Imprimiendo datos de contacto");
            System.out.printf("\t Nombre: %s Apellido: %s DNI: %s Teléfono: %d \n",
                    contacto[0], contacto[1], contacto[2], (int)contacto[3]);
        }
    }
}

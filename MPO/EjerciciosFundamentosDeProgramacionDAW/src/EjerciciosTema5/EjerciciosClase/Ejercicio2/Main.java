package EjerciciosTema5.EjerciciosClase.Ejercicio2;

import EjerciciosTema5.EjerciciosClase.Ejercicio2.controller.Registrador;
import EjerciciosTema5.EjerciciosClase.Ejercicio2.model.Equipo;
import EjerciciosTema5.EjerciciosClase.Ejercicio2.model.Partido;

public class Main {

    /*
        2. Realizar una aplicación para el seguimiento de eventos deportivos. En la
        aplicación se quieren gestionar partidos de fútbol y sus resultados. Estos
        constan de un equipo local, uno visitante, donde cada uno de ellos tiene un
        numero de goles. La aplicación realizará todas las acciones sobre un menú
        con las siguientes opciones:

            a. Agregar partido: el sistema pedirá todos los datos necesarios
            b. Mostrar partidos
            c. Mostrar partidos equipo: el sistema pedirá el nombre del equipo y
            mostrará todos los datos de sus partidos
            d. Mostrar estadísticas: el sistema pedirá el nombde del equipo y
            mostrará las estadísticas de número goles favor, número goles
            contra
     */

    public static void main(String[] args) {

        Equipo equipo1 = new Equipo("Equipo1");
        Equipo equipo2 = new Equipo("Equipo2");
        Equipo equipo3 = new Equipo("Equipo3");
        Equipo equipo4 = new Equipo("Equipo4");
        Equipo equipo5 = new Equipo("Equipo5");

        Registrador registrador = new Registrador();
        registrador.registrarPartidos(new Partido(equipo1,equipo2,3,3));
        registrador.registrarPartidos(new Partido(equipo1,equipo3,0,3));
        registrador.registrarPartidos(new Partido(equipo1,equipo4,1,3));
        registrador.registrarPartidos(new Partido(equipo1,equipo5,2,3));

        registrador.registrarPartidos(new Partido(equipo2,equipo1,2,3));
        registrador.registrarPartidos(new Partido(equipo3,equipo1,1,3));
        registrador.registrarPartidos(new Partido(equipo4,equipo1,4,3));
        registrador.registrarPartidos(new Partido(equipo5,equipo1,0,0));

        registrador.mostrarPartidos();
        registrador.buscarEstadisticas("Equipo2");
    }
}

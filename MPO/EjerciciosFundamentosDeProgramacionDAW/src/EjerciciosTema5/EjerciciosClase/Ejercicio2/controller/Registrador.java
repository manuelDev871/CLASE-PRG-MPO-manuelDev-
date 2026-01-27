package EjerciciosTema5.EjerciciosClase.Ejercicio2.controller;

import EjerciciosTema5.EjerciciosClase.Ejercicio2.model.Equipo;
import EjerciciosTema5.EjerciciosClase.Ejercicio2.model.Partido;

import java.util.ArrayList;

public class Registrador {

    private ArrayList<Partido> listaPartidos;

    public Registrador() {
        this.listaPartidos = new ArrayList<>();
    }

    public ArrayList<Partido> getListaPartidos() {
        return listaPartidos;
    }

    public void setListaPartidos(ArrayList<Partido> listaPartidos) {
        this.listaPartidos = listaPartidos;
    }

    public void registrarPartidos(Partido partido) {
        // se pueden duplicar equipos tanto en local como en visitantes
        this.listaPartidos.add(partido);
    }

    public void mostrarPartidos() {
        for (Partido partido : listaPartidos) {
            partido.mostrarDatos();
        }
    }

    public void buscarEstadisticas(String nombre) {
        // buscar por nombre de equipos y sacar sus estadisticas
        // busco en el array de partidos
        for (Partido partido : listaPartidos) {
            if (partido.getEquipoLocal().getNombre().equals(nombre)) {
                partido.getEquipoLocal().mostrarEstadisticas();
                break;
            } else if (partido.getEquipoVisitante().getNombre().equals(nombre)) {
                partido.getEquipoVisitante().mostrarEstadisticas();
                break;
            }

            System.out.println("Equipo no encontrado en la relacion de partidos");
        }
    }
}

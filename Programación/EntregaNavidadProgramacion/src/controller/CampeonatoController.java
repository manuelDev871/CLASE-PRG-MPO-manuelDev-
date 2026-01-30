package controller;

import model.Campeonato;
import model.Carrera;
import model.Coche;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

public class CampeonatoController {

    // Clase CampeonatoController:
        /*
            1. Atributos.
            2. Constructor.
            3. Metodo empezarCampeonato.
            4. Metodo asignarPuntos.
            5. Metodo mostrarClasificacion.
         */

    private Scanner scanner;
    private CarreraController carreraController;
    private ArrayList<Coche> resultadoUltimaCarrera;

    public CampeonatoController() {
        scanner = new Scanner(System.in);
        carreraController = new CarreraController();
        resultadoUltimaCarrera = new ArrayList<>();
    }

    public void empezarCampeonato(ArrayList<Coche> coches) {

        Campeonato campeonato = new Campeonato();
        campeonato.inicializarClasificacion(coches);

        int numCarreras;

        System.out.println();
        System.out.print("Introduce el número de carreras: ");

        do {
            numCarreras = scanner.nextInt();

            if (numCarreras <= 0) {
                System.out.print("El número de carreras ingresado no es válido, por favor, inténtelo de nuevo: ");
            }

        } while (numCarreras <= 0);

        System.out.println();

        for (int i = 1; i <= numCarreras; i++) {

            // Generar los kms aleatorio para cada carrera:
            System.out.print("Introduce los km de la carrera " + i + ": ");
            int kmCarrera = scanner.nextInt();
            System.out.println();

            Carrera carrera = new Carrera(coches, kmCarrera);
            campeonato.anhadirCarrera(carrera);

            // Simular carrera:
            ArrayList<Coche> resultado = carreraController.simularCarrera(carrera, i);
            resultadoUltimaCarrera = resultado;

            // Asignar puntos:
            asignarPuntos(resultado, campeonato);

            // Si NO es la última carrera, preguntamos
            if (i < numCarreras) {

                System.out.print("¿Desea ver la clasificación general actual? (y/n): ");
                String respuesta = scanner.next();
                System.out.println();

                if (respuesta.equalsIgnoreCase("y")) {
                    mostrarClasificacion(campeonato, false);
                }

            } else {
                mostrarClasificacion(campeonato, true);
            }
        }
    }

    private void asignarPuntos(ArrayList<Coche> resultado, Campeonato campeonato) {

        if (resultado.size() > 0) {
            campeonato.sumarPuntos(resultado.get(0), 10);
        }
        if (resultado.size() > 1) {
            campeonato.sumarPuntos(resultado.get(1), 8);
        }
        if (resultado.size() > 2) {
            campeonato.sumarPuntos(resultado.get(2), 6);
        }
    }

    private void mostrarClasificacion(Campeonato campeonato, boolean esFinal) {

        if (esFinal) {
            System.out.println("=== CLASIFICACIÓN GENERAL FINAL===");
        } else {
            System.out.println("=== CLASIFICACIÓN GENERAL ===");
        }

        HashMap<Coche, Integer> clasificacion = campeonato.getClasificacion();

        // Paso las claves a una lista para ordenarlas:
        ArrayList<Coche> cochesOrdenados = new ArrayList<>(clasificacion.keySet());

        // Ordeno por puntos y, en caso de empate, por posición en la última carrera:
        Collections.sort(cochesOrdenados, new Comparator<Coche>() {
            @Override
            public int compare(Coche coche1, Coche coche2) {

                int puntos1 = clasificacion.get(coche1);
                int puntos2 = clasificacion.get(coche2);

                // 1º criterio: puntos.
                if (puntos1 != puntos2) {
                    return puntos2 - puntos1;
                }

                // 2º criterio: posición en la última carrera.
                int pos1 = resultadoUltimaCarrera.indexOf(coche1);
                int pos2 = resultadoUltimaCarrera.indexOf(coche2);

                return pos1 - pos2;
            }
        });

        // Mostrar el podium
        int limite = Math.min(3, cochesOrdenados.size());

        for (int i = 0; i < limite; i++) {
            Coche coche = cochesOrdenados.get(i);
            System.out.println((i + 1) + "º " + coche.getNombre() + " " + "\t[" + clasificacion.get(coche) + " puntos]");
        }

        // Comprobar empate en el podium (clasificacion general final)
        if (esFinal && cochesOrdenados.size() >= 2) {

            int puntos1 = clasificacion.get(cochesOrdenados.get(0));
            int puntos2 = clasificacion.get(cochesOrdenados.get(1));

            boolean empatePodium = false;

            // Empate entre 1º y 2º
            if (puntos1 == puntos2) {
                empatePodium = true;
            }

            // Empate entre 2º y 3º en caso de haber mas de dos coches
            if (cochesOrdenados.size() >= 3) {
                int puntos3 = clasificacion.get(cochesOrdenados.get(2));
                if (puntos2 == puntos3) {
                    empatePodium = true;
                }
            }

            if (empatePodium) {
                System.out.println();
                System.out.println("Se ha aplicado el criterio de desempate por posición en la última carrera");
            }
        }

        System.out.println();
    }
}
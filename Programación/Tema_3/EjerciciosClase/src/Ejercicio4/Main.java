package Ejercicio4;

import java.util.Scanner;

public class Main {

    /*  4.
        Crea un programa para jugar una partida virtual de dardos entre dos
        jugadores. El objetivo es que uno de los jugadores llegue exactamente a 0 puntos partiendo desde 301.

        Reglas:
            • Nada más empezar pide el nombre de cada jugador
            • Cada jugador comienza con 301 puntos.
            • En cada turno, un jugador lanza 3 dardos. Cada dardo genera un número
              aleatorio entre 0 y 60 (simulando puntuación en dardos).
            • La puntuación del turno es la suma de los 3 dardos.
            • Resta la puntuación del turno al total de puntos del jugador.
            • Si la puntuación restante es menor que 0, se considera que el jugador "se
              pasa" y su total no cambia ese turno.
            • El primer jugador que llegue exactamente a 0 gana la partida.
            • Después de cada turno, muestra las puntuaciones actuales y quién va
              ganando (el que tiene menos puntos).
            • Al finalizar, muestra el ganador y cuántos turnos tomó la partida.
     */

    public static void main(String[] args) {

        Scanner entradaTeclado = new Scanner(System.in);

        // Nombres de los jugadores
        System.out.print("Introduce el nombre del Jugador 1: ");
        String jugadorUno = entradaTeclado.next();

        System.out.print("Introduce el nombre del Jugador 2: ");
        String jugadorDos = entradaTeclado.next();

        // Marcadores iniciales
        int marcadorUno = 301;
        int marcadorDos = 301;

        int turnosTotales = 0; // Para guardar cuántos turnos tomó la partida
        boolean ganador = false;

        System.out.println("\n--- ¡COMIENZA LA PARTIDA! ---\n");

        // Bucle principal del juego
        while (!ganador) {

            // -------------------------
            // TURNO JUGADOR 1
            // -------------------------
            System.out.println("Turno de " + jugadorUno);
            int puntuacionTurno = 0;

            for (int i = 1; i <= 3; i++) {
                int dardo = (int) (Math.random() * 60) + 1;
                System.out.println("Dardo " + i + ": " + dardo);
                puntuacionTurno += dardo;
            }

            System.out.println("Puntuación total del turno: " + puntuacionTurno);

            // ¿Se pasa?
            if (marcadorUno - puntuacionTurno < 0) {
                System.out.println("¡" + jugadorUno + " se pasa! No se restan puntos.");
            } else {
                marcadorUno -= puntuacionTurno;
            }

            // Mostrar marcador
            System.out.println("Marcador de " + jugadorUno + ": " + marcadorUno);
            System.out.println("Marcador de " + jugadorDos + ": " + marcadorDos);

            // ¿Ha ganado?
            if (marcadorUno == 0) {
                ganador = true;
                break;
            }

            turnosTotales++;

            // -------- TURNO JUGADOR 2 --------
            System.out.println("\nTurno de " + jugadorDos);
            puntuacionTurno = 0;

            for (int i = 1; i <= 3; i++) {
                int dardo = (int) (Math.random() * 60) + 1;
                System.out.println("Dardo " + i + ": " + dardo);
                puntuacionTurno += dardo;
            }

            System.out.println("Puntuación total del turno: " + puntuacionTurno);

            if (marcadorDos - puntuacionTurno < 0) {
                System.out.println("¡" + jugadorDos + " se pasa! No se restan puntos.");
            } else {
                marcadorDos -= puntuacionTurno;
            }

            // Mostrar marcadores
            System.out.println("Marcador de " + jugadorUno + ": " + marcadorUno);
            System.out.println("Marcador de " + jugadorDos + ": " + marcadorDos);

            // ¿Ganador?
            if (marcadorDos == 0) {
                ganador = true;
                break;
            }

            turnosTotales++;

            System.out.println("\n--------------------------------\n");
        }

        System.out.println("\n--- FIN DE LA PARTIDA ---");
        if (marcadorUno == 0) {
            System.out.println("🎯 ¡" + jugadorUno + " gana la partida! 🎯");
        } else {
            System.out.println("🎯 ¡" + jugadorDos + " gana la partida! 🎯");
        }

        System.out.println("La partida duró un total de " + turnosTotales + " turnos.");

        entradaTeclado.close();
    }
}


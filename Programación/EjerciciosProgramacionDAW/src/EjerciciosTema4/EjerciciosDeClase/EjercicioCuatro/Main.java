package EjerciciosTema4.EjerciciosDeClase.EjercicioCuatro;

import java.util.Random;
import java.util.Scanner;

public class Main {

    /*
        4. Crear una aplicación que permita realizar el sorteo del mundial. Para ello el
        sistema pedirá los nombres de las selecciones de los dos bombos, 5 por bombo.
        Una vez introducidos. Mostrar los emparejamientos de los equipos. Ten en cuenta
        que un mismo equipo no puede jugar más de un partido
     */

    public static void main(String[] args) {

        String[] bomboUno = new String[5];
        String[] bomboDos = new String[5];

        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido al sorteo del Mundial de Fútbol 2026");
        System.out.println("===============================================");

        System.out.println("BOMBO 1");
        System.out.println("=======");

        for (int i = 0; i < bomboUno.length; i++) {
            System.out.print("Introduce la selección " + (i + 1) + " para el Bombo 1: ");
            String seleccion = sc.nextLine();
            bomboUno[i] = seleccion;
        }

        System.out.println();
        System.out.println("BOMBO 2");
        System.out.println("=======");

        for (int i = 0; i < bomboDos.length; i++) {
            System.out.print("Introduce la selección " + (i + 1) + " para el Bombo 2: ");
            String seleccion = sc.nextLine();
            bomboDos[i] = seleccion;
        }


        // Enfrentamientos de equipos

        boolean[] equipoUsado = new boolean[bomboDos.length];
        Random random = new Random();

        System.out.println();
        System.out.println("ENFRENTAMIENTOS");
        System.out.println("==============");

        for (int i = 0; i < bomboUno.length; i++) {
            int indiceAleatorio;

            do {
                indiceAleatorio = random.nextInt(bomboDos.length);
            } while (equipoUsado[indiceAleatorio]);

            equipoUsado[indiceAleatorio] = true;

            System.out.println(bomboUno[i] + " vs " + bomboDos[indiceAleatorio]);
        }
    }
}
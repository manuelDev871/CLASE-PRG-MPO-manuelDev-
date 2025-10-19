/* Escribe un programa que pida al usuario la puntuación de tres exámenes.
   Calcula la nota media y usa operadores relacionales para determinar si ha aprobado (>=5),
   si tiene notable (>=7), y si tiene sobresaliente (>=9). Muestra todos los resultados. */

import java.util.Scanner;

public class Ejercicio9_Tema_2 {

    public static void main(String[] args) {

        // 1 -> Solicitar datos.

        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("Introduce la nota del primer examen");
        float notaUno = entradaTeclado.nextFloat();

        System.out.println("Introduce la nota del segundo examen");
        float notaDos = entradaTeclado.nextFloat();

        System.out.println("Introduce la nota del tercer examen");
        float notaTres = entradaTeclado.nextFloat();

        // 2 -> Realizar las operaciones.

        float notaMedia = (notaUno + notaDos + notaTres) / 3;

        boolean aprobado = (notaMedia >= 5);
        boolean notable = (notaMedia >= 7);
        boolean sobresaliente = (notaMedia >= 9);

        // 3 -> Mostrar la información.

        System.out.println("Nota media: " + notaMedia);
        System.out.println("¿Ha aprobado? (>=5): " + aprobado);
        System.out.println("¿Tiene notable? (>=7): " + notable);
        System.out.println("¿Tiene sobresaliente? (>=9): " + sobresaliente);

        entradaTeclado.close();
    }
}
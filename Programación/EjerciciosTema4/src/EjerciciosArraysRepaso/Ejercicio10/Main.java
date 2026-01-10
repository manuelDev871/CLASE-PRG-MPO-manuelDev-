package EjerciciosArraysRepaso.Ejercicio10;

import java.util.Scanner;

public class Main {

    /*
        Desarrolla un programa que pida al usuario cuántos estudiantes hay en una clase.
        Crea un array para almacenar sus calificaciones (0-10). Usa un bucle while para
        rellenar el array con las notas. Luego, usa un bucle for para:

            1. Mostrar todas las calificaciones
            2. Calcular el promedio de la clase
            3. Contar cuántos estudiantes aprobaron (nota ≥ 5)
            4. Encontrar la nota más alta y la más baja
     */

    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);
        System.out.print("¿Cuántos estudiantes hay?: ");
        int numeroEstudiantes = sc.nextInt();

        double[] calificaciones = new double[numeroEstudiantes];

        int posicion = 1;
        double calificacion = 0;
        int contadorEstudiantes = 0;

        while (contadorEstudiantes != numeroEstudiantes) {

            System.out.print("Introduce la nota del estudiante " + posicion + " : ");

            do {
                calificacion = sc.nextDouble();

                if (calificacion < 0 || calificacion > 10) {
                    System.out.print("Calificación fuera de rango (0 - 10). Intente de nuevo: ");
                }

            } while (calificacion < 0 || calificacion > 10);

            calificaciones[contadorEstudiantes] = calificacion;
            contadorEstudiantes++;
            posicion++;
        }


        System.out.println("--- REPORTE DE CALIFICACIONES ---");

        System.out.println();
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.print(calificaciones[i] + " ");
        }


        double sumaTotal = 0;
        for (int i = 0; i < calificaciones.length; i++) {
            sumaTotal += calificaciones[i];
        }

        double promedio = sumaTotal / calificaciones.length;

        System.out.println();
        System.out.println("Promedio de la clase: " + promedio);


        int contadorAprobados = 0;

        for (int i = 0; i < calificaciones.length; i++) {
            if (calificaciones[i] >= 5) {
                contadorAprobados++;
            }
        }


        System.out.println("Estudiantes aprobados: " + contadorAprobados);

        double notaAlta = calificaciones[0];

        for (int i = 0; i < calificaciones.length; i++) {
            if (calificaciones[i] > notaAlta) {
                notaAlta = calificaciones[i];
            }
        }

        System.out.println("Nota más alta: " + notaAlta);


        double notaBaja = calificaciones[0];

        for (int i = 0; i < calificaciones.length; i++) {
            if (calificaciones[i] < notaBaja) {
                notaBaja = calificaciones[i];
            }
        }

        System.out.println("Nota más alta: " + notaBaja);
    }
}

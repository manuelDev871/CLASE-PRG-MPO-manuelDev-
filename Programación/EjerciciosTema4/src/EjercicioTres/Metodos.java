package EjercicioTres;

import java.util.Scanner;

public class Metodos {

    static double[] notas;
    Scanner sc = new Scanner(System.in);

    public void rellenarNotas() {

        notas = new double[3];

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Introduce la calificacion del alumno " + (i + 1) + ": ");
            double calificacion = sc.nextDouble();

            do {
                if ((calificacion < 0) || (calificacion > 10)) {
                    System.out.println("Calificacion introducida fuera de rango (0 - 10)");
                    System.out.print("Introduce de nuevo una calificacion válida: ");
                    calificacion = sc.nextDouble();
                }

            } while ((calificacion < 0) || (calificacion > 10));

            notas[i] = calificacion;
        }

        System.out.print("Calificaciones introducidas correctamente, ¿desea imprimirlas en su terminal? y/n: ");
        String respuesta = sc.next();

        if (respuesta.equals("y")) {
            imprimirNotas();
        }
    }

    public void imprimirNotas() {

        for (double item : notas) {
            System.out.print(item + " ");
        }

        System.out.println();
    }

    public void notaMedia() {

        double sumaTotal = 0;
        double notaMedia;

        for (double nota : notas) {
            sumaTotal += nota;
        }

        notaMedia = sumaTotal / notas.length;
        System.out.printf("La nota media de los alumnos de 1º de DAW es: %.2f \n", notaMedia);
    }

    public void sacarNotaAlta() {

        double notaAlta = notas[0];

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > notaAlta) {
                notaAlta = notas[i];
            }
        }

        System.out.println("La nota mas alta es " + notaAlta);
    }

    public void sacarNotaBaja() {

        double notaBaja = notas[0];

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] < notaBaja) {
                notaBaja = notas[i];
            }
        }

        System.out.println("La nota mas baja es " + notaBaja);
    }

    public void numeroAprobados() {

        int aprobados = 0;
        int suspensos = 0;

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 5) {
                aprobados++;
            }
        }

        suspensos = notas.length - aprobados;

        System.out.println("Número de aprobados: " + aprobados);
        System.out.println("Número de suspensos: " + suspensos);
    }
}

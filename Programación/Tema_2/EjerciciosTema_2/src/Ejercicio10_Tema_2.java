/* Crea un programa que pida el salario base por hora, las horas trabajadas y si ha hecho horas extra (true/false).
   Si ha hecho horas extra y trabajó más de 40 horas, las horas que excedan de 40 se pagan al doble.
   Usa operadores lógicos, relacionales y aritméticos para calcular el salario total. */

import java.util.Scanner;

public class Ejercicio10_Tema_2 {

    public static void main(String[] args) {

        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("Introduce el salario base por hora:");
        float salarioHora = entradaTeclado.nextFloat();

        System.out.println("Numero de horas trabajadas:");
        float horasTrabajadas = entradaTeclado.nextFloat();

        System.out.println("¿Has hecho horas extras? (true/false):");
        boolean horasExtras = entradaTeclado.nextBoolean();

        // Validaciones básicas
        if (salarioHora < 0 || horasTrabajadas < 0) {
            System.out.println("Error: salario o horas introducidas no pueden ser negativas.");
            entradaTeclado.close();
            return;
        }

        // Detectar contradicciones entre el booleano y el número de horas
        if ((horasTrabajadas > 40) && (horasExtras == false)) {
            System.out.println("Contradicción detectada: ha introducido más de 40 horas pero ha indicado que NO hizo horas extras.");
            System.out.println("Corrija la entrada o indique true en '¿Has hecho horas extras?' si desea pagar las horas sobre 40.");
            entradaTeclado.close();
            return;
        } else if ((horasTrabajadas <= 40) && (horasExtras == true)) {
            System.out.println("Contradicción detectada: ha indicado que hizo horas extras pero trabajó 40 horas o menos.");
            System.out.println("Corrija la entrada o indique false en '¿Has hecho horas extras?' si no hubo horas sobre 40.");
            entradaTeclado.close();
            return;
        }

        // Cálculos correctos
        float horasNormales = Math.min(horasTrabajadas, 40f);
        float salarioNormal = salarioHora * horasNormales;

        float horasExtra = Math.max(0f, horasTrabajadas - 40f);
        float salarioHorasExtra = (salarioHora * 2f) * horasExtra; // se pagan al doble
        float salarioGlobal = salarioNormal + salarioHorasExtra;

        // Mostrar resultados
        if (horasExtra > 0) {
            System.out.println("Numero de horas extras: " + horasExtra + " horas.");
            System.out.printf("Salario de horas extras: %.2f €.%n", salarioHorasExtra);
            System.out.printf("Salario normal (primeras %.0f h): %.2f €.%n", horasNormales, salarioNormal);
            System.out.printf("Salario global (con horas extras): %.2f €.%n", salarioGlobal);
        } else {
            System.out.printf("Salario total (sin horas extras): %.2f €.%n", salarioNormal);
        }

        entradaTeclado.close();
    }
}

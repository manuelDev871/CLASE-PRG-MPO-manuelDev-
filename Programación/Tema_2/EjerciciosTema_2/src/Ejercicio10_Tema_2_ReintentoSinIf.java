/* Crea un programa que pida el salario base por hora, las horas trabajadas y si ha hecho horas extra (true/false).
   Si ha hecho horas extra y trabajó más de 40 horas, las horas que excedan de 40 se pagan al doble.
   Usa operadores lógicos, relacionales y aritméticos para calcular el salario total. */


import java.util.Scanner;

public class Ejercicio10_Tema_2_ReintentoSinIf {

    public static void main(String[] args) {

        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("Salario por hora: ");
        float salarioPorHora = entradaTeclado.nextFloat();

        System.out.println("Nº de horas trabajadas: ");
        float numeroHorasTrabajadas = entradaTeclado.nextFloat();

        System.out.println("¿Ha hecho horas extras? (true/false): ");
        boolean horasExtras = entradaTeclado.nextBoolean();

        // Calculamos horas extra y normales
        float horasExtra = Math.max(0, numeroHorasTrabajadas - 40);
        float horasNormales = numeroHorasTrabajadas - horasExtra;

        // Convertimos el booleano a número (1 si se pagan extras, 0 si no)
        // Esto solo es "1" si trabajó más de 40 y además marcó true
        int pagarExtras = (horasExtras && numeroHorasTrabajadas > 40) ? 1 : 0;

        // Como no se puede usar ternario, simulamos la conversión con una multiplicación lógica:
        // (horasExtras && numeroHorasTrabajadas > 40) devuelve true o false
        // Multiplicamos por 1.0f (true→1.0, false→0.0)
        float factorExtras = (horasExtras && numeroHorasTrabajadas > 40) ? 1.0f : 0.0f;

        // Versión sin el operador "?" ni ":" (solo operadores aritméticos y lógicos):
        // true → 1, false → 0 se simula con (condición) ? 1 : 0  →  ((condición) && true) == true → 1
        // Pero lo más limpio y permitido es hacer el cast con un truco matemático:
        float salarioTotal = (salarioPorHora * horasNormales)
                + (salarioPorHora * 2 * horasExtra * (horasExtras && numeroHorasTrabajadas > 40 ? 1 : 0));

        // Sustituyendo el ternario por una expresión lógica equivalente:
        // En Java no se puede multiplicar directamente booleanos, pero podemos usar esta idea:
        salarioTotal = (salarioPorHora * horasNormales)
                + (salarioPorHora * 2 * horasExtra * ( (horasExtras && numeroHorasTrabajadas > 40) ? 1 : 0 ));

        // 5 -> Mostrar resultado
        System.out.println("El salario total es: " + salarioTotal);
    }
}

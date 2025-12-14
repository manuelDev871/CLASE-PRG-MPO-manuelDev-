package Tema3.EstructuraIf;
import java.util.Scanner;

public class Decisiones {

    // Scanner como atributo para reutilizarlo en los métodos
    private Scanner lectorTeclado;
    public void estructuraIF(int nota) {

        // Ejemplo básico de estructura if / else


        System.out.println("Vamos a explicar la estructura IF");

        // Condición simple: aprobado o suspenso
        if (nota >= 5) {
            System.out.println("El examen está aprobado");
        } else {
            System.out.println("El examen está suspenso");
        }

        System.out.println("Terminando evaluación");
    }
    public void estructuraIFELSEIF(double nota) {

        /*
           Ejemplo de if / else if / else
           Clasificación de una nota
        */


        System.out.println("Iniciando la evaluación del examen");

        // Validamos primero que la nota esté en el rango correcto
        if (nota >= 0 && nota <= 10) {

            if (nota < 1) {
                System.out.println("Examen desastroso");
            } else if (nota < 4) {
                System.out.println("Examen mal");
            } else if (nota < 5) {
                System.out.println("Examen suspenso raspado");
            } else if (nota < 8) {
                System.out.println("Examen bien");
            } else if (nota < 9) {
                System.out.println("Examen notable");
            } else if (nota < 10) {
                System.out.println("Examen sobresaliente");
            } else {
                System.out.println("Examen de Matrícula de Honor");
            }

        } else {
            System.out.println("Rango incorrecto");
        }

        System.out.println("Finalizando la evaluación");
    }
    public void ejercicio4T2() {

        /*
           Ejercicio 4 Tema 2
           Determina si un número es par o impar usando el operador módulo
        */


        lectorTeclado = new Scanner(System.in);

        System.out.println("Dime qué número quieres evaluar");
        int numero = lectorTeclado.nextInt();

        // El operador % devuelve el resto de una división
        if (numero % 2 == 0) {
            System.out.printf("El número %d es par%n", numero);
        } else {
            System.out.printf("El número %d es impar%n", numero);
        }

        // No cerramos el Scanner aquí para evitar errores si se reutiliza
    }
    public void ejercicio10T2(int horasBase) {

        /*
           Ejercicio 10 Tema 2
           Cálculo de salario con horas extra
        */


        lectorTeclado = new Scanner(System.in);

        System.out.println("Indica cuánto cobras por hora");
        int salarioHora = lectorTeclado.nextInt();

        System.out.println("Indica cuántas horas has trabajado");
        int horasTrabajadas = lectorTeclado.nextInt();

        System.out.println("¿Has trabajado horas extra? (true / false)");
        boolean horasExtras = lectorTeclado.nextBoolean();

        int salarioTotal = 0;

        // Si hay horas extra y se superan las horas base
        if (horasExtras && horasTrabajadas > horasBase) {

            int horasExtra = horasTrabajadas - horasBase;

            // Las horas extra se pagan al doble
            salarioTotal += horasExtra * (salarioHora * 2);
        }

        // Pago de las horas normales
        salarioTotal += horasBase * salarioHora;

        // Uso de printf para formatear la salida
        System.out.printf(
                "El salario cobrado este mes es %d %s%n",
                salarioTotal,
                "Dólares"
        );

        lectorTeclado.close();
    }
}

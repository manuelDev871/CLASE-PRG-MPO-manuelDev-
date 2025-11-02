/*  Escribe un programa para calcular el precio de entrada a un museo. Pide la edad del usuario y el día de la semana
    (1=Lunes, 2=Martes... 7=Domingo). Las reglas son: Menores de 12 años: entrada gratis. Entre 12 y 17 años: 5€
    (pero gratis los martes). Entre 18 y 64 años: 10€ (pero 7€ los jueves). 65 años o más: 6€. Usa operadores
    lógicos para determinar el precio correcto y muestra el cálculo. */


import java.util.Scanner;

public class Ejercicio13_Tema_3 {

    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner(System.in);

        // 1º -> Solicitamos la información
        System.out.println("Introduce tu edad:");
        int edad = entradaTeclado.nextInt();

        System.out.println("Introduce el día de la semana: \n" +
                "Lunes = 1\n" +
                "Martes = 2\n" +
                "Miércoles = 3\n" +
                "Jueves = 4\n" +
                "Viernes = 5\n" +
                "Sábado = 6\n" +
                "Domingo = 7");

        int diaSemana = entradaTeclado.nextInt();

        // Mostrar edad y día
        System.out.println("Edad: " + edad + " años.");

        if (diaSemana == 1) {
            System.out.println("Día de la semana: Lunes");
        } else if (diaSemana == 2) {
            System.out.println("Día de la semana: Martes");
        } else if (diaSemana == 3) {
            System.out.println("Día de la semana: Miércoles");
        } else if (diaSemana == 4) {
            System.out.println("Día de la semana: Jueves");
        } else if (diaSemana == 5) {
            System.out.println("Día de la semana: Viernes");
        } else if (diaSemana == 6) {
            System.out.println("Día de la semana: Sábado");
        } else if (diaSemana == 7) {
            System.out.println("Día de la semana: Domingo");
        } else {
            System.out.println("Error: Día no válido.");
        }

        // 2º -> Condiciones según edad y día
        if (edad <= 0 || edad >= 100) {
            System.out.println("Error. Introduce de nuevo tu edad.");
        } else if (edad < 12) {
            System.out.println("Eres menor de 12 años, entrada gratuita.");
        } else if (edad <= 17) {
            if (diaSemana == 2) { // Martes
                System.out.println("Tienes " + edad + " años y hoy es martes, entrada gratuita.");
            } else {
                System.out.println("Tienes " + edad + " años, precio de la entrada: 5 €.");
            }
        } else if (edad <= 64) {
            if (diaSemana == 4) { // Jueves
                System.out.println("Tienes " + edad + " años y hoy es jueves, precio reducido: 7 €.");
            } else {
                System.out.println("Tienes " + edad + " años, precio de la entrada: 10 €.");
            }
        } else {
            System.out.println("Tienes " + edad + " años, precio de la entrada: 6 €.");
        }

        entradaTeclado.close();
    }
}


// Ejercicio resulto: revisar para tener mas conocimiento.
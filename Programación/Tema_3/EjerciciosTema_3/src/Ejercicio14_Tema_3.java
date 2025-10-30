/*  Desarrolla un programa que determine si una persona es elegible para un préstamo bancario.
    Pide: edad, ingresos mensuales (€), y si tiene deudas pendientes (true/false). Los requisitos son: Edad entre 21 y 65 años,
    ingresos mensuales de al menos 1000€, y NO tener deudas pendientes. El programa debe evaluar cada condición y
    mostrar si es elegible o no, explicando qué requisitos no cumple. */


import java.util.Scanner;

public class Ejercicio14_Tema_3 {

    public static void main(String[] args) {

        // 1º -> Solicitar informacion al usuario.

        Scanner estradaTeclado = new Scanner(System.in);

        // Solicitar edad / ingresos / deudas (true/false).

        System.out.println("Introduce tu edad");
        int edad = estradaTeclado.nextInt();

        System.out.println("Introduce tus ingresos mensuales");
        int ingresos = estradaTeclado.nextInt();

        System.out.println("¿Tienes deudas pendientes? (true / false)");
        boolean deudas = estradaTeclado.nextBoolean();

        if ((edad >= 21) && (edad <= 65)) {
            System.out.println("Requisito de edad: Check");
        } else {
            System.out.println("Requisito de edad: Uncheck");
        }

        if (ingresos >= 1000) {
            System.out.println("Ingresos mensuales: Check");
        } else {
            System.out.println("Ingresos mensuales: Uncheck");
        }

        if (!deudas) {
            System.out.println("No tienes ninguna deuda: Check");
        } else {
            System.out.println("Tienes deudas: Uncheck");
        }

        System.out.println("----------------------------------------------");

        if ((edad >= 21) && (edad <= 65) && (ingresos >= 1000) && !deudas) {
            System.out.println("¡Felicidades! Eres elegible para solicitar el préstamo.");
        } else {
            System.out.println("Lo siento, no eres elegible para solicitar el préstamo.");
        }

        estradaTeclado.close();
    }
}

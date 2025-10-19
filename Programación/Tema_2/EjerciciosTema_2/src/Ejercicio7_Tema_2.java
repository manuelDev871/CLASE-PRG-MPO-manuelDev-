/* Crea un programa que pida al usuario su edad y si es estudiante (true/false).
   Usa operadores lógicos (AND, OR, NOT) para determinar si puede acceder a diferentes descuentos:
   descuento joven (menor de 26 años), descuento estudiante, o descuento especial (menor de 26 Y estudiante). */

import java.util.Scanner;

public class Ejercicio7_Tema_2 {

    public static void main(String[] args) {

        // 1 -> Solicitar datos al usuario.

        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("Introduce tu edad: ");
        int edad = entradaTeclado.nextInt();

        System.out.println("¿Eres estudiante?");
        boolean estudiante = entradaTeclado.nextBoolean();

        // 2 -> Usar operadores lógicos.

        boolean descuentoJoven = (edad < 26);
        boolean descuentoEstudiante = estudiante != false;
        boolean descuentoEspecial = (edad < 26) && (estudiante == true);

        // 3 -> Mostrar información.

        System.out.println("¿Tienes descuento joven?: " + descuentoJoven);
        System.out.println("¿Tienes descuento de estudiantes?: " + descuentoEstudiante);
        System.out.println("¿Tienes descuento especial?: " + descuentoEspecial);

        entradaTeclado.close();
    }
}
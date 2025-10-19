/* Crea un programa que pida la edad del usuario y si tiene carnet de conducir (true/false).
   Usa operadores lógicos para determinar si puede alquilar un coche (debe tener 21 años o más Y tener carnet). */


import java.util.Scanner;

public class Ejercicio5_Tema_2 {

    public static void main(String[] args) {

        // 1 -> Pedir datos.

        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("Introduce tu edad: ");
        int edad = entradaTeclado.nextInt();

        System.out.println("¿Tienes carnet de conducir? (true/false)");
        boolean carnetConducir = entradaTeclado.nextBoolean();

        // 2 -> Operadores lógicos.

        boolean edadApta = (edad >= 21);
        boolean apto = (edad >= 21) && (carnetConducir == true);

        // 3 -> Mostar información.

        System.out.println("----------------------------------------------------------------");
        System.out.println("¿Tienes 21 años o más?: " + edadApta);
        System.out.println("¿Tienes carnet de conducir? (true/false): " + carnetConducir);
        System.out.println("¿Es el usuario apto para poder alquilar un coche? (AND): " + apto);

        entradaTeclado.close();
    }
}

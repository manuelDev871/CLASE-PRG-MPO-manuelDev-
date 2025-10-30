/*  Crea un programa que pida la altura del usuario (en cm) y determine si puede subir a una atracción.
    La altura mínima es 120 cm y la máxima es 200 cm. Si está dentro del rango, muestra "Puedes subir",
    si no, indica el motivo (demasiado bajo o demasiado alto). */

import java.util.Scanner;

public class Ejercicio10_Tema_3 {

    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("Introduce tu altura en cms");
        int altura = entradaTeclado.nextInt();

        if ((altura >= 120) && (altura <= 200)) {
            System.out.println("Puedes subir");
        } else if (altura < 120){
            System.out.println("No puedes subir, eres demasiado bajo");
        } else {
            System.out.println("No puedes subir, eres demasiado alto");
        }

        entradaTeclado.close();
    }
}
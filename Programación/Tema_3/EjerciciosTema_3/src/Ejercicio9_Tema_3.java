/*  Escribe un programa que pida el peso (en kg) y la altura (en metros) del usuario. Calcula el IMC (peso / altura²)
    y determina si está en peso normal (IMC entre 18.5 y 24.9), por debajo del peso normal (IMC menor a 18.5)
    o por encima del peso normal (IMC mayor a 24.9). */

import java.util.Scanner;

public class Ejercicio9_Tema_3 {

    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("Introduce tu peso en kg");
        double peso = entradaTeclado.nextDouble();

        System.out.println("Introduce tu altura en metros");
        double altura = entradaTeclado.nextDouble();

        double IMC = peso / (altura * altura);

        if ((IMC >= 18.5) && (IMC <= 24.9)) {
            System.out.printf("Tu indice de masa corporal es de %.2f \n", IMC);
            System.out.println("Tu peso es normal");
        } else if (IMC < 18.5) {
            System.out.printf("Tu indice de masa corporal es de %.2f \n", IMC);
            System.out.println("Tu peso está por debajo del peso normal");
        } else {
            System.out.printf("Tu indice de masa corporal es de %.2f \n", IMC);
            System.out.println("Tu peso está por encima del peso normal");
        }

        entradaTeclado.close();
    }
}

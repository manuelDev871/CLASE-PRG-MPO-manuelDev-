package EjerciciosArraysRepaso.Ejercicio9;

public class Main {

    /*
        Escribe un programa que cree un array de 7 números.
        Usa un bucle for para crear un nuevo array con los
        elementos en orden inverso. Muestra ambos arrays: el original y el invertido.
     */

    public static void main(String[] args) {

        int[] arrayNumerosOriginal = new int[] {2, 4, 6, 8, 10, 12, 14};
        int[] arrayNumerosInverso = new int[] {2, 4, 6, 8, 10, 12, 14};


        for (int i = 0; i < arrayNumerosInverso.length / 2; i++) {
            int temporal = arrayNumerosInverso[i];
            arrayNumerosInverso[i] = arrayNumerosInverso[arrayNumerosInverso.length - 1 - i];
            arrayNumerosInverso[arrayNumerosInverso.length - 1 - i] = temporal;
        }

        System.out.println("Array original: ");
        for (int item : arrayNumerosOriginal) {
            System.out.print(item + " ");
        }

        System.out.println();
        System.out.println("Array inverso: ");
        for (int item : arrayNumerosInverso) {
            System.out.print(item + " ");
        }
    }
}

package EjerciciosArraysRepaso.Ejercicio7;

public class Main {

    /*
        Desarrolla un programa que cree un array de 6 números.
        Usa bucles for para encontrar el número mayor y el número
        menor del array, y muestra ambos resultados.
     */

    public static void main(String[] args) {

        int[] array = new int[]{15, 8, 25, 3, 19, 12};

        int numeroMayor = array[0];
        int numeroMenor = (array.length -1);

        for (int i = 0; i < array.length; i++) {
            if (array[i] > numeroMayor) {
                numeroMayor = array[i];
            }
        }

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < numeroMenor) {
                numeroMenor = array[i];
            }
        }

        System.out.println("Numero Mayor: " + numeroMayor);
        System.out.println("Numero Menor: " + numeroMenor);
    }
}

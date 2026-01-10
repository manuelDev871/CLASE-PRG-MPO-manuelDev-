package EjerciciosArrayMultiRepaso.Ejercicio3;

public class Main {

    /*
        Escribe un programa que defina una matriz de 4x4 con números.
        Usa bucles for anidados para recorrer la matriz y calcular la
        suma de todos sus elementos. Muestra el resultado.
     */

    public static void main(String[] args) {

        int[][] matriz = new int[4][4];

        int sumaTotal = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                int aleatorio = (int) (Math.random()*10);
                matriz[i][j] = aleatorio;
                sumaTotal += aleatorio;
            }
        }

        for (int[] fila : matriz) {
            for (int item : fila) {
                System.out.print(item + "\t");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Suma total de elementos: " + sumaTotal);
    }
}

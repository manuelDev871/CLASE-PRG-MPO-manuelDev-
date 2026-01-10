package EjerciciosArrayMultiRepaso.Ejercicio6;

public class Main {

    /*
        Escribe un programa que cree una matriz de 3x4 con números.
        Usa bucles for para encontrar el número mayor de cada columna y muestra los resultados.
     */

    public static void main(String[] args) {

        int[][] matriz = new int[3][4];

        // Llenar la matriz con números aleatorios
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 50);
            }
        }

        // Mostrar la matriz
        for (int[] fila : matriz) {
            for (int item : fila) {
                System.out.print(item + "\t");
            }
            System.out.println();
        }

        System.out.println("\nMayor de cada columna:");

        // Encontrar el mayor de cada columna
        for (int col = 0; col < matriz[0].length; col++) {
            int mayor = matriz[0][col];

            for (int fila = 1; fila < matriz.length; fila++) {
                if (matriz[fila][col] > mayor) {
                    mayor = matriz[fila][col];
                }
            }

            System.out.println("Columna " + col + ": " + mayor);
        }
    }
}

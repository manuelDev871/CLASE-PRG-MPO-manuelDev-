package EjerciciosArrayMultiRepaso.Ejercicio1;

public class Main {

    /*
        Crea un programa que defina una matriz de 3x3 con números del 1 al 9.
        Usa bucles for anidados para mostrar la matriz en formato de tabla.
     */

    public static void main(String[] args) {

        int[][] matriz = new int[][] {{1,2,3},{4,5,6},{7,8,9}};

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

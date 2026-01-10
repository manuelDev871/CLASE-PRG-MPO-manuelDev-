package EjerciciosArrayMultiRepaso.Ejercicio5;

public class Main {

    /*
        Desarrolla un programa que defina una matriz de 4x3 con números decimales.
        Usa bucles for anidados para calcular y mostrar el promedio de cada fila de la matriz.
     */

    public static void main(String[] args) {

        double[][] matriz = new double[][] {{5.5, 7.2, 6.8},{8.1, 9.3, 7.5},{4.2, 5.6, 6.1},{7.8, 8.9, 9.2}};

        for (int i = 0; i < matriz.length; i++) {
            double suma = 0;   // suma de la fila actual

            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }

            double promedio = suma / matriz[i].length;
            System.out.println("Promedio de la fila " + (i+1) + ": " + promedio);
        }
    }
}

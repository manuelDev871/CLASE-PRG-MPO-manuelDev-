package EjerciciosArraysRepaso.Ejercicio6;

public class Main {

    /*
        Crea un programa con un array de 8 números decimales.
        Recorre el array con un bucle for para calcular la suma
        de todos los elementos. Luego, calcula y muestra el promedio.
     */

    public static void main(String[] args) {

        double[] array = new double[] {4.5, 7.2, 3.8, 9.1, 5.6, 8.3, 6.7, 4.9};

        double sumaTotal = 0;

        for (int i = 0; i < array.length; i++) {
            sumaTotal += array[i];

        }

        System.out.println("Suma total: " + sumaTotal);

        double promedio;
        promedio = sumaTotal / array.length;
        System.out.println("Promedio total: " + promedio);
    }
}

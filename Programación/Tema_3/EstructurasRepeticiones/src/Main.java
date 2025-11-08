import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*  TEORIA

            Ejemplo de ejercicio: Pide por teclado 10 numeros y di de todos ellos
            cuantos son pares, impares, numero medio introducido y calcular cual es
            el mas mas grande y mas pequeño

        // inicil ; final ; incremento

        Scanner scanner = new Scanner(System.in);

        int contadorPares = 0;
        int contadorImpares = 0;
        int sumatorio = 0;
        int maximo = 0;
        int minimo = 0;

        for (int i=0; i<5; i++){
            System.out.println("Introduce un numero en posicion " + i);
            int numero = scanner.nextInt();

            // Lógica para inicializar Máximo y Mínimo con el primer número
            if (i == 0) {
                maximo = numero; // El primer número es inicialmente el más grande
                minimo = numero; // Y también el más pequeño
            }

            // Lógica para actualizar el Máximo
            if (numero > maximo) {
                maximo = numero;
            }

            // Lógica para actualizar el Mínimo
            if (numero < minimo) {
                minimo = numero;
            }

            if (numero%2 == 0){
                contadorPares++;
            } else{
                contadorImpares++;
            }
            sumatorio+=numero;
        }
        System.out.println("Saliendo del for");
        System.out.println("El numero de pares es " + contadorPares);
        System.out.println("El numero de impares es " + contadorImpares);
        System.out.println("El numero medio es " + (sumatorio/5));
        System.out.println("El numero maximo es " + maximo);
        System.out.println("El numero minimo es " + minimo);


        // Bucle for en decremento
        for (int i = 10; i>=0; i-=2) {
            System.out.println("Ejecucion en linea repetida " + i);
        }


        // Tabla de multiplicar
        System.out.println("Tabla del 5");
        for (int i=0; i<11; i++){
            System.out.printf("%d * %d = %d \n", 5, i, 5 * i);
        }
         */

        /*
        // For tradicional: inicio; final; incremento

        String[] diasSemana = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};

        for (int i = 0; i < 7; i++) {
            if (i%2 == 0) {
                System.out.println(diasSemana[i]);
            }
        }

        // Con este ejercico estamos decladando un Array y diciendo que quieres imprimir los dias de la semana en posicion Par.
        */


        // For Each: ->(tipo de variable + nombre que yo quiera; ej; item) : coleccion a recorrer
        // Recorre todos los elementos.

        String[] diasSemana = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};

        for (String item : diasSemana) {
            System.out.println(item);
        }
















        // EJERCICIOS CON FOR (METODO)

        EjerciciosForClase ejercicios = new EjerciciosForClase();

        // ejercicios.ejercicioUno();
        // ejercicios.ejercicioDos();
        // ejercicios.ejercicioTres();
        //ejercicios.ejercicioCuatro();
        // ejercicios.ejercicioCinco();
        // ejercicios.ejercicioSeis();
        // ejercicios.ejercicioSiete();

    }
}

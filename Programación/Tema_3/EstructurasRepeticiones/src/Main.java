import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*  Ejemplo de ejercicio: Pide por teclado 10 numeros y di de todos ellos
            cuantos son pares, impares, numero medio introducido y calcular cual es
            el mas mas grande y mas pequeño */

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
    }
}

package EjerciciosTema4.EjerciciosArrayMultidimensionales;

import java.util.Scanner;

public class EjerciciosArrayMultidimensionales {

    public void ejercicioUno() {

        /*
            Crea un programa que defina una matriz de 3x3 con números del 1 al 9.
            Usa bucles for anidados para mostrar la matriz en formato de tabla.
        */

        int [][] matriz = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Matriz 3x3:");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public void ejercicioDos() {

        /*
            Desarrolla un programa que cree una matriz de 2x4.
            Usa bucles for anidados para pedir al usuario que introduzca 8 números
            y los almacene en la matriz. Al final, muestra la matriz completa.
        */

        // 0 0 0 0
        // 0 0 0 0

        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[2][4];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Introduce el valor para la posicion [" + i + "][" + j + "] : ");
                int numero = sc.nextInt();
                matriz[i][j] = numero;
            }
        }

        System.out.println();

        for (int[] fila : matriz) {
            for (int item : fila) {
                System.out.print(item + "\t");
            }
            System.out.println();
        }
    }
    public void ejercicioTres() {

        /*
             Escribe un programa que defina una matriz de 4x4 con números.
             Usa bucles for anidados para recorrer la matriz y calcular
             la suma de todos sus elementos. Muestra el resultado.
        */

        int[][] matriz = new int[4][4];

        int aleatorio;
        int sumaTotal = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                aleatorio = (int) (Math.random()*10);
                matriz[i][j] = aleatorio;

                sumaTotal += aleatorio;
            }
        }

        // Mostrar la matriz
        for (int[] fila : matriz) {
            for (int item : fila) {
                System.out.print(item + "\t");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("La suma total de la matriz es: " + sumaTotal);

    }
    public void ejercicioCuatro() {

        /*
             Crea un programa con una matriz de 3x5 con números.
             Pide al usuario un número a buscar y usa bucles for anidados para encontrarlo.
             Si existe, muestra su posición (fila y columna). Si no existe, indica que no se encontró.
        */

        // Array Matriz
        int[][] matriz = new int[][] {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};

        System.out.println("Matriz: ");
        // ForEach para mostrar la matriz
        for (int[] fila : matriz) {
            for (int item : fila) {
                System.out.print(item + "\t");
            }
            System.out.println();
        }

        // Scanner para preguntar al usuario
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el número a buscar: ");
        int numeroBuscado = sc.nextInt();

        boolean numeroEncontrado = false;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (numeroBuscado == matriz[i][j]) {
                    System.out.println("El número " + numeroBuscado + " se encuentra en la posición [" + i + "][" + j + "]");
                    numeroEncontrado = true;
                    break;
                }
            }
        }

        if (!numeroEncontrado) {
            System.out.println("El número " + numeroBuscado + " no se encuentra en la matriz");
        }
    }
    public void ejercicioCinco() {

        /*
            Desarrolla un programa que defina una matriz de 4x3 con números decimales.
            Usa bucles for anidados para calcular y mostrar el promedio de cada fila de la matriz.
        */

        double[][] matriz = new double[][] {{5.5,7.2,6.8},{8.1,9.3,7.5},{4.2,5.6,6.1},{7.8,8.9,9.2}};

        System.out.println("Matriz: ");
        // ForEach para mostrar la matriz
        for (double[] fila : matriz) {
            for (double item : fila) {
                System.out.print(item + "\t");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < matriz.length; i++) {
            double sumaFila = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                sumaFila += matriz[i][j];
            }
            double promedio = sumaFila / matriz[i].length;

            System.out.println("Promedio de la fila " + i + ": " + promedio);
        }
    }
    public void ejercicioSeis() {

        /*
             Escribe un programa que cree una matriz de 3x4 con números.
             Usa bucles for para encontrar el número mayor de cada columna y muestra los resultados.
        */

        int[][] matriz = new int[][] {{15,23,8,19},{42,17,31,25},{28,35,12,40}};

        // Recorremos columnas
        for (int j = 0; j < matriz[0].length; j++) {
            int mayor = matriz[0][j]; // asumimos que el mayor es el primero de la columna

            // Recorremos filas
            for (int i = 1; i < matriz.length; i++) {
                if (matriz[i][j] > mayor) {
                    mayor = matriz[i][j];
                }
            }

            System.out.println("Mayor de la columna " + j + ": " + mayor);
        }
    }
    public void ejercicioSiete() {

        /*
             Crea un programa que defina una matriz de 3x4.
             Usa bucles for anidados para crear una nueva matriz transpuesta (4x3)
             donde las filas se convierten en columnas. Muestra ambas matrices.
        */

        int[][] matriz = new int[3][4];
        int aleatorio;

        // Rellenar matriz original
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                aleatorio = (int) (Math.random() * 21);
                matriz[i][j] = aleatorio;
            }
        }

        // Mostrar matriz original
        System.out.println("Matriz original (3x4)");
        for (int[] fila : matriz) {
            for (int item : fila) {
                System.out.print(item + "\t");
            }
            System.out.println();
        }

        // Crear matriz transpuesta
        int[][] transpuesta = new int[4][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                transpuesta[j][i] = matriz[i][j];
            }
        }

        // Mostrar matriz transpuesta
        System.out.println("\nMatriz transpuesta (4x3)");
        for (int[] fila : transpuesta) {
            for (int item : fila) {
                System.out.print(item + "\t");
            }
            System.out.println();
        }

    }
    public void ejercicioOcho() {

        /*
             Desarrolla un programa que cree una matriz de 4x5 con números enteros.
             Usa bucles for anidados para contar cuántos números pares e impares hay en toda la matriz.
             Muestra ambos contadores.
        */

        int[][] matriz = new int[][] {{12,16,8,23,34},{17,20,9,14,27},{6,11,18,25,30},{13,22,7,16,19}};

        int contadorPar = 0;
        int contadorImpar = 0;

        // For para contar pares e impares
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] %2 == 0) {
                    contadorPar++;
                } else {
                    contadorImpar++;
                }
            }
        }

        // ForEach para mostrar la matriz
        for (int[] fila : matriz) {
            for (int item : fila) {
                System.out.print(item + "\t");
            }
            System.out.println();
        }

        System.out.println();

        // Muestro el resultado del For
        System.out.println("Numeros pares: " + contadorPar);
        System.out.println("Numeros impares: " + contadorImpar);
    }
    public void ejercicioNueve() {

        /*
             Escribe un programa que genere una matriz de 10x10 que represente
             las tablas de multiplicar del 1 al 10. Usa bucles for anidados para
             llenar la matriz donde cada elemento [i][j] contenga el resultado de
             (i+1) * (j+1). Muestra la matriz completa.
        */

        int[][] matriz = new int[10][10];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (i + 1) * (j + 1);
            }
        }


        System.out.println("Tablas de multiplicar del 1 al 10");
        System.out.println();


        for (int[] fila : matriz) {
            for (int item : fila) {
                System.out.print(item + "\t");
            }
            System.out.println();
        }
    }
    public void ejercicioDiez() {

        /*
            Desarrolla un programa que pida al usuario cuántos estudiantes y cuántas asignaturas hay.
            Crea una matriz para almacenar las notas (estudiantes x asignaturas).
            Usa bucles for anidados para rellenar la matriz con las notas. Luego:

            1.  Muestra todas las notas en formato de tabla
            2.  Calcula y muestra el promedio de cada estudiante
            3.  Calcula y muestra el promedio de cada asignatura
            4.  Encuentra la nota más alta de toda la clase y su posición
        */

        Scanner sc = new Scanner(System.in);

        // Pedir datos
        System.out.print("¿Cuántos estudiantes hay?: ");
        int estudiantes = sc.nextInt();

        System.out.print("¿Cuántas asignaturas hay?: ");
        int asignaturas = sc.nextInt();

        // Crear matriz de notas
        double[][] notas = new double[estudiantes][asignaturas];

        // Rellenar la matriz
        for (int i = 0; i < estudiantes; i++) {
            for (int j = 0; j < asignaturas; j++) {
                System.out.print("Introduce nota de estudiante " + (i + 1)
                        + ", asignatura " + (j + 1) + ": ");
                notas[i][j] = sc.nextDouble();
            }
        }

        // 1️⃣ Mostrar tabla de notas
        System.out.println("\n--- TABLA DE NOTAS ---");

        System.out.print("\t");
        for (int j = 0; j < asignaturas; j++) {
            System.out.print("Asig" + (j + 1) + "\t");
        }
        System.out.println();

        for (int i = 0; i < estudiantes; i++) {
            System.out.print("Est " + (i + 1) + ":\t");
            for (int j = 0; j < asignaturas; j++) {
                System.out.print(notas[i][j] + "\t");
            }
            System.out.println();
        }

        // 2️⃣ Promedio por estudiante
        System.out.println("\n--- PROMEDIOS POR ESTUDIANTE ---");
        for (int i = 0; i < estudiantes; i++) {
            double suma = 0;
            for (int j = 0; j < asignaturas; j++) {
                suma += notas[i][j];
            }
            System.out.printf("Estudiante %d: %.2f%n", (i + 1), suma / asignaturas);
        }

        // 3️⃣ Promedio por asignatura
        System.out.println("\n--- PROMEDIOS POR ASIGNATURA ---");
        for (int j = 0; j < asignaturas; j++) {
            double suma = 0;
            for (int i = 0; i < estudiantes; i++) {
                suma += notas[i][j];
            }
            System.out.printf("Asignatura %d: %.2f%n", (j + 1), suma / estudiantes);
        }

        // 4️⃣ Nota más alta y su posición
        double max = notas[0][0];
        int estMax = 0;
        int asigMax = 0;

        for (int i = 0; i < estudiantes; i++) {
            for (int j = 0; j < asignaturas; j++) {
                if (notas[i][j] > max) {
                    max = notas[i][j];
                    estMax = i;
                    asigMax = j;
                }
            }
        }

        System.out.println("\n--- NOTA MÁS ALTA ---");
        System.out.println("La nota más alta es " + max +
                " (Estudiante " + (estMax + 1) +
                ", Asignatura " + (asigMax + 1) + ")");

        sc.close();
    }
}


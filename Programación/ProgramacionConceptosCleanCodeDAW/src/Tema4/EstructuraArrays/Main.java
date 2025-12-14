package Tema4.EstructuraArrays;
import java.util.Random;
import java.util.Scanner;

    /*
        Ejemplo completo y comentado sobre uso de arrays en Java.
        Declaración e inicialización de arrays (primitivos y objetos)
        Lectura de longitud, acceso y modificación de elementos
        Recorridos con índice y con "enhanced for"
        Rellenar un array con valores aleatorios
        Contar ocurrencias y buscar la primera posición de un valor
        Uso de un array de Object y comprobación de tipos con instanceof

        Comentarios y explicaciones dentro del código.
    */

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);     // Para leer datos desde la consola
        Random rnd = new Random();               // Generador de números aleatorios


        //  --------------------------------------------------------------------------
                        /* 1) Declaración e inicialización de arrays */
        //  --------------------------------------------------------------------------

        // Array de booleanos con tamaño fijo (valores por defecto = false)
        boolean[] aciertos = new boolean[4];     // [false, false, false, false]

        // Array de Strings vacíos (nulls inicialmente)
        String[] palabras = new String[3];      // [null, null, null]

        // Array de Objects (puede contener cualquier tipo de objeto)
        Object[] cosas = new Object[5];         // [null, null, null, null, null]

        // Arrays con valores concretos (inicialización directa)
        int[] numerosConcretos = new int[] {5, 3, 1, 10, 8};
        Integer[] numerosConcretos2 = new Integer[] {4, 3, 1, 10, 8}; // Wrapper Integer
        int[] numerosConcretosCorto = {5, 3, 1, 10, 8};               // Forma corta
        boolean[] aciertosConcretos = new boolean[] {false, true, false};
        String[] palabrasConcretas = new String[] {"hola", "programacion", "array"};
        Object[] cosasConcretas = new Object[] {1, "hola", 0.0, 'a'}; // Mezcla: Integer, String, Double, Character


        //  --------------------------------------------------------------------------
                /* 2) Crear un array con tamaño dinámico y operaciones básicas */
        //  --------------------------------------------------------------------------

        // Crear un array de enteros con tamaño 6: sus valores iniciales son 0 (por ser primitivo int)
        int[] numeros = new int[6]; // [0,0,0,0,0,0]

        // Obtener la longitud (nº de elementos) con la propiedad .length
        int longitud = numeros.length;
        System.out.println("El número de elementos del array 'numeros' es " + longitud);

        // Modificar elementos por índice:
        numeros[0] = 19;                          // primer elemento (posición 0)
        numeros[numeros.length - 1] = 30;         // último elemento (posición length-1)

        // Acceder e imprimir elementos concretos:
        System.out.println("El elemento de la primera posición es " + numeros[0]);
        System.out.println("El elemento de la posición central es " + numeros[numeros.length / 2]);
        System.out.println("El elemento de la última posición es " + numeros[numeros.length - 1]);


        //  --------------------------------------------------------------------------
                /*3) Recorrer un array
                        - Con índice (for clásico) -> cuando necesitas el índice.
                        - Con enhanced for (for-each) -> cuando solo te interesa el valor.*/
        //  --------------------------------------------------------------------------

        System.out.println("\nRecorrido con índice (for clásico):");
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Posición %d -> %d%n", i, numeros[i]);
        }

        System.out.println("\nRecorrido con enhanced for (for-each):");
        int contador = 0;
        for (int item : numeros) {
            System.out.println("El elemento en iteración es " + item + " en posición " + contador);
            contador++;
        }


        //  --------------------------------------------------------------------------
                /* 4) Rellenar un array con números aleatorios (ejemplo interactivo) */
        //  --------------------------------------------------------------------------

        System.out.println("\n¿Cuántos números quieres guardar?");
        int tamanho = sc.nextInt();               // El usuario indica el tamaño
        if (tamanho <= 0) {
            System.out.println("Tamaño inválido. Se necesita un entero positivo.");
        } else {
            int[] valor = new int[tamanho];

            // Rellenar 'valor' con números aleatorios entre 1 y 5 (inclusive)
            for (int i = 0; i < valor.length; i++) {
                // rnd.nextInt(5) genera 0..4, +1 -> 1..5
                valor[i] = rnd.nextInt(5) + 1;
            }

            // Mostrar el array generado
            System.out.println("Array generado:");
            for (int i = 0; i < valor.length; i++) {
                System.out.printf("pos %d -> %d%n", i, valor[i]);
            }


            //  --------------------------------------------------------------------------
                    /* 5) Contar ocurrencias de un número dentro del array */
            //  --------------------------------------------------------------------------

            System.out.println("\n¿Qué número quieres buscar (1-5)?");
            int numeroBuscar = sc.nextInt();

            // Contar cuántas veces aparece el número
            int cont = 0;
            for (int item : valor) {
                if (item == numeroBuscar) {
                    cont++;
                }
            }
            System.out.println("El número de veces que aparece " + numeroBuscar + " es: " + cont);


            //  --------------------------------------------------------------------------
                    /* 6) Encontrar la primera posición donde aparece el número (si existe)*/
            //  --------------------------------------------------------------------------

            boolean encontrado = false;
            for (int i = 0; i < valor.length; i++) {
                if (valor[i] == numeroBuscar) {
                    System.out.println("La primera posición donde aparece " + numeroBuscar + " es: " + i);
                    encontrado = true;
                    break; // Paramos al encontrar la primera
                }
            }
            if (!encontrado) {
                System.out.println("El número " + numeroBuscar + " no se encuentra en la colección.");
            }
        }

        //  --------------------------------------------------------------------------
                 /* 7) Ejemplo con Object[] y comprobación de tipos (instanceof)
                    -> Permite almacenar distintos tipos pero requiere casting para operar.*/
        //  --------------------------------------------------------------------------

        System.out.println("\nEjemplo recorriendo 'cosasConcretas' y comprobando tipos:");
        for (Object item : cosasConcretas) {
            // 'instanceof' comprueba si el objeto es instancia de una clase específica
            if (item instanceof Integer) {
                // Al ser Integer (wrapper), hacemos un cast a Integer y lo desempaquetamos si hace falta
                int valorEntero = (Integer) item;
                if (valorEntero > 0) {
                    System.out.println("El número entero " + valorEntero + " es mayor que 0");
                } else {
                    System.out.println("El número entero " + valorEntero + " no es mayor que 0");
                }
            } else if (item instanceof String) {
                // Para Strings podemos usar .length() para obtener su longitud
                String palabra = (String) item;
                System.out.println("La longitud de la palabra \"" + palabra + "\" es " + palabra.length());
            } else if (item instanceof Double) {
                double d = (Double) item;
                System.out.println("Encontrado Double con valor " + d);
            } else if (item instanceof Character) {
                char c = (Character) item;
                System.out.println("Encontrado Character con valor '" + c + "'");
            } else {
                System.out.println("Tipo no manejado: " + item);
            }
        }

        // Cerrar el Scanner al final para liberar recursos
        sc.close();
    }
}
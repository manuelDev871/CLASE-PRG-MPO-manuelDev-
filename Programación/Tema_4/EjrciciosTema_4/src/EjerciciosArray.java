import java.util.Scanner;

public class EjerciciosArray {

    public void ejercicioUno() {
        /*
            Crea un programa que defina un array llamado frutas con 5 nombres de frutas.
            Luego, muestra todos los elementos del array en la consola, uno por línea.
         */

        String[] frutas = new String[] {"Manzana","Plátano","Naranja","Fresa","Uva"};
        System.out.println(frutas[0]);
        System.out.println(frutas[1]);
        System.out.println(frutas[2]);
        System.out.println(frutas[3]);
        System.out.println(frutas[4]);

    }

    public void ejercicioDos() {

        /*
            Escribe un programa que cree un array de 6 números enteros. Usa un bucle for para recorrer
            el array y mostrar cada número junto con su posición (índice).
         */

        int [] numeros = new int[] {11,42,301,4,55,86};

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posicion " + (i+1) + ": " + numeros[i]);
        }
    }

    public void ejercicioTres() {

        /*
            Desarrolla un programa que cree un array vacío de tamaño 5. Usa un bucle for para pedir
            al usuario que introduzca 5 nombres, guardándolos en el array. Al final, muestra todos los nombres almacenados.
         */

        Scanner sc = new Scanner(System.in);

        String[] nombres = new String[5];


        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Introduce el nombre " + (i+1));
            nombres[i] = sc.next();
        }

        for (String item : nombres) {
            System.out.println(item);
        }
    }

    public void ejercicioCuatro() {

        /*
            Crea un programa con un array de 7 números. Pide al usuario un número a
            buscar y usa un bucle for para recorrer el array. Si el número existe,
            muestra su posición. Si no existe, indica que no se encontró.
         */

        int[] numeros = new int[] {5,12,8,3,15,9,6};

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero que quieres buscar");
        int numero = sc.nextInt();
        boolean numeroEncontrado = false;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numero) {
                System.out.println("El numero " + numero + " se encuntra en la posición " + (i + 1));
                numeroEncontrado = true;
                break;
            }
        }

        if (!numeroEncontrado) {
            System.out.println("El numero " + numero + " no se encuntra en la lista");
        }

        sc.close();
    }

    public void ejercicioCinco() {

        /*
            Escribe un programa que defina un array de 10 números enteros.
            Usa un bucle for para contar cuántos números son mayores que 50 y muestra el resultado.
         */

        int[] numeros = new int[] {23,67,45,89,12,56,78,34,90,43};
        int contador = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 50) {
                contador++;
            }
        }
        System.out.println("Cantidad de numeros mayores que 50: " + contador);
    }

    public void ejercicioSeis() {

        /*
            Crea un programa con un array de 8 números decimales. Recorre el array con un bucle for
            para calcular la suma de todos los elementos. Luego, calcula y muestra el promedio.
         */

        double[] numeros = new double[] {4.5, 7.2, 3.8, 9.1, 5.6, 8.3, 6.7, 4.9};

        double suma = 0;
        double promedio = 0;

        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
            promedio = suma / numeros.length;
        }

        System.out.println("Suma total: " + suma);
        System.out.println("Promedio: " + promedio);
    }

    public void ejercicioSiete() {

        /*
            Desarrolla un programa que cree un array de 6 números. Usa bucles for para encontrar
            el número mayor y el número menor del array, y muestra ambos resultados.
         */

        int[] numeros = new int[] {15, 8, 23, 4, 19, 12};

        int mayor = numeros[0];
        int menor = numeros[0];

        // Recorremos el array desde el segundo elemento
        for (int i = 1; i < numeros.length; i++) {

            // Comprobar mayor
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }

            // Comprobar menor
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);
    }

    public void ejercicioOcho() {

        /*
            Crea un programa con un array de 10 palabras (pueden repetirse).
            Pide al usuario una palabra y usa un bucle for para contar cuántas
            veces aparece esa palabra en el array.
         */

        String[] palabras = new String[] {"gato", "perro", "gato", "pajaro", "gato", "pez", "perro", "gato", "conejo", "perro"};

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una palabra que quieras buscar en el array");
        String palabraUsuario = sc.next();
        int contadorPalabras = 0;

        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].equalsIgnoreCase(palabraUsuario)) {
                contadorPalabras++;
            }
        }

        System.out.println(palabraUsuario + " aparece " + contadorPalabras + " veces en el array");
        sc.close();
    }

    public void ejercicioNueve() {

        /*
            Escribe un programa que cree un array de 7 números. Usa un bucle for para crear un nuevo
            array con los elementos en orden inverso. Muestra ambos arrays: el original y el invertido.
         */


        int[] numeros = {2, 4, 6, 8, 10, 12, 14};

        // MUESTRO EL ARRAY INICIAL
        System.out.print("Array original: ");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

        System.out.println();

        // ARRAY INVERSO
        int[] numerosInverso = new int[numeros.length];

        // Llenamos el array inverso
        for (int i = 0; i < numeros.length; i++) {
            numerosInverso[i] = numeros[numeros.length - 1 - i];
        }

        // MUESTRO EL ARRAY INVERSO
        System.out.print("Array invertido: ");

        for (int i = 0; i < numerosInverso.length; i++) {
            System.out.print(numerosInverso[i] + " ");
        }
    }

    public void ejercicioDiez() {

        /*
            Desarrolla un programa que pida al usuario cuántos estudiantes hay en una clase.
            Crea un array para almacenar sus calificaciones (0-10). Usa un bucle while para
            rellenar el array con las notas. Luego, usa un bucle for para:

            1.  Mostrar todas las calificaciones
            2.  Calcular el promedio de la clase
            3.  Contar cuántos estudiantes aprobaron (nota ≥ 5)
            4.  Encontrar la nota más alta y la más baja
         */

        // 1 -> Pedir nº de estudiantes al usuario:
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cuántos estudiantes hay?: ");
        int numeroEstudiantes = sc.nextInt();

        // 2 -> Crear array que guarde las calificaciones:
        double[] calificaciones = new double[numeroEstudiantes];
        int numeroCalificaciones = 0;
        int contadorEstudiantes = 1;

        // 3 -> Bucle while que pide las califiaciones al usuario y las guarda en el array Calificaciones
        while (numeroEstudiantes > numeroCalificaciones) {
            System.out.print("Introduce la nota del estudiante " + contadorEstudiantes + ": ");
            calificaciones[numeroCalificaciones] = sc.nextDouble();
            numeroCalificaciones++;
            contadorEstudiantes++;
        }

        System.out.println();
        // 4 -> Bucle for para mostrar las calificaciones del array
        System.out.println("--- REPORTE DE CALIFICACIONES ---");
        System.out.println();
        System.out.print("Calificaciones: ");

        for (int i = 0; i < calificaciones.length; i++) {
            if (i == calificaciones.length - 1) {
                // Último elemento → sin coma
                System.out.print(calificaciones[i]);
            } else {
                System.out.print(calificaciones[i] + " , ");
            }
        }

        System.out.println();

        // 5 -> Bucle for para calcular el promedio de todas las notas del array

        double suma = 0;
        double promedio = 0;

        for (int i = 0; i < calificaciones.length; i++) {
            suma += calificaciones[i];
            promedio = suma / calificaciones.length;
        }

        System.out.println("Promedio de la clase: " + promedio);

        // 6 -> For para recorrer el array y ver cuantos estudiantes han aprobado

        int estudiantesAprobados = 0;

        for (int i = 0; i < calificaciones.length; i++) {
            if (calificaciones[i] >= 5) {
                estudiantesAprobados++;
            }
        }
        System.out.println("Estudiantes aprobados: " + estudiantesAprobados);

        // 7 ->

        double notaAlta = calificaciones[0];
        double notaBaja = calificaciones[0];

        for (int i = 1; i < calificaciones.length; i++) {
            // Nota mas alta
            if (calificaciones[i] > notaAlta) {
                notaAlta = calificaciones[i];
            }

            // Nota mas baja
            if (calificaciones[i] < notaBaja) {
                notaBaja = calificaciones[i];
            }
        }

        System.out.println("Nota más alta: " + notaAlta);
        System.out.println("Nota más baja: " + notaBaja);

        sc.close();
    }
}

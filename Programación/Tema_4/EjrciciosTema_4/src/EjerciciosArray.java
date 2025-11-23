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
    }
}

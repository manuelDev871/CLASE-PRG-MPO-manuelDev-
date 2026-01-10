package EjerciciosArraysRepaso.Ejercicio1;

public class Main {

    /*
        Crea un programa que defina un array llamado frutas con 5 nombres de frutas.
        Luego, muestra todos los elementos del array en la consola, uno por línea.
     */

    public static void main(String[] args) {

        String[] frutas = new String[] {"Manzana","Plátano","Naranja","Fresa","Uva"};

        System.out.println("Frutas en el array: ");

        for (String item : frutas) {
            System.out.println(item);
        }
    }
}

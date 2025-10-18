/* Ejercicio Nº 3 : Define cinco variables con diferentes tipos de datos (String, int, boolean, double, char)
   y muestra tanto su valor como su tipo. */

public class Ejercicio3_Tema_1 {

    public static void main (String[] args) {

        String nombre = "Manuel";
        Integer edad = 23;
        Boolean experiencia = true;
        Double altura = 1.71;
        Character DNI = 'b';

        System.out.println("Mi nombre es " + nombre + " y el tipo de variable es " + nombre.getClass().getSimpleName());
        System.out.println("Mi edad es de " + edad + " años y el tipo de variable es " + edad.getClass().getSimpleName());
        System.out.println("Mi experiencia es " + experiencia + " y el tipo de variable es " + experiencia.getClass().getSimpleName());
        System.out.println("Mi altura es de " + altura + " cms y el tipo de variable es " + altura.getClass().getSimpleName());
        System.out.println("Mi letra del DNI es " + DNI + " y el tipo de variable es " + DNI.getClass().getSimpleName());
    }
}

/*Crea un programa que declare una variable con valor inicial 100 y aplique diferentes
  operadores de asignación compuesta (+=, -=, *=, /=). Muestra el valor de la variable después de cada operación. */

public class Ejercicio3_Tema_2 {

    public static void main(String[] args) {

        int valor = 100;
        valor += 50;
        System.out.println("El resultado despues del += es " + valor);

        valor -= 30;
        System.out.println("El resultado despues del -= es " + valor);

        valor *= 2;
        System.out.println("El resultado despues del *= es " + valor);

        valor /= 4;
        System.out.println("El resultado despues del /= es " + valor);
        System.out.println("------------------------------------");
        System.out.println("EL RESULTADO FINAL ES " + valor);
    }




}

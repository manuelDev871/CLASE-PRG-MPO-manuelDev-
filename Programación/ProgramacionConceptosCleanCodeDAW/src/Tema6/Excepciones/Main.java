package Tema6.Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //int [] numeros = new int[] {1,2,3,4,5,6};

        // NullPointerException - ArrayIndexOutOfBooundsException - ArithException - InputMisMatchException

        Operaciones operaciones = new Operaciones();
        Scanner scanner = new Scanner(System.in);
        boolean fallo;

        System.out.println("Vamos a realizar opraciones");

        try {
            System.out.print("Indica el operando uno: ");
            int operandoUno = scanner.nextInt();
            System.out.print("Indica el operando dos: ");
            int operandoDos = scanner.nextInt();
            operaciones.sumar(operandoUno,operandoDos); // -> Va con la etiqueta que puede provocar error Arithmetric
        } catch (InputMismatchException e) {
            System.out.println("Error en la introduccion de los datos");
        } catch (ArithmeticException e) {
            System.out.println("Division entre cero, le pongo solucion");
        }



/*
        do {
            fallo = false;

            try {
                System.out.print("Indica el operando uno: ");
                int operandoUno = scanner.nextInt();
                System.out.print("Indica el operando dos: ");
                int operandoDos = scanner.nextInt();

                int suma = operandoUno + operandoDos;
                int multiplicacion = operandoUno * operandoDos;
                int division = operandoUno / operandoDos;

                System.out.println("Los resultados son: ");
                System.out.println("Suma: " + suma);
                System.out.println("Multiplicacion: " + multiplicacion);
                System.out.println("Division: " + division);
            } catch (InputMismatchException e) {
                System.out.println("El usuario ha introducido mal algun operando");
                System.out.print("Quieres iniciar el proceso nuevamente s/n: ");

                scanner = new Scanner(System.in);
                String respuesta = scanner.nextLine();
                if (respuesta.equals("s")) {
                    fallo = true;
                }
            } catch (ArithmeticException e) {
                System.out.println("El usuario ha intendao dividir entre 0");

                scanner = new Scanner(System.in);
                System.out.print("Quieres iniciar el proceso nuevamente s/n: ");
                String respuesta = scanner.nextLine();
                if (respuesta.equals("s")) {
                    fallo = true;
                }
            } catch (Exception e) {
                System.out.println("Fallo general");
            }

        } while (fallo);
*/

        System.out.println("Finalizando el proceso de calculo");

    }
}

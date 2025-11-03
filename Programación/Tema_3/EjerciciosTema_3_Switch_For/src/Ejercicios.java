import java.util.Scanner;

public class Ejercicios {

    /*  Ejercicio 1: Crea un programa que pida un número del 1 al 7 y use un switch para
        mostrar el día de la semana correspondiente (1=Lunes, 2=Martes, etc.).
     */

    public void ejercicioUno(){
        Scanner entradaTeclado = new Scanner(System.in);
        System.out.println("Introduce un numero del 1 al 7");
        int dia = entradaTeclado.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;

            case 2:
                System.out.println("Martes");
                break;

            case 3:
                System.out.println("Miércoles");
                break;

            case 4:
                System.out.println("Jueves");
                break;

            case 5:
                System.out.println("Viernes");
                break;

            case 6:
                System.out.println("Sábado");
                break;

            case 7:
                System.out.println("Domingo");
                break;

            default:
                System.out.println("Error, numero introducido no valido");
        }
        entradaTeclado.close();
    }


    /*  Ejercicio 2: Desarrolla un programa que pida una letra de calificación (A, B, C, D, F)
        y use un switch para mostrar el mensaje correspondiente: A="Excelente",
        B="Muy bien", C="Bien", D="Suficiente", F="Insuficiente".
     */

    public void ejercicioDos(){

        Scanner entradaTeclado = new Scanner(System.in);
        System.out.println("Introduce tu calificación (A-F): ");
        String letra = entradaTeclado.next();

        switch (letra.toLowerCase()) {
            case "a":
                System.out.println("Excelente");
                break;

            case "b":
                System.out.println("Muy bien");
                break;

            case "c":
                System.out.println("Bien");
                break;

            case "d":
                System.out.println("Suficiente");
                break;

            case "e":
                System.out.println("Insuficiente raspado");
                break;

            case "f":
                System.out.println("Insuficiente total");
                break;

            default:
                System.out.println("Datos introducidos incorrectamente");
        }
        entradaTeclado.close();
    }


    /*  Escribe un programa que pida dos números y una operación (+, -, *, /).
        Usa un switch para realizar la operación correspondiente y mostrar el resultado.
    */

    public void ejercicioTres() {

        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("Introduce el primer valor");
        int numeroUno = entradaTeclado.nextInt();

        System.out.println("Introduce el segundo valor");
        int numeroDos = entradaTeclado.nextInt();

        System.out.println("Indica que operacion desea realizar: \n" +
                "1 - Suma \n" +
                "2 - Resta \n" +
                "3 - Multiplicacion\n" +
                "4 - Division");

        int operacion = entradaTeclado.nextInt();

        double resultado = 0;

        switch (operacion) {
            case 1:
                System.out.println("Has elegido ¡SUMA!");
                resultado = numeroUno + numeroDos;
                break;

            case 2:
                System.out.println("Has elegido ¡RESTA!");
                resultado = numeroUno - numeroDos;
                break;

            case 3:
                System.out.println("Has elegido ¡MULTIPLICACIÓN!");
                resultado = numeroUno * numeroDos;
                break;

            case 4:
                System.out.println("Has elegido ¡DIVISIÓN!");
                resultado = (float) numeroUno / numeroDos;
                break;

            default:
                System.out.println("Operación fuera de rango");
        }
        System.out.println("El resultado de su operacion es " + resultado);
        entradaTeclado.close();
    }


    /*  Crea un programa que muestre un menú con 4 opciones:
        1=Ver perfil, 2=Configuración, 3=Ayuda, 4=Salir.
        Pide al usuario que elija una opción y usa un switch para
        mostrar el mensaje correspondiente a cada opción.
     */

    public void ejercicioCuatro(){

        System.out.println("------MENÚ------");

        Scanner entradaTeclado = new Scanner(System.in);
        System.out.println("1. Ver perfil \n" +
                "2. Configuración \n" +
                "3. Ayuda \n" +
                "4. Salir\n \n" +
                "Elige una opción");
        int operacion = entradaTeclado.nextInt();

        switch (operacion) {
            case 1:
                System.out.println("Has seleccionado: Ver perfil");
                break;

            case 2:
                System.out.println("Has seleccionado: Configuración");
                break;

            case 3:
                System.out.println("Has seleccionado: Ayuda");
                break;

            case 4:
                System.out.println("Has seleccionado: Salir");
                break;

            default:
                System.out.println("Opción no encontrada :(");
        }
        entradaTeclado.close();
    }


    /*  Desarrolla un programa que pida un mes (número del 1 al 12) y use un switch para
        determinar la estación del año: Invierno (12, 1, 2), Primavera (3, 4, 5), Verano (6, 7, 8), Otoño (9, 10, 11).
     */

    public void ejercicioCinco() {

        Scanner entradaTeclado = new Scanner(System.in);
        System.out.println("Introduce el numero del mes (1-12)");
        int mes = entradaTeclado.nextInt();

        switch (mes) {
            case 1:
            case 2:
            case 12:
                    System.out.println("El mes " + mes + " corresponde a: Invierno");
                break;

            case 3:
            case 4:
            case 5:
                    System.out.println("El mes " + mes + " corresponde a: Primavera");
                break;

            case 6:
            case 7:
            case 8:
                    System.out.println("El mes " + mes + " corresponde a: Verano");
                break;

            case 9:
            case 10:
            case 11:
                    System.out.println("El mes " + mes + " corresponde a: Otoño");
                break;

            default:
                System.out.println("El numero introducido no corresponde a ningún mes");
        }
        entradaTeclado.close();
    }


    // Escribe un programa que pida un número y use un bucle for para mostrar su tabla de multiplicar del 1 al 10.

    public void ejercicioSeis(){
        Scanner entradaTeclado = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int tabla = entradaTeclado.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.printf("%d * %d = %d\n",tabla, i, tabla * i);
        }

        entradaTeclado.close();
    }


    /*  Crea un programa que pida un número N y use un bucle for para calcular la suma
        de todos los números desde 1 hasta N. Muestra el resultado final.
    */

    public void ejercicioSiete() {
        Scanner entradaTeclado = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int numeroN = entradaTeclado.nextInt();

        int suma = 0;
        System.out.print("Sumando: ");

        for (int i = 1; i <= numeroN; i++) {
            suma += i;
            System.out.print(i);
            if (i < numeroN) {
                System.out.print("+");
            }

        }
        System.out.println();
        System.out.printf("La suma de numeros del 1 al " + numeroN + " es: " + suma);
    }


    /*  Desarrolla un programa que pida un número N y use un bucle for para contar
        cuántos números pares e impares hay desde 1 hasta N. Muestra ambos contadores.
    */

    public void ejercicioOcho () {
        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("Introduce un numero");
        int numeroN = entradaTeclado.nextInt();

        int pares = 0;
        int impares = 0;

        for (int i = 1; i <= numeroN; i++) {
            if (i %2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        System.out.println("Recorreindo numeros del 1 al " + numeroN + "...");
        System.out.println("Contador de numeros pares = " + pares);
        System.out.println("Contador de numeros impares = " + impares);

        entradaTeclado.close();
    }


    /*  Escribe un programa que pida un número entero positivo y calcule su factorial
        usando un bucle for. El factorial de N es: N! = N × (N-1) × (N-2) × ... × 1
     */

    public void ejercicioNueve () {
        Scanner entradaTeclado = new Scanner(System.in);
        System.out.println("Introduce un numero positivo");
        int numeroN = entradaTeclado.nextInt();
        int factorial = 0;

        System.out.println("Calculando " + numeroN + "!");
        for (int i = numeroN; i >= 1 ; i--) {
            System.out.print(i);
            if (i > 1) {
                System.out.print(" x ");
            }

            factorial += i;
        }
        System.out.println();
        System.out.println("El factorial de " + numeroN + " es: " + factorial);

        entradaTeclado.close();
    }


    /*  Crea un programa que muestre un menú con 3 tipos de ejercicios: 1=Flexiones, 2=Abdominales, 3=Sentadillas.
        Pide al usuario que elija un ejercicio y cuántas repeticiones quiere hacer.
        Usa un switch para determinar el ejercicio y un for para contar las repeticiones una a una.
     */

    public void ejercicioDiez() {
        // 1 -> Solicitar datos:

        Scanner entradaTeclado = new Scanner(System.in);
        System.out.printf("---------EJERCICIOS---------\n" +
                "1. Flexiones\n" +
                "2. Abdominales\n" +
                "3. Sentadillas \n");

        System.out.println("Elige un ejercicio (1-3)");
        int eleccion = entradaTeclado.nextInt();

        System.out.println("¿Cuantas repeticiones quieres hacer?");
        int repeticiones = entradaTeclado.nextInt();

        switch (eleccion) {
            case 1:
                System.out.println("Has elegido: Flexiones");

                for (int i = 1; i <= repeticiones ; i++) {
                    System.out.println("Repeticion " + i + " completada");
                }

                break;

            case 2:
                System.out.println("Has elegido: Abdominales");

                for (int i = 1; i <= repeticiones ; i++) {
                    System.out.println("Repeticion " + i + " completada");
                }

                break;

            case 3:
                System.out.println("Has elegido: Sentadillas");

                for (int i = 1; i <= repeticiones ; i++) {
                    System.out.println("Repeticion " + i + " completada");
                }

                break;

            default:
                System.out.println("Opción no encontrada");

        }
        System.out.println();
        System.out.println("¡Ejercicio completado! Ha hecho " + repeticiones + " repeticiones");
        entradaTeclado.close();
    }
}

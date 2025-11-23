public class Main {

    // break -> rompe una iteración y sale del bucle.
    // return -> retorna un valor o finaliza el metodo. Es la última instrucción que se ejecuta en ese metodo.
    // continue -> salta a la siguiente iteración, NO rompe el bucle.
    // if -> condicional que permite ejecutar un cuerpo u otro.
    // operador ternario -> asigna un valor según una condición lógica.

    public static void main(String[] args) {

        int acumulador = 0, intentos = 0;
        int[] numeros = {1, 4, -67, 23, -12, 24, 68, -96};


        /* ========================================================
           EJEMPLO 1: Bucle for con acumulación y break
        ==========================================================*/
        for (int i = 0; i < 10; i++) {
            acumulador += (int) (Math.random() * 101);
            intentos++;

            if (acumulador >= 301) {
                break;  // Rompe el bucle si se supera el límite.
            }

            System.out.println("Continuamos incrementando la variable, saldo insuficiente");
        }


        /* ========================================================
           EJEMPLO 2: Bucle do-while con break al cumplir condición
        ==========================================================*/
        do {
            System.out.println("Repitiendo");
            acumulador += (int) (Math.random() * 20);
            intentos++;

            if (acumulador > 100 && acumulador < 110) {
                break; // Rompe el bucle si el valor está entre 100 y 110.
            }

        } while (acumulador < 301);

        System.out.println("Terminando la ejecución con un saldo de " + acumulador);
        System.out.println("Has necesitado " + intentos + " intentos");


        /* ========================================================
           EJEMPLO 3: Condicional IF / ELSE IF
        ==========================================================*/
        if (acumulador == 10) {
            System.out.println("Acumulador valor 10");
        } else if (acumulador == 20) {
            System.out.println("Acumulador valor 20");
        }


        /* ========================================================
           EJEMPLO 4: Uso de return dentro de un bucle
        ==========================================================*/
        for (int i = 0; i < 10; i++) {
            System.out.println("Ejecutando en la vuelta " + i);

            if (i == 4) {
                return;  // Finaliza el metodo main por completo.
            } else if (i == 5) {
                return;
            }

            // Un return aqui terminaria todo el metodo.
        }


        /* ========================================================
           EJEMPLO 5: Uso de continue en un bucle
        ==========================================================*/
        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] < 0) {
                System.out.println("Número negativo");
                continue;  // Se salta esta iteración.
            }

            // Solo se ejecuta cuando el número es >= 0
            System.out.println(numeros[i]);
        }


        /* ========================================================
           EJEMPLO 6: Operador ternario
        ==========================================================
           variable = condición ? valorSiTrue : valorSiFalse;
        ==========================================================*/

        int nota = 5;

        String resultado = (nota >= 5) ? "Examen aprobado" : "Examen suspenso";
        boolean notaBool = (nota > 5) ? true : false;

        System.out.println(resultado);
        // También podría imprimirse directamente así:
        // System.out.println(nota >= 5 ? "Examen aprobado" : "Examen suspenso");
    }
}

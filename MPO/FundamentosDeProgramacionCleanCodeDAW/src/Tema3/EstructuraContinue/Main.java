package Tema3.EstructuraContinue;

public class Main {

    public static void main(String[] args) {

        ejemploBreak();
        ejemploContinue();
        ejemploReturn();
        ejemploIf();
        ejemploTernario();
    }

    // 🔹 break: rompe el bucle
    public static void ejemploBreak() {

        int acumulador = 0;
        int intentos = 0;

        for (int i = 0; i < 10; i++) {
            acumulador += (int) (Math.random() * 100);
            intentos++;

            if (acumulador >= 300) {
                break;
            }
        }

        System.out.println("BREAK → Total: " + acumulador + " | Intentos: " + intentos);
    }

    // 🔹 continue: salta la iteración actual
    public static void ejemploContinue() {

        int[] numeros = {1, 4, -67, 23, -12, 24, 68, -96};

        System.out.println("\nCONTINUE → Números positivos:");
        for (int numero : numeros) {
            if (numero < 0) {
                continue;
            }
            System.out.println(numero);
        }
    }

    // 🔹 return: finaliza el método
    public static void ejemploReturn() {

        System.out.println("\nRETURN:");
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                return;
            }
            System.out.println("Vuelta: " + i);
        }
    }

    // 🔹 if / else
    public static void ejemploIf() {

        int acumulador = 20;

        System.out.println("\nIF:");
        if (acumulador == 10) {
            System.out.println("Acumulador vale 10");
        } else if (acumulador == 20) {
            System.out.println("Acumulador vale 20");
        } else {
            System.out.println("Valor distinto");
        }
    }

    // 🔹 operador ternario
    public static void ejemploTernario() {

        int nota = 5;

        String resultado = nota >= 5 ? "Examen aprobado" : "Examen suspenso";
        boolean aprobado = nota >= 5;

        System.out.println("\nTERNARIO:");
        System.out.println(resultado);
        System.out.println("¿Aprobado?: " + aprobado);
    }
}

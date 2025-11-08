import java.util.Scanner;

public class MainWhile {

    public static void main(String[] args) {


        // BUCLE WHILE ->

        /*
            WHILE -> estructura que repite un cuerpo siempre que una condicion sea true
            ejecuciones minimas y maximas -> 0 a N
            mientras (condicion) {
                cuerpo -> romper con break o cambiar la condicion
            }
                ejecuta
         */

         /*
            // El bucle while se va a seguir ejecutando hasta que el numero introducido sea menor que 0 (numero negativo)
            Scanner scanner = new Scanner(System.in);
            int numero = 0;

            while (numero >= 0){
                System.out.println("Por favor, introduce un numero");
                numero = scanner.nextInt();
            }

            System.out.println("Sistema detenido");
        */

        /*
            // Ejemplo de ejercicio pin de movil con intentos en bucle While.

            Scanner entradaTeclado = new Scanner(System.in);
            int intentos = 3;
            int pin = 1234;
            int pinUsuario = 0;
            boolean bloqueado = false;

            while ((intentos >= 0) && (pinUsuario != pin)) {
                System.out.println("Por favor, introduce un pin");
                pinUsuario = entradaTeclado.nextInt();
                intentos--;
                if ((intentos == 0) && (pinUsuario != pin)) {
                    bloqueado = true;
                }
            }

            if (bloqueado) {
                System.out.println("Telefono bloqueado");
            } else {
                System.out.println("Bienvenido al telefono");
            }
        */


        // BUCLE DO WHILE ->

        /*
            do while -> se repite el cuerpo de un estamento siempre y cuando la condicion de repeticion sea true -> 1 a N
        */

        /*

            Scanner sc = new Scanner(System.in);
            int numero = 10;

            do {
                System.out.println("Lineas del cuerpo del bucle");
                System.out.println("Introduce un nuevo valor para un numero");
                numero = sc.nextInt();
            } while (numero >= 10);

        */

        // Ejemplo de menu

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Las opciones del menu son ");
            System.out.println("1 - Sumar");
            System.out.println("2 - Restar");
            System.out.println("3 - Salir");
            System.out.println("Que opcion quieres hacer");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Vamos a sumar");
                    break;

                case 2:
                    System.out.println("Vamos a restar");
                    break;

                case 3:
                    System.out.println("Saliendo......");
                    break;

                default:
                    System.out.println("Opcion no contemplada");
            }

        } while (opcion != 3);











    }
}

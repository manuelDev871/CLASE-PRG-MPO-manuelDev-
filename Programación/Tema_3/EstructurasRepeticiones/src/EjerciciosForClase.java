import java.util.Scanner;

public class EjerciciosForClase {

    public void ejercicioUno() {
        // Tablas del 0 al 10
        System.out.println("Tablas de multiplicar");
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j < 11; j++) {
                System.out.printf("%d x %d = %d \n", i, j, i * j);
            }
            System.out.println();
        }
    }


    public void ejercicioDos() {
        //Tabla del 2 y tabla del 6.
        for (int i = 2; i <= 6; i += 4) {
            System.out.println("Tabla del " + i + "\n");
            for (int j = 0; j < 11; j++) {
                System.out.printf("%d * %d = %d\n", i, j, i * j);
            }
            System.out.println();
        }
    }


    public void ejercicioTres() {
        //Tabla del 8 y del 12.
        for (int i = 8; i < 13; i += 4) {
            System.out.println("Tabla del " + i + "\n");
            for (int j = 0; j < 11; j++) {
                System.out.printf("%d * %d = %d\n", i, j, i * j);
            }
            System.out.println();
        }
    }


    public void ejercicioCuatro() {
        // Dibuja un cuadrado con asteriscos (*)

        Scanner entradaTeclado = new Scanner(System.in);
        System.out.println("Indica el tamaño del cuadrado");
        int tamanho = entradaTeclado.nextInt();

        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j <= tamanho; j++) {
                if ((i == 0) || (i == tamanho - 1)) {
                    System.out.print(" * ");
                } else if ((j == 0) || (j == tamanho - 1)) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println(" ");
        }

        entradaTeclado.close();
    }


    public void ejercicioCinco() {
        // Factorial de un numero

        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("Introduce un numero para hacer su factorial");
        int numeroF = entradaTeclado.nextInt();

        // Crear variable factorial -> siempre va a valer 1 o +, ya que nunca llega amultiplicar * 0.

        int factorial = 1;

        for (int i = numeroF; i >= 1 ; i--) {
            System.out.print(i);
            if (i > 1) {
                System.out.print(" x ");
            }
            factorial = factorial*i;
        }
        System.out.println();
        System.out.println("El resultado del factorial de " + numeroF + " es: " + factorial);

        entradaTeclado.close();
    }


    public void ejercicioSeis() {
        // ¿Una palabra es palindromo? Palindromo == se lee igual de izquierda a derecha que de derecha a izquierda.
        // Ejemplo: ana, oso

        String palabra = "allivessevilla";
        boolean esPalindromo = true;
        for (int i = 0; i < palabra.length()/2 ; i++) {
            // System.out.println(palabra.charAt(i));

            // i = 0 -> a != a
            // i = 1 -> l != l
            // i = 2 -> l != l
            if (palabra.charAt(i) != palabra.charAt(palabra.length()-1-i)) {
                esPalindromo = false;
                break;
            }
        }

        if (esPalindromo) {
            System.out.println("La palabra es palindromo");
        } else {
            System.out.println("La palabra no es palindromo");
        }
    }


    public void ejercicioSiete() {
        // ejemplo palindromo con Scanner.

        Scanner entradaTeclado = new Scanner(System.in);
        System.out.println("Introduce una palabra");
        String palabra = entradaTeclado.nextLine();

        boolean esPalindromo = true;

        for (int i = 0; i < palabra.length()/2; i++) {
            if (palabra.charAt(0) != palabra.charAt(palabra.length()-1-i)){
                esPalindromo = false;
                break;
            }
        }

        if (esPalindromo) {
            System.out.println("La palabra " + palabra + " es palindromo");
        } else {
            System.out.println("La palabra " + palabra + " no es palindromo");
        }
    }
}
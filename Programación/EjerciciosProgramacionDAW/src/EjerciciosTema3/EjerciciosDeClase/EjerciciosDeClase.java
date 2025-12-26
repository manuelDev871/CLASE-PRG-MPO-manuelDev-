package EjerciciosTema3.EjerciciosDeClase;
import java.util.Scanner;

public class EjerciciosDeClase {

    public void ejercicioUno() {

        /*  1.
            Crea un programa de adivinación de números El programa genera de manera
            aleatoria un número entre 1 y 50. El usuario debe adivinar el número en un
            máximo de 7 intentos. Después de cada intento, indica si el número es mayor
            o menor que el elegido. Si el usuario acierta, mostrar un aviso con el número
            de intentos utilizado; si no, mostrar un aviso de que debe introducir
            nuevamente un número.   */

        // 0 - Necesito pedir cosas por tecado
        // 1 - Generar numero aleatoio entre 1-50
        // 2 - 7 intentos / repeticiones
        // 3 - Indicar si elnumero es mayor o menor del elegido
        // 4 - Mostrar un aviso con elnumerodeintentos utilizado


        Scanner sc = new Scanner(System.in);
        int numeroSistemas = (int) ((Math.random()*50) + 1); // 0.0-0.999999 - > 1 - 50
        System.out.println("El nuero de sistema es " + numeroSistemas);

        int intentos = 7;
        int numeroUsuario;
        do {
            // vas a pedir el numero n veces como maximo 7 y como minimo 1
            System.out.println("Indica el numero con el que juegas");
            numeroUsuario = sc.nextInt();
            intentos--;

            if (numeroUsuario ==  numeroSistemas) {
                System.out.println("ENHORABUENA, HAS ACERTADO :)");
                break;
            } else {

                if (numeroSistemas < numeroUsuario) {
                    System.out.println("Numero demasiado grande");
                } else {
                    System.out.println("Numero demasiado pequeño");
                }
            }

            // Nº de intentos restantes
            System.out.println("Has consumido "+ (7 - intentos) + " intentos");
            System.out.println("Te quedan "+ (intentos) + " intentos");

        } while (intentos > 0);

        if (numeroUsuario != numeroSistemas) {
            System.out.println("Lo siento, has perdido :(");
        }

        sc.close();
    }
    public void ejercicioDos() {

        /*  2.
            Crea una aplicación que simule el funcionamiento del wordle. Para ello realiza
            las siguientes acciones:

            a. Crea una palabra de 5 letras. (funcionará como la palabra a adivinar)

            b. El programa debe seleccionar aleatoriamente una palabra del array y
               almacenarla como la palabra secreta.

            c. El usuario tiene 5 intentos como máximo para adivinar la palabra secreta.

            d. En cada intento, el usuario introduce una palabra por teclado.

            e. Tras cada intento, el programa debe indicar al usuario:

                i. Aciertos: cuántas letras tiene en la misma posición que la palabra
                secreta.

                ii. Aproximaciones: cuántas letras están en la palabra secreta, pero en una
                posición diferente.

                iii. Fallos: cuántas letras no están presentes en la palabra secreta.
                El juego termina cuando el usuario adivina la palabra o se acaban los 5 intentos.
        */


        // Pedir la palabra al usuario:
        Scanner sc = new Scanner(System.in);

        // Array de palabras; Mostrar la palabra de manera aleatoria:
        String [] palabras = {"datos","cosas","lucia","manta"};
        String palabraSecreta = palabras[(int) (Math.random()*4)];
        System.out.println("La palabra a adivinar es " + palabraSecreta);

        // Variable para guardar la palabra que introduce el usuario; nº de intentos:
        String palabraUsuario;
        int intentos = 5;

        // Bucle do while para nº de intentos; pide la palabra un max de (variable intentos):
        do {
            // Bucle do while que pide la palabra y verifica que cumple los requisitos de tener una longitud de 5 letras:
            do {
                System.out.println("Introduce la palabra");
                palabraUsuario = sc.next();

                if (palabraUsuario.length() != 5) {
                    System.out.println("Palabra invalida");
                }

            } while (palabraUsuario.length() != 5);

            System.out.println("Intento gastado");
            intentos--;

            // VARIABLES DEL BUCLE FOR:
            int numeroAciertos = 0;
            int numeroAproximaciones = 0;
            int numeroErrores = 0;

            if (palabraUsuario.equals(palabraSecreta)) {
                System.out.println("Palabra adivinada");
                numeroAciertos = 5;
                break;
            }

            // Analizar:
            for (int i = 0; i < palabraSecreta.length(); i++) {
                // i=0, 1, 2, 3, 4
                // cosas
                // datos

                if (palabraUsuario.charAt(i) == palabraSecreta.charAt(i)) {
                    numeroAciertos++;
                } else if (palabraSecreta.contains(String.valueOf(palabraUsuario.charAt(i)))) {
                    numeroAproximaciones++;
                } else {
                    numeroErrores++;
                }
            }

            System.out.println("El numero de aciertos es " + numeroAciertos);
            System.out.println("El numero de aproximaciones es " + numeroAproximaciones);
            System.out.println("El numero de errores es " + numeroErrores);

        } while (intentos > 0);

        System.out.println("Saliendo del juego...");

        sc.close();
    }
    public void ejercicioTres() {

        /*  3.
            Crea un programa que permita al usuario crear una pizza personalizada
            eligiendo ingredientes desde un menú.

            Reglas:
                • El programa muestra al usuario un menú con al menos cinco ingredientes
                  posibles y su precio individual. Ejemplo: queso (10), jamón (15), piña (8), tomate (6), pepperoni (12).

                • El usuario puede agregar hasta 5 ingredientes diferentes a su pizza,
                eligiendo uno por uno. El programa debe evitar que la cantidad máxima no se supere.

                • Por cada ingrediente elegido, el programa suma el precio correspondiente.

                • Después de cada selección, muestra al usuario la lista actual de ingredientes y el subtotal acumulado.

                • Cuando el usuario termina, muestra la pizza final detallada (con todos
                los ingredientes seleccionados) y el total a pagar.
        */


        Scanner sc = new Scanner(System.in);

        String ingredientes = "";

        int numeroIngredientes = 0;
        int totalPizza = 0;
        int opcionIngrediente;

        do {
            System.out.println("1. Queso");
            System.out.println("2. Jamon");
            System.out.println("3. Piña");
            System.out.println("4. Tomate");
            System.out.println("5. Peperonni");
            System.out.println("0. Parar de pedir");
            System.out.println("¿Que ingrediente quieres?");
            opcionIngrediente = sc.nextInt();

            switch (opcionIngrediente) {
                case 1 -> {
                    totalPizza += 10;
                    ingredientes += " Queso";
                }
                case 2 -> {
                    totalPizza += 15;
                    ingredientes += " Jamon";
                }
                case 3 -> {
                    totalPizza += 8;
                    ingredientes += " Piña";
                }
                case 4 -> {
                    totalPizza += 6;
                    ingredientes += " Tomate";
                }
                case 5 -> {
                    totalPizza += 12;
                    ingredientes += " Peperonni";
                }

            }
            numeroIngredientes++;
            System.out.println("El total de lo que llevas gastado es " + totalPizza);
            System.out.println("Los ingredientes que lleva tu pizza son: " + ingredientes);

        } while ((numeroIngredientes < 5) && (opcionIngrediente != 0));

        sc.close();
    }
    public void ejercicioCuatro() {

        /*  4.
            Crea un programa para jugar una partida virtual de dardos entre dos
            jugadores. El objetivo es que uno de los jugadores llegue exactamente a 0 puntos partiendo desde 301.

            Reglas:
                • Nada más empezar pide el nombre de cada jugador
                • Cada jugador comienza con 301 puntos.
                • En cada turno, un jugador lanza 3 dardos. Cada dardo genera un número
                  aleatorio entre 0 y 60 (simulando puntuación en dardos).
                • La puntuación del turno es la suma de los 3 dardos.
                • Resta la puntuación del turno al total de puntos del jugador.
                • Si la puntuación restante es menor que 0, se considera que el jugador "se
                  pasa" y su total no cambia ese turno.
                • El primer jugador que llegue exactamente a 0 gana la partida.
                • Después de cada turno, muestra las puntuaciones actuales y quién va
                  ganando (el que tiene menos puntos).
                • Al finalizar, muestra el ganador y cuántos turnos tomó la partida.
        */


        Scanner entradaTeclado = new Scanner(System.in);

        // Nombres de los jugadores
        System.out.print("Introduce el nombre del Jugador 1: ");
        String jugadorUno = entradaTeclado.next();

        System.out.print("Introduce el nombre del Jugador 2: ");
        String jugadorDos = entradaTeclado.next();

        // Marcadores iniciales
        int marcadorUno = 301;
        int marcadorDos = 301;

        int turnosTotales = 0; // Para guardar cuántos turnos tomó la partida
        boolean ganador = false;

        System.out.println("\n--- ¡COMIENZA LA PARTIDA! ---\n");

        // Bucle principal del juego
        while (!ganador) {

            // -------------------------
            // TURNO JUGADOR 1
            // -------------------------
            System.out.println("Turno de " + jugadorUno);
            int puntuacionTurno = 0;

            for (int i = 1; i <= 3; i++) {
                int dardo = (int) (Math.random() * 60) + 1;
                System.out.println("Dardo " + i + ": " + dardo);
                puntuacionTurno += dardo;
            }

            System.out.println("Puntuación total del turno: " + puntuacionTurno);

            // ¿Se pasa?
            if (marcadorUno - puntuacionTurno < 0) {
                System.out.println("¡" + jugadorUno + " se pasa! No se restan puntos.");
            } else {
                marcadorUno -= puntuacionTurno;
            }

            // Mostrar marcador
            System.out.println("Marcador de " + jugadorUno + ": " + marcadorUno);
            System.out.println("Marcador de " + jugadorDos + ": " + marcadorDos);

            // ¿Ha ganado?
            if (marcadorUno == 0) {
                ganador = true;
                break;
            }

            turnosTotales++;

            // -------- TURNO JUGADOR 2 --------
            System.out.println("\nTurno de " + jugadorDos);
            puntuacionTurno = 0;

            for (int i = 1; i <= 3; i++) {
                int dardo = (int) (Math.random() * 60) + 1;
                System.out.println("Dardo " + i + ": " + dardo);
                puntuacionTurno += dardo;
            }

            System.out.println("Puntuación total del turno: " + puntuacionTurno);

            if (marcadorDos - puntuacionTurno < 0) {
                System.out.println("¡" + jugadorDos + " se pasa! No se restan puntos.");
            } else {
                marcadorDos -= puntuacionTurno;
            }

            // Mostrar marcadores
            System.out.println("Marcador de " + jugadorUno + ": " + marcadorUno);
            System.out.println("Marcador de " + jugadorDos + ": " + marcadorDos);

            // ¿Ganador?
            if (marcadorDos == 0) {
                ganador = true;
                break;
            }

            turnosTotales++;

            System.out.println("\n--------------------------------\n");
        }

        System.out.println("\n--- FIN DE LA PARTIDA ---");
        if (marcadorUno == 0) {
            System.out.println("🎯 ¡" + jugadorUno + " gana la partida! 🎯");
        } else {
            System.out.println("🎯 ¡" + jugadorDos + " gana la partida! 🎯");
        }

        System.out.println("La partida duró un total de " + turnosTotales + " turnos.");

        entradaTeclado.close();
    }
    public void ejercicioCinco() {
        // Tablas del 0 al 10
        System.out.println("Tablas de multiplicar");
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j < 11; j++) {
                System.out.printf("%d x %d = %d \n", i, j, i * j);
            }
            System.out.println();
        }
    }
    public void ejercicioSeis() {
        //Tabla del 2 y tabla del 6.
        for (int i = 2; i <= 6; i += 4) {
            System.out.println("Tabla del " + i + "\n");
            for (int j = 0; j < 11; j++) {
                System.out.printf("%d * %d = %d\n", i, j, i * j);
            }
            System.out.println();
        }
    }
    public void ejercicioSiete() {
        //Tabla del 8 y del 12.
        for (int i = 8; i < 13; i += 4) {
            System.out.println("Tabla del " + i + "\n");
            for (int j = 0; j < 11; j++) {
                System.out.printf("%d * %d = %d\n", i, j, i * j);
            }
            System.out.println();
        }
    }
    public void ejercicioOcho() {
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
    public void ejercicioNueve() {
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
    public void ejercicioDiez() {
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
    public void ejercicioOnce() {
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

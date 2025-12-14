package EjerciciosTema3.EjerciciosWhile_DoWhile;
import java.util.Scanner;
import java.util.Random;


public class EjerciciosWhile_DoWhile {

    public void ejercicioUno() {

        // Crea un programa que pida un número N y use un bucle while para contar desde 1 hasta N, mostrando cada número.


        Scanner entradaTeclado = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int numeroN = entradaTeclado.nextInt();
        int contador = 1;

        System.out.println("Contando con while");
        while (contador <= numeroN) {
            System.out.println(contador);
            contador++;
        }

        System.out.println("Fin del conteo");

        entradaTeclado.close();
    }
    public void ejercicioDos() {

        /*  Desarrolla un programa que pida al usuario una contraseña. La contraseña correcta es "1234".
            Usa un bucle do-while para seguir pidiendo la contraseña hasta que el usuario la introduzca correctamente.  */


        Scanner entradaTeclado = new Scanner(System.in);

        String passCorrecta = "1234";
        String passUsuario;

        do {
            System.out.print("Introduce la contraseña: ");
            passUsuario = entradaTeclado.next();

            if (!passUsuario.equals(passCorrecta)) {
                System.out.println("Lo siento, contraseña incorrecta");
            } else {
                System.out.println("Enhorabuena, contraseña correcta");
            }

        } while (!passUsuario.equals(passCorrecta));

        entradaTeclado.close();
    }
    public void ejercicioTres() {

        /*  Escribe un programa que pida números al usuario y los vaya sumando.
            El bucle while debe continuar mientras el usuario introduzca números positivos.
            Cuando introduzca un número negativo o cero, el programa debe terminar y mostrar la suma total. */


        Scanner entradaTeclado = new Scanner(System.in);

        int numero;
        int suma = 0;

        System.out.println("Introduce números positivos para sumar. Introduce un número negativo o cero para terminar. ");

        System.out.print("Introduce un número: ");
        numero = entradaTeclado.nextInt();

        while (numero > 0) {
            System.out.println("Numero actual = " + numero);
            suma +=numero;

            System.out.print("Introduce otro número: ");
            numero = entradaTeclado.nextInt();
        }

        System.out.println("Programa terminado");
        System.out.println("Suma total: " + suma);

        entradaTeclado.close();
    }
    public void ejercicioCuatro() {

        /*  Crea un juego donde el programa elige un número secreto entre 1 y 10 (por ejemplo, 7).
            Usa un bucle do-while para pedir al usuario que adivine el número.
            El programa debe indicar si el número es mayor o menor, y continuar hasta que el usuario acierte.   */


        Scanner entrada = new Scanner(System.in);
        Random random = new Random();

        // Genera un número secreto entre 1 y 10
        int numeroSecreto = random.nextInt(10) + 1; // genera del 1 al 10
        int intento;

        System.out.println("🎲 Adivina el número secreto entre 1 y 10!");

        do {
            System.out.print("Introduce tu número: ");
            intento = entrada.nextInt();

            if (intento < numeroSecreto) {
                System.out.println("El número secreto es MAYOR. 🔼");
            } else if (intento > numeroSecreto) {
                System.out.println("El número secreto es MENOR. 🔽");
            } else {
                System.out.println("🎉 ¡Correcto! El número secreto era " + numeroSecreto + " 🎉");
            }

        } while (intento != numeroSecreto);

        entrada.close();
    }
    public void ejercicioCinco() {

        /*  Desarrolla un programa con un menú que se repita usando do-while.
            El menú debe tener 4 opciones: 1=Saludar, 2=Despedirse, 3=Ver hora actual (puedes mostrar un mensaje fijo), 4=Salir.
            Usa switch para procesar cada opción. El programa solo debe terminar cuando el usuario elija la opción 4.   */


        Scanner entradaTeclado = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("Elige una opción: \n" +
                    "1 - Saludar \n" +
                    "2 - Despedirse \n" +
                    "3 - Ver hora actual \n" +
                    "4 - Salir \n");
            opcion = entradaTeclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("¡HOLA!, ¿como estás?");
                    break;

                case 2:
                    System.out.println("¡Hasta luego!");
                    break;

                case 3:
                    System.out.println("Son las 19:30 p.m");
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no disponible :(");
            }

        } while (opcion != 4);

        entradaTeclado.close();
    }
    public void ejercicioSeis() {

        /*  Escribe un programa que pida un número N y use un bucle while para hacer una cuenta atrás desde N hasta 1,
            mostrando cada número. Al llegar a 1, debe mostrar "¡Despegue!".    */


        Scanner entradaTeclado = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int numN = entradaTeclado.nextInt();

        System.out.println("Cuenta atrás:");
        while (numN >= 1) {
            System.out.println(numN);
            numN = numN -1;
        }
        System.out.println("¡DESPEGUE!");

        entradaTeclado.close();
    }
    public void ejercicioSiete() {

        /*
            Crea un programa que pida al usuario cuántas calificaciones va a introducir.
            Luego, usa un bucle while para pedir cada calificación una por una,
            sumarlas y al final calcular y mostrar el promedio. */


        Scanner entradaTeclado = new Scanner(System.in);
        System.out.print("¿Cuántas calificaciones vas a introducir?: ");
        int numeroCalificaciones = entradaTeclado.nextInt();

        double sumaTotal = 0;
        int contador = 0;

        while (numeroCalificaciones > 0) {
            System.out.print("Introduce la calificación " + (contador + 1) + ": ");
            double nota = entradaTeclado.nextDouble();
            sumaTotal += nota;

            contador++;
            numeroCalificaciones--;
        }

        double promedio = sumaTotal / contador;

        System.out.println("Suma total: " + sumaTotal);
        System.out.printf("Promedio de calificaciones: %.2f",promedio);

        entradaTeclado.close();
    }
    public void ejercicioOcho() {

        /*  Desarrolla un programa que pida la edad del usuario. Usa un bucle do-while para validar que la edad
            introducida esté entre 0 y 120. Si no es válida, debe volver a pedirla.
            Una vez válida, muestra un mensaje de confirmación. */


        Scanner entradaTeclado= new Scanner(System.in);
        int edad;

        do {
            System.out.println("Introduce tu edad");
            edad = entradaTeclado.nextInt();

            if ((edad >= 0) && (edad <= 120)) {
                System.out.println("Edad válida: " + edad + " años");
            } else {
                System.out.println("Edad no válida. Debe estar entre 0 y 120.");
            }

        } while ((edad <= 0) || (edad > 120));

        entradaTeclado.close();
    }
    public void ejercicioNueve() {

        /*
            Crea un programa que pida al usuario cuántos estudiantes hay en una clase.
            Para cada estudiante, usa un bucle while para pedir su calificación numérica (0-10).
            Luego, usa un bucle for para mostrar todas las calificaciones
            y usa un switch para convertir cada nota numérica en letra:
            9-10 = A, 7-8 = B, 5-6 = C, 3-4 = D, 0-2 = F.   */


        Scanner entradaTeclado = new Scanner(System.in);
        System.out.print("¿Cuántos estudiantes hay en clase?: ");
        int numeroEstudiantes = entradaTeclado.nextInt();

        // Crear un arreglo para guardar las notas
        Double[] notas = new Double[numeroEstudiantes];

        int contador = 0;
        double nota;

        // Bucle while para pedir las calificaciones
        while (contador < numeroEstudiantes) {
            System.out.print("Introduce la nota del estudiante " + (contador + 1) + " (0-10): ");
            nota = entradaTeclado.nextDouble();

            // Validar que la nota esté en el rango permitido
            if (nota >= 0 && nota <= 10) {
                notas[contador] = nota; // Guardar la nota en el arreglo
                contador++;
            } else {
                System.out.println("⚠️ Nota no válida. Debe estar entre 0 y 10.");
            }
        }

        System.out.println("\n--- REPORTE DE CALIFICACIONES ---");

        // Bucle for para mostrar las notas y su equivalente en letra
        for (int i = 0; i < numeroEstudiantes; i++) {
            double variableTemporal = notas[i];
            String letra;

            // Convertir la nota numérica en letra usando switch
            switch ((int) variableTemporal) {
                case 10:
                case 9:
                    letra = "A";
                    break;

                case 8:
                case 7:
                    letra = "B";
                    break;

                case 6:
                case 5:
                    letra = "C";
                    break;

                case 4:
                case 3:
                    letra = "D";
                    break;

                default:
                    letra = "F";
                    break;
            }

            System.out.println("Estudiante " + (i + 1) + ": " + variableTemporal + " puntos = Calificación " + letra);
        }

        entradaTeclado.close();
    }
    public void ejercicioDiez() {

        /*  Desarrolla un programa que simule un cajero automático. El saldo inicial es 1000€. Usa un bucle do-while
            para mostrar un menú con opciones: 1=Consultar saldo, 2=Retirar dinero, 3=Depositar dinero, 4=Salir.
            Usa switch para cada opción. Para retirar dinero, usa un bucle while para validar que no se retire
            más del saldo disponible (si intenta retirar más, debe volver a pedir la cantidad). Para depositar,
            valida que sea una cantidad positiva.   */


        Scanner entrada = new Scanner(System.in);
        int saldo = 1000;
        int opcion;

        System.out.println("\nBIENVENIDO A SU CAJERO AUTOMÁTICO DE IBERCAJA");

        // Bucle principal para el menú
        do {
            System.out.println("\n---------------------- MENÚ ----------------------");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Retirar dinero");
            System.out.println("3 - Depositar dinero");
            System.out.println("4 - Salir");
            System.out.print("Elige una opción (1-4): ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Su saldo actual es: " + saldo + " €");
                    break;

                case 2:
                    System.out.println("Ha elegido retirar dinero.");
                    System.out.println("Saldo actual: " + saldo + " €");

                    System.out.print("¿Cuánto dinero desea retirar?: ");
                    int retirar = entrada.nextInt();

                    // Bucle WHILE para validar que no se retire más del saldo
                    while (retirar > saldo || retirar <= 0) {
                        System.out.println("Cantidad no válida o saldo insuficiente.");
                        System.out.print("Introduzca otra cantidad: ");
                        retirar = entrada.nextInt();
                    }

                    saldo -= retirar;
                    System.out.println("Ha retirado " + retirar + " €. Saldo restante: " + saldo + " €");
                    break;

                case 3:
                    System.out.println("Ha elegido depositar dinero.");
                    System.out.print("¿Cuánto dinero desea depositar?: ");
                    int deposito = entrada.nextInt();

                    // Validación de cantidad positiva
                    while (deposito <= 0) {
                        System.out.println("Debe ingresar una cantidad positiva.");
                        System.out.print("Introduzca otra cantidad: ");
                        deposito = entrada.nextInt();
                    }

                    saldo += deposito;
                    System.out.println("Ha depositado " + deposito + " €. Saldo total: " + saldo + " €");
                    break;

                case 4:
                    System.out.println("Gracias por usar el cajero automático de IBERCAJA. ¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }

        } while (opcion != 4);

        entrada.close();
    }
}

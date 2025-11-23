package EstructurasDeControl;

import java.util.Objects;
import java.util.Scanner;

public class EjerciciosSwitch {

    public void ejercicioUno() {

        /*
            Escribe un programa en Java que solicite al usuario ingresar un número del 1 al 7
            y muestre el día de la semana correspondiente utilizando una sentencia switch.
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero del 1 al 7");
        int numero = sc.nextInt();

        while (numero < 1 || numero > 7) {
            System.out.println("Numero no valido");
            System.out.println("Introduce un numero del 1 al 7");
            numero = sc.nextInt();
        }

        switch (numero) {
            case 1 -> {
                System.out.println("Lunes");
            }

            case 2 -> {
                System.out.println("Martes");
            }

            case 3 -> {
                System.out.println("Miércoles");
            }

            case 4 -> {
                System.out.println("Jueves");
            }

            case 5 -> {
                System.out.println("Viernes");
            }

            case 6 -> {
                System.out.println("Sábado");
            }

            case 7 -> {
                System.out.println("Domingo");
            }
        }

        sc.close();
    }

    public void ejercicioDos() {

        /*
            Crea un programa que permita al usuario ingresar un carácter y luego determine
            si es una vocal o una consonante utilizando una sentencia switch.
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un caracter");
        String caracter = sc.next();

        while (caracter.length() != 1) {
            System.out.println("Has introducido mas de un caracter");
            System.out.println("Introduce un unico caracter");
            caracter = sc.next();
        }

        switch (caracter) {
            case "a", "e", "i", "o", "u", "A", "E", "I", "O", "U" -> {
                System.out.println(caracter + " es una vocal");
            }

            default -> {
                System.out.println(caracter + " es una consonante");
            }
        }
        sc.close();
    }

    public void ejercicioTres() {

        /*
            Desarrolla un programa que reciba un número entero y, utilizando una sentencia switch, determine si es par o impar.
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero entero: ");
        int numero = sc.nextInt();

        int modulo = numero %2;

        switch (modulo) {
            case 0 -> {
                System.out.println(numero + " es par");
            }

            case 1, -1 -> {
                System.out.println(numero + " es impar");
            }
        }

        sc.close();
    }

    public void ejercicioCuatro() {

        /*
            Realiza un programa que solicite al usuario ingresar un mes (como un número del 1 al 12)
            y muestre la cantidad de días que tiene ese mes, considerando años no bisiestos.
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un mes del año (1 - 12): ");
        int mes = sc.nextInt();

        while (mes < 1 || mes > 12) {
            System.out.println("Mes introducido no válido");
            System.out.print("Por favor, introduce un mes del año válido (1 - 12): ");
            mes = sc.nextInt();
        }

        switch (mes) {
            case 2, 4, 6, 9, 11 -> {
                if (mes == 2) {
                    System.out.println("Febrero tiene 30 días");
                } else if (mes == 4) {
                    System.out.println("Abril tiene 30 días");
                } else if (mes == 6) {
                    System.out.println("Junio tiene 30 días");
                } else if (mes == 9) {
                    System.out.println("Septiembre tiene 30 días");
                } else {
                    System.out.println("Noviembre tiene 30 días");
                }
            }

            case 1, 3, 5, 7, 8, 10, 12 -> {
                if (mes == 1) {
                    System.out.println("Enero tiene 31 días");
                } else if (mes == 3) {
                    System.out.println("Marzo tiene 31 días");
                } else if (mes == 5) {
                    System.out.println("Mayo tiene 31 días");
                } else if (mes == 7) {
                    System.out.println("Julio tiene 31 días");
                } else if (mes == 8) {
                    System.out.println("Agosto tiene 31 días");
                } else if (mes == 10) {
                    System.out.println("Octubre tiene 31 días");
                } else {
                    System.out.println("Diciembre tienee 31 días");
                }
            }
        }

        sc.close();
    }

    public void ejercicioCinco() {

        /*
            Escribe un programa que pida al usuario ingresar un número del 1 al 12 y
            muestre el nombre del mes correspondiente utilizando una sentencia switch.
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un mes del año (1 - 12): ");
        int mes = sc.nextInt();

        while (mes < 1 || mes > 12) {
            System.out.println("Mes introducido no válido");
            System.out.print("Por favor, introduce un mes del año válido (1 - 12): ");
            mes = sc.nextInt();
        }

        switch (mes) {
            case 2 -> System.out.println("Febrero tiene 28 días");
            case 4, 6, 9, 11 -> System.out.println("Este mes tiene 30 días");
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("Este mes tiene 31 días");
        }

        sc.close();
    }

    public void ejercicioSeis() {

        /*
            Crea un programa que permita al usuario ingresar un número del 1 al 4 y muestre un mensaje
            diferente para cada número utilizando una sentencia switch (por ejemplo, "Opción 1 seleccionada",
            "Opción 2 seleccionada", etc.).
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero (1 - 4): ");
        int numero = sc.nextInt();

        while (numero < 1 || numero > 4) {
            System.out.println("Numero introducido no válido");
            System.out.println("Por favor, introduce un numero (1 - 4): ");
            numero = sc.nextInt();
        }

        switch (numero) {
            case 1:
                System.out.println("Opción 1 seleccionada");
                break;

            case 2:
                System.out.println("Opción 2 seleccionada");
                break;

            case 3:
                System.out.println("Opción 3 seleccionada");
                break;
            case 4:
                System.out.println("Opción 4 seleccionada");
                break;
        }

        sc.close();
    }

    public void ejercicioaSiete() {

        /*
            Desarrolla un programa que solicite al usuario ingresar una nota del 1 al 5 y
            muestre un mensaje de calificación utilizando una sentencia switch
            (por ejemplo, "Suspenso", "Aprobado", "Notable", "Sobresaliente", etc.).
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce tu nota (1 - 5): ");
        int nota = sc.nextInt();

        while (nota < 1 || nota > 5) {
            System.out.println("Nota introducida no válida");
            System.out.print("Por favor, introduce tu nota (1 - 5): ");
            nota = sc.nextInt();
        }

        switch (nota) {
            case 1:
                System.out.println("Suspenso");
                break;

            case 2:
                System.out.println("Aprobado");
                break;

            case 3:
                System.out.println("Notable");
                break;

            case 4:
                System.out.println("Sobresaliente");
                break;

            case 5:
                System.out.println("Matricula de honor");
                break;
        }

        sc.close();
    }

    public void ejercicioOcho() {

        /*
            Realiza un programa que pida al usuario ingresar un carácter que represente
            una operación matemática (+, -, *, /) y dos números. Luego, utiliza una sentencia
            switch para realizar la operación correspondiente y mostrar el resultado.
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una operación (+, -, *, /)");
        String operacion = sc.next();

        // Si no es válida, entonces entras al bucle
        while (!operacion.equals("+") && !operacion.equals("-") &&
                !operacion.equals("*") && !operacion.equals("/")) {

            System.out.println("Lo siento, operación no disponible, vuelve a intentarlo");
            System.out.println("Opciones: (+, -, *, /)");
            operacion = sc.next();
        }

        System.out.println("Introduce un 1º operando");
        double operandoUno = sc.nextDouble();

        System.out.println("Introduce un 2º operando");
        double operandoDos = sc.nextDouble();

        double resultado;

        switch (operacion) {
            case "+":
                System.out.println("Has elegido : SUMA");
                resultado = operandoUno + operandoDos;
                System.out.println("El resultado de la suma es " + resultado);
                break;

            case "-":
                System.out.println("Has elegido : RESTA");
                resultado = operandoUno - operandoDos;
                System.out.println("El resultado de la resta es " + resultado);
                break;

            case "*":
                System.out.println("Has elegido : MULTIPLICACIÓN");
                resultado = operandoUno * operandoDos;
                System.out.println("El resultado de la multiplicación es " + resultado);
                break;

            case "/":
                System.out.println("Has elegido: DIVSIÓN");
                if (operandoDos == 0) {
                    System.out.println("Lo siento, no se puede dividir entre 0");
                } else {
                    resultado = operandoUno / operandoDos;
                    System.out.printf("El resultado de la división es %.2f", resultado);
                }
                break;
        }

        sc.close();
    }

    public void ejercicioNueve() {

        /*
            Escribe un programa que solicite al usuario ingresar un número del 1 al 12 y
            muestre la estación del año correspondiente (por ejemplo, "Primavera", "Verano", "Otoño", "Invierno")
            utilizando una sentencia switch.
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce mes (1 - 12): ");
        int mes = sc.nextInt();

        while (mes < 1 || mes > 12) {
            System.out.println("Lo siento, mes no disponible, vuelve a intentarlo");
            System.out.print("Introduce mes (1 - 12): ");
            mes = sc.nextInt();
        }

        switch (mes) {
            case 3,4,5:
                System.out.println("Primavera");
                break;

            case 6,7,8:
                System.out.println("Verano");
                break;

            case 9,10,11:
                System.out.println("Otoño");
                break;

            case 12,1,2:
                System.out.println("Invierno");
                break;
        }
        sc.close();
    }

    public void ejercicioDiez() {

        /*
            Crea un programa que permita al usuario ingresar un código de producto (como una cadena de caracteres) y,
            utilizando una sentencia switch, muestre el nombre del producto y su precio correspondiente
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el codigo de producto que quieras consultar");
        System.out.println("Producto 1: AUR-123SC");
        System.out.println("Producto 2: AUR-456SC");
        System.out.println("Producto 3: AUR-789SC");
        String producto = sc.next();

        // Tienes dos  opciones, bucle while para validar que solo existen esos codigo de productos.
        // O en el switch, usar la opcion default y mostrar opcion no contemplada.
        // While te obliga a meter un producto correcto.
        while (!producto.equals("AUR-123SC") && !producto.equals("AUR-456SC") && !producto.equals("AUR-789SC")) {
            System.out.println("Lo siento, codigo de producto no encontrado, vuelve a intentarlo");
            System.out.println("Introduce el codigo de producto que quieras consultar");
            producto = sc.next();
        }

        switch (producto) {
            case "AUR-123SC" -> {
                System.out.println("Microondas");
                System.out.println("Precio: 49,99 €");
            }

            case "AUR-456SC" -> {
                System.out.println("Frigorifico");
                System.out.println("Precio: 299,99 €");
            }

            case "AUR-789SC" -> {
                System.out.println("Televisión");
                System.out.println("Precio: 649,99 €");
            }
        }
        sc.close();
    }
}

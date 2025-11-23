package EstructurasDeControl;

import java.util.Scanner;

public class EjerciciosIf {

    public void ejercicioUno() {

        /*
            Hágase un programa que lea dos enteros y compruebe si el primero es o no mayor que el segundo.
            En la salida se mostrará “El primero es mayor que el segundo” o “El primero no es mayor que el segundo”.
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un 1º valor entero: ");
        int valorUno = sc.nextInt();
        System.out.print("Introduce un 2º valor entero: ");
        int valorDos = sc.nextInt();

        if (valorUno > valorDos) {
            System.out.println("El primero es mayor que el segundo");
        } else {
            System.out.println("El primero no es mayor que el segundo");
        }

        sc.close();
    }

    public void ejercicioDos() {

        /*
            Hágase un programa que lea tres enteros positivos, y compruebe si alguno es suma de los otros dos.
            En la salida se mostrará “Ninguno es suma de los otros dos” o “8 = 2 + 6” (en este último caso se introdujeron los números 2, 8 y 6).
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un 1º valor entero: ");
        int valorUno = sc.nextInt();
        System.out.print("Introduce un 2º valor entero: ");
        int valorDos = sc.nextInt();
        System.out.print("Introduce un 3º valor entero: ");
        int valorTres = sc.nextInt();

        if (valorUno == (valorDos + valorTres)) {
            System.out.println("Valor 1 es la suma de valor 2 y valor 3");
            System.out.println(valorUno + " = " + valorDos + " + " + valorTres);
        } else if (valorDos == (valorUno + valorTres)) {
            System.out.println("Valor 2 es la suma de valor 1 y valor 3");
            System.out.println(valorDos + " = " + valorUno + " + " + valorTres);
        } else if (valorTres == (valorUno + valorDos)) {
            System.out.println("Valor 3 es la suma de valor 1 y valor 2");
            System.out.println(valorTres + " = " + valorUno + " + " + valorDos);
        } else {
            System.out.println("Ninguno es suma de los otros dos");
        }

        sc.close();
    }

    public void ejercicioTres() {

        /*
            Léase un número entero. Se comprobará si dicho número es o no múltiplo de 20,
            y también se comprobará si está o no entre -100 y 100. En la salida se mostrará uno de los siguientes menasajes:

            1.  “Es múltiplo de 20 y está entre -100 y 100”.
            2.  “Es múltiplo de 20 y no está entre -100 y 100”.
            3.  “No es múltiplo de 20 y está entre -100 y 100”-
            4.  “No es múltiplo de 20 y no está entre -100 y 100”.

            Un número es múltiplo de otro cuando su resto es igual a 0
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero entero: ");
        int numero = sc.nextInt();

        if ((numero % 20) == 0 && numero >= -100 && numero <= 100) {
            System.out.println("Es múltiplo de 20 y está entre -100 y 100");
        } else if ((numero % 20) == 0 && (numero < -100 || numero > 100)) {
            System.out.println("Es múltiplo de 20 y no está entre -100 y 100");
        } else if ((numero % 20) != 0 && numero >= -100 && numero <= 100) {
            System.out.println("No es múltiplo de 20 y está entre -100 y 100");
        } else {
            System.out.println("No es múltiplo de 20 y no está entre -100 y 100");
        }

        sc.close();
    }

    public void ejercicioCuatro() {

        /*
            Hágase un programa que compruebe si un año pedido por teclado es bisiesto.
            En la salida se mostrará o “Es bisiesto” o “No es bisiesto”,)
            El algoritmo para obtener si un año es bisiesto es el siguiente:
            un año es bisiesto si es múltiplo de 4.
         */

            Scanner sc = new Scanner(System.in);
            int anho;

            while (true) {

                System.out.print("Introduce un año (por ejemplo 2024): ");
                anho = sc.nextInt();

                if (esBisiesto(anho)) {
                    System.out.println("El año " + anho + " ES bisiesto ✔");
                } else {
                    System.out.println("El año " + anho + " NO es bisiesto ✘");
                }

                // Preguntar si desea repetir
                System.out.print("¿Desea comprobar otro año? (si/no): ");
                String respuesta = sc.next();

                if (!respuesta.equalsIgnoreCase("si")) {
                    System.out.println("Hasta pronto 👋");
                    break;
                }
            }

            sc.close();
        }
    //  Metodo que comprueba si un año es bisiesto
    private boolean esBisiesto(int anho) {
            return (anho % 400 == 0) || (anho % 4 == 0 && anho % 100 != 0);
    }

    public void ejercicioCinco() {

        /*
            Determinar si un número natural de 4 dígitos (entre 1000 y 9999) es capicúa.
            Se comprobará previamente que el número introducido tiene 4 dígitos.
            En la salida se mostrará uno de los siguientes mensajes:

            1.  “El número no tiene 4 dígitos”;
            2.  “Es capicúa”
            3.  “No es capicúa”.

            Un número es capicúa cuando se lee igual de izquierda a derecha que de derecha a izquierda
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero entero (1000 - 9999): ");
        int numero = sc.nextInt();


        // 1. Comprobar si tiene 4 dígitos y volver a introducirlo
            while (numero < 1000 || numero > 9999) {
                System.out.println("El número no tiene 4 dígitos");
                System.out.println("\"Introduce un numero entero (1000 - 9999): \"");
                numero = sc.nextInt();
            }

        // 2. Obtener los dígitos
        int d1 = numero / 1000;          // primer dígito
        int d2 = (numero / 100) % 10;    // segundo dígito
        int d3 = (numero / 10) % 10;     // tercer dígito
        int d4 = numero % 10;            // cuarto dígito

        // 3. Comprobar si es capicúa
        if (d1 == d4 && d2 == d3) {
            System.out.println("Es capicúa");
        } else {
            System.out.println("No es capicúa");
        }

        sc.close();
    }

    public void ejercicioSeis() {

        /*
            Introducir tres enteros entre -100 y 100. De cumplir los tres números la condición del rango,
            se obtendrá la suma de sus inversos (1/número ). En el caso de no estar alguno de los numeros
            en el rango se mostrará el mensaje “Alguno de los números no está entre -100 y 100”. No se sumará
            el inverso de aquellos valores que sean 0. Por ejemplo, se introducen los enteros 20, -4 y 100, y
            se muestra el valor 1/20 + 1/-4 + 1/100 = -0.19000.
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el 1º numero (-100 / 100): ");
        int numeroUno = sc.nextInt();

        System.out.print("Introduce el 2º numero (-100 / 100): ");
        int numeroDos = sc.nextInt();

        System.out.print("Introduce el 3º numero (-100 / 100): ");
        int numeroTres = sc.nextInt();

        // Comprobar si algún número está fuera de rango
        if (numeroUno < -100 || numeroUno > 100 ||
                numeroDos < -100 || numeroDos > 100 ||
                numeroTres < -100 || numeroTres > 100) {

            System.out.println("Alguno de los números no está entre -100 y 100");
            return;
        }

        double suma = 0;

        if (numeroUno != 0) {
            suma += 1.0 / numeroUno;
        }
        if (numeroDos != 0) {
            suma += 1.0 / numeroDos;
        }
        if (numeroTres != 0) {
            suma += 1.0 / numeroTres;
        }

        System.out.printf("La suma de los inversos es: %.5f\n", suma);

        sc.close();
    }

    public void ejercicioSiete() {

        /*
            Un número de 3 cifras es un número de Armstrong si la suma de sus dígitos elevado a 3 coincide con dicho número.
            Por ejemplo, 153 = 1+125+27. Dado un número de 3 cifras determinar si es o no un número Armstrong. Se comprobará
            previamente que el número introducido tiene 3 dígitos. En la salida se mostrará uno de los siguientes mensajes:

            1.  “El número no tiene 3 dígitos”
            2.  “Es un número Armstrong”
            3.  “No es un número Armstrong”.
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int numero = sc.nextInt();

        int digitoUno;
        int digitoDos;
        int digitoTres;
        int resultado = 0;

        digitoUno = (numero % 1000) / 100;
        digitoDos = (numero % 100) / 10;
        digitoTres = (numero % 10);

        if (numero < 100 || numero > 999) {
            System.out.println("Numero introducido no valido, no tiene 3 cifras.");
        } else {
            System.out.println("Numero introducido: " + numero);

            resultado = (digitoUno * digitoUno * digitoUno) + (digitoDos * digitoDos *digitoDos) + (digitoTres * digitoTres * digitoTres);
            System.out.println("El resultado es: " + resultado);

            if (resultado == numero) {
                System.out.println("Es un número Armstrong");
            } else {
                System.out.println("No es un número Armstrong");
            }
        }
        sc.close();
    }

    public void ejercicioOcho() {

        /*
            Leer tres enteros y mostrarlos ordenados.
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un 1º valor: ");
        int a = sc.nextInt();

        System.out.print("Introduce un 2º valor: ");
        int b = sc.nextInt();

        System.out.print("Introduce un 3º valor: ");
        int c = sc.nextInt();

        // Ordenar con intercambios simples
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        if (b > c) {
            int temp = b;
            b = c;
            c = temp;
        }

        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        System.out.println("Ordenados:");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        sc.close();


    }

    public void ejerccioNueve() {

        /*
            Se leen tres enteros y se comprobará si son o no consecutivos. Se mostrará en la salida

            “Son consecutivos” o “No son consecutivos”.
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un 1º valor: ");
        int a = sc.nextInt();

        System.out.print("Introduce un 2º valor: ");
        int b = sc.nextInt();

        System.out.print("Introduce un 3º valor: ");
        int c = sc.nextInt();

        if (a + 1 == b && b + 1 == c) {
            System.out.println("Son consecutivos");
        } else if (a - 1 == b && b - 1 == c){
            System.out.println("Son consecutivos");
        } else {
            System.out.println("No son consecutivos");
        }

        sc.close();
    }

    public void ejercicioDiez() {

        /*
            Se lee un número entero. Dicho número se incrementará en una unidad si es par,
            y se decrementará en una unidad si es impar. Se muestra por consola el nuevo valor del número.
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero entero");
        int numero = sc.nextInt();

        System.out.println("NUMERO INTRODUCIDO: " + numero);

        if (numero%2 == 0) {
            numero += 1;
        } else {
            numero -= 1;
        }
        System.out.println("El numero final es: " + numero);

        sc.close();
    }

    public void ejercicioOnce() {

        /*
            Se leen tres enteros y un valor booleano para ordenarlos ascendentemente
            o descendentemente. Se mostrarán los valores leídos ordenados.
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        int a = sc.nextInt();

        System.out.print("Introduce el segundo número: ");
        int b = sc.nextInt();

        System.out.print("Introduce el tercer número: ");
        int c = sc.nextInt();

        System.out.print("¿Orden ascendente? (true/false): ");
        boolean asc = sc.nextBoolean();

        // Encontrar el menor
        int menor = a;
        if (b < menor) menor = b;
        if (c < menor) menor = c;

        // Encontrar el mayor
        int mayor = a;
        if (b > mayor) mayor = b;
        if (c > mayor) mayor = c;

        // El número del medio es la suma menos el menor y el mayor
        int medio = a + b + c - menor - mayor;

        // Mostrar según el booleano
        System.out.println("Resultados:");
        if (asc) {
            System.out.println(menor + " " + medio + " " + mayor);
        } else {
            System.out.println(mayor + " " + medio + " " + menor);
        }

        sc.close();
    }

    public void ejercicioDoce() {

        /*
            Leer un número entero, se realizarán las siguientes acciones:

            *   Incrementará en 2 unidades si es par
            *   En 3 unidades si es múltiplo de 3
            *   En 5 unidades si es múltiplo de 5
            *   En el caso de no cumplirse ninguna de las anteiores, se incrementará en una unidad.

            Sólo se realiza un incremento.

            Mostrar por consola el valor del número obtenido
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero entero: ");
        int numero = sc.nextInt();
        System.out.println("NUMERO INTRODUCIDO: " + numero);

        if (numero%2 == 0) {
            numero += 2;
        } else if (numero % 3 == 0) {
            numero += 3;
        } else if (numero % 5 == 0) {
            numero += 5;
        } else {
            numero += 1;
        }

        System.out.println("El resultado final es: " + numero);
        sc.close();
    }

    public void ejercicioTrece() {

        /*
            Pedir el día, mes y año de una fecha e indicar si la fecha es correcta.
            Con meses de 28, 30 y 31 días. Sin años bisiestos.
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("VERIFICACION DE FECHA");
        System.out.print("Introduce el dia: ");
        int dia = sc.nextInt();
        System.out.print("Introduce el mes: ");
        int mes = sc.nextInt();
        System.out.print("Introduce el año: ");
        int anho = sc.nextInt();

        boolean fechaCorrecta = true;

        if (dia < 1 || dia > 31) {
            System.out.println("Fecha no valida, numero de dias introducidos inadecuadamente");
            fechaCorrecta = false;
        }

        if (mes < 1 || mes > 12) {
            System.out.println("Fecha no valida, numero de meses introducidos inadecuadamente");
            fechaCorrecta = false;
        }

        if (anho < 0 || anho > 9999) {
            System.out.println("Fecha no valida, numero de año introducido inadecuadamente");
            fechaCorrecta = false;
        }

        // Febrero (28 días siempre)
        if (mes == 2 && dia > 28) {
            System.out.println("Fecha incorrecta. No se contemplan años bisiestos en este programa.");
            fechaCorrecta = false;
        }

        // Meses de 30 días
        if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30) {
            System.out.println("Fecha incorrecta: ese mes solo tiene 30 días.");
            fechaCorrecta = false;
        }

        if (fechaCorrecta){
            System.out.println("Fecha introducida: " + dia + "/" + mes + "/" + anho);
        }

        sc.close();
    }

    public void ejercicioCatorce() {

        /*
            Pedir el día, mes y año de una fecha correcta y mostrar la fecha del día siguiente.
            Suponer que todos los meses tienen 30 días excepto febrero que tiene 28.
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("VERIFICACION DE FECHA");
        System.out.print("Introduce el dia: ");
        int dia = sc.nextInt();
        System.out.print("Introduce el mes: ");
        int mes = sc.nextInt();
        System.out.print("Introduce el año: ");
        int anho = sc.nextInt();

        boolean fechaCorrecta = true;

        if (mes < 1 || mes > 12) {
            System.out.println("Fecha no valida, numero de meses introducidos inadecuadamente");
            fechaCorrecta = false;
        }

        if (anho < 0 || anho > 9999) {
            System.out.println("Fecha no valida, numero de año introducido inadecuadamente");
            fechaCorrecta = false;
        }

        // Días máximos por mes
        int diasMes;

        if (mes == 2) {
            diasMes = 28;
        } else {
            diasMes = 30;
        }

        if (dia < 1 || dia > diasMes) {
            System.out.println("Día inválido para ese mes.");
            fechaCorrecta = false;
        }

        // --- Cálculo del día siguiente ---
        if (fechaCorrecta) {

            dia++; // sumamos un día

            if (dia > diasMes) {
                dia = 1;  // reiniciamos el día
                mes++;    // pasamos al siguiente mes

                if (mes > 12) {
                    mes = 1;  // nuevo año
                    anho++;
                }
            }

            System.out.println("La fecha del día siguiente es: " + dia + "/" + mes + "/" + anho);
        }

        sc.close();
    }
}

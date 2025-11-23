package EstructuraDeUnProgramaInformatico;

import javax.swing.plaf.PanelUI;
import java.util.Scanner;

public class Ejercicios {

    public void ejercicioUno() {

        /*  Crea un programa que declare constantes locales con tu nombre completo,
            dirección de casa (solo calle), número del portal, piso, letra del piso,
            código postal, localidad, provincia y país. Muestra por consola estos datos
            almacenados en las constantes como si fuera la dirección para enviar una carta.

            (Direccion)

            ENTRADA/SALIDA
            Luis González Sanz
            C/ Maria de Molina nº 51, 1A
            91023 Madrid
            España

         */

        //No pongo todas las variables como final porque pueden cambiar, ya que puedo irme a vivir a otro lugar, por ejemplo.
        final String nombreCompleto = "Manuel Cruz Sánchez";
        String direccion = "C/ Cacería nº 29, 2º";
        String cp = "06450";
        String localidad = "Quintana de la Serena";
        String provincia = "Extremadura";
        String pais = "España";

        System.out.println(nombreCompleto);
        System.out.println(direccion);
        System.out.println(cp + " " + localidad);
        System.out.println(provincia);
        System.out.println(pais);
    }

    public void ejercicioDos() {

        /*  Programa que lee el nombre completo y la edad de una persona, y muestra los datos leídos. (leerNombreEdad)

            ENTRADA/SALIDA
            ESCRIBE TU NOMBRE COMPLETO: Ana Garrido Alonso
            ESCRIBE TU EDAD: 23
            Te llamas Ana Garrido Alonso
            Tienes 23 años

         */

        Scanner entradaTeclado = new Scanner(System.in);

        System.out.print("ESCRIBE TU NOMBRE COMPLETO: ");
        String nombreCompleto = entradaTeclado.nextLine();

        System.out.print("ESCRIBE TU EDAD: ");
        int edad= entradaTeclado.nextInt();

        System.out.println("Te llamas " + nombreCompleto);
        System.out.println("Tienes "+ edad + " años");

        entradaTeclado.close();
    }

    public void ejercicioTres() {

        /*  Hágase un programa que lea dos variables enteras y obtenga las siguientes operaciones:

            a) Suma
            b) Resta
            c) Multiplicación
            d) División entera
            e) Resto
            f) División real
            g) Resto real
            (Operaciones)

         */

        Scanner entradaTeclado = new Scanner(System.in);

        System.out.print("Introduce el primer valor: ");
        int numeroUno = entradaTeclado.nextInt();

        System.out.print("Introduce el segundo valor: ");
        int numeroDos = entradaTeclado.nextInt();

        double divisionReal;
        divisionReal = ((double) numeroUno / numeroDos);

        double restoReal;
        restoReal = ((double) numeroUno % numeroDos);

        System.out.println("Suma: " + (numeroUno + numeroDos));
        System.out.println("Resta: " + (numeroUno - numeroDos));
        System.out.println("Multiplicación: " + (numeroUno * numeroDos));
        System.out.println("División entera: " + (numeroUno / numeroDos));
        System.out.println("Resto: " + (numeroUno % numeroDos));
        System.out.println("División real: " + divisionReal);
        System.out.println("Resto real: " + restoReal);

        entradaTeclado.close();
    }

    public void ejercicioCuatro() {

        /*  Unos amigos entra en un bar que ofrece las bebidas a 1,25€ y los bocadillos a 2,05€.
            El camarero les pregunta cuántas bebidas y bocadillos quieren. Calcula el coste de la consumición,
            mostrando primero el coste de las bebidas y de los bocadillos. (Bar)

            ENTRADA/SALIDA
            Número de bebidas: 3
            Número de bocadillos: 5
            Coste de las bebidas: 3.75
            Coste de los bocadillos: 10.25
            Coste consumición: 14.0

         */

        Scanner entradaTeclado = new Scanner(System.in);
        System.out.println("----------BIENVNIDO AL TABLADO DE MANUEL----------");

        System.out.print("¿Cuántas bebidas quieres?: ");
        int bebidas = entradaTeclado.nextInt();

        System.out.print("¿Cuántos bocadillos quieres?: ");
        int bocadillos = entradaTeclado.nextInt();

        System.out.println("Número de bebidas: " + bebidas);
        System.out.println("Número de bocadillos: " + bocadillos);

        double precioBebidas = bebidas * (1.25);
        double precioBocadillos = bocadillos * (2.05);
        double precioTotal = precioBebidas + precioBocadillos;

        System.out.printf("Coste de las bebidas: %.2f € \n", precioBebidas);
        System.out.printf("Coste de los bocadilos: %.2f € \n", precioBocadillos);
        System.out.printf("Coste total: %.2f €", precioTotal);

        entradaTeclado.close();
    }

    public void ejercicioCinco() {

        /*  Hágase un programa que convierta segundos en horas, minutos y segundos.(Segundos)

            *ENTRADA/SALIDA*

            Número de segundos: 24973
            Horas: 6
            Minutos: 56
            Segundos: 13

         */

        Scanner entradaTeclado = new Scanner(System.in);
        System.out.print("Introduce numero de segundos: ");
        int segundosTotales = entradaTeclado.nextInt();

        System.out.println(segundosTotales + " segundos, equivalen a: ");

        // 1 hora -> 60 min
        // 60 min -> 3600 segundos.

        int horas = segundosTotales / 3600;
        int minutos = (segundosTotales % 3600) / 60;
        int segundos = (segundosTotales & 60);

        System.out.println("Horas: " + horas);
        System.out.println("Minutos: " + minutos);
        System.out.println("Segundos: " + segundos);

        entradaTeclado.close();
    }

    public void ejercicioSeis() {

        /*  Permítase introducir el valor con IVA de una compra con dos decimales
            (la compra no puede ser superior a 500€ ni inferior a 0€) y el valor del IVA
            de dicha compra (valor entero entre 0 y 25%).¿Cuánto costó la compra sin IVA?
            ¿Cuánto fue el IVA? Muéstrese los resultados redondeados a dos decimales. (Compra)

            *ENTRADA/SALIDA*

            Valor de la compra (entre 0.00 y 500.00): 298,45
            IVA (entre 0 y 25%): 12
            Compra: 266.47
            IVA: 31.98
            ======
            298.45

         */

        Scanner entradaTeclado = new Scanner(System.in);
        System.out.println("Intrduce el valor de la compra");
        double valorCompra = entradaTeclado.nextDouble();

        System.out.println("Introduce el % de IVA");
        int porcentajeIva = entradaTeclado.nextInt();

        double precioSinIVA = valorCompra / (1 + porcentajeIva / 100.0);
        double ivaEuros = valorCompra - precioSinIVA;

        // Redondeo a 2 decimales
        precioSinIVA = Math.round(precioSinIVA * 100.0) / 100.0;
        ivaEuros = Math.round(ivaEuros * 100.0) / 100.0;

        System.out.println("Compra: " + precioSinIVA);
        System.out.println("IVA: " + ivaEuros);
        System.out.println("======");
        System.out.println(valorCompra);

        entradaTeclado.close();
    }

    public  void ejercicioSiete() {

        /*  Permítase introducir el valor del radio de una circuferencia con valores entre 0 y 100.
            Obténgase la longitud de la circunferencia (2πr) y el área del circulo (πr2) .(Circunferencia)
            NOTA El valor de PI se obtiene con Math.PI

            *ENTRADA/SALIDA*
            Escribe un radio entero: 15
            Longitud de la circunferencia: 94.24777960769379
            Area de circulo: 706.8583470577034

         */

        Scanner entradaTeclado = new Scanner(System.in);
        System.out.print("Introduce el valor del radio de la circunferencia: ");
        int radio = entradaTeclado.nextInt();

        double longitud = (2 * Math.PI) * radio;
        double area = Math.PI * (radio * radio);

        System.out.printf("La longitud de la circunferencia es de %.2f cms \n",longitud);
        System.out.printf("El area de la circunferencia es de %.2f cms cuadrados \n",area);

        entradaTeclado.close();
    }

    public void ejercicioOcho() {

        /*  Hágase una aplicación que permita realizar conversiones de temperaturas entre grados
            centígrados, farenheit y kelvin (los resultados se muestran redondeados a dos
            decimales). (Temperaturas)

            *ENTRADA/SALIDA*

            Grados centigrados: 15,70
            Farenheit: 60,26 Kelvin: 288,85
            Grados Farenheit: 45,32
            Centigrados: 7,4 Kelvin: 280,55
            Grados Kelvin: 345,23
            Centigrados: 72,08 Farenheit: 161,74

         */


        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("BIENVENIDO AL GESTOR DE CONVERSIONES DE TEMPERATURAS");
        System.out.println("----------------------------------------------------");

        int opcion;

        do {
            System.out.println("MENÚ DE OPCIONES");
            System.out.println("1. Convertir Celsius a Fahrenheit / Kelvin");
            System.out.println("2. Convertir Fahrenheit a Celsius / Kelvin");
            System.out.println("3. Convertir Kelvin a Celsius / Fahrenheit");
            System.out.println("4. Salir...");
            opcion = entradaTeclado.nextInt();

            switch (opcion) {

                // ------------------------------------------------------------------------
                // 1 → CELSIUS
                // ------------------------------------------------------------------------
                case 1 -> {
                    String repetir = "si";

                    System.out.print("Introduce grados Celsius: ");
                    double celsius = entradaTeclado.nextDouble();

                    while (repetir.equalsIgnoreCase("si")) {

                        System.out.println("¿A qué quieres convertir?");
                        System.out.println("1. Fahrenheit");
                        System.out.println("2. Kelvin");
                        int opcionInterna = entradaTeclado.nextInt();

                        if (opcionInterna == 1) {
                            double fahrenheit = (celsius * 9/5) + 32;
                            System.out.printf("%.2f °C equivalen a %.2f °F%n", celsius, fahrenheit);
                        } else {
                            double kelvin = celsius + 273.15;
                            System.out.printf("%.2f °C equivalen a %.2f K%n", celsius, kelvin);
                        }

                        System.out.println("¿Quieres hacer otra conversión? (si/no)");
                        repetir = entradaTeclado.next();
                    }
                }

                // ------------------------------------------------------------------------
                // 2 → FAHRENHEIT
                // ------------------------------------------------------------------------
                case 2 -> {
                    String repetir = "si";

                    System.out.print("Introduce grados Fahrenheit: ");
                    double fahrenheit = entradaTeclado.nextDouble();

                    while (repetir.equalsIgnoreCase("si")) {

                        System.out.println("¿A qué quieres convertir?");
                        System.out.println("1. Celsius");
                        System.out.println("2. Kelvin");
                        int opcionInterna = entradaTeclado.nextInt();

                        if (opcionInterna == 1) {
                            double celsius = (fahrenheit - 32) * 5/9; // ✔ fórmula corregida
                            System.out.printf("%.2f °F equivalen a %.2f °C%n", fahrenheit, celsius);
                        } else {
                            double kelvin = (fahrenheit - 32) * 5/9 + 273.15; // ✔ fórmula corregida
                            System.out.printf("%.2f °F equivalen a %.2f K%n", fahrenheit, kelvin);
                        }

                        System.out.println("¿Quieres hacer otra conversión? (si/no)");
                        repetir = entradaTeclado.next();
                    }
                }

                // ------------------------------------------------------------------------
                // 3 → KELVIN
                // ------------------------------------------------------------------------
                case 3 -> {
                    String repetir = "si";

                    System.out.print("Introduce grados Kelvin: ");
                    double kelvin = entradaTeclado.nextDouble();

                    while (repetir.equalsIgnoreCase("si")) {

                        System.out.println("¿A qué quieres convertir?");
                        System.out.println("1. Celsius");
                        System.out.println("2. Fahrenheit");
                        int opcionInterna = entradaTeclado.nextInt();

                        if (opcionInterna == 1) {
                            double celsius = kelvin - 273.15;
                            System.out.printf("%.2f K equivalen a %.2f °C%n", kelvin, celsius);
                        } else {
                            double fahrenheit = (kelvin - 273.15) * 9/5 + 32;
                            System.out.printf("%.2f K equivalen a %.2f °F%n", kelvin, fahrenheit);
                        }

                        System.out.println("¿Quieres hacer otra conversión? (si/no)");
                        repetir = entradaTeclado.next();
                    }
                }

                case 4 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción no válida.");
            }

        } while (opcion != 4);
    }

    public void ejercicioNueve() {

        /*   Hágase una aplicación que permita introducir el número de bebidas y bocadillos comprados (valores entre 0 y 20).
             Además se podrá introducir el precio de cada bebida (valor entre 0.00 € y 3.00 €) y de cada bocadillo (valor entre 0.00 € y 5.00 €).
             También se podrá introducir el número de alumnos que realizaron la compra (valor entre 0 y 10).
             Se mostrará el total de la compra (con el subtotal de las bebidas y de los bocadillos) y la cantidad que debe
             pagar cada alumno redondeada a 2 decimales. (CosteBar)

             *ENTRADA/SALIDA*

             Número de bebidas (entre 0 y 20): **3**
             Número de bocadillos (entre 0 y 20): **5**
             Precio de cada bebida (entre 0,00 y 3,00): **1,20**
             Precio de cada bocadillo (entre 0,00 y 3,00): **2,05**
             Número de alumnos (entre 1 y 10): **5**

         */

        Scanner sc = new Scanner(System.in);

        System.out.print("Número de bebidas (entre 0 y 20): ");
        int bebidas = sc.nextInt();
        while (bebidas < 0 || bebidas > 20) {
            System.out.print("Valor inválido. Introduce un número entre 0 y 20: ");
            bebidas = sc.nextInt();
        }

        System.out.print("Número de bocadillos (entre 0 y 20): ");
        int bocadillos = sc.nextInt();
        while (bocadillos < 0 || bocadillos > 20) {
            System.out.print("Valor inválido. Introduce un número entre 0 y 20: ");
            bocadillos = sc.nextInt();
        }

        System.out.print("Precio de cada bebida (entre 0,00 y 3,00): ");
        double precioBebida = sc.nextDouble();
        while (precioBebida < 0 || precioBebida > 3) {
            System.out.print("Valor inválido. Introduce un precio entre 0,00 y 3,00: ");
            precioBebida = sc.nextDouble();
        }

        System.out.print("Precio de cada bocadillo (entre 0,00 y 5,00): ");
        double precioBocadillo = sc.nextDouble();
        while (precioBocadillo < 0 || precioBocadillo > 5) {
            System.out.print("Valor inválido. Introduce un precio entre 0,00 y 5,00: ");
            precioBocadillo = sc.nextDouble();
        }

        System.out.print("Número de alumnos (entre 1 y 10): ");
        int alumnos = sc.nextInt();
        while (alumnos < 1 || alumnos > 10) {
            System.out.print("Valor inválido. Introduce un número entre 1 y 10: ");
            alumnos = sc.nextInt();
        }

        // Cálculos
        double totalBebidas = bebidas * precioBebida;
        double totalBocadillos = bocadillos * precioBocadillo;
        double totalCompra = totalBebidas + totalBocadillos;
        double precioPorAlumno = totalCompra / alumnos;

        // Salida
        System.out.println("--------------------------------------------");
        System.out.printf("Total bebidas: %.2f €%n", totalBebidas);
        System.out.printf("Total bocadillos: %.2f €%n", totalBocadillos);
        System.out.printf("Total compra: %.2f €%n", totalCompra);
        System.out.printf("A pagar por alumno: %.2f €%n", precioPorAlumno);

        sc.close();
    }

    public void ejercicioDiez() {

        /*  Se introducen los 5 dígitos de un número (decenas de mil, unidades de mil, centenas, decenas y unidades),
            y se obtiene el número correspondiente. (Numero)

            ENTRADA/SALIDA*

            Decenas de mil: 7
            Unidades de mil: 9
            Centenas: 0
            Decenas: 5
            Unidades: 0
            Numero introducido: 79050

         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero de 5 cifras");
        int numero = sc.nextInt();

        int decenasMil = numero / 10000;
        int unidadesMil =  (numero % 10000) / 1000;
        int centenas = (numero % 1000) / 100;
        int decenas = (numero % 100) / 10;
        int unidades = (numero % 10);

        System.out.println("Decenas de mil: " + decenasMil);
        System.out.println("Unidades de mil: " + unidadesMil);
        System.out.println("Centenas: " + centenas);
        System.out.println("Decenas: " + decenas);
        System.out.println("Unidades: " + unidades);
        System.out.println("El numero introducido es " + numero);

        sc.close();
    }

    public void ejercicioOnce() {

        /*  Hágase una aplicación que lea un entero entre 0 y 100.
            Compruébese (mostrándose verdadero o falso) las siguientes condiciones:

            a) Es par
            b) Es mayor que otro numero que introduce el usuario
            (CompararEntero)

            ENTRADA/SALIDA
            Escribe un entero entre 0 y 100: 55
            Par: false
            Mayor que numeroUsuario: true

         */

        // Solicitar datos.
        Scanner sc = new Scanner(System.in);

        // Bucle para pedir un numero entre 0 y 100.
        int numero;
        boolean numeroPar = true;
        boolean mayorQue = true;
        int numeroMayor;

        do {
            System.out.print("Introduce un numero entero (0 - 100): ");
            numero = sc.nextInt();

            // --------------------------------------
            // ES PAR ???????
            // --------------------------------------

            if (numero %2 == 0) {
                System.out.println("El numero " + numero + " es par" + " (" + numeroPar + ")");
            } else {
                numeroPar = false;
                System.out.println("El numero " + numero + " es impar" + " (" + numeroPar + ")");
            }

            // --------------------------------------
            // COMPARAR OTRO NUMERO CO EL NUMERO INICIAL
            // --------------------------------------

            System.out.print("Introduce un nuevo número para comparar (0 - 100): ");
            numeroMayor = sc.nextInt();

            if (numero > numeroMayor) {
                System.out.println("El numero " + numero + " es mayor que " + numeroMayor + " (" + mayorQue + ")");
            } else {
                mayorQue = false;
                System.out.println("El numero " + numero + " es menor que " + numeroMayor + " (" + mayorQue + ")");
            }

        } while ((numero < 0) || (numero > 100) || (numeroMayor < 0) || (numeroMayor > 100));

        sc.close();
    }

    public void ejercicioDoce() {

        /*  Hágase una aplicación que lea dos cadenas y las compare del siguiente modo:

            a) Son iguales
            b) La primera es menor que la segunda
            c) Son distintas

            (CompararCadenas)

            ENTRADA/SALIDA
            Escribe una palabra: hola
            Escribe una palabra: adios
            Son iguales: false
            La primera es menor que la segunda: false
            Son distintas: true

         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la primera palabra");
        String palabraUno = sc.next();
        System.out.println("Introduce la seguna palabra");
        String palabraDos = sc.next();

        boolean iguales = true;
        boolean larga = true;

        if (palabraUno.equals(palabraDos)) {
            System.out.println("Las palabras son iguales");
            System.out.println(iguales);
        } else {
            System.out.println("Las palabras son diferentes");
            iguales = false;
            System.out.println(iguales);
        }

        if (palabraUno.length() > palabraDos.length()) {
            System.out.println("La primera es mayor que la segunda: ");
            System.out.println(larga);
        } else if (palabraUno.length() < palabraDos.length()) {
            System.out.println("La primera es menor que la segunda: ");
            larga = false;
            System.out.println(larga);
        } else {
            System.out.println(palabraUno + " tiene la misma longitud que " + palabraDos);
        }
    }

    public void ejercicioTrece() {

        /*  Lea dos números entre 0 y 9, ambos inclusive. Compruébese (mostrándose verdadero o falso)
            las siguientes condiciones e indíquese cómo se evalúan:

            a) El primero es par y el segundo impar
            b) El primero es superior al doble del segundo e inferior a 8
            c) Son iguales o la diferencia entre el primero y el segundo es menor que 2

            (CompararEnteros)

            *ENTRADA/SALIDA*
            Escribe un número entre 0 y 9: **4**
            Escribe un número entre 0 y 9: **7**
            El primero es par y el segundo impar: true
            El primero es superior al doble del segundo e inferior a 8: false
            Son iguales o la diferencia entre el primero y el segundo es menor que 2: true

         */

        Scanner sc = new Scanner(System.in);

        int valorUno;
        int valorDos;

        do {
            System.out.print("VALOR 1: Escribe un número entre 0 y 9: ");
            valorUno = sc.nextInt();

            System.out.print("VALOR 2: Escribe un número entre 0 y 9: ");
            valorDos = sc.nextInt();

        } while ((valorUno < 0 || valorUno > 9) || (valorDos < 0 || valorDos > 9));

        // a) El primero es par y el segundo impar
        boolean a = (valorUno % 2 == 0) && (valorDos % 2 != 0);
        System.out.println("El primero es par y el segundo impar: " + a);

        // b) El primero es superior al doble del segundo e inferior a 8
        boolean b = (valorUno > (valorDos * 2)) && (valorUno < 8);
        System.out.println("El primero es superior al doble del segundo e inferior a 8: " + b);

        // c) Son iguales o la diferencia entre ambos es menor que 2
        boolean c = (valorUno == valorDos) || (Math.abs(valorUno - valorDos) < 2);
        System.out.println("Son iguales o la diferencia entre el primero y el segundo es menor que 2: " + c);

        sc.close();
    }

    public void ejercicioCatorce() {

        /*  Hágase una aplicación que permita introducir la edad de una persona (valores enteros entre 0 y 100),
            su nivel de estudios (valores entre 0 y 10) y sus ingresos (valores enteros entre 0 y 25000).
            Compruébese (mostrándose verdadero o falso) si dicha persona tiene más de 40 años, un nivel de estudios entre 5 y 8,
            ambos incluisives, y gana menos de 15000 €. (CondicionLogica)

            ENTRADA/SALIDA

            Edad: 23

            Nivel de estudios: 8

            Ingresos: 1200

            Mas de 40 años y estudios entre 5 y 8 y gana menos de 15000: false

         */

        Scanner sc = new Scanner(System.in);

        int edad;
        int nivel;
        int ingresos;

        do {
            System.out.println("Introduce la edad (0 - 100): ");
            edad = sc.nextInt();
        } while ((edad < 0) || (edad > 100));

        do {
            System.out.println("Introduce el nivel de estudios (0 - 10): ");
            nivel = sc.nextInt();
        } while ((nivel < 0) || (nivel > 10));

        do {
            System.out.println("Introduce tus ingresos (0 - 25000): ");
            ingresos = sc.nextInt();
        } while ((ingresos < 0) || (ingresos > 25000));

        boolean comprobar = (edad > 40) && (nivel >= 5) && (nivel <= 8) && (ingresos < 15000);

        System.out.println("EDAD: " + edad + " años");
        System.out.println("NIVEL DE ESTUDIOS: " + nivel);
        System.out.println("INGRESOS: " + ingresos);
        System.out.println("La solución es: " + comprobar);

        sc.close();
    }

    public void ejercicioQuince() {

        /*  Se lee un entero que se modifica de la siguiente manera:

            a) Incrementar en 5 unidades (+=5).
            b) Decrementar en 3 unidades(-=3).
            c) Multiplicar por 10 (*=10)
            d) Dividir por 2 (/=2)

            (AsignarEntero)

            *ENTRADA/SALIDA*
            ENTERO: **21**
            Incrementar 5 unidades: 26
            Decrementar 3 unidades: 23
            Multiplicar por 10:

          */

        Scanner sc = new Scanner(System.in);
        System.out.print("INTRODUCE UN NUMERO ENTERO: ");
        int numero = sc.nextInt();

        int incrementar;
        int decrementar;
        int multiplicar;
        int dividir;

        incrementar = numero += 5;
        decrementar = numero -= 3;
        multiplicar = numero *= 10;
        dividir = numero /= 2;

        System.out.println("Incrementar 5 unidades: " + incrementar);
        System.out.println("Decrementar 3 unidades: " + decrementar);
        System.out.println("Multiplicar por 10: " + multiplicar);
        System.out.println("Dividir entre 2: " + dividir);
        System.out.println("ENTERO: " + numero);

        sc.close();
    }
}
package EjerciciosTema3.EjerciciosIf;
import java.util.Scanner;

public class EjerciciosIf {

    public void ejercicioUno() {

        /*  Crea un programa que pida la edad del usuario y determine si es mayor de edad (18 años o más).
            Muestra un mensaje indicando si puede votar o no. */

        Scanner entradaTeclado = new Scanner(System.in);
        System.out.println("Introduce tu edad");
        int edad = entradaTeclado.nextInt();

        if (edad >= 18) {
            System.out.println("Eres mayor de edad, puedes votar");
        } else {
            System.out.println("Eres menor de edad, no puedes votar");
        }

        entradaTeclado.close();
    }
    public void ejercicioDos() {

        /*  Desarrolla un programa que pida un número al usuario y determine si es positivo,
            negativo o cero. Muestra el resultado por consola. */

        Scanner entradaTeclado = new Scanner(System.in);
        System.out.println("Introduce un número");
        int numero = entradaTeclado.nextInt();

        if (numero > 0) {
            System.out.println("El número es positivo");
        } else if (numero < 0) {
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número es 0");
        }

        entradaTeclado.close();
    }
    public void ejercicioTres() {

        /*  Escribe un programa que pida la nota de un examen (entre 0 y 10) y determine si el alumno ha aprobado
            (nota mayor o igual a 5) o ha suspendido. */

        Scanner entradaTeclado = new Scanner(System.in);
        System.out.println("Introduce tu nota del examen");
        float nota = entradaTeclado.nextFloat();

        if (nota >= 5) {
            System.out.println("¡ENHORABUENA!, has aprobado.");
        } else {
            System.out.println("Lo siento, has suspendido.");
        }

        entradaTeclado.close();
    }
    public void ejercicioCuatro() {

        /*  Crea un programa que pida el importe de una compra. Si el importe es mayor o igual a 100€,
            aplica un descuento del 10%. Muestra el importe original y el importe final a pagar. */

        Scanner entradaTeclado = new Scanner(System.in);
        System.out.println("Introduce el importe de la compra");
        double importe = entradaTeclado.nextDouble();

        if (importe >= 100) {
            System.out.println("El importe inicial es de " + importe + " €");
            double descuentoInicial = importe * 0.10;
            double descuentoFinal = importe - descuentoInicial;
            System.out.println("El importe final es de " + descuentoFinal + " €");
        } else {
            System.out.println("El importe final es de " + importe + " €");
            System.out.println("No se le aplica descuento");
        }

        entradaTeclado.close();
    }
    public void ejercicioCinco() {

        /*  Desarrolla un programa que pida un número entero y determine si es par o impar usando el operador módulo.
            Muestra un mensaje personalizado para cada caso. */

        Scanner entradaTeclado = new Scanner(System.in);
        System.out.println("Introduce un número");
        int numero = entradaTeclado.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El número introducido es par");
        } else {
            System.out.println("El número introducido es impar");
        }

        entradaTeclado.close();
    }
    public void ejercicioSeis() {

        /*  Escribe un programa que pida la edad del usuario y determine si puede acceder a contenido para mayores de 16 años.
            Si tiene 16 o más años, muestra "Acceso permitido", si no, muestra "Acceso denegado". */

        Scanner entradaTeclado = new Scanner(System.in);
        System.out.println("Introduce tu edad");
        int edad = entradaTeclado.nextInt();

        if (edad >= 16) {
            System.out.println("Acceso permitido");
        } else {
            System.out.println("Acceso denegado");
        }

        entradaTeclado.close();
    }
    public void ejercicioSiete() {

        /*  Crea un programa que pida una nota numérica (0-10) y determine la calificación: Suspenso (0-4),
            Aprobado (5-6), Notable (7-8) o Sobresaliente (9-10). */

        Scanner entradaTeclado = new Scanner(System.in);
        System.out.println("Introduce tu nota");
        double nota = entradaTeclado.nextDouble();

        if ((nota >= 0) && (nota < 5)) {
            System.out.println("Tu calificación es: Suspenso");
        } else if ((nota >= 5) && (nota <= 6)) {
            System.out.println("Tu calificación es: Aprobado");
        } else if ((nota > 6) && (nota <= 8)) {
            System.out.println("Tu calificación es: Notable");
        } else if ((nota > 8) && (nota <= 10)){
            System.out.println("Tu calificación es: Sobresaliente");
        } else {
            System.out.println("Error en la calificación");
        }

        entradaTeclado.close();
    }
    public void ejercicioOcho() {

        /*  Desarrolla un programa que pida dos números al usuario y determine cuál es mayor, o si son iguales.
            Muestra el resultado por consola. */

        Scanner entradaTeclado = new Scanner(System.in);
        System.out.println("Introduce un primer número");
        int num1 = entradaTeclado.nextInt();
        System.out.println("Introduce un segundo número");
        int num2 = entradaTeclado.nextInt();

        if (num1 > num2 ) {
            System.out.println("El numero uno es mayor que numero dos");
        } else if (num1 == num2) {
            System.out.println("El numero uno es igual al numero dos");
        } else {
            System.out.println("Numero uno es mas pequeño que numero dos");
        }

        entradaTeclado.close();
    }
    public void ejercicioNueve() {

        /*  Escribe un programa que pida el peso (en kg) y la altura (en metros) del usuario. Calcula el IMC (peso / altura²)
            y determina si está en peso normal (IMC entre 18.5 y 24.9), por debajo del peso normal (IMC menor a 18.5)
            o por encima del peso normal (IMC mayor a 24.9). */

        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("Introduce tu peso en kg");
        double peso = entradaTeclado.nextDouble();

        System.out.println("Introduce tu altura en metros");
        double altura = entradaTeclado.nextDouble();

        double IMC = peso / (altura * altura);

        if ((IMC >= 18.5) && (IMC <= 24.9)) {
            System.out.printf("Tu indice de masa corporal es de %.2f \n", IMC);
            System.out.println("Tu peso es normal");
        } else if (IMC < 18.5) {
            System.out.printf("Tu indice de masa corporal es de %.2f \n", IMC);
            System.out.println("Tu peso está por debajo del peso normal");
        } else {
            System.out.printf("Tu indice de masa corporal es de %.2f \n", IMC);
            System.out.println("Tu peso está por encima del peso normal");
        }

        entradaTeclado.close();
    }
    public void ejercicioDiez() {

        /*  Crea un programa que pida la altura del usuario (en cm) y determine si puede subir a una atracción.
            La altura mínima es 120 cm y la máxima es 200 cm. Si está dentro del rango, muestra "Puedes subir",
            si no, indica el motivo (demasiado bajo o demasiado alto). */

        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("Introduce tu altura en cms");
        int altura = entradaTeclado.nextInt();

        if ((altura >= 120) && (altura <= 200)) {
            System.out.println("Puedes subir");
        } else if (altura < 120){
            System.out.println("No puedes subir, eres demasiado bajo");
        } else {
            System.out.println("No puedes subir, eres demasiado alto");
        }

        entradaTeclado.close();
    }
    public void ejercicioOnce() {

        /*  Desarrolla un programa que pida el importe de una compra y si el cliente es socio (true/false).
            Aplica descuentos según estas reglas: Si es socio Y la compra es mayor o igual a 200€, descuento del 20%.
            Si es socio Y la compra es menor de 200€, descuento del 10%. Si NO es socio pero la compra es mayor o igual a 300€,
            descuento del 5%. En cualquier otro caso, no hay descuento. Muestra el importe original, el descuento aplicado y el importe final. */

        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("Introduce el importe de la compra");
        double importe = entradaTeclado.nextDouble();

        System.out.println("¿Eres socio? : (true / false)");
        boolean socio = entradaTeclado.nextBoolean();

        double descuento;
        double importeFinal;

        if ((socio) && (importe >= 200)) {
            descuento = importe * 0.2;
            importeFinal = importe - descuento;
            System.out.println("El importe original es de " + importe + " €");
            System.out.println("El total a pagar es de " + importeFinal + " €");
            System.out.println("El descuento aplicado es de " + descuento + " €");
        } else if ((socio) && (importe < 200)) {
            descuento = importe * 0.1;
            importeFinal = importe - descuento;
            System.out.println("El importe original es de " + importe + " €");
            System.out.println("El total a pagar es de " + importeFinal + " €");
            System.out.println("El descuento aplicado es de " + descuento + " €");
        } else if ((!socio) && (importe >= 300)) {
            descuento = importe * 0.05;
            importeFinal = importe - descuento;
            System.out.println("El importe original es de " + importe + " €");
            System.out.println("El total a pagar es de " + importeFinal + " €");
            System.out.println("El descuento aplicado es de " + descuento + " €");
        } else {
            System.out.println("El total a pagar es de " + importe + " €");
            System.out.println("No se le ha aplicado ningún descuento");
        }

        entradaTeclado.close();
    }
    public void ejercicioDoce() {

        /*  Crea un programa que pida al usuario crear una contraseña. La contraseña debe cumplir estos requisitos:
            tener al menos 8 caracteres de longitud, contener al menos un número, y NO puede ser "12345678" o "password".
            El programa debe verificar cada condición por separado usando operadores lógicos y mostrar si la contraseña
            es válida o no, indicando qué requisitos no cumple.

            Nota: Para este ejercicio, asume que tienes funciones auxiliares como longitudCadena(texto), contienNumero(texto). */

        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("Introduce contraseña");
        String pass = entradaTeclado.next();

        boolean nCaracteres = pass.length() >= 8;
        System.out.println("¿La contraseña tiene al menos 8 caracteres?: " + nCaracteres);

        boolean esValida = !(pass.equals("12345678")) || (pass.equals("password"));
        System.out.println("¿La pass es prohibida?: " + !esValida);

        boolean contieneNumero = pass.contains("1") || pass.contains("2")
                || pass.contains("3") || pass.contains("4") || pass.contains("5") || pass.contains("6")
                || pass.contains("7") || pass.contains("8") || pass.contains("9") || pass.contains("0");
        System.out.println("¿La pass contiene al menos un numero?: " + contieneNumero);

        boolean passValida = nCaracteres && esValida && contieneNumero;
        System.out.println("La contraseña es valida: " + passValida);
    }
    public void ejercicioTrece() {

        /*  Escribe un programa para calcular el precio de entrada a un museo. Pide la edad del usuario y el día de la semana
            (1=Lunes, 2=Martes... 7=Domingo). Las reglas son: Menores de 12 años: entrada gratis. Entre 12 y 17 años: 5€
            (pero gratis los martes). Entre 18 y 64 años: 10€ (pero 7€ los jueves). 65 años o más: 6€. Usa operadores
            lógicos para determinar el precio correcto y muestra el cálculo. */

        Scanner entradaTeclado = new Scanner(System.in);

        // 1º -> Solicitamos la información
        System.out.println("Introduce tu edad:");
        int edad = entradaTeclado.nextInt();

        System.out.println("Introduce el día de la semana: \n" +
                "Lunes = 1\n" +
                "Martes = 2\n" +
                "Miércoles = 3\n" +
                "Jueves = 4\n" +
                "Viernes = 5\n" +
                "Sábado = 6\n" +
                "Domingo = 7");

        int diaSemana = entradaTeclado.nextInt();

        // Mostrar edad y día
        System.out.println("Edad: " + edad + " años.");

        if (diaSemana == 1) {
            System.out.println("Día de la semana: Lunes");
        } else if (diaSemana == 2) {
            System.out.println("Día de la semana: Martes");
        } else if (diaSemana == 3) {
            System.out.println("Día de la semana: Miércoles");
        } else if (diaSemana == 4) {
            System.out.println("Día de la semana: Jueves");
        } else if (diaSemana == 5) {
            System.out.println("Día de la semana: Viernes");
        } else if (diaSemana == 6) {
            System.out.println("Día de la semana: Sábado");
        } else if (diaSemana == 7) {
            System.out.println("Día de la semana: Domingo");
        } else {
            System.out.println("Error: Día no válido.");
        }

        // 2º -> Condiciones según edad y día
        if (edad <= 0 || edad >= 100) {
            System.out.println("Error. Introduce de nuevo tu edad.");
        } else if (edad < 12) {
            System.out.println("Eres menor de 12 años, entrada gratuita.");
        } else if (edad <= 17) {
            if (diaSemana == 2) { // Martes
                System.out.println("Tienes " + edad + " años y hoy es martes, entrada gratuita.");
            } else {
                System.out.println("Tienes " + edad + " años, precio de la entrada: 5 €.");
            }
        } else if (edad <= 64) {
            if (diaSemana == 4) { // Jueves
                System.out.println("Tienes " + edad + " años y hoy es jueves, precio reducido: 7 €.");
            } else {
                System.out.println("Tienes " + edad + " años, precio de la entrada: 10 €.");
            }
        } else {
            System.out.println("Tienes " + edad + " años, precio de la entrada: 6 €.");
        }

        entradaTeclado.close();
    }
    public void ejercicioCatorce() {

        /*  Desarrolla un programa que determine si una persona es elegible para un préstamo bancario.
            Pide: edad, ingresos mensuales (€), y si tiene deudas pendientes (true/false). Los requisitos son: Edad entre 21 y 65 años,
            ingresos mensuales de al menos 1000€, y NO tener deudas pendientes. El programa debe evaluar cada condición y
            mostrar si es elegible o no, explicando qué requisitos no cumple. */

        // 1º -> Solicitar informacion al usuario.

        Scanner estradaTeclado = new Scanner(System.in);

        // Solicitar edad / ingresos / deudas (true/false).

        System.out.println("Introduce tu edad");
        int edad = estradaTeclado.nextInt();

        System.out.println("Introduce tus ingresos mensuales");
        int ingresos = estradaTeclado.nextInt();

        System.out.println("¿Tienes deudas pendientes? (true / false)");
        boolean deudas = estradaTeclado.nextBoolean();

        if ((edad >= 21) && (edad <= 65)) {
            System.out.println("Requisito de edad: Check");
        } else {
            System.out.println("Requisito de edad: Uncheck");
        }

        if (ingresos >= 1000) {
            System.out.println("Ingresos mensuales: Check");
        } else {
            System.out.println("Ingresos mensuales: Uncheck");
        }

        if (!deudas) {
            System.out.println("No tienes ninguna deuda: Check");
        } else {
            System.out.println("Tienes deudas: Uncheck");
        }

        System.out.println("----------------------------------------------");

        if ((edad >= 21) && (edad <= 65) && (ingresos >= 1000) && !deudas) {
            System.out.println("¡Felicidades! Eres elegible para solicitar el préstamo.");
        } else {
            System.out.println("Lo siento, no eres elegible para solicitar el préstamo.");
        }

        estradaTeclado.close();
    }
    public void ejercicioQuince() {

        /*  Crea un programa que calcule el coste de envío de un paquete. Pide: peso del paquete (kg),
            distancia de envío (km), y si es envío urgente (true/false). Las reglas son: Precio base: 5€.
            Si el peso es mayor de 5kg, añadir 2€ por cada kg adicional.
            Si la distancia es mayor de 100km, añadir 10€. Si es envío urgente, multiplicar el precio total por 1.5.
            Muestra todos los cálculos paso a paso. */

        Scanner entradaTeclado = new Scanner(System.in);

        System.out.print("Introduce el peso del paquete (kg): ");
        double peso = entradaTeclado.nextDouble();

        System.out.print("Introduce la distancia de envío (km): ");
        double distancia = entradaTeclado.nextDouble();

        System.out.print("¿Es envío urgente? (true/false): ");
        boolean envioUrgente = entradaTeclado.nextBoolean();

        // Validación de entrada
        if (peso < 0 || distancia < 0) {
            System.out.println("❌ Valores incorrectos. Peso y distancia deben ser positivos.");
            entradaTeclado.close();
            return;
        }

        // Cálculo paso a paso
        double precioBase = 5.0;
        double recargoPeso = 0.0;
        double recargoDistancia = 0.0;
        double precioFinal;

        if (peso > 5) {
            recargoPeso = (peso - 5) * 2;
        }

        if (distancia > 100) {
            recargoDistancia = 10;
        }

        precioFinal = precioBase + recargoPeso + recargoDistancia;

        if (envioUrgente) {
            precioFinal *= 1.5;
        }

        // Mostrar resultados
        System.out.println("\n---------- RESULTADO ----------");
        System.out.printf("Peso total: %.2f kg%n", peso);
        System.out.printf("Peso adicional: %.2f kg%n", Math.max(peso - 5, 0));
        System.out.printf("Distancia total: %.2f km%n", distancia);
        System.out.println("Envío urgente: " + envioUrgente);
        System.out.printf("Precio base: %.2f €%n", precioBase);
        System.out.printf("Recargo por peso: %.2f €%n", recargoPeso);
        System.out.printf("Recargo por distancia: %.2f €%n", recargoDistancia);
        if (envioUrgente) {
            System.out.println("Recargo por envío urgente: +50%");
        }
        System.out.printf("👉 Precio final: %.2f €%n", precioFinal);

        entradaTeclado.close();
    }
}

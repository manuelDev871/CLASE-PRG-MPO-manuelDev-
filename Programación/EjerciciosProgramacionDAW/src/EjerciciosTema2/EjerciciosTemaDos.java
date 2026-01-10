package EjerciciosTema2;
import java.util.Scanner;

public class EjerciciosTemaDos {

    public void ejercicioUno() {

        /*Crea un programa que pida al usuario dos números enteros por consola y muestre el resultado de las cinco
          operaciones aritméticas básicas: suma, resta, multiplicación, división y módulo (resto). */

        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("Introduce un primer valor");
        double numeroUno = entradaTeclado.nextDouble();

        System.out.println("Introduce un segundo valor");
        double numeroDos = entradaTeclado.nextDouble();

        float division = (float) (numeroUno /  numeroDos);

        System.out.println("El resultado de la suma es " + (numeroUno + numeroDos));
        System.out.println("El resultado de la resta es " + (numeroUno - numeroDos));
        System.out.println("El resultado de la multiplicación es " + (numeroUno * numeroDos));
        System.out.printf("El resultado de la división es %.2f \n", division);
        System.out.println("El resultado del módulo (Resto) es " + (numeroUno % numeroDos));

        entradaTeclado.close();
    }
    public void ejercicioDos() {

        /*Escribe un programa que pida dos números al usuario y muestre el resultado de todas las comparaciones
          relacionales entre ellos (mayor que, menor que, igual, diferente, mayor o igual, menor o igual).*/

        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("Introduce un primer valor");
        int numeroUno = entradaTeclado.nextInt();

        System.out.println("Introduce un segundo valor");
        int numeroDos = entradaTeclado.nextInt();

        boolean mayorQue = numeroUno > numeroDos;
        System.out.println("¿Es " + numeroUno + " mayor que " + numeroDos + " ?: " + mayorQue);

        boolean menorQue = numeroUno < numeroDos;
        System.out.println("¿Es " + numeroUno + " menor que " + numeroDos + " ?: " + menorQue);

        boolean igual = numeroUno == numeroDos;
        System.out.println("¿Es " + numeroUno + " igual a " + numeroDos + " ?: " + igual);

        boolean diferente = numeroUno != numeroDos;
        System.out.println("¿Es " + numeroUno + " diferente de " + numeroDos + " ?: " + diferente);

        boolean mayorIgual = numeroUno >= numeroDos;
        System.out.println("¿Es " + numeroUno + " mayor o igual que " + numeroDos + " ?: " + mayorIgual);

        boolean menorIgual = numeroUno <= numeroDos;
        System.out.println("¿Es " + numeroUno + " menor o igual que " + numeroDos + " ?: " + menorIgual);

        entradaTeclado.close();
    }
    public void ejercicioTres() {

        /*Crea un programa que declare una variable con valor inicial 100 y aplique diferentes
          operadores de asignación compuesta (+=, -=, *=, /=). Muestra el valor de la variable después de cada operación. */

        int valor = 100;
        valor += 50;
        System.out.println("El resultado despues del += es " + valor);

        valor -= 30;
        System.out.println("El resultado despues del -= es " + valor);

        valor *= 2;
        System.out.println("El resultado despues del *= es " + valor);

        valor /= 4;
        System.out.println("El resultado despues del /= es " + valor);
        System.out.println("------------------------------------");
        System.out.println("EL RESULTADO FINAL ES " + valor);
    }
    public void ejercicioCuatro() {

        /*Desarrolla un programa que pida un número al usuario y determine si es par o impar usando el
          operador módulo. Muestra el resultado por consola. */

        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("Introduce un valor");
        int valor = entradaTeclado.nextInt();

        boolean numero = (valor % 2 == 0);
        System.out.println("¿Es el valor introducido, numero par? " + numero);

        entradaTeclado.close();
    }
    public void ejercicioCinco() {

        /* Crea un programa que pida la edad del usuario y si tiene carnet de conducir (true/false).
           Usa operadores lógicos para determinar si puede alquilar un coche (debe tener 21 años o más Y tener carnet). */

        // 1 -> Pedir datos.

        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("Introduce tu edad: ");
        int edad = entradaTeclado.nextInt();

        System.out.println("¿Tienes carnet de conducir? (true/false)");
        boolean carnetConducir = entradaTeclado.nextBoolean();

        // 2 -> Operadores lógicos.

        boolean edadApta = (edad >= 21);
        boolean apto = (edad >= 21) && (carnetConducir);

        // 3 -> Mostar información.

        System.out.println("----------------------------------------------------------------");
        System.out.println("¿Tienes 21 años o más?: " + edadApta);
        System.out.println("¿Tienes carnet de conducir? (true/false): " + carnetConducir);
        System.out.println("¿Es el usuario apto para poder alquilar un coche? (AND): " + apto);

        entradaTeclado.close();
    }
    public void ejercicioSeis() {

        /* Escribe un programa que pida el precio de un producto y el porcentaje de descuento.
           Calcula el precio final después del descuento usando operadores aritméticos y
           muestra todos los pasos del cálculo. */

        // 1 -> Pedir datos al usuario.

        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("Introduce el precio total del producto");
        double precioTotal = entradaTeclado.nextDouble();

        System.out.println("Introduce el % de descuento del producto");
        int descuento = entradaTeclado.nextInt();

        // 2 -> Hacer las diferentes operaciones.

        // Ejemplo: tenemos un producto de 80 €. Un 20% de descuento.
        // Operacion: (% * 100) / Precio total  = 16 €
        // Precio final = precio inicial 80 - operacion 16 =  64 €.

        double operacionInicial = (precioTotal * descuento) / 100;
        double operacionFinal = precioTotal - operacionInicial;

        // 3 -> Mostar la información.

        System.out.printf("Precio original: %.2f €%n", precioTotal);
        System.out.printf("Descuento (%d%%) %.2f € \n", descuento, operacionInicial);
        System.out.printf("Precio final: %.2f €%n", operacionFinal);

        entradaTeclado.close();
    }
    public void ejercicioSiete() {

        /* Crea un programa que pida al usuario su edad y si es estudiante (true/false).
           Usa operadores lógicos (AND, OR, NOT) para determinar si puede acceder a diferentes descuentos:
           descuento joven (menor de 26 años), descuento estudiante, o descuento especial (menor de 26 Y estudiante). */

        // 1 -> Solicitar datos al usuario.

        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("Introduce tu edad: ");
        int edad = entradaTeclado.nextInt();

        System.out.println("¿Eres estudiante?");
        boolean estudiante = entradaTeclado.nextBoolean();

        // 2 -> Usar operadores lógicos.

        boolean descuentoJoven = (edad < 26);
        boolean descuentoEstudiante = estudiante != false;
        boolean descuentoEspecial = (edad < 26) && (estudiante);

        // 3 -> Mostrar información.

        System.out.println("¿Tienes descuento joven?: " + descuentoJoven);
        System.out.println("¿Tienes descuento de estudiantes?: " + descuentoEstudiante);
        System.out.println("¿Tienes descuento especial?: " + descuentoEspecial);

        entradaTeclado.close();
    }
    public void ejercicioOcho() {

        /* Desarrolla un programa que pida tres números al usuario y calcule: la suma de los tres,
           el promedio, el resultado de multiplicar el primero por el segundo y dividirlo entre el tercero.
           Usa paréntesis para controlar la precedencia de operadores. */

        // 1 -> Solicitar datos.

        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("Introduce el primer valor");
        double numeroUno = entradaTeclado.nextDouble();

        System.out.println("Introduce el segundo valor");
        double numeroDos = entradaTeclado.nextDouble();

        System.out.println("Introduce el tercer valor");
        double numeroTres = entradaTeclado.nextDouble();

        // 2 -> Realizar operaciones.

        double suma = numeroUno + numeroDos + numeroTres;
        double promedio = (numeroUno + numeroDos + numeroTres) / 3;
        double multiplicar = (numeroUno * numeroDos) / numeroTres;

        // 3 -> Mostrar los resultados.

        System.out.printf("El resultado de la suma es %.2f \n", suma);
        System.out.printf("El promedio es %.2f \n", promedio);
        System.out.printf("El resultado de (%.2f * %.2f) / %.2f es %.2f", numeroUno, numeroDos, numeroTres, multiplicar);

        entradaTeclado.close();
    }
    public void ejercicioNueve() {

        /* Escribe un programa que pida al usuario la puntuación de tres exámenes.
           Calcula la nota media y usa operadores relacionales para determinar si ha aprobado (>=5),
           si tiene notable (>=7), y si tiene sobresaliente (>=9). Muestra todos los resultados. */

        // 1 -> Solicitar datos.

        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("Introduce la nota del primer examen");
        float notaUno = entradaTeclado.nextFloat();

        System.out.println("Introduce la nota del segundo examen");
        float notaDos = entradaTeclado.nextFloat();

        System.out.println("Introduce la nota del tercer examen");
        float notaTres = entradaTeclado.nextFloat();

        // 2 -> Realizar las operaciones.

        float notaMedia = (notaUno + notaDos + notaTres) / 3;

        boolean aprobado = (notaMedia >= 5);
        boolean notable = (notaMedia >= 7);
        boolean sobresaliente = (notaMedia >= 9);

        // 3 -> Mostrar la información.

        System.out.println("Nota media: " + notaMedia);
        System.out.println("¿Ha aprobado? (>=5): " + aprobado);
        System.out.println("¿Tiene notable? (>=7): " + notable);
        System.out.println("¿Tiene sobresaliente? (>=9): " + sobresaliente);

        entradaTeclado.close();
    }
    public void ejercicioDiez() {

        /* Crea un programa que pida el salario base por hora, las horas trabajadas y si ha hecho horas extra (true/false).
           Si ha hecho horas extra y trabajó más de 40 horas, las horas que excedan de 40 se pagan al doble.
           Usa operadores lógicos, relacionales y aritméticos para calcular el salario total. */

        // Aún no se han visto condicionales, sin embargo, este ejercicio es más fácil hacerlo usando la estructura If.

        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("Introduce el salario base por hora:");
        float salarioHora = entradaTeclado.nextFloat();

        System.out.println("Numero de horas trabajadas:");
        float horasTrabajadas = entradaTeclado.nextFloat();

        System.out.println("¿Has hecho horas extras? (true/false):");
        boolean horasExtras = entradaTeclado.nextBoolean();

        // Validaciones básicas
        if (salarioHora < 0 || horasTrabajadas < 0) {
            System.out.println("Error: salario o horas introducidas no pueden ser negativas.");
            entradaTeclado.close();
            return;
        }

        // Detectar contradicciones entre el booleano y el número de horas
        if ((horasTrabajadas > 40) && (!horasExtras)) {
            System.out.println("Contradicción detectada: ha introducido más de 40 horas pero ha indicado que NO hizo horas extras.");
            System.out.println("Corrija la entrada o indique true en '¿Has hecho horas extras?' si desea pagar las horas sobre 40.");
            entradaTeclado.close();
            return;
        } else if ((horasTrabajadas <= 40) && (horasExtras)) {
            System.out.println("Contradicción detectada: ha indicado que hizo horas extras pero trabajó 40 horas o menos.");
            System.out.println("Corrija la entrada o indique false en '¿Has hecho horas extras?' si no hubo horas sobre 40.");
            entradaTeclado.close();
            return;
        }

        // Cálculos correctos
        float horasNormales = Math.min(horasTrabajadas, 40f);
        float salarioNormal = salarioHora * horasNormales;

        float horasExtra = Math.max(0f, horasTrabajadas - 40f);
        float salarioHorasExtra = (salarioHora * 2f) * horasExtra; // se pagan al doble
        float salarioGlobal = salarioNormal + salarioHorasExtra;

        // Mostrar resultados
        if (horasExtra > 0) {
            System.out.println("Numero de horas extras: " + horasExtra + " horas.");
            System.out.printf("Salario de horas extras: %.2f €.%n", salarioHorasExtra);
            System.out.printf("Salario normal (primeras %.0f h): %.2f €.%n", horasNormales, salarioNormal);
            System.out.printf("Salario global (con horas extras): %.2f €.%n", salarioGlobal);
        } else {
            System.out.printf("Salario total (sin horas extras): %.2f €.%n", salarioNormal);
        }

        entradaTeclado.close();
    }
}
package EjerciciosTema1;
import java.util.Scanner;

public class Ejercicios {

    private Scanner lectorTeclado; // -> null.

    public void ejercicioUno () {

        /*  Ejercicio 1

            Hágase una aplicación que permita introducir el número de bebidas y bocadillos
            comprados (valores entre 0 y 20. Además se podrá introducir el precio de cada
            bebida (valor entre 0.00 € y 3.00 € y de cada bocadillo (valor entre 0.00 € y 5.00€.
            También se podrá introducir el número de alumnos que realizaron la compra
            (valor entre 0 y 10. Se mostrará el total de la compra (con el subtotal de las
            bebidas y de los bocadillos) y la cantidad que debe pagar cada alumno
            redondeada a 2 decimales. CosteBar)

         */


        // 1 -> pedir cosas por teclado.
        // 2 -> guardar cosas en variables.

        lectorTeclado = new Scanner(System.in);

        System.out.println("¿Cuantas bebidas vas a comprar?");
        int bebidas = lectorTeclado.nextInt();

        System.out.println("¿Cuantos bocadillos vas a comprar?");
        int bocadillos = lectorTeclado.nextInt();

        System.out.println("¿Cuanto vale cada bebida?");
        double precioBebida = lectorTeclado.nextDouble();

        System.out.println("¿Cuanto vale cada bodadillo?");
        double precioBocadillo = lectorTeclado.nextDouble();

        System.out.println("¿Cuantas personas han realizado la compra?");
        int numeroPersonas = lectorTeclado.nextInt();

        // 3 -> realizar calculos.

        double costeBocadillos = bocadillos * precioBocadillo;
        double costeBebidas = bebidas * precioBebida;
        double costeTotal = costeBocadillos + costeBebidas;
        double precioPersona = costeTotal / numeroPersonas;

        // 4 -> mostrar informacion.

        System.out.printf("El precio total de la compra es %.2f", costeTotal);
        System.out.printf("El precio total de los bocadillos es %.2f", costeBocadillos);
        System.out.printf("El precio total de las bebidas es %.2f", costeBebidas);
        System.out.printf("El precio total a pagar por persona es %.2f", precioPersona);

        lectorTeclado.close();
    }
    public void ejercicioDos () {

        /*  Ejercicio 2

            Permítase introducir el valor con IVA de una compra con dos decimales (la
            compra no puede ser superior a 500€ ni inferior a 0€ y el valor del IVA de dicha
            compra (valor entero entre 0 y 25%.¿Cuánto costó la compra sin IVA?¿Cuánto fue
            el IVA? Muéstrese los resultados redondeados a dos decimales. (Compra)

        */


        // 1 -> Pedir datos.

        lectorTeclado = new Scanner(System.in);

        System.out.println("Introduce el valor total de su compra realizada");
        double costeTotalConIva = lectorTeclado.nextDouble();

        System.out.println("Indica el porcentaje de IVA proporcionado en su compra");
        int porcentajeAplicadoIva = lectorTeclado.nextInt();

        // 2 -> Hacer calculos.

        // ¿Cómo se calcula el precio sin IVA a partir del total pagado?
        // El porcentaje de IVA siempre se aplica sobre el precio SIN IVA, no sobre el total.
        // Por ejemplo: si una compra tiene un 25% de IVA y el total pagado (con IVA) es 80 €,
        // entonces el precio sin IVA se obtiene dividiendo entre (1 + 25/100):
        // 80 / 1.25 = 64 € sin IVA.
        // El IVA en euros sería: 80 - 64 = 16 €.

        double totalPagadoSinIva = costeTotalConIva / (1 + (double) porcentajeAplicadoIva / 100);
        double compraSinIva = costeTotalConIva - totalPagadoSinIva;

        // 3 -> Mostar información.

        System.out.printf("El precio total pagado con IVA es %.2f € \n", costeTotalConIva);
        System.out.println("El porcentaje de IVA aplicado en su compra es de " + porcentajeAplicadoIva + " %");
        System.out.printf("El precio total de la compra sin IVA es %.2f € \n", totalPagadoSinIva);
        System.out.printf("Estas pagando %.2f €", compraSinIva);

        lectorTeclado.close();
    }
    public void ejercicioTres () {

        /*  Ejercicio 3

            Se introducen los 5 dígitos de un número (decenas de mil, unidades de mil,
            centenas, decenas y unidades), y se obtiene el número correspondiente.
            (Numero)

        */


        // 1 -> Introducir digitos.

        lectorTeclado = new Scanner(System.in);

        System.out.println("Introduce un valor de cinco digitos");
        int valor = lectorTeclado.nextInt();


        // Realizar calculos.

        // 1 -> Primer digito, posicion decenas de mil (10000)
        // 2 -> Segundo digito, posicion unidades de mil (1000)
        // 3 -> Tercer digito, posicion centenas (100)
        // 4 -> Cuarto digito, posicion decenas (10)
        // 5 -> Quinto digito, posicion unidades (1)

        int primeraPosicion = valor / 10000;
        System.out.println("Decenas de mil: " + primeraPosicion);

        int segundaPosicion = (valor%10000) / 1000;
        System.out.println("Unidades de mil: " + segundaPosicion);

        int terceraPosicion = (valor%1000) / 100;
        System.out.println("Centenas: " + terceraPosicion);

        int cuartaPosicion = (valor%100) / 10;
        System.out.println("Decemas: " + cuartaPosicion);

        int quintaPosicion = (valor % 10);
        System.out.println("Unidades: " + quintaPosicion);

        System.out.println("Número introducido: " + valor);

        lectorTeclado.close();
    }
    public void ejercicioCuatro () {

        /*  Ejercicio 4

            Hágase un programa que convierta segundos en horas, minutos y segundos.
            (Segundos)

        */


        // 1 -> Pedir datos.

        lectorTeclado = new Scanner(System.in);
        System.out.println("¿Cuantos segundos quieres pasar a tiempo?");
        int segundos = lectorTeclado.nextInt();

        // 2 -> Realizar calculos.

        // segundos -> 3600 segundos en una hora.
        // minuitos -> 60 minutos en una hora.
        // segundos -> 60 segundos en un minuto.

        int horas = segundos / 3600;
        int minutos = (segundos%3600) / 60;
        int segundosRestantes = segundos%60;

        // 3 -> Mostrar datos.

        System.out.println("El numero de horas es " +  horas);
        System.out.println("El numero de minutos es " + minutos);
        System.out.println("El numero de segundos es " + segundosRestantes);

        lectorTeclado.close();
    }
}

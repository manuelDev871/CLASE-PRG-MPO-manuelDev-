/*  Crea un programa que calcule el coste de envío de un paquete. Pide: peso del paquete (kg), distancia de envío (km),
    y si es envío urgente (true/false). Las reglas son: Precio base: 5€. Si el peso es mayor de 5kg, añadir 2€ por cada kg adicional.
    Si la distancia es mayor de 100km, añadir 10€. Si es envío urgente, multiplicar el precio total por 1.5. Muestra todos los cálculos paso a paso. */


// Ejemplo simplificado ChatGPT

import java.util.Scanner;

public class Ejercicio15_Tema_3 {

    public static void main(String[] args) {
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



/*
import java.util.Scanner;

public class Ejercicio15_Tema_3 {

    public static void main(String[] args) {

        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("Introduce el peso del paquete");
        double peso = entradaTeclado.nextDouble();

        System.out.println("Introduce la distancia de envio");
        double distancia = entradaTeclado.nextDouble();

        System.out.println("¿Es envio urgente? (true/false)");
        boolean envioUrgente = entradaTeclado.nextBoolean();

        double pesoAdicional;
        double precio;


        if (peso < 0 || distancia < 0) {
            System.out.println("Valores incorrectos");
        } else if ((peso > 5) && (distancia > 100) && (envioUrgente)) {
            pesoAdicional = peso - 5;
            precio = ((pesoAdicional * 2) + 10 + 5) * 1.5;
            System.out.println("----------RESULTADO-----------");
            System.out.printf("Peso total: %.2f kg \n", peso);
            System.out.printf("Peso adicional: %.2f kg \n", pesoAdicional);
            System.out.printf("Distancia total: %.2f kms \n", distancia);
            System.out.println("Envio urgente: " + envioUrgente);
            System.out.printf("Precio final: %.2f € \n", precio);
        } else if ((peso > 5) && (distancia < 100) && (envioUrgente)) {
            pesoAdicional = peso - 5;
            precio = ((pesoAdicional * 2) + 5) * 1.5;
            System.out.println("----------RESULTADO-----------");
            System.out.printf("Peso total: %.2f kg \n", peso);
            System.out.printf("Peso adicional: %.2f kg \n", pesoAdicional);
            System.out.printf("Distancia total: %.2f kms \n", distancia);
            System.out.println("Envio urgente: " + envioUrgente);
            System.out.printf("Precio final: %.2f € \n", precio);
        } else if ((peso > 5) && (distancia < 100) && (!envioUrgente)) {
            pesoAdicional = peso - 5;
            precio = (pesoAdicional * 2) + 5;
            System.out.println("----------RESULTADO-----------");
            System.out.printf("Peso total: %.2f kg \n", peso);
            System.out.printf("Peso adicional: %.2f kg \n", pesoAdicional);
            System.out.printf("Distancia total: %.2f kms \n", distancia);
            System.out.println("Envio urgente: " + envioUrgente);
            System.out.printf("Precio final: %.2f € \n", precio);
        } else if ((peso < 5) && (distancia > 100) && (envioUrgente)) {
            pesoAdicional = 0;
            precio = (5 + 10) * 1.5;
            System.out.println("----------RESULTADO-----------");
            System.out.printf("Peso total: %.2f kg \n", peso);
            System.out.printf("Peso adicional: %.2f kg \n", pesoAdicional);
            System.out.printf("Distancia total: %.2f kms \n", distancia);
            System.out.println("Envio urgente: " + envioUrgente);
            System.out.printf("Precio final: %.2f € \n", precio);
        } else if ((peso < 5) && (distancia < 100) && (envioUrgente)) {
            pesoAdicional = 0;
            precio = 5 * 1.5;
            System.out.println("----------RESULTADO-----------");
            System.out.printf("Peso total: %.2f kg \n", peso);
            System.out.printf("Peso adicional: %.2f kg \n", pesoAdicional);
            System.out.printf("Distancia total: %.2f kms \n", distancia);
            System.out.println("Envio urgente: " + envioUrgente);
            System.out.printf("Precio final: %.2f € \n", precio);
        } else if ((peso < 5) && (distancia < 100) && (!envioUrgente)) {
            pesoAdicional = 0;
            precio = 5;
            System.out.println("----------RESULTADO-----------");
            System.out.printf("Peso total: %.2f kg \n", peso);
            System.out.printf("Peso adicional: %.2f kg \n", pesoAdicional);
            System.out.printf("Distancia total: %.2f kms \n", distancia);
            System.out.println("Envio urgente: " + envioUrgente);
            System.out.printf("Precio final / base: %.2f € \n", precio);
        } else {
            pesoAdicional = peso - 5;
            precio = (pesoAdicional * 2) + 10;
            System.out.println("----------RESULTADO-----------");
            System.out.printf("Peso total: %.2f kg \n", peso);
            System.out.printf("Peso adicional: %.2f kg \n", pesoAdicional);
            System.out.printf("Distancia total: %.2f kms \n", distancia);
            System.out.println("Envio urgente: " + envioUrgente);
            System.out.printf("Precio final: %.2f € \n", precio);
        }

        entradaTeclado.close();
    }
}
*/

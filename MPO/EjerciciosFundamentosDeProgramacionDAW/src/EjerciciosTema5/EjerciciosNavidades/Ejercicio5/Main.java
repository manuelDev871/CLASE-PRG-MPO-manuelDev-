package EjerciciosTema5.EjerciciosNavidades.Ejercicio5;

import EjerciciosTema5.EjerciciosNavidades.Ejercicio5.model.Rectangulo;

public class Main {

    /*
        Objetivo: Crear una clase `Rectangulo` que calcule área y perímetro.

        Requisitos:

        1. Crear una clase `Rectangulo` con atributos: `base` (double), `altura` (double).
        2. Crear constructor con ambos parámetros.
        3. Crear getters y setters que validen que base y altura sean positivas.
        4. Crear metodo `double calcularArea()` que devuelva base × altura.
        5. Crear metodo `double calcularPerimetro()` que devuelva 2 × (base + altura).
        6. Crear metodo `boolean esCuadrado()` que devuelva `true` si base y altura son iguales.
        7. Crear metodo `void escalar(double factor)` que multiplique base y altura por el factor dado.
        8. Crear metodo `void mostrarInfo()` que muestre base, altura, área, perímetro y si es cuadrado.
        9. En el `main`, crear varios rectángulos y probar todos los métodos.
     */

    public static void main(String[] args) {

        // Crear rectángulos
        Rectangulo r1 = new Rectangulo(10, 5);
        Rectangulo r2 = new Rectangulo(4, 4);   // cuadrado
        Rectangulo r3 = new Rectangulo(7, 3);

        // Mostrar información inicial
        System.out.println("RECTÁNGULO 1");
        r1.mostrarInfo();

        System.out.println("\nRECTÁNGULO 2");
        r2.mostrarInfo();

        System.out.println("\nRECTÁNGULO 3");
        r3.mostrarInfo();

        // Probar getters
        System.out.println("\nBase de r1: " + r1.getBase());
        System.out.println("Altura de r1: " + r1.getAltura());

        // Probar setters (válidos e inválidos)
        System.out.println("\nProbando setters en r1");
        r1.setBase(20);
        r1.setAltura(10);
        r1.setBase(-5);   // inválido
        r1.setAltura(0);  // inválido
        r1.mostrarInfo();

        // Probar escalar
        System.out.println("\nEscalando r2 por 2");
        r2.escalar(2);
        r2.mostrarInfo();

        System.out.println("\nIntentando escalar r3 con factor negativo");
        r3.escalar(-3);   // inválido
        r3.mostrarInfo();

        // Probar métodos individuales
        System.out.println("\nÁrea de r1: " + r1.calcularArea());
        System.out.println("Perímetro de r1: " + r1.calcularPerimetro());
        System.out.println("¿r1 es cuadrado? " + r1.esCuadrado());
    }
}

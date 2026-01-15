package EjerciciosTema4.EjerciciosNavidades.Ejercicio7;

import EjerciciosTema4.EjerciciosNavidades.Ejercicio7.model.Empleado;

public class Main {

    /*
        Objetivo: Crear una clase `Empleado` que calcule salarios y bonificaciones.

        Requisitos:

        1. Crear una clase `Empleado` con atributos: `nombre` (String), `dni` (String), `salarioBase` (double), `horasExtras` (int).
        2. Crear constructor con nombre, dni y salarioBase. Las horasExtras empiezan en 0.
        3. Crear getters y setters.
        4. Crear metodo `void agregarHorasExtras(int horas)` que sume horas extras.
        5. Crear metodo `double calcularSalarioTotal()` que devuelva el salarioBase más 20€ por cada hora extra.
        6. Crear metodo `void aplicarAumento(double porcentaje)` que incremente el salarioBase según el porcentaje.
        7. Crear metodo `void resetearHorasExtras()` que ponga las horas extras a 0.
        8. Crear metodo `void mostrarInforme()` que muestre nombre, DNI, salario base, horas extras y salario total.
        9. En el `main`, crear varios empleados, añadir horas extras, calcular salarios y aplicar aumentos.
     */

    public static void main(String[] args) {

        Empleado manuel = new Empleado("Manuel Cruz", "08372126B", 1200);
        Empleado ines = new Empleado("Inés Sánchez", "79308224S", 800);

        System.out.println("Mostrando datos de " + manuel.getNombre());
        manuel.mostrarInforme();

        System.out.println();

        System.out.println("Agregando horas extras...");
        manuel.agregarHorasExtras(8); // Agregamos horas extras.
        manuel.mostrarInforme();

        System.out.println();

        System.out.println("Aplicando porcentaje de aumento salarial...");
        manuel.aplicarAumento(10); // Aplicamos un aumento del 10%
        manuel.mostrarInforme();

        System.out.println();

        System.out.println("Reseteando horas extras...");
        manuel.resetearHorasExtras();
        manuel.mostrarInforme();

        System.out.println();

        System.out.println("Mostrando datos de " + ines.getNombre());
        ines.mostrarInforme();

        System.out.println();

        System.out.println("Agregando horas extras...");
        ines.agregarHorasExtras(24); // Agregamos horas extras.
        ines.mostrarInforme();

        System.out.println();

        System.out.println("Aplicando porcentaje de aumento salarial...");
        ines.aplicarAumento(10); // Aplicamos un aumento del 10%
        ines.mostrarInforme();

        System.out.println();

        System.out.println("Reseteando horas extras...");
        ines.resetearHorasExtras();
        ines.mostrarInforme();
    }
}

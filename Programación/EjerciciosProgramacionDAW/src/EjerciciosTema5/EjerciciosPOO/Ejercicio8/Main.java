package EjerciciosTema5.EjerciciosPOO.Ejercicio8;

import EjerciciosTema5.EjerciciosPOO.Ejercicio8.model.Empleado;

public class Main {

    /*
        Crea una clase Empleado con atributos nombre, puesto y salario.
        En el metodo main, crea un array de 5 empleados, inicialízalos
        con datos y luego muestra: todos los empleados, el empleado con mayor salario y el salario promedio.
     */

    public static void main(String[] args) {

        Empleado[] empleados = new Empleado[5];

        empleados[0] = new Empleado("Ana Pérez", "Desarrolladora", 35000);
        empleados[1] = new Empleado("Luis García", "Diseñador", 28000);
        empleados[2] = new Empleado("María Torres", "Project Manager", 42000);
        empleados[3] = new Empleado("Jorge Díaz", "Analista", 32000);
        empleados[4] = new Empleado("Laura Sánchez", "Tester", 26000);

        System.out.println("Lista de Empleados:");

        double sumaSalarios = 0;
        Empleado mayorSalario = empleados[0];

        for (int i = 0; i < empleados.length; i++) {
            System.out.println((i + 1) + ". " + empleados[i]);
            sumaSalarios += empleados[i].getSalario();

            if (empleados[i].getSalario() > mayorSalario.getSalario()) {
                mayorSalario = empleados[i];
            }
        }

        double promedio = sumaSalarios / empleados.length;

        System.out.println();
        System.out.println("Empleado con mayor salario: " + mayorSalario.getNombre() +
                " (" + mayorSalario.getSalario() + "€)");
        System.out.println("Salario promedio: " + promedio + "€");
    }
}

package EjerciciosTema5.EjerciciosHerencia.Ejercicio5;

import EjerciciosTema5.EjerciciosHerencia.Ejercicio5.model.Desarrollador;
import EjerciciosTema5.EjerciciosHerencia.Ejercicio5.model.Empleado;
import EjerciciosTema5.EjerciciosHerencia.Ejercicio5.model.Gerente;

public class Main {

    /*
        Crea una clase Empleado con atributos nombre y salarioBase. Crea dos clases hijas:
        Gerente (con atributo bonus) y Desarrollador (con atributo lenguajePrincipal).
        Implementa un metodo calcularSalarioTotal() en Gerente que sume el bonus al salario base.
        Crea objetos de ambos tipos y muestra su información completa.
     */

    public static void main(String[] args) {

        Empleado empleado1 = new Gerente("Ana García", 40000, "Gerente", 10000);
        empleado1.mostrarDatos();

        System.out.println();

        Empleado empleado2 = new Desarrollador("Luis Martinez", 35000, "Desarrollador", "Java");
        empleado2.mostrarDatos();
    }
}

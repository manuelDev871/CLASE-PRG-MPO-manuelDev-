package EjerciciosTema5.EjerciciosHerencia.Ejercicio4;

import EjerciciosTema5.EjerciciosHerencia.Ejercicio4.model.Circulo;
import EjerciciosTema5.EjerciciosHerencia.Ejercicio4.model.Cuadrado;

public class Main {

    /*
        Crea una clase Figura con un metodo calcularArea(). Crea dos clases hijas:
        Circulo (con atributo radio) y Cuadrado (con atributo lado). Implementa el
        metodo calcularArea() en cada clase hija con la fórmula correspondiente.
        Crea objetos de cada tipo y muestra sus áreas.
     */

    public static void main(String[] args) {

        Circulo circulo = new Circulo(5);
        Cuadrado cuadrado = new Cuadrado(4);

        circulo.mostrarDatos();
        circulo.calcularArea();

        System.out.println();

        cuadrado.mostrarDatos();
        cuadrado.calcularArea();
    }
}

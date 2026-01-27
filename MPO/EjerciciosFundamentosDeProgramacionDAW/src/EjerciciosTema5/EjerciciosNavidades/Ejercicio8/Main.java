package EjerciciosTema5.EjerciciosNavidades.Ejercicio8;

import EjerciciosTema5.EjerciciosNavidades.Ejercicio8.model.Coche;

public class Main {

    /*
        Objetivo: Crear una clase `Coche` que simule características y comportamientos básicos.

        Requisitos:

        1. Crear una clase `Coche` con atributos: `marca` (String), `modelo` (String), `anio` (int), `kilometraje` (double), `combustible` (double, en litros).
        2. Crear constructor con marca, modelo y año. Kilometraje empieza en 0 y combustible en 50 litros.
        3. Crear getters y setters apropiados.
        4. Crear metodo `void conducir(double km)` que añada kilómetros al kilometraje y reduzca el combustible (1 litro cada 15 km). Si no hay suficiente combustible, mostrar mensaje de error.
        5. Crear metodo `void repostar(double litros)` que añada combustible sin superar los 60 litros.
        6. Crear metodo `int calcularAntiguedad()` que devuelva los años desde la fabricación (usa 2025 como año actual).
        7. Crear metodo `boolean necesitaMantenimiento()` que devuelva `true` si el kilometraje supera los 10000 km.
        8. Crear metodo `void mostrarInfo()` con toda la información del coche.
        9. En el `main`, crear un coche, conducir varias distancias, repostar y verificar mantenimiento.
     */

    public static void main(String[] args) {

        Coche coche = new Coche("Volkswagen", "Golf", 2020);

        coche.conducir(150);
        coche.conducir(260);

        coche.repostar(30);
        System.out.println("¿Necesita el " + coche.getMarca() + " " + coche.getModelo() + " mantenimiento?: " + coche.necesitaMantenimiento());
        System.out.println("La antiguedad del " + coche.getMarca() + " " + coche.getModelo() + " es de: " + coche.calcularAntiguedad() + " años");
        coche.mostrarInfo();
    }
}
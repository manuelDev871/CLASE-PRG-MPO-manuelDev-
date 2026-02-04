package Tema4.Funciones.EjercicioGestionNotas;

import Tema4.Funciones.EjercicioGestionNotas.model.Alumno;

import java.util.ArrayList;
import java.util.function.BiFunction;

public class Main {

    public static void main(String[] args) {


        // 1. CREACIÓN DE OBJETOS
        Alumno alumno1 = new Alumno("Alumno1", "Apellido1", "123123", 5);
        Alumno alumno2 = new Alumno("Alumno2", "Apellido2", "234234", 9);
        Alumno alumno3 = new Alumno("Alumno3", "Apellido3", "345345", 7);

        // 2. LISTA DE ALUMNOS
        ArrayList<Alumno> listaAlumnos = new ArrayList<>();
        listaAlumnos.add(alumno1);
        listaAlumnos.add(alumno2);
        listaAlumnos.add(alumno3);


        // Forma clásica de recorrer la lista
        for (Alumno alumno : listaAlumnos) {
            alumno.mostrarDatos();
        }


        // 3. FUNCIONES LAMBDA

        // Lambda básica: por cada alumno se ejecuta mostrarDatos()
        listaAlumnos.forEach(item -> item.mostrarDatos());

        // Referencia a metodo: hace exactamente lo mismo que la línea anterior
        listaAlumnos.forEach(Alumno::mostrarDatos);

        // Otro ejemplo de referencia a metodo
        listaAlumnos.forEach(Alumno::calcularMedia);


        // 4. BIFUNCTION

        // BiFunction<T, U, R>
        // T = primer parámetro
        // U = segundo parámetro
        // R = valor de retorno

        // Forma larga con llaves y return
        BiFunction<Integer, Integer, Integer> suma = (p1, p2) -> {
            return p1 + p2;
        };

        // Forma simplificada: una sola línea, no necesita return
        BiFunction<Integer, Integer, Integer> sumaBi = (p1, p2) -> p1 + p2;
        System.out.println(sumaBi.apply(1, 4)); // -> 5

        // Referencia a metodo ya existente (Integer.sum)
        BiFunction<Integer, Integer, Integer> sumaB = Integer::sum;
        System.out.println(sumaB.apply(1, 4)); // -> 5


        // 5. BIFUNCTION CON OBJETOS

        // Recibe un Alumno y un número, devuelve la nota multiplicada
        BiFunction<Alumno, Integer, Integer> notaDuplicada =
                (a, numero) -> a.getNota() * numero;

        System.out.println(notaDuplicada.apply(alumno1, 5));


        // 6. STREAM + MAP
        System.out.println("Imprimiendo todas las notas");

        // Se transforma la lista de alumnos en una lista de notas y se imprimen una a una
        listaAlumnos.stream().map(Alumno::getNota).forEach(System.out::println);
    }
}

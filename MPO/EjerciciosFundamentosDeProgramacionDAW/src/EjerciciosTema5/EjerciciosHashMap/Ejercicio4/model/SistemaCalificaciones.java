package EjerciciosTema5.EjerciciosHashMap.Ejercicio4.model;

import java.util.*;

public class SistemaCalificaciones {

    // 1. HashMap: estudiante -> lista de notas
    private HashMap<String, ArrayList<Double>> estudiantes;

    // Constructor
    public SistemaCalificaciones() {
        estudiantes = new HashMap<>();
    }

    // 2. Agregar estudiante
    public void agregarEstudiante(String nombre) {
        estudiantes.putIfAbsent(nombre, new ArrayList<>());
    }

    // 3. Agregar calificación
    public void agregarCalificacion(String nombre, double calificacion) {
        if (estudiantes.containsKey(nombre)) {
            estudiantes.get(nombre).add(calificacion);
        } else {
            System.out.println("El estudiante no existe");
        }
    }

    // 4. Calcular promedio de un estudiante
    public double calcularPromedio(String nombre) {
        ArrayList<Double> notas = estudiantes.get(nombre);

        if (notas == null || notas.isEmpty()) {
            return 0;
        }

        double suma = 0;
        for (double n : notas) {
            suma += n;
        }
        return suma / notas.size();
    }

    // 5. Mostrar calificaciones
    public void mostrarCalificaciones(String nombre) {
        ArrayList<Double> notas = estudiantes.get(nombre);

        if (notas == null) {
            System.out.println("El estudiante no existe");
            return;
        }

        System.out.println("Calificaciones de " + nombre + ": " + notas);
    }

    // 6. Mejor estudiante
    public String mejorEstudiante() {
        String mejor = null;
        double mejorPromedio = 0;

        for (String nombre : estudiantes.keySet()) {
            double promedio = calcularPromedio(nombre);
            if (mejor == null || promedio > mejorPromedio) {
                mejor = nombre;
                mejorPromedio = promedio;
            }
        }
        return mejor;
    }

    // 7. Estudiantes aprobados
    public void listarEstudiantesAprobados(double notaMinima) {
        for (String nombre : estudiantes.keySet()) {
            if (calcularPromedio(nombre) >= notaMinima) {
                System.out.println(nombre);
            }
        }
    }

    // 8. Promedio general
    public double promedioGeneral() {
        double suma = 0;
        int totalNotas = 0;

        for (ArrayList<Double> notas : estudiantes.values()) {
            for (double n : notas) {
                suma += n;
                totalNotas++;
            }
        }

        if (totalNotas == 0) return 0;
        return suma / totalNotas;
    }
}

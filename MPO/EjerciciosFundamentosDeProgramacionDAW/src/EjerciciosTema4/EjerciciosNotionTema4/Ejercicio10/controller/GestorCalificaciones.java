package EjerciciosTema4.EjerciciosNotionTema4.Ejercicio10.controller;

import EjerciciosTema4.EjerciciosNotionTema4.Ejercicio10.model.Alumno;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class GestorCalificaciones {

    private ArrayList<Alumno> listaCalificaciones;

    public GestorCalificaciones() {
        listaCalificaciones = new ArrayList<>();
    }

    public void anhadirDatosAlumno(Alumno alumno) {
        listaCalificaciones.add(alumno);
    }

    BiFunction<Double, Double, Double> calcularNotaFinal = (teoria, practica) -> teoria * 0.6 + practica * 0.4;

    BiPredicate<Alumno, Double> estaAprobado = (alumno, notaFinal) -> notaFinal >= 5;

    Function<Double, String> notaALetra = nota -> {
        if (nota >= 9) return "A";
        if (nota >= 7) return "B";
        if (nota >= 6) return "C";
        if (nota >= 5) return "D";
        return "F";
    };

    BiConsumer<Alumno, Double> imprimirInforme = (alumno, notaFinal) -> {
        System.out.println("Alumno: " + alumno.getNombre());
        System.out.println("Nota teoría: " + alumno.getNotaTeoria());
        System.out.println("Nota práctica: " + alumno.getNotaPractica());
        System.out.println("Nota final: " + notaFinal);
        System.out.println("Calificación: " + notaALetra.apply(notaFinal));

        if (estaAprobado.test(alumno, notaFinal)) {
            System.out.println("APROBADO");
        } else {
            System.out.println("SUSPENSO");
        }

        System.out.println("----------------------------");
    };

    Predicate<Alumno> filtroAprobados = alumno -> calcularNotaFinal.apply(alumno.getNotaTeoria(), alumno.getNotaPractica()) >= 5;

    public void generarInformeCompleto() {
        listaCalificaciones.forEach(alumno -> {
            double notaFinal = calcularNotaFinal.apply(
                    alumno.getNotaTeoria(),
                    alumno.getNotaPractica()
            );
            imprimirInforme.accept(alumno, notaFinal);
        });
    }

    public void mostrarSoloAprobados() {
        System.out.println("=== ALUMNOS APROBADOS ===");
        listaCalificaciones.stream().filter(filtroAprobados).forEach(a -> System.out.println(a.getNombre()));
    }
}

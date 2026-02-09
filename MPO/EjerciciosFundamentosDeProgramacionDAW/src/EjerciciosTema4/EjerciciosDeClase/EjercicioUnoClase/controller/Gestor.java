package EjerciciosTema4.EjerciciosDeClase.EjercicioUnoClase.controller;

import EjerciciosTema4.EjerciciosDeClase.EjercicioUnoClase.model.Alumno;

import java.util.*;
import java.util.function.BiPredicate;

public class Gestor {

    private List<Alumno> listaAlumnos;

    private HashMap<String,Alumno> alumnosMap;

    public Gestor() {
        listaAlumnos = new ArrayList<>();
        alumnosMap = new HashMap<>();
    }

    // Agregar usuarios
    public void agregarUsuarioConMap(Alumno alumno) {
        // Solo se puede agregar si el dni que me dices no esta en el map
        // Lanzar una excepcion

        // Si lo agregas y no esta retorno un null / si intento agregar y esta, retorno el que esta
        Alumno alumnoAgregado = alumnosMap.put(alumno.getDni(),alumno);
        if (alumnoAgregado != null) {
            System.out.printf("DNI %s duplicado, error en el proceso %n", alumno.getDni());
        } else {
            System.out.printf("Alumno con nombre %s agregado correctamente %n", alumno.getNombre());
        }
    }
    public void agregarUsuarioConLista(Alumno alumno) {
        // Solo se puede agregar si el dni que me dices no esta en la lista
        // Recorro y pregunto en iteracion
        if (listaAlumnos.stream().anyMatch(item -> item.getDni().equalsIgnoreCase(alumno.getDni()))) {
            System.out.println("No puedo utilizar este dni, usuario no agregado");
        } else {
            listaAlumnos.add(alumno);
            System.out.println("Alumno agregado correctamente");
        }
    }

    public void calificarAlumnos() {
        // Recorre una copia y lo modificas
        //  listaAlumnos.stream().forEach(item -> item.setNota(10)); // -> esto pone un 10 a todas las notas

        listaAlumnos.forEach(item ->
                {
                    if (item.getNota() < 0) {
                        item.setNota((int) (Math.random()*11));
                    }
                }
            );
    }

    public void mostrarUsuarios() {
        listaAlumnos.forEach(Alumno::mostrarDatos);
    }

    public void calcularNotaMedia() {
        // Variable general
        // forEach -> sumar todas las notas
        // Divido entre numero de alumnos


        OptionalDouble media = listaAlumnos.stream().mapToDouble(Alumno::getNota).average();
        System.out.println(media.getAsDouble());
    }

    public long getNumeroAprobados() {
        // recorro, pregunto >= 5 sumatorio
        /*
        int numeroAprobados = 0;
        for (Alumno a : listaAlumnos) {
            if (a.getNota() >= 5) {
                numeroAprobados++;
            }
        }
        */

        return listaAlumnos.stream().filter(item -> item.getNota() >= 5).count();
    }

    public List<Alumno> getAprobados() {
        return listaAlumnos.stream().filter(ietm -> ietm.getNota() >= 5).toList();
    }

    public Optional<Alumno> buscarDNI(String dni) {
        // si el correo que estas buscando no esta -> null
        return listaAlumnos.stream().filter(item -> item.getDni().equals(dni)).findFirst();
    }

    public void ordenarAlumnos() {
        listaAlumnos = listaAlumnos.stream().sorted(Comparator.comparingInt(Alumno::getNota)).toList();
        listaAlumnos.forEach(Alumno::mostrarDatos);
    }

    public List<Alumno> getAlumnosNota(BiPredicate<Alumno, Double> predicado, double nota) {
        return listaAlumnos.stream().
                filter(item -> predicado.test(item,nota)).toList();
    }
}


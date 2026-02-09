package EjerciciosTema4.EjerciciosDeClase.EjercicioUnoClase;

import EjerciciosTema4.EjerciciosDeClase.EjercicioUnoClase.controller.Gestor;
import EjerciciosTema4.EjerciciosDeClase.EjercicioUnoClase.model.Alumno;

public class Main {

    public static void main(String[] args) {

        Gestor gestor = new Gestor();
        //  gestor.agregarUsuarioConMap(new Alumno("Alumno1", "Alumno1", "123A"));
        //  gestor.agregarUsuarioConMap(new Alumno("Alumno1", "Alumno1", "123A"));

        gestor.agregarUsuarioConLista(new Alumno("Alumno1", "Alumno1", "123A",1));
        gestor.agregarUsuarioConLista(new Alumno("Alumno2", "Alumno2", "123B",8));
        gestor.agregarUsuarioConLista(new Alumno("Alumno3", "Alumno3", "123C",9));
        gestor.agregarUsuarioConLista(new Alumno("Alumno4", "Alumno4", "123D",4));
        gestor.agregarUsuarioConLista(new Alumno("Alumno5", "Alumno5", "123E",4));
        gestor.agregarUsuarioConLista(new Alumno("Alumno6", "Alumno6", "123F",1));

        gestor.calificarAlumnos();
        gestor.calcularNotaMedia();
        gestor.mostrarUsuarios();
        System.out.println("Numero de aprobados: " + gestor.getNumeroAprobados());

        /*
        if (gestor.buscarDNI("123A").isPresent()) {
            System.out.println("El usuario se ha encontrado con exito");
            gestor.buscarDNI("123A").get().mostrarDatos();
        } else {
            System.out.println("El usuario no ha encontrado coincidencias");
        }
        */

        gestor.buscarDNI("123A").ifPresent(item -> item.mostrarDatos());

        String dni = "12345";
        gestor.buscarDNI("12345").ifPresentOrElse(Alumno::mostrarDatos,() -> gestor.agregarUsuarioConLista(new Alumno("Nuevo", "Nuevo", dni)));

        gestor.ordenarAlumnos();
    }
}

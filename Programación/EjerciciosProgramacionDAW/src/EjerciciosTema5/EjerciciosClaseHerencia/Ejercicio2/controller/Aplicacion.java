package EjerciciosTema5.EjerciciosClaseHerencia.Ejercicio2.controller;

import EjerciciosTema5.EjerciciosClaseHerencia.Ejercicio2.interfaces.AutorLibro;
import EjerciciosTema5.EjerciciosClaseHerencia.Ejercicio2.interfaces.AutorAudio;
import EjerciciosTema5.EjerciciosClaseHerencia.Ejercicio2.interfaces.DirectorVideo;
import EjerciciosTema5.EjerciciosClaseHerencia.Ejercicio2.model.Audio;
import EjerciciosTema5.EjerciciosClaseHerencia.Ejercicio2.model.Libro;
import EjerciciosTema5.EjerciciosClaseHerencia.Ejercicio2.model.Multimedia;
import EjerciciosTema5.EjerciciosClaseHerencia.Ejercicio2.model.Video;

import java.util.ArrayList;


public class Aplicacion implements AutorLibro, AutorAudio, DirectorVideo {

    private ArrayList<Multimedia> coleccion;

    public Aplicacion() {
        coleccion = new ArrayList<>();
    }

    public void anhadirColeccion(Multimedia multimedia) {

        boolean duplicado = false;

        for (Multimedia m : coleccion) {
            if (m.getIdentificador().equals(multimedia.getIdentificador())) {
                duplicado = true;
                break;
            }
        }

        if (!duplicado) {
            coleccion.add(multimedia);
            System.out.println("Elemento agregado correctamente");
            System.out.println();
        } else {
            System.out.println("Identificador duplicado, no se puede guardar un elemento con el mismo identificador");
            System.out.println();
        }
    }


    public void eliminarElementoColeccion(String identificador) {

        Multimedia encontrado = null;

        for (Multimedia multimedia : coleccion) {
            if (multimedia.getIdentificador().equals(identificador)) {
                encontrado = multimedia;
                break;
            }
        }

        if (encontrado != null) {
            coleccion.remove(encontrado);
            System.out.println("Elemento eliminado correctamente");
            System.out.println();
        } else {
            System.out.println("No existe ningún elemento con ese identificador");
            System.out.println();
        }
    }


    public void listarElementos() {

        if (coleccion.isEmpty()) {
            System.out.println("No hay datos que mostrar");
            System.out.println();
            return;
        }

        for (Multimedia multimedia: coleccion) {
            System.out.println();
            multimedia.mostrarDatos();
            System.out.println();
        }
    }

    public void listarVideos() {

        boolean hayVideos = false;

        for (Multimedia multimedia : coleccion) {
            if (multimedia instanceof Video) {
                multimedia.mostrarDatos();
                System.out.println();
                hayVideos = true;
            }
        }

        if (!hayVideos) {
            System.out.println("No hay videos en la coleccion");
            System.out.println();
        }
    }

    public void listarAudios() {

        boolean hayAudios = false;

        for (Multimedia multimedia : coleccion) {
            if (multimedia instanceof Audio) {
                multimedia.mostrarDatos();
                System.out.println();
                hayAudios = true;
            }
        }

        if (!hayAudios) {
            System.out.println("No hay audios en la coleccion");
            System.out.println();
        }
    }

    @Override
    public void buscarPorAutorLibro(String autor) {

        boolean autorEncontrado = false;

        for (Multimedia multimedia : coleccion) {
            if (multimedia instanceof Libro) {
                if (autor.equalsIgnoreCase(multimedia.getAutor())) {
                    System.out.println(multimedia.getTitulo());
                    autorEncontrado = true;
                }
            }
        }

        if (!autorEncontrado) {
            System.out.println("Lo siento, no existe ningún libro con ese autor en mi coleccion");
        }
    }

    @Override
    public void buscarPorAutorAudio(String autor) {

        boolean autorEncontrado = false;

        for (Multimedia multimedia : coleccion) {
            if (multimedia instanceof Audio) {
                if (autor.equalsIgnoreCase(multimedia.getAutor())) {
                    System.out.println(multimedia.getTitulo());
                    autorEncontrado = true;
                }
            }
        }

        if (!autorEncontrado) {
            System.out.println("Lo siento, no existe ningún audio con ese autor en mi coleccion");
        }
    }

    @Override
    public void buscarPorDirector(String director) {

        boolean autorEncontrado = false;

        for (Multimedia multimedia : coleccion) {
            if (multimedia instanceof Video) {
                if (director.equalsIgnoreCase(((Video) multimedia).getDirector())) {
                    System.out.println(multimedia.getTitulo());
                    autorEncontrado = true;
                }
            }
        }

        if (!autorEncontrado) {
            System.out.println("Lo siento, no existe ningún video con ese director en mi coleccion");
        }
    }
}

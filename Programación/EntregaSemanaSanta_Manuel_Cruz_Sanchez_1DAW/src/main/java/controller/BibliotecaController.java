package controller;

import model.Biblioteca;
import model.Libro;

import java.util.List;

public class BibliotecaController {

    private Biblioteca biblioteca;
    private APIController apiController;

    public BibliotecaController() {
        biblioteca = new Biblioteca();
        apiController = new APIController();
    }

    public void importarLibros() {
        List<Libro> librosAPI = apiController.obtenerLibros();

        if (librosAPI != null) {
            biblioteca.getLibros().addAll(librosAPI);
            System.out.println("Libros importados correctamente");
        } else {
            System.out.println("Error al importar libros");
        }
    }

    public void mostrarLibros() {
        for (Libro l : biblioteca.getLibros()) {
            System.out.println(l);
        }
    }


    public Libro buscarLibroPorId(int id) {
        for (Libro l : biblioteca.getLibros()) {
            if (l.getId() == id) {
                return l;
            }
        }
        return null;
    }

    public void buscarLibroAPI(int id) {
        Libro libro = apiController.obtenerLibroPorId(id);

        if (libro != null) {
            System.out.println(libro);
        }
    }

    public void agregarFavorito(int id) {
        Libro libro = buscarLibroPorId(id);

        if (libro != null) {
            biblioteca.getFavoritos().add(libro);
            System.out.println("Libro añadido a favoritos");
        } else {
            System.out.println("Libro no encontrado en la biblioteca");
        }
    }

    public void mostrarFavoritos() {
        if (biblioteca.getFavoritos().isEmpty()) {
            System.out.println("No hay favoritos");
        } else {
            for (Libro l : biblioteca.getFavoritos()) {
                System.out.println(l);
            }
        }
    }

    public List<Libro> getFavoritos() {
        return biblioteca.getFavoritos();
    }

    public void setFavoritos(List<Libro> favoritos) {
        biblioteca.getFavoritos().clear();
        biblioteca.getFavoritos().addAll(favoritos);
    }
}
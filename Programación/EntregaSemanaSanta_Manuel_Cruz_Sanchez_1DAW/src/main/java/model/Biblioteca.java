package model;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Libro> libros;
    private List<Libro> favoritos;

    public Biblioteca() {
        libros = new ArrayList<>();
        favoritos = new ArrayList<>();
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public List<Libro> getFavoritos() {
        return favoritos;
    }

    public void addLibro(Libro libro) {
        libros.add(libro);
    }

    public void addFavorito(Libro libro) {
        favoritos.add(libro);
    }
}
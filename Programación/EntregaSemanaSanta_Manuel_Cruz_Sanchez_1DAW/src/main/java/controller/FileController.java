package controller;

import model.Libro;

import java.io.*;
import java.util.List;

public class FileController {

    private final String FILE_NAME = "favoritos.obj";

    public void guardarFavoritos(List<Libro> favoritos) {

        File file = new File(FILE_NAME);
        ObjectOutputStream oos = null;

        try {
            oos = new ObjectOutputStream(new FileOutputStream(file));

            oos.writeObject(favoritos);

            System.out.println("Favoritos guardados correctamente");

        } catch (IOException e) {
            System.out.println("Error al guardar favoritos");
        } finally {
            try {
                oos.close();
            } catch (IOException | NullPointerException e) {
                System.out.println("Error al cerrar el fichero");
            }
        }
    }

    public List<Libro> cargarFavoritos() {

        File file = new File(FILE_NAME);
        ObjectInputStream ois = null;

        try {
            ois = new ObjectInputStream(new FileInputStream(file));

            List<Libro> favoritos = (List<Libro>) ois.readObject();

            System.out.println("Favoritos cargados correctamente");

            return favoritos;

        } catch (FileNotFoundException e) {
            System.out.println("No existe el fichero de favoritos");
        } catch (IOException e) {
            System.out.println("Error en la lectura del fichero");
        } catch (ClassNotFoundException e) {
            System.out.println("Error al convertir los datos");
        } finally {
            try {
                ois.close();
            } catch (IOException | NullPointerException e) {
                System.out.println("Error al cerrar el fichero");
            }
        }

        return null;
    }
}
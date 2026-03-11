package Ejercicio9.controller;

import Ejercicio9.model.Usuario;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Gestor {

    private List<Usuario> listaUsuarios;

    public Gestor() {
        listaUsuarios = new ArrayList<>();
    }

    public void agregarUsuario(Usuario usuario) {
        boolean dniDuplicado = false;

        for (Usuario user : listaUsuarios) {
            if (usuario.getDni().equalsIgnoreCase(user.getDni())) {
                System.out.println("Lo siento, DNI duplicado");
                dniDuplicado = true;
                break;
            }
        }

        if (!dniDuplicado) {
            listaUsuarios.add(usuario);
            System.out.println("Usuario agregado correctamente");
        }

    }

    public void listarUsuarios() {

        if (listaUsuarios.isEmpty()) {
            System.out.println("No hay datos para mostrar");
            return;
        }

        listaUsuarios.forEach(Usuario::mostrarDatos);
    }

    public void exportarUsuarios() {
        File file = new File("src/main/java/Ejercicio9/usuarios.csv");
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;

        try {
            file.createNewFile();
            fileWriter = new FileWriter(file, true);
            bufferedWriter = new BufferedWriter(fileWriter);

            for (Usuario usuario : listaUsuarios) {
                if (file.length() == 0) {
                    bufferedWriter.write("Nombre  |  Apellido  |  DNI" + "\n");
                }

                bufferedWriter.write(usuario.toString());
                bufferedWriter.newLine();
            }

        } catch (IOException e) {
            System.out.println("Archivo no encontrado");
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException | NullPointerException e) {
                System.out.println("Error al cerrar el fichero");
            }
        }
    }

    public void leerFicheroUsuarios() {

        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            fileReader = new FileReader("src/main/java/Ejercicio9/usuarios.csv");
            bufferedReader = new BufferedReader(fileReader);

            String linea;
            while ((linea = bufferedReader.readLine()) != null) {
                System.out.println(linea);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error, fichero no encontrado");
        } catch (IOException e) {
            System.out.println("Error, no hay suficientes permisos");
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException | NullPointerException e) {
                System.out.println("Error al cerrar el fichero");
            }
        }
    }
}

package controller;

import model.Administrador;
import model.Trabajador;
import model.Usuario;

import java.util.*;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Sistema {

    private List<Usuario> usuarios;

    public Sistema() {
        usuarios = new ArrayList<>();
    }

    public void anhadirUsuario(Usuario u) {
        usuarios.add(u);
    }

    public Usuario login(String correo, String password) {
        for (Usuario u : usuarios) {
            if (u.getCorreo().equals(correo) && u.getPassword().equals(password)) {
                return u;
            }
        }
        return null;
    }

    public Usuario buscarPorDni(String dni) {
        for (Usuario u : usuarios) {
            if (u.getDni().equals(dni)) {
                return u;
            }
        }
        return null;
    }

    public void eliminarUsuario(String dni) {

        boolean eliminado = usuarios.removeIf(u -> u.getDni().equals(dni));

        if (eliminado) {
            guardarTodosUsuarios();
        }
    }

    public void mostrarUsuarios() {
        for (Usuario u : usuarios) {
            System.out.println(u);
        }
    }

    public void cargarUsuarios() {

        File fichero = new File("usuarios.txt");

        if (!fichero.exists()) {

            System.out.println("Creando fichero de usuarios con admin por defecto...");

            Administrador admin = new Administrador(
                    "Admin", "Admin", "000", "admin@admin.com", "1234"
            );

            usuarios.add(admin);
            guardarTodosUsuarios(); // crea el fichero con el admin

            return;
        }

        try {
            BufferedReader br = new BufferedReader(new FileReader(fichero));
            String linea;

            while ((linea = br.readLine()) != null) {

                String[] partes = linea.split(";");

                String tipo = partes[0];
                String nombre = partes[1];
                String apellido = partes[2];
                String dni = partes[3];
                String correo = partes[4];
                String password = partes[5];

                if (tipo.equals("ADMIN")) {
                    usuarios.add(new Administrador(nombre, apellido, dni, correo, password));
                } else {
                    usuarios.add(new Trabajador(nombre, apellido, dni, correo, password));
                }
            }

            br.close();

        } catch (IOException e) {
            System.out.println("Error al cargar usuarios");
        }
    }

    public void guardarUsuario(Usuario u) {
        try {
            FileWriter fw = new FileWriter("usuarios.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);

            String tipo = (u instanceof Administrador) ? "ADMIN" : "TRABAJADOR";

            bw.write(tipo + ";" +
                    u.getNombre() + ";" +
                    u.getApellido() + ";" +
                    u.getDni() + ";" +
                    u.getCorreo() + ";" +
                    u.getPassword());

            bw.newLine();
            bw.close();

        } catch (IOException e) {
            System.out.println("Error al guardar usuario");
        }
    }

    public void guardarTodosUsuarios() {

        try {
            FileWriter fw = new FileWriter("usuarios.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            for (Usuario u : usuarios) {

                String tipo = (u instanceof Administrador) ? "ADMIN" : "TRABAJADOR";

                bw.write(tipo + ";" +
                        u.getNombre() + ";" +
                        u.getApellido() + ";" +
                        u.getDni() + ";" +
                        u.getCorreo() + ";" +
                        u.getPassword());

                bw.newLine();
            }

            bw.close();

        } catch (IOException e) {
            System.out.println("Error al guardar todos los usuarios");
        }
    }

    public void fichar(String correo) {
        try {
            FileWriter fw = new FileWriter("horas.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);

            LocalDateTime ahora = LocalDateTime.now();
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yy HH:mm:ss");
            String fechaHora = ahora.format(formato);

            bw.write(correo + " - " + fechaHora);
            bw.newLine();

            bw.close();

        } catch (IOException e) {
            System.out.println("Error al escribir fichaje");
        }
    }

    public void verFichajes() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("horas.txt"));
            String linea;

            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }

            br.close();

        } catch (IOException e) {
            System.out.println("Error al leer fichajes");
        }
    }
}
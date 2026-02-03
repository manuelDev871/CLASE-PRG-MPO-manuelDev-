package EjerciciosTema5.EjerciciosClaseHerencia.Ejercicio2;

import EjerciciosTema5.EjerciciosClaseHerencia.Ejercicio2.controller.Aplicacion;
import EjerciciosTema5.EjerciciosClaseHerencia.Ejercicio2.model.Audio;
import EjerciciosTema5.EjerciciosClaseHerencia.Ejercicio2.model.Libro;
import EjerciciosTema5.EjerciciosClaseHerencia.Ejercicio2.model.Multimedia;
import EjerciciosTema5.EjerciciosClaseHerencia.Ejercicio2.model.Video;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;

        Aplicacion aplicacion = new Aplicacion();

        System.out.println("========================================");
        System.out.println("GESTOR MULTIMEDIA");
        System.out.println("========================================");

        System.out.println("Indica que operacion quieres hacer:");
        System.out.println();

        do {
            System.out.println("1. Añadir elemento a la colección");
            System.out.println("2. Eliminar elemento de la coleccion");
            System.out.println("3. Listar elementos");
            System.out.println("4. Buscar libro por autor");
            System.out.println("5. Buscar audio por autor");
            System.out.println("6. Buscar video por director");
            System.out.println("7. Salir");
            System.out.print("Elige una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 -> {
                    System.out.println();
                    System.out.println("Que tipo de elemento quieres añadir a la coleccion:");
                    System.out.println("1. Libro");
                    System.out.println("2. Video");
                    System.out.println("3. Audio");
                    System.out.print("Elige una opcion: ");
                    int tipo = sc.nextInt();
                    sc.nextLine();

                    Multimedia multimedia = null;

                    System.out.println();
                    System.out.print("Indica el identificador: ");
                    String identificador = sc.nextLine();

                    System.out.print("Indica el titulo: ");
                    String titulo = sc.nextLine();

                    System.out.print("Indica el autor: ");
                    String autor = sc.nextLine();

                    System.out.print("Indica el tamaño: ");
                    String tamanio = sc.nextLine();

                    System.out.print("Indica el formato: ");
                    String formato = sc.nextLine();

                    switch (tipo) {
                        case 1 -> {
                            System.out.print("Indica el ISBN: ");
                            String isbn = sc.nextLine();

                            System.out.print("Indica el numero de paginas: ");
                            int numPaginas = sc.nextInt();
                            sc.nextLine();

                            multimedia = new Libro(identificador, titulo, autor, formato, tamanio, isbn, numPaginas);
                        }
                        case 2 -> {
                            System.out.print("Indica el director: ");
                            String director = sc.nextLine();

                            System.out.print("Indica el numero de actores: ");
                            int numActores = sc.nextInt();
                            sc.nextLine();

                            multimedia = new Video(identificador, titulo, autor, formato, tamanio, director, numActores);

                        }
                        case 3 -> {
                            System.out.print("Indica la duracion: ");
                            double duracion = sc.nextDouble();
                            sc.nextLine();

                            System.out.print("Indica el soporte: ");
                            String soporte = sc.nextLine();

                            multimedia = new Audio(identificador, titulo, autor, tamanio, formato, duracion, soporte);
                        }

                        default -> {
                            System.out.println("Opcion invalida");
                        }
                    }

                    aplicacion.anhadirColeccion(multimedia);
                }

                case 2 -> {
                    System.out.print("Indica el identificador del elemento que desea eliminar: ");
                    String identificador = sc.nextLine();

                    aplicacion.eliminarElementoColeccion(identificador);
                }
                case 3 -> {
                    System.out.println();
                    System.out.println("Indica que elementos desea listar");
                    System.out.println("A. Video");
                    System.out.println("B. Audio");
                    System.out.println("C. Todos");
                    System.out.print("Elige una opcion: ");
                    String opcionLista = sc.nextLine();

                    switch (opcionLista.toUpperCase()) {
                        case "A" -> aplicacion.listarVideos();
                        case "B" -> aplicacion.listarAudios();
                        case "C" -> aplicacion.listarElementos();
                        default -> System.out.println("Opcion invalida");
                    }
                }

                case 4 -> {
                    System.out.print("Indica el nombre del autor: ");
                    String autor = sc.nextLine();

                    aplicacion.buscarPorAutorLibro(autor);
                }

                case 5 -> {
                    System.out.print("Indica el nombre del autor: ");
                    String autor = sc.nextLine();

                    aplicacion.buscarPorAutorAudio(autor);
                }

                case 6 -> {
                    System.out.print("Indica el nombre del director: ");
                    String director = sc.nextLine();

                    aplicacion.buscarPorDirector(director);
                }

                case 7 -> {
                    System.out.println("Saliendo...");
                }

                default -> {
                    System.out.println("Opcion invalida");
                }
            }
        } while (opcion != 7);
    }
}

import controller.BibliotecaController;
import controller.FileController;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BibliotecaController bc = new BibliotecaController();
        FileController fc = new FileController();

        int opcion = 0;

        do {

            System.out.println("\n=================================");
            System.out.println("BIBLIOTECA STEPHEN KING");
            System.out.println("=================================");
            System.out.println("1. Importar libros");
            System.out.println("2. Buscar libro por ID (API)");
            System.out.println("3. Añadir a favoritos");
            System.out.println("4. Mostrar favoritos");
            System.out.println("5. Exportar favoritos");
            System.out.println("6. Importar favoritos");
            System.out.println("0. Salir");
            System.out.println("=================================");
            System.out.print("Selecciona una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    bc.importarLibros();
                    break;

                case 2:
                    System.out.print("Introduce ID del libro: ");
                    int idBuscar = sc.nextInt();
                    bc.buscarLibroAPI(idBuscar);
                    break;

                case 3:
                    System.out.print("ID del libro a añadir: ");
                    int idFav = sc.nextInt();
                    bc.agregarFavorito(idFav);
                    break;

                case 4:
                    System.out.println("\nFAVORITOS:");
                    bc.mostrarFavoritos();
                    break;

                case 5:
                    fc.guardarFavoritos(bc.getFavoritos());
                    break;

                case 6:
                    List lista = fc.cargarFavoritos();
                    if (lista != null) {
                        bc.setFavoritos(lista);
                    }
                    break;

                case 0:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida");
            }

        } while (opcion != 0);

        sc.close();
    }

}
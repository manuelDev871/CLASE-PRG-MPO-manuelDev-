
// import nombrePaquete.NombreClase
// import controller.GestorDocumentos
// import controller.GestorUsuarios
// import controller.* (importa la carpeta completa controller)

import controller.GestorDocumentos;
import controller.GestorUsuarios;

public class Main {

    public static void main(String[] args) {
        System.out.println("Iniciando la clase");
        GestorUsuarios gestorUsuarios = new GestorUsuarios();
        gestorUsuarios.validarUsuario("Manuel", 23, "manuel@gmail.com");
        GestorDocumentos gestorDocumentos = new GestorDocumentos();
        gestorDocumentos.imprimirFactura(12);
    }
}

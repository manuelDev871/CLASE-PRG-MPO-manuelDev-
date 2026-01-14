package EjerciciosTema5.EjerciciosPOO.Ejercicio10.model;

import java.time.LocalDate;

public class Prestamo {

    private Libro libro;
    private Usuario usuario;
    private LocalDate fechaPrestamo;

    public Prestamo(Libro libro, Usuario usuario) {
        this.libro = libro;
        this.usuario = usuario;
        this.fechaPrestamo = LocalDate.now();
    }

    public void realizarPrestamo() {
        System.out.println("\nUsuario " + usuario.getNombre() + " (Socio " + usuario.getNumeroSocio() + ") intenta tomar prestado " + libro.getLibro());

        if (libro.isDisponible()) {
            libro.prestar();
            System.out.println("✓ Préstamo realizado el " + fechaPrestamo);
        } else {
            System.out.println("✗ El libro no está disponible");
        }
    }

    public void devolverLibro() {
        System.out.println("\nUsuario " + usuario.getNombre() + " devuelve " + libro.getLibro());

        libro.devolver();
        System.out.println("✓ Libro devuelto");
    }
}

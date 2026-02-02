package EjerciciosTema5.EjerciciosClaseHerencia.Ejercicio1;

import EjerciciosTema5.EjerciciosClaseHerencia.Ejercicio1.controller.Centralita;
import EjerciciosTema5.EjerciciosClaseHerencia.Ejercicio1.model.Llamada;
import EjerciciosTema5.EjerciciosClaseHerencia.Ejercicio1.model.LlamadaLocal;
import EjerciciosTema5.EjerciciosClaseHerencia.Ejercicio1.model.LlamadaNacional;
import EjerciciosTema5.EjerciciosClaseHerencia.Ejercicio1.model.LlamadaProvincial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        Centralita centralita = new Centralita();

        do {
            System.out.println("1. Registrar llamada");
            System.out.println("2. Mostrar llamada");
            System.out.println("3. Mostrar caja");
            System.out.println("4. Salir");
            System.out.print("Que quieres hacer: ");
            opcion = sc.nextInt();

            switch (opcion) {

                case 1 -> {
                    System.out.println("Indica que llamada quieres registrar");
                    System.out.println("1. Local");
                    System.out.println("2. Provincial");
                    System.out.println("3. Nacional");
                    System.out.print("Tipo: ");
                    int tipo = sc.nextInt();

                    Llamada llamada = null;

                    System.out.println("Indica Numero de Origen");
                    long nOrigen = sc.nextLong();
                    System.out.println("Indica Numero de Destino");
                    long nDestino = sc.nextLong();
                    System.out.println("Indica Duracion");
                    int duracion = sc.nextInt();

                    switch (tipo) {
                        case 1 -> {
                            llamada = new LlamadaLocal(nOrigen,nDestino,duracion);
                        }
                        case 2 -> {
                            llamada = new LlamadaProvincial(nOrigen,nDestino,duracion);
                        }
                        case 3 -> {
                            System.out.print("Indica franja:");
                            int franja = sc.nextInt();

                            llamada = new LlamadaNacional(nOrigen,nDestino,duracion,franja);
                        }
                    }

                    centralita.registrarLlamada(llamada);
                }

                case 2 -> {
                    centralita.mostrarDatosLlamadas();
                }

                case 3 -> {
                    centralita.mostrarCaja();
                }

                case 4 -> {
                    System.out.println("Saliendo");
                }

                default -> {
                    System.out.println("Opcion invalida");
                }
            }
        } while (opcion != 4);
    }
}

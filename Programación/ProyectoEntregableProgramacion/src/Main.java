import model.*;
import controller.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Coche> coches = new ArrayList<>();

        System.out.print("Número de coches: ");
        int numCoches = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < numCoches; i++) {
            System.out.print("Marca del coche " + (i + 1) + ": ");
            String marca = sc.nextLine();
            System.out.print("Modelo del coche " + (i + 1) + ": ");
            String modelo = sc.nextLine();

            coches.add(new Coche(marca, modelo));
        }

        System.out.print("Número de carreras: ");
        int numCarreras = sc.nextInt();

        ArrayList<Carrera> carreras = new ArrayList<>();

        for (int i = 0; i < numCarreras; i++) {
            System.out.print("Km de la carrera " + (i + 1) + ": ");
            int km = sc.nextInt();
            carreras.add(new Carrera(coches, km));
        }

        Campeonato campeonato = new Campeonato(carreras, coches);
        CampeonatoController controller = new CampeonatoController();
        controller.ejecutarCampeonato(campeonato);
    }
}

package Tema5.ProgramacionOrientadaObjetos.IntroducionPOO;

import Tema5.ProgramacionOrientadaObjetos.IntroducionPOO.model.Coche;
import Tema5.ProgramacionOrientadaObjetos.IntroducionPOO.model.Comprador;

public class Main {

    public static void main(String[] args) {

        Coche vacio = new Coche(); // Coche vacio
        // marca = null, modelo = null, cv = 0, precio = 0

        Coche mercedes = new Coche("Mercedes","ClaseC",300, 70000);
        Coche audi = new Coche("Audi","A5",260, 50000, 5);

        System.out.println("El precio del mercedes es " + mercedes.getPrecio() + " €");

        // Uso set para cambiar el precio del audi:
        audi.setPrecio(20000);
        System.out.println("El precio del mercedes es " + audi.getPrecio() + " €");

        Comprador nulo = new Comprador();

        Comprador comprador = new Comprador("Manuel","Cruz","Caceria 29");
        System.out.println("La dirección de envío del coche será " + comprador.getDireccion());
    }
}

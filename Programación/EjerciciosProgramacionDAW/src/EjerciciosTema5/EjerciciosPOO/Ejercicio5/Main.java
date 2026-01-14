package EjerciciosTema5.EjerciciosPOO.Ejercicio5;

import EjerciciosTema5.EjerciciosPOO.Ejercicio5.model.CuentaBancaria;

public class Main {

    /*
        Crea una clase CuentaBancaria con atributos titular y saldo.
        Implementa métodos depositar(cantidad) y retirar(cantidad).
        Crea tres cuentas diferentes, realiza varias operaciones en cada una y muestra el saldo final de todas.
     */

    public static void main(String[] args) {

        CuentaBancaria cuenta1 = new CuentaBancaria("Juan García",1500);
        CuentaBancaria cuenta2 = new CuentaBancaria("María López",800);
        CuentaBancaria cuenta3 = new CuentaBancaria("Pedro Martín",1200);

        System.out.println("Cuenta de " + cuenta1.getTitular() + ": " + cuenta1.getSaldo() + "€");
        cuenta1.depositar(500);
        System.out.println();

        System.out.println("Cuenta de " + cuenta2.getTitular() + ": " + cuenta2.getSaldo() + "€");
        cuenta2.retirar(200);
        System.out.println();

        System.out.println("Cuenta de " + cuenta3.getTitular() + ": " + cuenta3.getSaldo() + "€");
        cuenta3.depositar(300);
        System.out.println();

        System.out.println("Saldos finales:");
        System.out.println(cuenta1.getTitular() + ": " + cuenta1.getSaldo() + "€");
        System.out.println(cuenta2.getTitular() + ": " + cuenta2.getSaldo() + "€");
        System.out.println(cuenta3.getTitular() + ": " + cuenta3.getSaldo() + "€");
    }
}

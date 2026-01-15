package EjerciciosTema4.EjerciciosNavidades.Ejercicio3;

import EjerciciosTema4.EjerciciosNavidades.Ejercicio3.model.CuentaBancaria;

public class Main {

    /*
        Objetivo: Crear una clase que simule una cuenta bancaria con operaciones básicas.

        Requisitos:

        1. Crear una clase `CuentaBancaria` con atributos: `titular` (String), `numeroCuenta` (String), `saldo` (double).
        2. Crear constructor que inicialice titular y numeroCuenta. El saldo inicial debe ser 0.
        3. Crear getters. El saldo NO debe tener setter público.
        4. Crear metodo `void ingresar(double cantidad)` que añada dinero al saldo si la cantidad es positiva.
        5. Crear metodo `boolean retirar(double cantidad)` que retire dinero si hay saldo suficiente y la cantidad es positiva. Devuelve `true` si la operación tiene éxito.
        6. Crear metodo `void transferir(CuentaBancaria destino, double cantidad)` que transfiera dinero a otra cuenta.
        7. Crear metodo `void mostrarInfo()` que muestre titular, número de cuenta y saldo actual.
        8. En el `main`, crear dos cuentas y realizar varias operaciones.
     */

    public static void main(String[] args) {

        CuentaBancaria manuel = new CuentaBancaria("Manuel", "ES21 2323 2424 2525");
        CuentaBancaria natalia = new CuentaBancaria("Natalia", "ES23 1234 4567 5678");

        manuel.mostrarInfo();
        manuel.ingresar(1000);
        manuel.retirar(300);
        manuel.retirar(1000);

        manuel.transferir(natalia,200);
        natalia.mostrarInfo();
    }
}

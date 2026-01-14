package EjerciciosTema5.EjerciciosPOO.Ejercicio5.model;

public class CuentaBancaria {

    private String titular;
    private double saldo;

    public CuentaBancaria() {}

    public CuentaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Depósito de " + cantidad + "€. Nuevo saldo: " + saldo + "€");
        } else {
            System.out.println("No se puede depositar una cantidad inválida");
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Retiro de " + cantidad + "€. Nuevo saldo: " + saldo + "€");
        } else {
            System.out.println("No se puede retirar " + cantidad + "€");
        }
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }
}


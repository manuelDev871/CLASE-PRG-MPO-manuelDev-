package EjerciciosTema4.EjerciciosNavidades.Ejercicio3.model;

public class CuentaBancaria {

    private String titular, numeroCuenta;
    private double saldo;

    public CuentaBancaria() {}

    public CuentaBancaria(String titular, String numeroCuenta) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0;
    }

    // Getters
    public String getTitular() {
        return titular;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    // Setters
    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Metodo ingresar
    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Ingresando " + cantidad + " €...");
            System.out.println("Saldo actual: " + saldo + " €");
        } else {
            System.out.println("Cantidad errónea");
        }
    }

    // Metodo retirar
    public boolean retirar(double cantidad) {
        if ((saldo > cantidad) && (cantidad > 0)) {
            saldo -= cantidad;
            System.out.println("Retirando " + cantidad + " €...");
            System.out.println("Operacion exitosa. Saldo actual: " + saldo + " €");
            return true;
        } else {
            System.out.println("Intentando retirar " + cantidad + " €...");
            System.out.println("Saldo insuficiente");
            return false;
        }
    }

    //Metodo transferir
    public void transferir(CuentaBancaria destino, double cantidad) {
        if (cantidad > 0 && saldo >= cantidad) {
            saldo -= cantidad;
            System.out.println("Transfiriendo " + cantidad + " € a otra cuenta...");
            destino.ingresar(cantidad);
            System.out.println("Transferencia exitosa. Saldo actual: " + saldo + " €");
        } else {
            System.out.println("No se pudo realizar la transferencia de " + cantidad + " €");
        }
    }

    // Metodo mostrarInfo
    public void mostrarInfo() {
        System.out.println("Cuenta creada: Titular: " + titular + ", Número de cuenta: " + numeroCuenta + ", Saldo: " + saldo + " €");
    }
}

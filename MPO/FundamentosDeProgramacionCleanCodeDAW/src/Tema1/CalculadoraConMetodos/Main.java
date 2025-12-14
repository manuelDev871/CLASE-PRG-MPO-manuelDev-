package Tema1.CalculadoraConMetodos;

public class Main {

    public static void main(String[] args) {

        Operaciones operacionesMatematicas = new Operaciones();
        //Suma con numeros enteros y numeros decimales.
        operacionesMatematicas.sumarEnteros(5,10);
        operacionesMatematicas.sumarDecimales(5.5,7.9);

        //Resta con numeros enteros y numeros decimales.
        operacionesMatematicas.restarEnteros(25,10);
        operacionesMatematicas.restarDecimales(25.7,10.89);

        //Multiplicación con numeros enteros y numeros decimales.
        operacionesMatematicas.multiplicarEnteros(36,3);
        operacionesMatematicas.multiplicarDecimales(4.6,5.64);

        //División con numeros enteros y numeros decimales.
        operacionesMatematicas.dividirEnteros(50,10);
        operacionesMatematicas.dividirDecimales(12.44,12.44);
    }
}

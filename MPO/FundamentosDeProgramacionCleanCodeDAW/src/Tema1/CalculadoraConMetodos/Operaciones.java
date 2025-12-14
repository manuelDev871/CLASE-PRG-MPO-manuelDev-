package Tema1.CalculadoraConMetodos;

public class Operaciones {

    public void sumarEnteros (int op1,int op2) {
        int resultado = op1 + op2;
        System.out.println("El resultado de la suma es " + resultado);
    }

    public void sumarDecimales (double op1,double op2) {
        Double resultado = op1 + op2;
        System.out.println("El resultado de la suma de numeros decimales es " + resultado.floatValue());
    }

    public void restarEnteros (int op1,int op2) {
        int resultado = op1 - op2;
        System.out.println("El resultado de la resta es " + resultado);
    }

    public void restarDecimales (double op1,double op2) {
        Double resultado = op1 - op2;
        System.out.println("El resultado de la resta de numeros decimales es " + resultado.floatValue());
    }

    public void multiplicarEnteros (int op1,int op2) {
        int resultado = op1 * op2;
        System.out.println("El resultado de la multiplicación es " + resultado);
    }

    public void multiplicarDecimales (double op1,double op2) {
        Double resultado = op1 * op2;
        System.out.println("El resultado de la multiplicación de numero decimales es " + resultado.floatValue());
    }

    public void dividirEnteros(int op1, int op2) {
        int resultado = op1 / op2;
        System.out.println("El resultado de la división es " + resultado);
    }

    public void dividirDecimales(double op1, double op2) {
        Double resultado = op1 / op2;
        System.out.println("El resultado de la división de numero decimales es " + resultado.floatValue());
    }
}

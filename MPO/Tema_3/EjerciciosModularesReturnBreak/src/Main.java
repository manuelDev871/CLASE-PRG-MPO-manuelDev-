public class Main {

    public static void main(String[] args) {

        Ejercicios ejercicios = new Ejercicios();
        // ejercicios.validarContrasenha("123Manu456");

        //  int[] numeros = new int[] {1,2,3,4,5,6,7,8,9,0};
        //  ejercicios.buscarNumero(numeros, 12);

        //  int[] numeros = new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        //  ejercicios.mostrarPares(numeros);

        //  double[] notas = new double[] {-1,4,6,9,13,9};
        //  ejercicios.calcularPromedio(notas);

        //  ejercicios.intentarLogin();

        //  String[] tareas = new String[] {"hacer los deberes", "estudiar", "ir a la compra", "ver a mi novia (muy urgente)"};
        //  ejercicios.procesarTareas(tareas);

        //  ejercicios.generarFibonacci();

        int[] edades = new int[] {23,22,19,65,34,105,145,-10,89,212,99};
        ejercicios.contarEdadesValidas(edades);
        ejercicios.mostrarEdadesValidas(edades);

    }
}

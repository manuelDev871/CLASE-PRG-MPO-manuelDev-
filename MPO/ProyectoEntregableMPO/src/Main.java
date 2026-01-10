import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el tamaño de la matriz (n): ");
        int n = sc.nextInt();

        CuadradoMagico cuadrado = new CuadradoMagico(n);
        cuadrado.buscarCuadradoMagico();
        cuadrado.mostrarResultado();

        sc.close();
    }
}

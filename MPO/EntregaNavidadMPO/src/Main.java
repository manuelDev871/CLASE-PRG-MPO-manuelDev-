import java.util.Scanner;
import model.CuadradoMagico;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("Introduce el tamaño de la matriz (n): ");
            n = sc.nextInt();


            if (n < 3) {
                System.out.println("No existen cuadrados mágicos para n < 3. Inténtalo de nuevo.");
            }

        } while (n < 3);

        CuadradoMagico cuadrado = new CuadradoMagico(n);
        cuadrado.generar();

        System.out.println("=== CUADRADO MÁGICO ENCONTRADO ===");
        cuadrado.mostrarMatriz();
        System.out.println("Constante mágica: " + cuadrado.getConstanteMagica());
        System.out.println("Intentos realizados: " + cuadrado.getIntentos());

        sc.close();
    }
}
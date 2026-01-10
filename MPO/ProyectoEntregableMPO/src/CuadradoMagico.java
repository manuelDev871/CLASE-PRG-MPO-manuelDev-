import java.util.*;

public class CuadradoMagico {

    private int n;
    private int[][] matriz;
    private int constanteMagica;
    private int intentos;
    private Random random;

    public CuadradoMagico(int n) {
        this.n = n;
        this.matriz = new int[n][n];
        this.intentos = 0;
        this.random = new Random();
    }

    // Metodo principal de búsqueda por intentos sucesivos
    public void buscarCuadradoMagico() {
        boolean encontrado = false;

        while (!encontrado) {
            intentos++;
            generarMatrizAleatoria();

            if (esCuadradoMagico()) {
                constanteMagica = calcularConstanteMagica();
                encontrado = true;
            }
        }
    }

    // Genera una matriz aleatoria sin números repetidos
    private void generarMatrizAleatoria() {
        List<Integer> numeros = new ArrayList<>();

        for (int i = 1; i <= n * n; i++) {
            numeros.add(i);
        }

        Collections.shuffle(numeros, random);

        int indice = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = numeros.get(indice++);
            }
        }
    }

    // Comprueba si la matriz es un cuadrado mágico
    private boolean esCuadradoMagico() {
        int sumaObjetivo = 0;

        // Primera fila
        for (int j = 0; j < n; j++) {
            sumaObjetivo += matriz[0][j];
        }

        // Filas
        for (int i = 1; i < n; i++) {
            int sumaFila = 0;
            for (int j = 0; j < n; j++) {
                sumaFila += matriz[i][j];
            }
            if (sumaFila != sumaObjetivo) {
                return false;
            }
        }

        // Columnas
        for (int j = 0; j < n; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < n; i++) {
                sumaColumna += matriz[i][j];
            }
            if (sumaColumna != sumaObjetivo) {
                return false;
            }
        }

        // Diagonal principal
        int sumaDiagonalPrincipal = 0;
        for (int i = 0; i < n; i++) {
            sumaDiagonalPrincipal += matriz[i][i];
        }
        if (sumaDiagonalPrincipal != sumaObjetivo) {
            return false;
        }

        // Diagonal secundaria
        int sumaDiagonalSecundaria = 0;
        for (int i = 0; i < n; i++) {
            sumaDiagonalSecundaria += matriz[i][n - 1 - i];
        }
        if (sumaDiagonalSecundaria != sumaObjetivo) {
            return false;
        }

        return true;
    }

    // Calcula la constante mágica
    private int calcularConstanteMagica() {
        int suma = 0;
        for (int j = 0; j < n; j++) {
            suma += matriz[0][j];
        }
        return suma;
    }

    // Muestra el resultado final
    public void mostrarResultado() {
        System.out.println("=== CUADRADO MÁGICO ENCONTRADO ===");
        mostrarMatriz();
        System.out.println("Constante mágica: " + constanteMagica);
        System.out.println("Intentos realizados: " + intentos);
    }

    // Muestra la matriz con formato
    private void mostrarMatriz() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}

package model;

import java.util.ArrayList;
import java.util.Random;

public class CuadradoMagico {

    private int n;
    private int[][] matriz;
    private int constanteMagica;
    private int intentos;

    // Constructor:
    public CuadradoMagico(int n) {
        this.n = n;
        this.matriz = new int[n][n];
        this.constanteMagica = 0;
        this.intentos = 0;
    }

    // Metodo principal:
    public void generar() {

        boolean encontrado = false;

        while (!encontrado) {
            intentos++;

            generarMatrizAleatoria();
            calcularConstanteMagica();

            encontrado = comprobarFilas()
                    && comprobarColumnas()
                    && comprobarDiagonalPrincipal()
                    && comprobarDiagonalSecundaria();
        }
    }

    // Genero la matriz aleatoria sin números repetidos:
    private void generarMatrizAleatoria() {

        ArrayList<Integer> numeros = new ArrayList<>();
        Random aleatorio = new Random();

        for (int i = 1; i <= n * n; i++) {
            numeros.add(i);
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int nGenerados = aleatorio.nextInt(numeros.size());
                matriz[i][j] = numeros.get(nGenerados);
                numeros.remove(nGenerados);
            }
        }
    }

    // Calculo la constante mágica usando la primera fila:
    private void calcularConstanteMagica() {
        constanteMagica = 0;

        for (int j = 0; j < n; j++) {
            constanteMagica += matriz[0][j];
        }
    }

    // Compruebo todas las filas:
    private boolean comprobarFilas() {

        for (int i = 0; i < n; i++) {
            int sumaFila = 0;

            for (int j = 0; j < n; j++) {
                sumaFila += matriz[i][j];
            }

            if (sumaFila != constanteMagica) {
                return false;
            }
        }

        return true;
    }

    // Compruebo todas las columnas:
    private boolean comprobarColumnas() {

        for (int j = 0; j < n; j++) {
            int sumaColumna = 0;

            for (int i = 0; i < n; i++) {
                sumaColumna += matriz[i][j];
            }

            if (sumaColumna != constanteMagica) {
                return false;
            }
        }

        return true;
    }

    // Compruebo la diagonal principal:
    private boolean comprobarDiagonalPrincipal() {

        int suma = 0;

        for (int i = 0; i < n; i++) {
            suma += matriz[i][i];
        }

        return suma == constanteMagica;
    }

    // Compruebo la diagonal secundaria:
    private boolean comprobarDiagonalSecundaria() {

        int suma = 0;

        for (int i = 0; i < n; i++) {
            suma += matriz[i][n - 1 - i];
        }

        return suma == constanteMagica;
    }

    // Mostrar la matriz por pantalla:
    public void mostrarMatriz() {

        for (int[] fila : matriz) {
            for (int item : fila) {
                System.out.print(item + "\t");
            }
            System.out.println();
        }
    }

    public int getConstanteMagica() {
        return constanteMagica;
    }

    public int getIntentos() {
        return intentos;
    }
}
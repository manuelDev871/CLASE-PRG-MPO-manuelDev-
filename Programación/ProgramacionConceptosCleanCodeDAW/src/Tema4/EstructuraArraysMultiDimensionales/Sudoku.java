package Tema4.EstructuraArraysMultiDimensionales;

public class Sudoku {

    private int[][] sudoku = new int[3][3];

    public void empezarJuego() {
        // se rellena la matriz con numeros aleatorios
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku[i].length; j++) {
                int aleatorio;
                do {
                    aleatorio = (int) (Math.random()*10);
                } while (estaNumero(aleatorio));
                sudoku[i][j] = aleatorio;
            }
        }

        // Utilizo forEach para mostrar el resultado del sudoku
        for (int[] fila : sudoku) {
            for (int item : fila) {
                System.out.print(item + "\t");
            }
            System.out.println();
        }

        System.out.println("Mostrando los números de una columna concreta");
        numerosColumnaUno(0);

        System.out.println();

        System.out.println("Mostrando los números de una fila concreta");
        numerosFilaUno(0);

    }

    private boolean estaNumero(int numero) {
        for (int[] fila : sudoku) {
            for (int item : fila) {
                if (item == numero) {
                    return true;
                }
            }
        }
        return false;
    }

    // solo saco los numeros de la primera columna
    public void numerosColumnaUno(int nColumna) {
        for (int i = 0; i < sudoku.length; i++) {
            System.out.println(sudoku[i][nColumna]);
        }
    }

    // solo saco los numeros de la primera fila
    public void numerosFilaUno(int nFila) {
        for (int i = 0; i < sudoku[nFila].length; i++) {
                System.out.print(sudoku[nFila][i] + "\t");
        }
    }
}

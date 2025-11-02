public class Ejercicios_for_clase {

    public static void main(String[] args) {

    // Tablas del 0 al 10
        System.out.println("Tablas de multiplicar");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 11; j++) {
                System.out.printf("%d x %d = %d \n", i, j, i * j);
            }
            System.out.println();
        }

        //Tabla del 2 y tabla del 6.
        for (int i = 2; i <= 6; i+=4) {
            System.out.println("Tabla del " + i);
            for (int j = 0; j < 11; j++) {
                System.out.printf("%d * %d = %d\n",i ,j, i * j);
            }
            System.out.println();
        }

        //Tabla del 8 y del 12.
        for (int i = 8; i < 13; i+=4) {
            System.out.println("Tabla del " + i + "\n");
            for (int j = 0; j < 11; j++) {
                System.out.printf("%d * %d = %d\n",i, j, i * j);
            }
            System.out.println();
        }
    }
}

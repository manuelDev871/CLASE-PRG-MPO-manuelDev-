package Tema1;

public class Main {

    // ============================================================
    //                 VARIABLES Y COMENTARIOS
    // ============================================================

    // Comentario de una línea
    /*
       Comentario en varias líneas
       usado para documentar bloques largos
     */

    // Variable global (pertenece al objeto)
    int edadGlobal = 12;

    // ============================================================
    //                        MAIN
    // ============================================================
    public static void main(String[] args) {

        System.out.println("Primer programa en JAVA");
        System.out.println("Main para probar métodos y variables");

        // ------------------ TIPOS DE VARIABLES -------------------

        // Variables de texto
        String miNombre = "Manuel";
        final String DNI = "123123A";   // constante → no se puede modificar

        // Caracteres (solo un símbolo)
        Character letraCompleja = 'b';  // tipo objeto
        char letraDNI = 'B';            // tipo primitivo

        // Números enteros
        Integer edadCompleja = 23;  // tipo objeto
        int edad = 22;              // tipo primitivo

        // Decimales
        Double alturaCompleja = 21.76;   // objeto (usa más memoria)
        double altura = 1.71;            // primitivo
        Float pesoCompleja = 21.12f;
        float peso = 70.7f;

        // Booleanos
        Boolean experienciaCompleja = false;
        boolean experiencia = true;

        // ------------------ MODIFICACIONES -----------------------
        edad = 23;
        letraDNI = 109;          // 109 es un código ASCII → 'm'
        miNombre = "Manuel C.S.";
        altura = 1.75;
        peso = 67.5f;
        experiencia = false;

        // ------------------ MOSTRAR DATOS ------------------------
        System.out.println("Mi nombre es: " + miNombre);
        System.out.println("La letra de mi dni es: " + letraDNI);
        System.out.println("Mi edad es: " + edad + " años");
        System.out.println("Mi altura es de: " + altura + " cm");
        System.out.println("Mi peso es de: " + peso + " kg");
        System.out.println("Mi experiencia es: " + experiencia);
        System.out.println("Mi DNI es: " + DNI);

        // ------------------ CLASE MATH ---------------------------
        System.out.println("Número PI: " + Math.PI);
        System.out.println("Número E: " + Math.E);
        System.out.println("Máximo de int: " + Integer.MAX_VALUE);
        System.out.println("Mínimo de int: " + Integer.MIN_VALUE);

        // ------------------ LLAMADA A MÉTODOS ---------------------
        saludar("Laura");   // método que recibe parámetro
        // despedir();      // método sin parámetros
    }

    // ============================================================
    //                       MÉTODOS
    // ============================================================

    // Metodo sin parámetros, solo imprime una variable local
    public void nombreMetodo() {
        int edadMetodo = 12;   // variable local → solo existe aquí
        System.out.println(edadMetodo);
        System.out.println(edadGlobal); // accede a la variable global
    }

    // Metodo con parámetro que tiene el mismo nombre que la global
    public void nombreMetodo1(int edadGlobal) {
        int edadMetodo = 123;
        System.out.println(edadMetodo);
        // this.edadGlobal → se refiere a la variable global, NO al parámetro
        System.out.println(this.edadGlobal);
    }

    // ------------------ MÉTODOS ESTÁTICOS -----------------------

    // Metodo que recibe un dato (parámetro)
    static void saludar(String data){
        System.out.println("Enhorabuena " + data + ", has llamado a tu primer método");
    }

    // Metodo simple sin parámetros
    static void despedir(){
        System.out.println("Hasta luego, hemos terminado");
    }
}

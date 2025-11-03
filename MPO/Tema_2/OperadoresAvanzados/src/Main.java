// import nombrePaquete.NombreClase
// import controller.GestorDocumentos
// import controller.GestorUsuarios
// import controller.*
import controller.*;

public class Main {

    public static void main(String[] args) {
        /*System.out.println("Iniciando la clase");
        GestorUsuarios gestorUsuarios = new GestorUsuarios();
        gestorUsuarios.validarUsuario("Borja",41,"borja@gmail.com");*/
        /*GestorDocumentos gestorDocumentos1 = new GestorDocumentos();
        GestorDocumentos gestorDocumentos2 = new GestorDocumentos();
        // gestorDocumentos.imprimirFactura(12);
        gestorDocumentos1.ejecutarDocumento();
        gestorDocumentos1.ejecutarDocumento();
        gestorDocumentos1.verConsultas(); // 2

        gestorDocumentos2.ejecutarDocumento();
        gestorDocumentos2.ejecutarDocumento();
        gestorDocumentos2.verConsultas(); // 4

        gestorDocumentos1.verConsultas(); // 4*/
        // CASTING
        // int -> double
        // double -> int
        // AutoBoxing
        // Integer numero = 20;
        // UnBoxing
        // Integer numero1 = 20;
        //
        // int numeroBase = numero1;

        // PARSING
        // String -> int
        // String -> boolean

        // ARITMETRICOS -> + - * / %
        // ASIGNACION -> = += -= *= /= %=
        // RELACIONALES -> < <= > >= == !=
        // LOGICOS -> && (AND) || (OR)

        /*
        int numero1 = 5;
        int numero2 = 6;
        int resultado = numero1 & numero2;
        System.out.println("El resultado de la comparacion & a nivel de BIT es " + resultado);

        resultado = numero1 | numero2;
        System.out.println("El resultado de la comparacion | a nivel de BIT es " + resultado);

        String palabra = null;
        int comparar = 0;
        int comparar2 = 20;
        boolean resultadoComparacion = comparar < comparar2 || comparar >= 0 || numero2 < 100 || palabra.length() == 0;
        // System.out.println(palabra.length()); (Me ha dado fallo porque esto es null.length
        System.out.println("El resultado de la comparacion boleana es " + resultadoComparacion);
        */

        /*
        String palabra1 = "borja";
        String palabra2 = "Borja";
        //boolean resultadoPalabra = palabra1 == palabra2; No se debe hacer asi
        boolean resultadoPalabra = palabra1.equals(palabra2); // .equals se utiliza para hacer comparaciones
        System.out.println("El resultado de comparar las dos palabras " + resultadoPalabra);

        resultadoPalabra = palabra1.equalsIgnoreCase(palabra2); // .equalsIgnoreCase se utiliza para hacer comparaciones sin importar mayusculas o minusculas.
        System.out.println("El resultado de comparar las dos palabras " + resultadoPalabra);
         */

        // CASTEO -> pasar temporalmente una variable de un tipo a otro ->  (int) variable
        /*
        int numero = 140;
        System.out.println("El numero correspondiente es " + numero);
        char letra = (char) numero;
        System.out.println("Esta es la letra correspondiente a " + letra);
        int ultimoNumeroAsci = 255;
        System.out.println("El ultimo numero ASCII es " + ultimoNumeroAsci);
        String palabraCifrar = "Esta frase la quiero cifrar";
        for (int i = 0; i < palabraCifrar.length(); i++) {
            int codigo = palabraCifrar.charAt(i);

            if (i%2 == 0) {
                codigo*=2;
            } else {
                codigo*=3;
            }

            System.out.print(codigo + " ");

            }
            */
        // Recolector de basura -> recopilar todas las variables o elementos del codigo que no se usen y tengan un valor null
        
        String nombre = "Borja";
        System.out.println(nombre);
        boolean esCorreo = nombre.contains("@");
        System.out.println("El nombre es " + nombre);
        System.out.println("El correo es " + esCorreo);
        nombre = null; // candidata a ser capturada por el GC (garbage colector)
        System.gc(); // Fuerza la recoleccion de elementos en null

        }
    }
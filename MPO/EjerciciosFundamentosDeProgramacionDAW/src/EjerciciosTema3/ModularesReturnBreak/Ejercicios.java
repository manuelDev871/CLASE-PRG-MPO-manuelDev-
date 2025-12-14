package EjerciciosTema3.ModularesReturnBreak;
import java.util.Scanner;

public class Ejercicios {

    public boolean validarContrasenha (String password) {

        /*
            Objetivo: Crear un metodo que valide una contraseña y use return
            para salir anticipadamente si no cumple los requisitos.

            1.  Crea un metodo boolean validarContrasena(String password).
            2.  La contraseña debe tener al menos 8 caracteres. Si no cumple, usa return false inmediatamente.
            3.  Debe contener al menos una letra mayúscula. Si no cumple, usa return false.
            4.  Debe contener al menos un número. Si no cumple, usa return false.
            5.  Si pasa todas las validaciones, devuelve true.
            6.  En el main, prueba el metodo con diferentes contraseñas y muestra si son válidas o no.
         */

        // Tiene al menos 8 caracteres?...
        if (password.length() < 8) {
            System.out.println("Contraseña no valida, no tiene al menos 8 caracteres");
            return false;
        }

        // Tiene al menos una mayuscula?...
        boolean tieneMayuscula = false;

        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                tieneMayuscula = true;
            }
        }

        if(!tieneMayuscula) {
            System.out.println("Contraseña no válida, no contiene ninguna mayuscula");
            return false;
        }

        // Tiene al menos un numero?...

        boolean contieneNumero = false;

        for (int i = 0; i < password.length(); i++) {
            if(password.contains("1") || password.contains("2") || password.contains("3") || password.contains("4")
                    || password.contains("5") || password.contains("6") || password.contains("7") || password.contains("8")
                    || password.contains("9") || password.contains("0")) {
                contieneNumero = true;
            }
        }

        if (!contieneNumero) {
            System.out.println("Contraseña no válida, no contiene ningún número");
            return false;
        }


        System.out.println("Contraseña valida");
        return true;
    }

    public int buscarNumero(int[] numeros, int obejtivo) {

        /*
            Objetivo: Crear un metodo que busque un número en un array y use break para salir del bucle cuando lo encuentre.

            1.  Crea un metodo int buscarNumero(int[] numeros, int objetivo).
            2.  El metodo debe recorrer el array con un for.
            3.  Cuando encuentre el número objetivo, usa break para salir del bucle.
            4.  Devuelve el índice donde se encontró el número, o -1 si no se encontró.
            5.  En el main, crea un array de enteros y prueba el metodo.
        */

        int indice = -1;

        for (int i = 0; i < numeros.length; i++) {
            if (obejtivo == numeros[i]) {
                System.out.println("Objetivo encontrado en la posicion " + (i + 1));
                indice = i;
                break;
            }
        }


        if (indice == -1) {
            System.out.println("-1");
        }

        return indice;
    }

    public void mostrarPares(int[] numerosss) {

    /*
        Objetivo: Crear un metodo que muestre solo números pares de un array usando continue.

        1.  Crea un metodo void mostrarPares(int[] numeros).
        2.  Recorre el array con un bucle for.
        3.  Si el número es impar, usa continue para saltar a la siguiente iteración.
        4.  Si el número es par, muéstralo en pantalla.
        5.  En el main, crea un array con números del 1 al 20 y llama al metodo.
     */

        for (int i = 0; i < numerosss.length; i++) {
            if (numerosss[i] %2 != 0) {
                continue;
            } else {
                System.out.print(numerosss[i] + " ");
            }
        }
    }

    public double calcularPromedio(double[] notas) {

        /*
            Objetivo: Crear un metodo que calcule el promedio de notas, saltando notas inválidas con continue

            1. Crea un metodo `double calcularPromedio(double[] notas)`.
            2. Recorre el array de notas.
            3. Si una nota es menor que 0 o mayor que 10, usa `continue` para ignorarla.
            4. Suma las notas válidas y cuenta cuántas hay.
            5. Devuelve el promedio de las notas válidas.
            6. En el `main`, prueba con un array que incluya algunas notas inválidas.
        */

        double suma = 0;
        int notasValidas = 0;
        double promedio;

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] < 0 || notas[i] > 10) {
                continue;
            } else {
                notasValidas++;
                suma += notas[i];
            }
        }

        promedio = suma / notasValidas;
        System.out.println("Nº de notas válidas: " + notasValidas);
        System.out.println("Suma: " + suma);
        System.out.printf("Promedio: %.2f", promedio);
        return promedio;
    }

    public void intentarLogin() {

        /*
            Objetivo: Crear un metodo que simule un sistema de login usando break cuando el login sea exitoso.

            1. Crea un metodo `boolean intentarLogin(String usuarioCorrecto, String passwordCorrecta)`.
            2. El usuario tiene 3 intentos máximo.
            3. Usa un bucle `for` para los intentos.
            4. Simula el ingreso de usuario y contraseña (puedes usar valores hardcodeados diferentes en cada intento).
            5. Si las credenciales son correctas, usa `break` y devuelve `true`.
            6. Si se agotan los intentos, devuelve `false`.
        */

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce tu username: ");
        String username = sc.next();
        System.out.print("Introduce tu password: ");
        String password = sc.next();


        int intentos = 3;
        String usuarioCorrecto = "manuelDev";
        String passwordCorrecta = "123Manu456";


        for (int i = 0; i < 3; i++) {
            if (username.equals(usuarioCorrecto) && password.equals(passwordCorrecta)) {
                System.out.println("Las credenciales son correctas");
                break;
            } else {
                System.out.println("Lo siento, usuario o contraseña incorrectos, intentelo de nuevo");
                System.out.print("Introduce tu username: ");
                username = sc.next();
                System.out.print("Introduce tu password: ");
                password = sc.next();
                intentos--;
            }

            if (intentos == 0) {
                System.out.println("Nº de intentos alcanzados");
            }
        }
        sc.close();
    }

    public static String procesarTareas(String[] tareas) {

        /*
            Objetivo: Crear un metodo que procese una lista de tareas y use return anticipadamente si encuentra una tarea prioritaria.

            1. Crea un metodo `String procesarTareas(String[] tareas)`.
            2. Recorre el array de tareas.
            3. Si encuentra una tarea que contiene la palabra "URGENTE", usa `return` inmediatamente devolviendo esa tarea.
            4. Si no hay tareas urgentes, devuelve "No hay tareas urgentes".
            5. En el `main`, prueba con diferentes arrays de tareas.
        */

        for (int i = 0; i < tareas.length; i++) {
            if (tareas[i].contains("urgente")) {
                System.out.println(tareas[i]);
                return tareas[i];
            }
        }
        return "No hay tareas urgentes";
    }

    public void generarFibonacci() {

        /*
            Objetivo: Crear un metodo que genere la secuencia de Fibonacci hasta un límite usando `break`.

            1. Crea un metodo `void generarFibonacci(int limite)`.
            2. Genera la secuencia de Fibonacci (0, 1, 1, 2, 3, 5, 8, 13...).
            3. Usa un bucle `while(true)` infinito.
            4. Cuando el siguiente número supere el límite, usa `break` para salir.
            5. Muestra todos los números generados.
            6. En el `main`, prueba con diferentes límites como 100, 1000, 10000.
        */

        Scanner sc = new Scanner(System.in);
        System.out.print("Indica el limite de la frecuencia: ");
        int limiteFrecuencia = sc.nextInt();

        int a = 0;
        int b = 1;

        while (true) {

            if (a > limiteFrecuencia) {
                break;
            }

            System.out.println(a + "");
            int siguiente = a +b;

            a = b;
            b = siguiente;
        }

        System.out.println();
    }

    public int contarEdadesValidas (int[] edades) {

        /*
            Objetivo: Crear un metodo que valide edades en un array, saltando valores inválidos con `continue`.

            Requisitos:

            1. Crea un metodo `int contarEdadesValidas(int[] edades)`.
            2. Recorre el array de edades.
            3. Si la edad es negativa o mayor a 120, usa `continue` para ignorarla.
            4. Cuenta las edades válidas.
            5. Devuelve el contador de edades válidas.
            6. Crea otro metodo `void mostrarEdadesValidas(int[] edades)` que muestre solo las edades válidas.
        */

        System.out.println();
        int contadorEdadesValidas = 0;

        for (int i = 0; i < edades.length; i++) {
            if (edades[i] > 120 || edades[i] < 0) {
                continue;
            } else {
                contadorEdadesValidas++;
            }
        }
        System.out.println("Nº de edades validas: " + contadorEdadesValidas);
        System.out.println();
        return contadorEdadesValidas;

    }
    public void mostrarEdadesValidas(int[] edades) {

        System.out.println("Edades validas: ");

        for (int i = 0; i < edades.length; i++) {
            if (edades[i] <= 120 && edades[i] > 0) {
                System.out.print(edades[i] + " ");
            }
        }
    }

    public int contarVocales(String texto) {

        /*
             Objetivo: Crear varios métodos modulares que analicen un texto y usen `return`, `break` y `continue`.

             1. Crea un metodo int contarVocales(String texto) que cuente vocales, usando continue para consonantes.
             2. Crea un metodo boolean contienePalabraProhibida(String texto, String[] palabrasProhibidas)
                que use return true en cuanto encuentre una palabra prohibida.
             3. Crea un metodo String primeraPalabraLarga(String texto, int longitudMinima) que busque y devuelva
                la primera palabra que supere la longitud mínima usando return.
             4. En el main, prueba todos los métodos con diferentes textos.
        */

        int contadorVocales = 0;
        texto = texto.toLowerCase();

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);

            // Si NO es vocal → saltamos la iteración
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                continue;   // pasa al siguiente caracter
            }

            // Si llegamos aquí, entonces sí es vocal
            contadorVocales++;
        }

        System.out.println("Hay " + contadorVocales + " vocales");
        return contadorVocales;
    }
    public boolean contienePalabraProhibida(String texto, String[] palabrasProhibidas) {

        for (int i = 0; i < palabrasProhibidas.length; i++) {
            if (texto.contains(palabrasProhibidas[i])) {
                System.out.println("El texto contiene una palabra prohibida: " + palabrasProhibidas[i]);
                return true;   // terminamos en cuanto encontremos una
            }
        }

        System.out.println("El texto no contiene ninguna palabra prohibida");
        return false;  // si llegamos aquí, no encontramos ninguna
    }
    public String primeraPalabraLarga(String texto, int longitudMinima) {

        String[] palabra = texto.split(" ");

        for (int i = 0; i < palabra.length; i++) {
            if (palabra[i].length() > longitudMinima) {
                System.out.println(palabra[i]);
                return palabra[i];
            }
        }
        return null;
    }


    public boolean verificarStock(int cantidad, int stock) {

        /*
            Crear un sistema modular de procesamiento de pedidos que use return, break y continue.

            1.  Crea un metodo boolean verificarStock(int cantidad, int stock) que devuelva inmediatamente false si no hay suficiente stock.
            2.  Crea un metodo double calcularDescuento(double precio, int cantidad) que aplique descuentos por cantidad.
            3.  Crea un metodo void procesarPedidos(String[] productos, int[] cantidades, double[] precios).
            4.  En el procesamiento, usa continue para saltar productos con cantidad 0.
            5.  Usa break si el total del pedido supera los 1000 euros (límite de procesamiento automático).
            6.  En el main, simula el procesamiento de varios pedidos.
        */

        if (stock > cantidad) {
            System.out.println("Enhorabuena, hay stock suficiente");
        }

        return false;
    }
    public double calcularDescuento(double precio, int cantidad) {

        double precioTotal = 0;

        if (cantidad <= 0) {
            precio = 0;
            return precio;
        }
        else if (cantidad == 1) {
            System.out.println("Precio original: " + precio + " €");
            return precio;
        } else if (cantidad <= 5) {
            precioTotal = cantidad * precio;
            precioTotal *= 0.5;
            System.out.println("Descuento del 50%");
            System.out.printf("Precio total: %.2f €", precioTotal);
            return precioTotal;
        } else {
            precioTotal = precio * cantidad;
            precioTotal *= 0.65;
            System.out.println("Descuento del 65%");
            System.out.printf("Precio total: %.2f €", precioTotal);
            return precioTotal;
        }
    }
    public void procesarPedidos(String[] productos, int[] cantidades, double[] precios) {

        double totalPedido = 0;

        for (int i = 0; i < productos.length; i++) {

            // Saltar productos sin cantidad usando continue
            if (cantidades[i] == 0) {
                continue;
            }

            double subtotal = cantidades[i] * precios[i];
            totalPedido += subtotal;

            System.out.println("Producto: " + productos[i] +
                    " | Cantidad: " + cantidades[i] +
                    " | Precio ud.: " + precios[i] +
                    " | Subtotal: " + subtotal);

            // Si el total supera el límite → parar el procesamiento
            if (totalPedido > 1000) {
                System.out.println("❗ Límite de 1000€ superado. Procesamiento detenido.");
                break;
            }
        }

        System.out.println("Total procesado hasta el momento: " + totalPedido + " €");
    }
}
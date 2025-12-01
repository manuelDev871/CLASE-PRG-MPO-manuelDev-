import java.util.Scanner;

public class Ejercicios {

    public boolean validarContrasenha (String password) {

        /*
        EJERCICIO 1:

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

    public void mostrarPares(int[] numeros) {

    /*
        Objetivo: Crear un metodo que muestre solo números pares de un array usando continue.

        1.  Crea un metodo void mostrarPares(int[] numeros).
        2.  Recorre el array con un bucle for.
        3.  Si el número es impar, usa continue para saltar a la siguiente iteración.
        4.  Si el número es par, muéstralo en pantalla.
        5.  En el main, crea un array con números del 1 al 20 y llama al metodo.
     */

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] %2 != 0) {
                continue;
            } else {
                System.out.print(numeros[i] + " ");
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





}
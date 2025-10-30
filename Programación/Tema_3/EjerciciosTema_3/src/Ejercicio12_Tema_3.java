/*  Crea un programa que pida al usuario crear una contraseña. La contraseña debe cumplir estos requisitos:
    tener al menos 8 caracteres de longitud, contener al menos un número, y NO puede ser "12345678" o "password".
    El programa debe verificar cada condición por separado usando operadores lógicos y mostrar si la contraseña
    es válida o no, indicando qué requisitos no cumple.

    Nota: Para este ejercicio, asume que tienes funciones auxiliares como longitudCadena(texto), contienNumero(texto). */


import java.util.Scanner;

public class Ejercicio12_Tema_3 {

    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner(System.in);
        System.out.println("Introduce tu contraseña");
        String pass = entradaTeclado.next();

        if (pass.length() < 8) {
            System.out.println("Contraseña no valida, debe tener al menos 8 caracteres de longitud.");
        } else if (pass.equals("12345678") || pass.equalsIgnoreCase("password")) {
            System.out.println("Contraseña no valida, no puede ser ni (12345678), ni (password).");
        } else if (!contieneNumero(pass)) {
            System.out.println("Contraseña no valida, debe contener al menos un número.");
        } else {
            System.out.println("Contraseña válida, iniciando sesión..........");
        }

        entradaTeclado.close();
    }

    // Función auxiliar para comprobar si hay al menos un número
    public static boolean contieneNumero(String texto) {
        for (int i = 0; i < texto.length(); i++) {
            if (Character.isDigit(texto.charAt(i))) {
                return true;
            }
        }
        return false;
    }
}


// Revisar

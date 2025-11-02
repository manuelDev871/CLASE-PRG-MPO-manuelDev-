/*  Crea un programa que pida al usuario crear una contraseña. La contraseña debe cumplir estos requisitos:
    tener al menos 8 caracteres de longitud, contener al menos un número, y NO puede ser "12345678" o "password".
    El programa debe verificar cada condición por separado usando operadores lógicos y mostrar si la contraseña
    es válida o no, indicando qué requisitos no cumple.

    Nota: Para este ejercicio, asume que tienes funciones auxiliares como longitudCadena(texto), contienNumero(texto). */


import java.util.Scanner;

public class Ejercicio12_Tema_3_ResueltoProfesor {

    public static void main(String[] args) {

        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("Introduce contraseña");
        String pass = entradaTeclado.next();

        boolean nCaracteres = pass.length() >= 8;
        System.out.println("¿La contraseña tiene al menos 8 caracteres?: " + nCaracteres);

        boolean esValida = !(pass.equals("12345678")) || (pass.equals("password"));
        System.out.println("¿La pass es prohibida?: " + !esValida);

        boolean contieneNumero = pass.contains("1") || pass.contains("2")
                || pass.contains("3") || pass.contains("4") || pass.contains("5") || pass.contains("6")
                || pass.contains("7") || pass.contains("8") || pass.contains("9") || pass.contains("0");
        System.out.println("¿La pass contiene al menos un numero?: " + contieneNumero);

        boolean passValida = nCaracteres && esValida && contieneNumero;
        System.out.println("La contraseña es valida: " + passValida);
    }

}

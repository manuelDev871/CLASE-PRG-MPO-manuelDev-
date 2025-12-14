package EjerciciosTema1;
import java.util.Scanner;

public class EjerciciosTemaUno {

    public void ejercicioUno() {

        /* Ejercicio Nº1 : Crea un programa que defina tres variables: nombre, edad y ciudad.
           Asigna valores a cada una y muestra su contenido en la consola.*/

        String nombre = "Manuel";
        int edad = 23;
        String ciudad = "Quintana de la Serena";

        System.out.println("Mi nombre es " + nombre);
        System.out.println("Tengo " + edad + " años");
        System.out.println("Mi pueblo se llama " + ciudad);
    }
    public void ejercicioDos() {

        /* Ejercicio Nº 2 : Crea un programa que defina una variable llamada puntuación con valor inicial 0.
           Luego, modifica su valor tres veces y muestra el resultado final.*/

        int puntuacion = 0;
        System.out.println("Puntuación inicial = " + puntuacion);
        puntuacion = 1;
        System.out.println("Después de primera modificación = " + puntuacion);
        puntuacion = 2;
        System.out.println("Después de segunda modificación = " + puntuacion);
        puntuacion = 3;
        System.out.println("Puntuación final = " + puntuacion);
    }
    public void ejercicioTres() {

        /* Ejercicio Nº 3 : Define cinco variables con diferentes tipos de datos (String, int, boolean, double, char)
           y muestra tanto su valor como su tipo. */

        String nombre = "Manuel";
        Integer edad = 23;
        Boolean experiencia = true;
        Double altura = 1.71;
        Character DNI = 'b';

        System.out.println("Mi nombre es " + nombre + " y el tipo de variable es " + nombre.getClass().getSimpleName());
        System.out.println("Mi edad es de " + edad + " años y el tipo de variable es " + edad.getClass().getSimpleName());
        System.out.println("Mi experiencia es " + experiencia + " y el tipo de variable es " + experiencia.getClass().getSimpleName());
        System.out.println("Mi altura es de " + altura + " cms y el tipo de variable es " + altura.getClass().getSimpleName());
        System.out.println("Mi letra del DNI es " + DNI + " y el tipo de variable es " + DNI.getClass().getSimpleName());
    }

    public void ejercicioCuatro () {

        /* Ejercicio Nº 4 : Crea un programa que simule la información de un libro usando variables con nombres descriptivos.
           Muestra toda la información del libro en la consola. */

        System.out.println("--------------");
        System.out.println("INFORMACION 1");
        System.out.println("--------------");

        almacenar("Don Quijote","Miguel de Cervantes",1605, 863, true);

        System.out.println("--------------");
        System.out.println("INFORMACION 2");
        System.out.println("--------------");
        almacenar("Don Quijote de la Mancha","Miguel de Cervantes",1605, 863, false);

        // El metodo public void ejercicioCuatro, deberia estar en el metodo Main.
        // almacenar() debe ser llamado desde el metodo Main, aun asi, el programa funciona correctamente.
    }
    public static void almacenar (String titulo, String autor, int fechaPublicacion, int numeroPaginas, boolean disponibilidad) {

        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de publicación: " + fechaPublicacion);
        System.out.println("Número de páginas: " + numeroPaginas);
        System.out.println("Disponibilidad: " + disponibilidad);
    }

    public void ejercicioCinco() {

        /* Ejercicio Nº 5 : Crea un programa que use constantes para almacenar información que no debe cambiar (
           como el valor de PI o el nombre de una aplicación) y variables para información que puede cambiar.
           Muestra todos los valores. */

        final String nombreApp = "MiApp";
        final String version = "1.0.0";

        String usuario = "Laura";
        int level = 1;
        int puntuacion = 0;

        System.out.println("Aplicación: " + nombreApp);
        System.out.println("Versión final: " + version);
        System.out.println("El numero PI es: " + Math.PI);
        System.out.println("Usuario actual: " + usuario);
        System.out.println("Nivel actual: " + level);
        System.out.println("Puntuación actual: " + puntuacion);

        usuario = "Manuel";
        level = 5;
        puntuacion = 10;

        System.out.println("Usuario actualizado: " + usuario);
        System.out.println("Nivel actualizado: " + level);
        System.out.println("Puntuación actualizado: " + puntuacion);
    }
    public void ejercicioSeis() {

        /* Ejercicio Nº 6 : Escribe un programa que declare dos variables numéricas,
           realice las operaciones básicas (suma, resta, multiplicación y división) y muestre los resultados por consola. */

        int num1 = 50;
        int num2 = 5;

        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        int division = num1 / num2;

        System.out.println("El resultado de la suma es " + suma);
        System.out.println("El resultado de la resta es " + resta);
        System.out.println("El resultado de la multiplicacion es " + multiplicacion);
        System.out.println("El resultado de la division es " + division);
    }
    public void ejercicioSiete() {

        /* Ejercicio Nº 7 : Crea un programa que almacene tu información personal
           (nombre, apellido, edad y ciudad) en variables y muestre un mensaje de presentación por consola. */

        Scanner ejercicio7 = new Scanner(System.in);

        System.out.println("Introduce tu nombre");
        String nombre = ejercicio7.nextLine();

        System.out.println("Introduce tus apellidos");
        String apellidos = ejercicio7.nextLine();

        System.out.println("Introduce tu edad");
        int edad = ejercicio7.nextInt();
        ejercicio7.nextLine();

        System.out.println("Dime el nombre de tu ciudad");
        String ciudad = ejercicio7.nextLine();


        System.out.println("¡Hola! Me llamo " + nombre + " " + apellidos + ".\n" + "Tengo " + edad + " años y vivo en " + ciudad + ".");

        ejercicio7.close();
    }
    public void ejercicioOcho() {

        /* Ejercicio Nº 8 : Desarrolla un programa que calcule el área de un rectángulo.
           Declara variables para la base y la altura, y muestra el resultado del cálculo. */

        Scanner ejercicio8 = new Scanner(System.in);
        System.out.println("Introduce la longitud en cms de la base del rectángulo");
        float base = ejercicio8.nextFloat();

        System.out.println("Introduce la longitud en cms de la altura del rectángulo");
        float altura = ejercicio8.nextFloat();

        float resultado = base * altura;
        System.out.println("El area del rectangulo es: " + resultado + " cm^2");

        ejercicio8.close();
    }
    public void ejercicioNueve() {

        /* Ejercicio Nº 9 : Escribe un programa que almacene la información de un producto (nombre, precio, código y disponibilidad)
           y muestre estos datos formateados por consola. */

        Scanner ejercicio9 = new Scanner(System.in);
        System.out.println("Nombre del producto");
        String nombreProdcuto = ejercicio9.nextLine();

        System.out.println("Precio del producto");
        float precio = ejercicio9.nextFloat();
        ejercicio9.nextLine();

        System.out.println("Código del producto");
        String codigo = ejercicio9.nextLine();

        System.out.println("¿Está disponible el producto?");
        boolean disponibilidad = ejercicio9.nextBoolean();

        System.out.println("------------------------");
        System.out.println("INFORMACIÓN DEL PRODUCTO");
        System.out.println("------------------------");

        System.out.println("Nombre: " + nombreProdcuto);
        System.out.println("Precio: " + precio + " €");
        System.out.println("Código: " + codigo);
        System.out.println("Disponibilidad: " + disponibilidad);

        ejercicio9.close();
    }
    public void ejercicioDiez() {

        /* Ejercicio Nº 10 : Crea un programa que convierta una temperatura de grados Celsius a Fahrenheit.
           Usa una variable para la temperatura en Celsius y muestra el resultado de la conversión.
           La fórmula para convertir de Celsius a Fahrenheit es:

           F = C × 9/5 + 32
        */

        Scanner ejercicio10 = new Scanner(System.in);

        System.out.println("Introduce cuantos grados Celsius quieres convertir");
        float celsius = ejercicio10.nextFloat();

        float fahrenheit;
        fahrenheit = ((celsius * 9) / 5) + 32;

        System.out.println("Temperatura en grados Celsius: " + celsius + "º");
        System.out.println("Temperatura en grados Fahrenheit: " + fahrenheit + "º");

        ejercicio10.close();
    }
}

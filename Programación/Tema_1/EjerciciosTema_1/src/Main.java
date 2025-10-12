public class Main {
    /* Ejercicio Nº1 : Crea un programa que defina tres variables: nombre, edad y ciudad.
     Asigna valores a cada una y muestra su contenido en la consola.*/

    /*
    public static void main (String[] args) {

        String nombre = "Manuel";
        int edad = 23;
        String ciudad = "Quintana de la Serena";

        System.out.println("Mi nombre es " + nombre);
        System.out.println("Tengo " + edad + " años");
        System.out.println("Mi pueblo se llama " + ciudad);
    }
    */


    /* Ejercicio Nº 2 : Crea un programa que defina una variable llamada puntuación con valor inicial 0.
    Luego, modifica su valor tres veces y muestra el resultado final.*/

    /*
    public static void main (String[] args) {

        int puntuacion = 0;
        System.out.println("Puntuación inicial = " + puntuacion);
        puntuacion = 1;
        System.out.println("Después de primera modificación = " + puntuacion);
        puntuacion = 2;
        System.out.println("Después de segunda modificación = " + puntuacion);
        puntuacion = 3;
        System.out.println("Puntuación final = " + puntuacion);
    }
    */

    /* Ejercicio Nº 3 : Define cinco variables con diferentes tipos de datos (String, int, boolean, double, char)
    y muestra tanto su valor como su tipo. */

    /*
    public static void main (String[] args) {

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
    */

    /* Ejercicio Nº 4 : Crea un programa que simule la información de un libro usando variables con nombres descriptivos.
    Muestra toda la información del libro en la consola. */

    /*

    */

    /* Ejercicio Nº 5 : Crea un programa que use constantes para almacenar información que no debe cambiar (
    como el valor de PI o el nombre de una aplicación) y variables para información que puede cambiar.
    Muestra todos los valores. */

    /*
    public static void main (String [] args) {

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
    */

    /* Ejercicio Nº 6 : Escribe un programa que declare dos variables numéricas,
    realice las operaciones básicas (suma, resta, multiplicación y división) y muestre los resultados por consola. */

    /*
    public static void main (String[] args) {

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
    */

    /* Ejercicio Nº 7 : Crea un programa que almacene tu información personal
    (nombre, apellido, edad y ciudad) en variables y muestre un mensaje de presentación por consola. */

    /*
    public static void main (String[] args) {

        final String nombre = "Manuel";
        final String apellidos = "Cruz Sánchez";

        int edad = 23;
        String ciudad = "Quintana de la Serena";

        System.out.println("¡Hola!, me llamo " + nombre + " " + apellidos + ",\ntengo " + edad + " años y vivo en " + ciudad + ".");
    }
    */

    /* Ejercicio Nº 8 : Desarrolla un programa que calcule el área de un rectángulo.
    Declara variables para la base y la altura, y muestra el resultado del cálculo. */

    /*
    public static void main (String [] args) {

        double base = 15.2;
        double altura = 9.9;

        Double area = base * altura;

        System.out.println("Base del rectángulo: " + base);
        System.out.println("Altura del rectángulo: " + altura);
        System.out.println("El área del rectámgulo es: " + area.floatValue() + " cms");
    }
    */

    /* Ejercicio Nº 9 : Escribe un programa que almacene la información de un producto (nombre, precio, código y disponibilidad)
    y muestre estos datos formateados por consola. */

    /*
    public static void main (String[] args) {

        System.out.println("------------------------");
        System.out.println("INFORMACIÓN DEL PRODUCTO");
        System.out.println("------------------------");

        String nombre = "TurboDast";
        Double precio = 95.99;
        String codigo = "17R92QZ";
        boolean disponibilidad = true;

        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio.floatValue() + " €");
        System.out.println("Código: " + codigo);
        System.out.println("Disponibilidad: " + disponibilidad);
    }
    */

    /* Ejercicio Nº 10 : Crea un programa que convierta una temperatura de grados Celsius a Fahrenheit.
    Usa una variable para la temperatura en Celsius y muestra el resultado de la conversión.
    La fórmula para convertir de Celsius a Fahrenheit es:

    F = C × 9/5 + 32
    */

    /*
    public static void main (String[] args) {

        Double temperaturaCelsius = 25.12;
        Double fahrenheitInicial;
        Double fahrenheitFinal;

        fahrenheitInicial = temperaturaCelsius * 9;
        fahrenheitFinal = (fahrenheitInicial / 5) + 32;

        System.out.println(temperaturaCelsius + "º Celsius, equivalen a " + fahrenheitFinal.floatValue() + "º Fahrenheit.");
    }
    */

}

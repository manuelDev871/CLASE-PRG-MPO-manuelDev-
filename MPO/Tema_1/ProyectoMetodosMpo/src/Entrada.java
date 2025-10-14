import model.Operaciones;

public class Entrada {

    public static void main(String[] args) {
        /*
        System.out.println("Ejecucion de metodos");
        System.out.println("Hola Borja");
        System.out.println("Este metodo se va a repetir en el saludo");
        System.out.println("Hola Maria");
        System.out.println("Este metodo se va a repetir en el saludo");
        System.out.println("Hola Luis");
        System.out.println("Este metodo se va a repetir en el saludo");
        System.out.println("Hola Celia");
        System.out.println("Este metodo se va a repetir en el saludo");
        System.out.println("Hola Juan");
        System.out.println("Este metodo se va a repetir en el saludo");
        */

        saludar("Borja");
        despedir();
        saludar("Maria");
        despedir();
        saludar("Luis");
        despedir();
        saludar("Celia");
        despedir();
        saludar("Juan");
        despedir();

    Operaciones operacionesMatematicas = new Operaciones();
    operacionesMatematicas.sumar(5,5);
    operacionesMatematicas.restar(10,5);

    }

    public static void saludar (String nombre) {
        System.out.println("Hola " + nombre);
        System.out.println("Buenos dias");
        System.out.println("Que tal estas");
        System.out.println("Quieres un cafe");
        System.out.println("Este metodo se va a repetir en el saludo");
    }

    public static void despedir () {
        System.out.println("Hasta luego");
        System.out.println("Por hoy ya hemos terminado");
        System.out.println("Vamos a cerrar la clase");
    }

}

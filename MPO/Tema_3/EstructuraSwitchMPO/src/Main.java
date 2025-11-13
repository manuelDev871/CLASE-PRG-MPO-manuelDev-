public class Main {

    public static void main(String[] args) {
        // Tipos fijos.
        /*
        System.out.println(DiasSemana.Lunes);
        System.out.println(DiasSemana.Martes);
        System.out.println(DiasSemana.Miercoles);
        System.out.println(DiasSemana.Jueves);
        System.out.println(DiasSemana.Viernes);
        System.out.println(DiasSemana.Sabado);
        System.out.println(DiasSemana.Domingo);
        */
        // int char String
        /*
         Estructura tradicional

         switch (valor) {

            case 1:
                break;

            case 2:
                break;

            default:
        }
         */

        // switch uso con enums, y con valores con , (recordar que se necesita un level minimo de 14)
        DiasSemana dia = DiasSemana.Lunes;
        switch (dia) {
            case Lunes:
                System.out.println("Dia laborable");
                break;

            case Martes:
                System.out.println("Dia laborable");
                break;

            case Miercoles:
                System.out.println("Dia laborable");
                break;

            case Jueves:
                System.out.println("Dia laborable");
                break;

            case Viernes:
                System.out.println("Dia laborable, casi lo tenemos");
                break;

            case Sabado:
                System.out.println("Dia de descanso");
                break;

            case Domingo:
                System.out.println("Dia de descanso");
                break;
        }

        // Quiero imprimier la fecha de hoy. Hoy es 7 de noviembre y es viernes.
        System.out.println("Hoy es 7 de " + MesesAnhos.Noviembre + " y es " + DiasSemana.Viernes);
        System.out.printf("Hoy es %d/%s/%d y es %s de un mes de la estacion de %s y es el mes numero %d",
                7,MesesAnhos.Noviembre.name(),2025,DiasSemana.Viernes.name(),
                MesesAnhos.Noviembre.estacion, MesesAnhos.Noviembre.numero);
        System.out.println();
        System.out.println();
        // Switch con un rango de valores
        // si el numero esta entre 0 y 6 poner un sout
        // si el numero esta entre 7 y 10 poner un sout
        // si el numero esta entre 11 y 16 poner un sout
        // el restante
        // Switch co rango solo con level 23 y condicion valor como constante
        /*
        final int NUMERO = 6;
        switch (true) {
            case ((NUMERO >= 0) && (NUMERO < 6)):
                System.out.println("jhgvbkbqekf");
                break;

            case ((NUMERO > 6) && (NUMERO < 10)):
                System.out.println("vjkdqwkvhquiv");
                break;

        }
        */

        Operaciones operaciones = new Operaciones();
        operaciones.evaluarMetodo("levantado");
    }
}

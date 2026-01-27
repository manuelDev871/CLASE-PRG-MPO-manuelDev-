package EjerciciosTema5.EjerciciosNavidades.Ejercicio2.model;

public class Estudiante {

    private String nombre;
    private int edad;
    private double notaMatematicas, notaProgramacion, notaIngles;

    public Estudiante() {}

    public Estudiante(String nombre, int edad, double notaMatematicas, double notaProgramacion, double notaIngles) {
        this.nombre = nombre;
        this.edad = edad;
        this.notaMatematicas = notaMatematicas;
        this.notaProgramacion = notaProgramacion;
        this.notaIngles = notaIngles;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getNotaMatematicas() {
        return notaMatematicas;
    }

    public double getNotaProgramacion() {
        return notaProgramacion;
    }

    public double getNotaIngles() {
        return notaIngles;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNotaMatematicas(double notaMatematicas) {
        this.notaMatematicas = notaMatematicas;
    }

    public void setNotaProgramacion(double notaProgramacion) {
        this.notaProgramacion = notaProgramacion;
    }

    public void setNotaIngles(double notaIngles) {
        this.notaIngles = notaIngles;
    }

    // Metodo calcularPromedio -> double
    public double calcularPromedio() {
        return (notaMatematicas + notaProgramacion + notaIngles) / 3;
    }

    // Metodo boolea estAprobado
    public boolean estaAprobado() {
        return calcularPromedio() >= 5;
    }

    // Metodo obtenerCalificacion
    public String obtenerCalificacion() {
        double promedio = calcularPromedio();

        if (promedio < 5) {
            return "Insuficiente";
        } else if (promedio <= 5.9) {
            return "Suficiente";
        } else if (promedio <= 6.9) {
            return "Bien";
        } else if (promedio <= 8.9) {
            return "Notable";
        } else {
            return "Sobresaliente";
        }
    }


    // Metodo mostrarInfo
    public void mostrarInforme() {
        System.out.println("Nombre: " + nombre);
        System.out.println("edad = " + edad);
        System.out.println("notaMatematicas = " + notaMatematicas);
        System.out.println("notaProgramacion = " + notaProgramacion);
        System.out.println("notaIngles = " + notaIngles);
        System.out.printf("%.2f \n",calcularPromedio());
        System.out.println(obtenerCalificacion());
    }
}

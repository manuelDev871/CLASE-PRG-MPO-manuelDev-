package EjerciciosTema4.EjerciciosNavidades.Ejercicio8.model;

public class Coche {

    private String marca, modelo;
    private int anio;
    private double kilometraje, combustible;

    public Coche(){
        this.kilometraje = 0;
        this.combustible = 50;
    }

    public Coche(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.kilometraje = 0;
        this.combustible = 50;
    }

    // Getters
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnio() {
        return anio;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public double getCombustible() {
        return combustible;
    }

    // Setters

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setKilometraje(double kilometraje) {
        if (kilometraje >= 0) {
            this.kilometraje = kilometraje;
        }
    }

    public void setCombustible(double combustible) {
        if (combustible >= 0) {
            this.combustible = 50;
        }
    }

    public void conducir(double km) {

        double litrosNecesarios = km / 15;

        if (litrosNecesarios > combustible) {
            System.out.println("Error: no hay suficiente combustible para recorrer " + km + " km.");
            return;
        }

        // Si hay suficiente combustible...
        kilometraje += km;
        combustible -= litrosNecesarios;

        System.out.println("Has recorrido " + km + " km.");
        System.out.printf("Combustible restante: %.2f litros \n", combustible);
    }

    public void repostar(double litros) {

        if (litros <= 0) {
            System.out.println("No se pueden repostar litros negativos...");
            return;
        }

        double depositoMaximo = 60;

        if (combustible + litros > depositoMaximo) {
            double litrosQueEntran = depositoMaximo - combustible;
            combustible = depositoMaximo;
            System.out.printf("El deposito se ha llenado, han entrado %.2f litros \n", litrosQueEntran);
        } else {
            combustible += litros;
            System.out.println("Se han repostado " + litros + " litros");
        }

        System.out.printf("Combustible actual: %.2f litros \n", combustible);
    }

    public int calcularAntiguedad() {
        return 2025 - anio;
    }

    public boolean necesitaMantenimiento() {
        return kilometraje > 10000;
    }

    public void mostrarInfo() {
        System.out.println("Marca = " + marca);
        System.out.println("Modelo = " + modelo);
        System.out.println("Añoo = " + anio);
        System.out.println("Kilometraje = " + kilometraje + " kms");
        System.out.printf("Combustible = %.2f litros \n", combustible);
    }
}

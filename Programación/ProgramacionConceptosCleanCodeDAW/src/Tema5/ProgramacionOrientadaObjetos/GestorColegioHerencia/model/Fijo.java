package Tema5.ProgramacionOrientadaObjetos.GestorColegioHerencia.model;

public final class Fijo extends Profesor implements Inspector {

    private int nHorasCotizadas;

    public Fijo() {}

    public Fijo(String nombre, String apellido, int salario, int nHorasCotizadas) {
        super(nombre, apellido, salario);
        this.nHorasCotizadas = nHorasCotizadas;
    }

    public Fijo(String nombre, String apellido, int salario, int nHoras, int nHorasCotizadas) {
        super(nombre, apellido, salario, nHoras);
        this.nHorasCotizadas = nHorasCotizadas;
    }

    public int getnHorasCotizadas() {
        return nHorasCotizadas;
    }

    public void setnHorasCotizadas(int nHorasCotizadas) {
        this.nHorasCotizadas = nHorasCotizadas;
    }

    @Override
    public void saludar() {
        super.saludar();
        System.out.println("Soy un profesor fijo, doy la clase genial");
        System.out.println("Mi puesto no me lo quita nadie");
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Número de Horas Cotizadas: " + nHorasCotizadas);
    }

    public void pedirAumento(int aumentar) {
        this.setSalario(getSalario() + aumentar);
        System.out.println("Aumentas salario en " + aumentar + "€");
    }

    @Override
    public void realizarInspeccion() {
        System.out.println("Inspeccionare pero pasare cosas por alto");
    }
}

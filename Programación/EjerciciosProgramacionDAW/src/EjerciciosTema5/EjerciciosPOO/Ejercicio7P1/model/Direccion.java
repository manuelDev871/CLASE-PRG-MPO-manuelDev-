package EjerciciosTema5.EjerciciosPOO.Ejercicio7P1.model;

public class Direccion {

    private String calle, ciudad;
    private int codigoPostal;

    public Direccion(String calle, String ciudad, int codigoPostal) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.codigoPostal = codigoPostal;
    }

    public String getCalle() {
        return calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }
}

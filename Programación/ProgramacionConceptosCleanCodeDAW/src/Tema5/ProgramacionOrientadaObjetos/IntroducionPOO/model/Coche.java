package Tema5.ProgramacionOrientadaObjetos.IntroducionPOO.model;

//  TODA CLASE JAVA EXTIENDE OBJECT.

public class Coche {
    // Tengo toda la funcionalidad que me ha dado la clase object.

    // Siempre poner las variables privadas.
    private String marca,modelo, color;

    private int numeroPuertas, cv, precio;

    // tipo acceso tipo retorno nombre metodo (argumentos) {cuerpo metodo}.
    // tipo acceso nombre metodo (argumentos) {cuerpo metodo} -> no le digo que retorna -> el nombre debe ser igual a la clase
    // CONSTRUCTORES -> mínimo tengo 1, el vacío está por defecto (implicito) solo si hay uno escrito, el vacio desaparede (enmascara).

    public Coche() {} // hacerlo siempre para poder crear un "coche" de manera explicita

    public Coche(String marca, String modelo, int cv, int precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.cv = cv;
        this.precio = precio;
    }

    public Coche(String marca, String modelo, int cv, int precio, int numeroPuertas) {
        this.marca = marca;
        this.modelo = modelo;
        this.cv = cv;
        this.precio = precio;
        this.numeroPuertas = numeroPuertas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        if (precio > 10000) {
            this.precio = precio;
        } else {
            System.out.println("Error en el cambio de precio");
        }
    }
}

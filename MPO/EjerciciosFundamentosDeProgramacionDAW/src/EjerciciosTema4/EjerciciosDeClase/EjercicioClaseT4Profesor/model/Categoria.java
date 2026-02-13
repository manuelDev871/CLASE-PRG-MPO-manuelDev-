package EjerciciosTema4.EjerciciosDeClase.EjercicioClaseT4Profesor.model;

public enum Categoria {

    ALIMENTO, MUEBELE("Este producto es un muebele para decorar"), ROPA, TECNOLOGIA("Producto con capacidades tecnologicas");

    private String descripcion;

    private Categoria(String descripcion) {
        this.descripcion = descripcion;
    }

    private Categoria() {}

    public String getDescricion() {
        return descripcion;
    }
}

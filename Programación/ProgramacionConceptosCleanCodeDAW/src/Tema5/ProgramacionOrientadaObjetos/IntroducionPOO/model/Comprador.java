package Tema5.ProgramacionOrientadaObjetos.IntroducionPOO.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Comprador {

    private String nombre, apellido, correo, direccion;

    private int telefono;

    // CONSTRUCTORES -> VACIO // TODO
    // GETTER Y SETTER


    public Comprador(String nombre, String apellido, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
    }
}

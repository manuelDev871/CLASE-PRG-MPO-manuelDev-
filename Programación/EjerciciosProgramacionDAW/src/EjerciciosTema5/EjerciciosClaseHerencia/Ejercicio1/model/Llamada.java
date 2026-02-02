package EjerciciosTema5.EjerciciosClaseHerencia.Ejercicio1.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public abstract class Llamada {

    private long nOrigen, nDestino;
    private int duracion;
    private double costeSegundo;
    private double coste;

    // TODO cuidado con el coste, automatizar su calculo

    public Llamada(long nOrigen, long nDestino, int duracion) {
        this.nOrigen = nOrigen;
        this.nDestino = nDestino;
        this.duracion = duracion;
    }

    public void mostrarDatos() {
        System.out.println("Número de Origen = " + nOrigen);
        System.out.println("Número de Destino = " + nDestino);
        System.out.println("Duración = " + duracion);
        System.out.println("Coste Segundo = " + costeSegundo);
        System.out.println("Coste = " + coste);
    }

    public abstract void calcularCoste();
}

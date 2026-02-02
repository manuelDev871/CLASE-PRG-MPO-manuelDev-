package EjerciciosTema5.EjerciciosClaseHerencia.Ejercicio1.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public final class LlamadaLocal extends Llamada {

    public LlamadaLocal(long nOrigen, long nDestino, int duracion) {
        super(nOrigen, nDestino, duracion);
    }

    @Override
    public void calcularCoste() {
        this.setCoste(0);
    }
}

package EjerciciosTema5.EjerciciosClaseHerencia.Ejercicio1.controller;

import EjerciciosTema5.EjerciciosClaseHerencia.Ejercicio1.model.Llamada;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter

public class Centralita {

    private ArrayList<Llamada> listaLlamadas;
    private double caja;

    public Centralita() {
        listaLlamadas = new ArrayList<>();
        // caja = 0.0
    }

    public void registrarLlamada(Llamada llamada) {
        listaLlamadas.add(llamada);
        caja += llamada.getCoste();
        System.out.println("LLamada registrada correctamente");
    }

    public void mostrarDatosLlamadas() {
        System.out.printf("Hay un total de %d llamadas \n", listaLlamadas.size());
        if (!listaLlamadas.isEmpty()) {
            for (Llamada llamada : listaLlamadas) {
                llamada.mostrarDatos();
            }
        }
    }

    public void mostrarCaja() {
        System.out.println("Los beneficios del dia de son son " + caja + " €");
    }
}

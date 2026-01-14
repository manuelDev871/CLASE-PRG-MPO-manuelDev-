package Tema5.ProgramacionOrientadaObjetos.GestorEscolarAcademia.model;

public class Profesor {

    public Profesor(){} // Contructor vacio

    public void ponerNotas(Estudiante estudiante) {
        estudiante.getCurso1().setNota((Math.random()*10) + 0.1);
        estudiante.getCurso2().setNota((Math.random()*10) + 0.1);
        estudiante.getCurso3().setNota((Math.random()*10) + 0.1);
    }

    public double calcularMedia(Estudiante estudiante) {
        double notaMedia = estudiante.getCurso1().getNota() +
                estudiante.getCurso2().getNota() + estudiante.getCurso3().getNota();

        return (notaMedia) / 3;
    }
}

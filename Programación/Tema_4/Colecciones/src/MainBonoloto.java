public class MainBonoloto {

    public static void main(String[] args) {

        Bonoloto bonoloto = new Bonoloto();
            // numeroSistema = [ , , , , ]
            // numeroUsuario = [ , , , , ]
        bonoloto.generarNumeroSistemas();
            // numeroSistema = [10, 11, 5, 2, 7]
        bonoloto.pedirNumerosUsuario();
            // numeroUsuario = [10, 20, 2, 4, 6]
        bonoloto.comprobarNumeros();
    }
}

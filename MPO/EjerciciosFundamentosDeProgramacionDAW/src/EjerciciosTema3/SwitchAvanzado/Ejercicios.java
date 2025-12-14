package EjerciciosTema3.SwitchAvanzado;
import EjerciciosTema3.SwitchAvanzado.Enum.CategoriaPlato;
import EjerciciosTema3.SwitchAvanzado.Enum.EstadoPedido;
import EjerciciosTema3.SwitchAvanzado.Enum.Moneda;

import java.util.Random;
import java.util.Scanner;

import static EjerciciosTema3.SwitchAvanzado.Enum.EstadoPedido.PENDIENTE;

public class Ejercicios {

    public void ejercicioUno(double calificacion) {

        /*  Objetivo: Crear un programa que convierta una calificación numérica (0-10) en su equivalente alfabético usando un switch.

            Requisitos:

            1. Declara una variable double calificacion con un valor entre 0 y 10.
            2. Usa un switch para convertir la calificación a una letra (A, B, C, D, F).
            3. Considera: 9-10 = A, 7-8.9 = B, 5-6.9 = C, 4-4.9 = D, 0-3.9 = F
            4. Muestra un mensaje apropiado para cada calificación.
         */

        int notaEntera = (int) calificacion; // quitamos decimales solo para usar en el switch

        switch (notaEntera) {
            case 10:
            case 9:
                System.out.println("A");
                System.out.println("Excelente");
                break;

            case 8:
            case 7:
                System.out.println("B");
                System.out.println("Muy bien");
                break;

            case 6:
            case 5:
                System.out.println("C");
                System.out.println("Bien");
                break;

            case 4:
                System.out.println("D");
                System.out.println("Insuficiente");
                break;

            case 3:
            case 2:
            case 1:
            case 0:
                System.out.println("F");
                System.out.println("Fracaso total");
                break;

            default:
                System.out.println("Calificación inválida. Debe estar entre 0 y 10.");
                break;
        }
    }
    public void ejercicioDos(double cantidad, Moneda moneda) {

        /*  Objetivo: Crear un programa que convierta una cantidad en euros a otras monedas según la opción seleccionada.

            Requisitos:

            1. Crea un enum Moneda con: DOLAR, LIBRA, YEN, PESO.
            2. Declara una variable double euros con una cantidad.
            3. Usa un switch con el enum para aplicar la tasa de conversión correspondiente.
            4. Muestra el resultado de la conversión.
         */


        double resultado;


        switch (moneda) {
            case Dolar -> {
                resultado = cantidad * 1.15;
                System.out.println(cantidad + " €, equivalen a " + resultado + " $");
            }

            case Libra -> {
                resultado = cantidad * 0.87;
                System.out.println(cantidad + " €, equivalen a " + resultado + " libras");
            }

            case Peso -> {
                resultado = cantidad * 1555.78;
                System.out.println(cantidad + " €, equivalen a " + resultado + " pesos argentinos");
            }

            case Yen -> {
                resultado = cantidad * 176.99;
                System.out.println(cantidad + " €, equivalen a " + resultado + " yenes");
            }

            default -> {
                System.out.println("Moneda fuera de nuestra base de datos");
            }
        }
    }

    public void ejercicioTres(int temperatura) {

        /*  Objetivo: Crear un programa que clasifique la temperatura en categorías usando rangos.

            Requisitos:

            1. Declara una variable int temperatura en grados Celsius.
            2. Usa switch(true) para clasificar la temperatura en: Helado (<0), Frío (0-15),
                Templado (16-25), Calor (26-35), Muy Caliente (>35).
            3. Muestra un mensaje descriptivo y una recomendación de vestimenta.
         */

        switch (verificarTemperatura(temperatura)) {
            case "Helado" -> {
                System.out.println("Helado, ponte un buen chaquetón");
            }

            case "Frio" -> {
                System.out.println("Frio, ponte un cortaviento");
            }

            case "Templado" -> {
                System.out.println("Templado, ponte un jersey");
            }

            case "Calor" -> {
                System.out.println("Calor, ponte una camisa");
            }

            case "Muy caliente" -> {
                System.out.println("Muy caliente, ve si ropa");
            }
        }
    }
    public String verificarTemperatura(int temperatura) {
        if (temperatura < 0) {
            return "Helado";
        } else if (temperatura >= 0 && temperatura <= 15) {
            return "Frio";
        } else if (temperatura >= 16 && temperatura <= 25) {
            return "Templado";
        } else if (temperatura >= 26 && temperatura <= 35) {
            return "Calor";
        } else {
            return "Muy caliente";
        }
    }

    public void ejercicioCuatro() {

        /*  Objetivo: Simular un sistema de pedidos de restaurante con diferentes categorías.

            Requisitos:
            1. Crea un enum CategoriaPlato con: ENTRADA, PRINCIPAL, POSTRE, BEBIDA.
            2. Declara una variable del tipo enum.
            3. Usa un switch para mostrar 3 opciones disponibles de cada categoría.
            4. Agrupa categorías similares si es apropiado.
         */

        CategoriaPlato categoria = CategoriaPlato.ENTRADA;

        switch (categoria) {
            case BEBIDA -> {
                System.out.println("Coca Cola, Agua, Cerveza");
            }

            case ENTRADA -> {
                System.out.println("Jamón, croquetas, pistachos");
            }

            case PRINCIPAL -> {
                System.out.println("Gulas, percebes, hamburguesa");
            }

            case POSTRE -> {
                System.out.println("Tiramisú, helado, flan");
            }
        }
    }
    public double ejercicioCinco(double numUno, double numDos, char operador) {

        /*  Objetivo: Crear una calculadora simple que realice operaciones según un operador.

            Requisitos:
            1. Declara dos variables double num1 y double num2.
            2. Declara una variable char operador con valores posibles: '+', '-', '*', '/'.
            3. Usa un switch para realizar la operación correspondiente.
            4. Maneja el caso especial de división por cero.
         */

        double resultado = 0;
        switch (operador) {
            case '+' -> {
                resultado = numUno + numDos;
                System.out.println(resultado);
            }

            case '-' -> {
                resultado = numUno - numDos;
                System.out.println(resultado);
            }

            case '*' -> {
                resultado = numUno * numDos;
                System.out.println(resultado);
            }

            case '/' -> {
                if (numDos == 0) {
                    System.out.println("Un numero entre 0 == 1");
                } else {
                    resultado = numUno / numDos;
                    System.out.println(resultado);
                }
            }

            default -> {
                System.out.println("Operación no disponible");
            }
        }
        return resultado;
    }

    public void ejercicioSeis(int obtenerHoraActual) {

        /*  Objetivo: Crear un programa que genere saludos diferentes según la hora del día.

            Requisitos:
            1. Crea un metodo obtenerHoraActual() que devuelva un número entre 0 y 23.
            2. En el main, llama al metodo y usa switch(true) para clasificar en: Madrugada (0-5), Mañana (6-11), Tarde (12-19), Noche (20-23).
            3. Muestra un saludo apropiado para cada período del día.
         */

        switch (horaActual(obtenerHoraActual)) {
            case "Madrugada" -> {
                System.out.println("Buenos dias, como has madrugado hoy");
            }

            case "Mañana" -> {
                System.out.println("Buenos dias, ¿que tal has dormido hoy?");
            }

            case "Tarde" -> {
                System.out.println("Vamos chiqui, que se te han pegado las sabanas");
            }

            case "Noche" -> {
                System.out.println("Buenas noches corazón");
            }
        }
    }
    public String horaActual(int obtenerHoraActual) {
        if (obtenerHoraActual >= 0 && obtenerHoraActual <= 5) {
            return "Madrugada";
        } else if (obtenerHoraActual >= 6 && obtenerHoraActual <= 11) {
            return "Mañana";
        } else if (obtenerHoraActual >= 12 && obtenerHoraActual <= 19) {
            return "Tarde";
        } else if (obtenerHoraActual >= 20 && obtenerHoraActual <= 23) {
            return "Noche";
        } else {
            return "Franja horaria no disponible";
        }
    }

    public void ejercicioSiete(int puntuacion) {

        /*  Objetivo: Crear un sistema que determine el nivel del jugador según su puntuación.

            Requisitos:
            1. Declara una variable int puntuacion.
            2. Usa switch(true) para clasificar en niveles: Principiante (0-100), Intermedio (101-500),
               Avanzado (501-1000), Experto (1001-5000), Maestro (>5000).
            3. Muestra el nivel alcanzado y un mensaje motivacional.
            4. Otorga una recompensa virtual diferente para cada nivel.
         */

        switch (niveles(puntuacion)) {
            case "Principiante" -> {
                System.out.println("Eres principiate, has ganado una galleta");
            }

            case "Intermedio" -> {
                System.out.println("Eres intermedio, has ganado una coca cola");
            }

            case "Avanzado" -> {
                System.out.println("Eres avanzado, has ganado un buen plato de jamón");
            }

            case "Experto" -> {
                System.out.println("Eres experto, has ganado una paleta ibérica");
            }

            case "Maestro" -> {
                System.out.println("Eres maestro, has ganado un jamón de pata negra");
            }
        }
    }
    public String niveles(int puntuacion) {
        if (puntuacion >= 0 && puntuacion <= 100) {
            return "Principiante";
        } else if (puntuacion >= 101 && puntuacion <= 500) {
            return "Intermedio";
        } else if (puntuacion >= 501 && puntuacion <= 1000) {
            return "Avanzado";
        } else if (puntuacion >= 1001 && puntuacion <= 5000) {
            return "Experto";
        } else {
            return "Maestro";
        }
    }

    public void ejercicioOcho(String extension) {

        /*  Objetivo: Crear un programa que identifique el tipo de archivo según su extensión.

            Requisitos:
            1. Declara una variable String extension (por ejemplo: "jpg", "pdf", "txt", "mp3").
            2. Usa un switch para agrupar extensiones similares: Imágenes (jpg, png, gif),
               Documentos (pdf, doc, txt), Audio (mp3, wav), Video (mp4, avi).
            3. Muestra el tipo de archivo y el programa recomendado para abrirlo.
         */

        switch (tipos(extension)) {
            case "IMG" -> {
                System.out.println("Imagen, tipo de archivo: " + extension + ". Programa recomendado: Visor de imágenes o Photoshop.");
            }

            case "DOC" -> {
                System.out.println("Documento, tipo de archivo: " + extension + ". Programa recomendado: Microsoft Word o Adobe Reader.");
            }

            case "AUDIO" -> {
                System.out.println("Audio, tipo de archivo: " + extension + ". Programa recomendado: VLC Media Player o Spotify.");
            }

            case "VIDEO" -> {
                System.out.println("Video, tipo de archivo: " + extension + ". Programa recomendado: VLC Media Player o Windows Media Player.");
            }

            case "noDisponible" -> {
                System.out.println("Formato no válido o no disponible");
            }
        }
    }
    public String tipos(String extension) {

        if (extension.equalsIgnoreCase("jpg") || extension.equalsIgnoreCase("png") || extension.equalsIgnoreCase("gif")) {
            return "IMG";
        } else if (extension.equalsIgnoreCase("pdf") || extension.equalsIgnoreCase("doc") || extension.equalsIgnoreCase("txt")) {
            return "DOC";
        } else if (extension.equalsIgnoreCase("mp3") || extension.equalsIgnoreCase("wav")) {
            return "AUDIO";
        } else if (extension.equalsIgnoreCase("mp4") || extension.equalsIgnoreCase("avi")) {
            return "VIDEO";
        } else {
            return "noDisponible";
        }
    }

    public void ejercicioNueve() {

        /*  Objetivo:* Crear un programa que calcule y clasifique el Índice de Masa Corporal (IMC).

            Requisitos:
            1. Declara variables double peso (en kg) y double altura (en metros).
            2. Calcula el IMC: peso / (altura * altura).
            3. Usa switch(true) para clasificar: Bajo peso (<18.5), Normal (18.5-24.9), Sobrepeso (25-29.9), Obesidad (>=30).
            4. Muestra el IMC calculado y la clasificación correspondiente.
         */


        Scanner entradaTeclado = new Scanner(System.in);
        System.out.println("Introdce tu peso (kg)");
        double peso = entradaTeclado.nextDouble();

        System.out.println("Introuce tu altura (metros)");
        double altura = entradaTeclado.nextDouble();

        double IMC = 0;
        IMC = peso / (altura * altura);

        switch (clasificacion(IMC)) {
            case "Bajo":
                System.out.printf("Tu IMC es: %.2f%n", IMC);
                System.out.println("Clasificacion: Nivel bajo");
                break;

            case "Normal":
                System.out.printf("Tu IMC es: %.2f%n", IMC);
                System.out.println("Clasificacion: Nivel normal");
                break;

            case "Sobrepeso":
                System.out.printf("Tu IMC es: %.2f%n", IMC);
                System.out.println("Clasificacion: Nivel sobrepeso");
                break;

            case "Obesidad":
                System.out.printf("Tu IMC es: %.2f%n", IMC);
                System.out.println("Clasificacion: Nivel obesidad");
                break;

            case "Fuera de rango":
                System.out.println("Fuera de rango");
        }
    }
    public String clasificacion(double IMC) {
        if (IMC < 18.5) {
            return "Bajo";
        } else if (IMC >= 18.5 && IMC < 24.9) {
            return "Normal";
        } else if (IMC >= 25 && IMC < 29.9) {
            return "Sobrepeso";
        } else if (IMC >= 30) {
            return "Obesidad";
        } else {
            return "Fuera de rango";
        }
    }

    public void ejercicioDiez() {

        /*  Objetivo: Simular un sistema de seguimiento de pedidos con diferentes estados.

            Requisitos:
            1. Crea un enum EstadoPedido con: PENDIENTE, PROCESANDO, ENVIADO, EN_TRANSITO, ENTREGADO, CANCELADO.
            2. Crea un metodo obtenerEstadoActual() que devuelva aleatoriamente uno de estos estados.
            3. En el main, usa un switch para mostrar un mensaje detallado del estado.
            4. Indica el siguiente paso esperado para cada estado (excepto ENTREGADO y CANCELADO).
         */


        EstadoPedido estadoActual = obtenerEstadoActual();

        System.out.println("📦 Estado actual del pedido: " + estadoActual);

        // 4️⃣ Switch con los mensajes y pasos siguientes
        switch (estadoActual) {
            case PENDIENTE -> {
                System.out.println("🕓 Tu pedido está pendiente.");
                System.out.println("➡️ Siguiente paso: Procesar el pedido.");
            }
            case PROCESANDO -> {
                System.out.println("⚙️ Tu pedido está siendo procesado.");
                System.out.println("➡️ Siguiente paso: Enviar el pedido.");
            }
            case ENVIADO -> {
                System.out.println("📤 Tu pedido ha sido enviado.");
                System.out.println("➡️ Siguiente paso: En tránsito hacia tu ubicación.");
            }
            case EN_TRANSITO -> {
                System.out.println("🚚 Tu pedido está en tránsito.");
                System.out.println("➡️ Siguiente paso: Entregar el pedido.");
            }
            case ENTREGADO -> {
                System.out.println("✅ Tu pedido ha sido entregado. ¡Gracias por tu compra!");
            }
            case CANCELADO -> {
                System.out.println("❌ Tu pedido ha sido cancelado. Contacta con atención al cliente si necesitas ayuda.");
            }
        }
    }
    public EstadoPedido obtenerEstadoActual() {
        EstadoPedido[] estados = EstadoPedido.values();
        Random random = new Random();
        int indice = random.nextInt(estados.length);
        return estados[indice];
    }
}